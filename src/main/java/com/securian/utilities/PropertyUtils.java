package com.securian.utilities;

import static org.slf4j.LoggerFactory.getLogger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.slf4j.Logger;

public class PropertyUtils {
	public static Logger logger = getLogger(PropertyUtils.class);

	/**
	 * This method read the data from properties file and returns the data based on the key
	 * 
	 * @param fileName
	 * @param name
	 *
	 * @return string
	 */
	public static String getData(String fileName, String name) {
		File file = new File(fileName);
		FileInputStream fileInput = null;
		Properties prop = new Properties();
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			logger.error(" Exception occurred : ", e.getMessage());
		}
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			logger.error(" Exception occurred : ", e.getMessage());
		}

		return (prop.getProperty(name));
	}

	/**
	 * This method read the data from properties file and stores in a map
	 * 
	 * @param file
	 *
	 * @return propertiesMap
	 */
	public static HashMap<String, String> getProperties(String file) {
		Properties getProperties = new Properties();
		FileInputStream inputStream = null;
		HashMap<String, String> propertyMap = new HashMap<String, String>();
		try {
			inputStream = new FileInputStream(file);
			getProperties.load(inputStream);
			propertyMap.putAll((Map) getProperties);
		} catch (IOException e) {
			logger.error(" Exception occurred : ", e.getMessage());
		}

		return propertyMap;
	}

	/**
	 * This method read the data from properties file and stores in a map
	 * 
	 * @param file
	 *
	 * @return propertiesMap
	 */
	public static HashMap<String, String> getProperties(File file) { // throws FileNotFoundException
		HashMap<String, String> propertiesMap = new HashMap<String, String>();
		try {
			FileReader fileReader = new FileReader(file);

			Properties properties = new Properties();
			properties.load(fileReader);
			for (Map.Entry<Object, Object> entry : properties.entrySet()) {
				propertiesMap.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
			}
		} catch (IOException ex) {
			logger.error(" Exception occurred : ", ex.getMessage());
		}
		return propertiesMap;
	}

	/**
	 * This method gets the file from the resources directory of the project based on the filename
	 * 
	 * @param fileName
	 *
	 * @return File
	 */
	public File getFileFromResource(String fileName) {
		URL resource = this.getClass().getClassLoader().getResource(fileName);
		if (resource == null) {
			throw new IllegalArgumentException("File not found! " + fileName);
		} else {
			return new File(resource.getFile());
		}
	}
}