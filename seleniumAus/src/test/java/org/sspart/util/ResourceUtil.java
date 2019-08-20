package org.sspart.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ResourceUtil {
	
	public Properties props = null;
	
	public void locatorRead() {
		//File file  = new File("C:\\Users\\U6072903\\Desktop\\SampleGitProject\\seleniumAus\\src\\test\\resources\\locators\\First.loc");
		props = new Properties();

        File locatorFolder= new File("src/test/resources/locators");
 
		try {
			for(File eachFile : locatorFolder.listFiles()){
	            props.load(new FileInputStream(eachFile));
	        }
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	


}
