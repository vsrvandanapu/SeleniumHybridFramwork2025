package com.cts.factory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigProvider {
	
	protected static Properties pro;
	
	public ConfigProvider() {
		pro = new Properties();
		try {
			pro.load(new FileInputStream(new File("C:\\Users\\A1\\Desktop\\Workspace\\HybridFrameWork\\src\\test\\resources\\Configuration\\Config.properties")));
		} catch (FileNotFoundException e) {
			System.out.println("Exception handled..");
		} catch (IOException e) {
			System.out.println("Exception handled..");
		}
	}
	
	public String getKeyValue(String key) {
		String keyValue = pro.getProperty(key);
		return keyValue ;
	}

}
