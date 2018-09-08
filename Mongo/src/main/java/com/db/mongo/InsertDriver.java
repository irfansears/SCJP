package com.db.mongo;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class InsertDriver {

	public static void main(String[] args) {
		
		
		DB db= (new MongoClient("localhost",27017)).getDB("test");
		DBCollection dbcollection=db.getCollection("names");
		BasicDBObject basicdbobject=new BasicDBObject();
		basicdbobject.put("name", "sears");
		
		basicdbobject.put("school", "USA");
		dbcollection.insert(basicdbobject);
		
	}
}
