/**
 * Created by huangxi on 2016/5/16.
 * Used for linking MongoDB by Java.
 */
import java.net.UnknownHostException;
import java.util.Set;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoException;

public class test {
    public static void main(String[] args) throws UnknownHostException, MongoException {
        Mongo mongo = new Mongo("localhost", 27017);     // 连接数据库
        DB db = mongo.getDB("mytestdb");                    // 数据库
        Set<String> cols = db.getCollectionNames();           // 获取数据库中所有的集合（类似于获取关系数据库中的表）

        // 打印出数据库中的集合，这里应当为null
        for (String s : cols) {
            System.out.println(s);
        }

        DBCollection collection = db.getCollection("mytestcoll");       // 创建一个集合
        collection.drop();                                              // 删除集合，插入数据时自动重建
        BasicDBObject obj = new BasicDBObject();                        // 初始化一个基本DB对象，插入数据库的就是DB对象

        obj.put("from", "blog.ithomer.net");        // 放入几个键值对
        obj.put("to", "forum.ithomer.net");
        obj.put("subject", "ithomer.net");
        collection.insert(obj);                     // 插入对象

        DBObject dbobj = collection.findOne();      // 查看一条记录，findOne()=find().limit(1);
        System.out.println(dbobj);                  // 打印出刚才插入的数据

        // 插入10条{ranking:i}的数据
        for (int i = 0; i < 10; i++) {
            collection.insert(new BasicDBObject().append("ranking", i));
        }
        System.out.println("count: " + collection.getCount());      // 打印集合中的数据总数


        DBCursor cursor = collection.find();        // 然后我们使用这个游标来遍历集合
        while (cursor.hasNext()) {
            System.out.println(cursor.next());
        }
        // 简单的条件查询，查询ranking为1的记录
        BasicDBObject query = new BasicDBObject();
        query.put("ranking", 1);
        cursor = collection.find(query);
        System.out.println("collection find({\"ranking\":1}):");
        while (cursor.hasNext()) {
            System.out.println(cursor.next());
        }

        // 复杂的条件查询，查询ranking大于等于5小于9的记录
        query = new BasicDBObject();
        query.put("ranking", new BasicDBObject("$gte", 5).append("$lt", 9));
        cursor = collection.find(query);
        System.out.println("collection find({\"ranking\":[5-9)}):");
        while (cursor.hasNext()) {
            System.out.println(cursor.next());
        }

//      mongo.dropDatabase("mytestdb");         // 最后删除我们的测试数据库
    }
}