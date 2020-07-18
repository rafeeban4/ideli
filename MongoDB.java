package MongoDb;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import javax.servlet.http.HttpServletRequest;

public class MongoDB {
	private MongoClient mongoClient;
	private MongoDatabase mongoDatabase;
	@SuppressWarnings("rawtypes")
	private MongoCollection collection;

	public MongoDB() {
		// Connect to Mongo account
		String uri = "mongodb+srv://admin:admin@mongodb-tfyyt.mongodb.net/test";
		MongoClientURI clientURI = new MongoClientURI(uri);
		mongoClient = new MongoClient(clientURI);

		// Connect to database and connection
		mongoDatabase = mongoClient.getDatabase("ideli");
		collection = mongoDatabase.getCollection("login");

	}
	public void announce(){
		String s;
		for (Document x : collection.find()) {
			s.concat("<div class=\"row text-center\">\n" +
					"                    <div class=\"col-sm-12 \"><p class=\"lead\">");
			s.concat(x.getString("timestamp")+": ");
			s.concat(x.getString("content")+"</p></div>\n" +
			"                </div>\n");
		}
		announce.innerHTML = s;
	}
	@SuppressWarnings("unchecked")
	public void insertToDatabase(HttpServletRequest request) {
		// Create a new document to insert into the database
		String name;
		if(request.getParameter("name") == null)
			name = "tempName";
		else
			name = request.getParameter("name");
		
		Document document = new Document("Name", name);
		
		// Insert request parameters into the document
		document.append("Parking Area", "West Campus Parking");
		document.append("Distance from Main Campus", translateForm(request.getParameter("distance")));
		document.append("Amount of Available Parking Spots", translateForm(request.getParameter("spots")));
		document.append("Ease of Entering/Exiting Parking Area", translateForm(request.getParameter("ease")));
		document.append("Busy Hours", translateForm(request.getParameter("hours")));
		
		// Insert document into the database
		collection.insertOne(document);
	}

	@SuppressWarnings("unchecked")
	public FindIterable<Document> getDataFromDatabase() {
		// Return all the documents in the database
		return collection.find();
	}
	
	// Translates the data in database to String words for front end
	public String translateDatabaseData(String element) {
		if(element.equals("1"))
			return "Pretty Bad...";
		else if(element.equals("2"))
			return "Adequate...";
		return "Pretty Good...";
	}
	
	// Translates data from frontend to be stored in database
	private String translateForm(String element) {
		if(element.contains("Good"))
			return "3";
		else if(element.contains("Adequate"))
			return "2";
		return "1";
	}
}
