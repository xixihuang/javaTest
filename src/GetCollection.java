/**
 * Created by huangxi on 2016/5/16.
 * Used for Java:Get colletcion from mongo.
 */
import java.net.UnknownHostException;
import java.util.Set;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import com.mongodb.MongoException;

public class GetCollection {
    public static void main(String[] args){
        try {
            Mongo mongo = new Mongo("localhost",27017);
            DB db = mongo.getDB("myTestDB");
            Set<String> collections = db.getCollectionNames();
            for (String collectionName : collections) {
                System.out.println(collectionName);
            }
            DBCollection collection = db.getCollection("yourColleciton");
            System.out.println(collection.toString());
            System.out.println("Done");
        } catch (MongoException e) {
            e.printStackTrace();
        }
    }
}
