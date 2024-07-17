package com.securian.utilities;

import java.util.HashMap;

/**
 * This class is used to declare all the static variables accessed via getter and setters which is used across the framework
 * 
 */
public class GlobalParams {
	private static HashMap<String, String> envProperties;

	public static void setEnvProperties(HashMap<String, String> envProperties) {
		GlobalParams.envProperties = envProperties;
	}
	
	public static HashMap<String, String> getEnvProperties() {
		return envProperties;
	}
}