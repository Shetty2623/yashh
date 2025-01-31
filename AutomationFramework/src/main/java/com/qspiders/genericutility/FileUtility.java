package com.qspiders.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * @author Chetan
 */

public class FileUtility {
	/**
	 * this method is used to get data from property file
	 * 
	 * @param key
	 * @return
	 * @throws IOException
	 */

	public String getDataFromProperty(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/main/resources/TestData/commondata.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);

	}
}
