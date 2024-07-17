package com.securian.setup;

import static org.slf4j.LoggerFactory.getLogger;

import org.slf4j.Logger;

import com.securian.utilities.GlobalParams;
import com.securian.utilities.PropertyUtils;


public class Base {
	public static Logger logger = getLogger(Base.class);
	
	/**
	 * This method is used to get the environment and set the configuration properties file based on environment
	 * 
	 */
	public String setEnvironment() {
		String environment = System.getProperty("testEnv", "QA");
		String envConfigFile = null;
		if(environment != null) {
			envConfigFile = "config/".concat(environment).concat(".properties");
		} else {
			logger.info("Environment not set");
		}
		return envConfigFile;
	}
	
	/**
	 * This method reads the data from configuration properties file and set in a global map
	 * 
	 */
	public void setEnvironmentConfig() {
		GlobalParams.setEnvProperties(
				PropertyUtils.getProperties(new PropertyUtils().getFileFromResource(setEnvironment())));
	}
	
	public String getBrowser() {
		return System.getProperty("browser", "Chrome");
	}
}