package com.restapi.base;

import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {

		Properties prop= new Properties();
		prop.load(ReadPropertyFile.class.getClassLoader().getResourceAsStream("\\com\\restapi\\config\\config.properties\\config.properties"));
		System.out.println(prop);
	}

}
