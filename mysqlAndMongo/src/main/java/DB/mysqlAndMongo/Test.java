package DB.mysqlAndMongo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class Test {

	public static void main(String[] args) {

		try {
			
			DB db= (new MongoClient("localhost",27017)).getDB("test");
			DBCollection dbcollection=db.getCollection("names");
			
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","@zuhaib7");
			
			//create statement
			Statement myst= con.createStatement();
			
			//execute query
			ResultSet re= myst.executeQuery("select * from details");
			
			//get resultset
			while(re.next()) 
			{
				BasicDBObject basicdbobject=new BasicDBObject();
//				System.out.println(re.getInt("empid")+" "+re.getString("empname")+" "+re.getString("lastnmame"));
				basicdbobject.put("empid", re.getInt("empid"));
				basicdbobject.put("empname", re.getString("empname"));
				basicdbobject.put("lastnmame", re.getString("lastnmame"));
				dbcollection.insert(basicdbobject);
			}
			
		} catch (Exception e) {

			e.printStackTrace();
		System.out.println("connection failed");
		}
		System.out.println("done");
	}

}
