package com.erhan.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class US_02_ConfigsReader {
	
	private static Properties prop;
	
	public static void readProperties(String filePath) {
		
		FileInputStream fis;
		
		try {
			
			fis = new FileInputStream(filePath);
			
			prop = new Properties();
			
			prop.load(fis);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static String getProperty(String key) {
		
		return prop.getProperty(key);
		
	}

}
