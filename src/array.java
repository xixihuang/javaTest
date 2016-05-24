/**
 * Created by huangxi on 2016/5/16.
 * Java & MongoDB Hello World Example
 */


/**
 * 在上面的例子中，演示了使用Java对Mongodb操作的重要方法和步骤，首先通过创建Mongodb对象，传入构造函数的参数是Mongodb的数据库所在地址和端口，
 * 然后使用getDB方法获得要连接的数据库名，使用getCollection获得数据集合的名，然后通过新建立BasicDBObject对象去建立document,
 * 最后通过collection的insert方法，将建立的document保存到数据库中去。而collection的find方法，则是用来在数据库中查找document。
 */

import java.net.UnknownHostException;

import com.mongodb.*;

public class array {
    public static void main(String[] args) {
        try {
            //实例化Mongo对象，连接本机Mongo数据库
            Mongo mongo = new Mongo("localhost", 27017);
            //连接名为person的数据库，如果该数据库不存在，mongo会自动新建
            DB db = mongo.getDB("person");
            //获取名为"person"的数据集合，如果该集合不存在，则新建。
            DBCollection collection = db.getCollection("person");
            //使用BasicDBObject对象创建一个document，并为其赋值。
            BasicDBObject document = new BasicDBObject();
            document.put("name", "Martin");
            document.put("age", "21");
            //将新建的document保存到collection中
            collection.insert(document);
            // 创建要查询的document
            BasicDBObject searchQuery = new BasicDBObject();
            searchQuery.put("age", "21");
            // 使用collection的find方法查找document
            DBCursor cursor = collection.find(searchQuery);
            //循环输出结果
            while (cursor.hasNext()) {
                System.out.println(cursor.next());
            }
            System.out.println("Done");
        } catch (MongoException e) {
            e.printStackTrace();
        }
    }
}