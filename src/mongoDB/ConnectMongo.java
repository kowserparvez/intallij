package mongoDB;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class ConnectMongo {
    public static MongoDatabase mongoDatabase=null;
    public static void main(String[] args) {
        MongoDatabase database = null;
        database =connect();
        MongoCollection<Document> collection= database.getCollection("StudentInfo");
        BasicDBObject basicDBObject = new BasicDBObject();
        FindIterable<Document> iterable = collection.find(basicDBObject);
        for (Document doc:iterable){
            String name="";
            String major="";
            name = (String)doc.get("name");
            major =(String)doc.get("major");
            System.out.println(name+"  "+major);
        }
    }


    public static MongoDatabase connect(){
        MongoClient mongoClient=new MongoClient();
        mongoDatabase = mongoClient.getDatabase("Student");
        System.out.println("MongoDatabase is connected");
        return mongoDatabase;

    }
}


