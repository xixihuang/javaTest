/**
 * Created by huangxi on 2016/5/16.
 */
import java.net.UnknownHostException;
import java.util.Set;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import com.mongodb.MongoException;

public class test1 {
    public static void main (String[] args) {
        try{
            Mongo mongo = new Mongo("localhost",27017);
            //从Mongodb中获得collection数据集
            //如果你不知道collection的名称，可以使用db.getCollectionNames()获得集合，然后再遍历，如下:
            DB db = mongo.getDB("yourdb");
            Set<String> collections = db.getCollectionNames();
            for (String collectionName : collections) {
                System.out.println(collectionName);
            }
            DBCollection collection = db.getCollection("youtcollection");
            System.out.println(collection.toString());
            System.out.println("Done");
    } catch (MongoException e) {
            e.printStackTrace();
        }
    }
}
