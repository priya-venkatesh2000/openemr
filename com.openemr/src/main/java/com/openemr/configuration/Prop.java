package com.openemr.configuration;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Prop {
	
	public static String get(String PropertyName) {
		FileReader input=null;
		try {
			input= new FileReader("C:\\Users\\priya\\eclipse-framework\\com.openemr\\src\\main\\java\\com\\openemr\\configuration\\prop.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Properties p=new Properties();
		
		try {
			p.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String propertyvalue= p.getProperty(PropertyName);
				return propertyvalue;
	}

}
