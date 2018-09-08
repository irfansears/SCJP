package com.db.mongo;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class QueryDriver {

	public static void main(String[] args) {

		DB db = (new MongoClient("localhost", 27017)).getDB("test");
		DBCollection dbcollection = db.getCollection("names");
		
		/*BasicDBObject basicdbobject = new BasicDBObject();
		basicdbobject.put("name", "saziya");
		DBCursor cursor=dbcollection.find(basicdbobject);
		while(cursor.hasNext()) System.out.println(cursor.next());*/
		
		
		DBCursor cursor=dbcollection.find();
		while(cursor.hasNext()) System.out.println(cursor.next());

	}
}
