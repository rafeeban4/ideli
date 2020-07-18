package servlet;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;
import org.bson.conversions.Bson;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.set;

public class temp {
    public static void main(String[] args) {
        String uri = "mongodb+srv://admin1:Admin1@cluster0.78zu6.mongodb.net/test";
        MongoClientURI clientURI = new MongoClientURI(uri);
        MongoClient mongoClient = new MongoClient(clientURI);

        // Connect to database and connection
        MongoDatabase mongoDatabase = mongoClient.getDatabase("ideli");
        MongoCollection collection = mongoDatabase.getCollection("login");

        Bson filter = eq("logged in", "false");
        Bson updateOperation = set("logged in", "true");
        UpdateResult updateResult = collection.updateOne(filter, updateOperation);

    }
}
