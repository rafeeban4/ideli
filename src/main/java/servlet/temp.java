package servlet;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class temp {
    public static void main(String[] args) {
        String uri = "mongodb+srv://admin1:Admin1@cluster0.78zu6.mongodb.net/test";
        MongoClientURI clientURI = new MongoClientURI(uri);
        MongoClient mongoClient = new MongoClient(clientURI);

        // Connect to database and connection
        MongoDatabase mongoDatabase = mongoClient.getDatabase("ideli");
        MongoCollection collection = mongoDatabase.getCollection("announcements");
        StringBuilder s = new StringBuilder();
        FindIterable<Document> data = collection.find();
        for (Document x : data) {
            s.append("<div class=\"row text-center\">\n" +
                    "                    <div class=\"col-sm-12 \"><p class=\"lead\">");
            s.append(x.get("_id")+"</p></div>\n" +
                    "                </div>\n");
        }
        System.out.println(s.toString());
    }
}
