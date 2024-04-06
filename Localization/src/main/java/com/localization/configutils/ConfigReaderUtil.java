package com.localization.configutils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReaderUtil {

	private Properties prop;
	private FileInputStream fip;
	
	
	public Properties initializeLanguageProprties(String language) throws IOException {
		
		System.out.println("Language selected :" + language);
		
		prop = new Properties();
		
		switch(language.toLowerCase()) {
		case "english":
			fip = new FileInputStream("src\\main\\resources\\lang.eng.properties");
			break;
		case "french":
			fip = new FileInputStream("src\\main\\resources\\lang.french.properties");
			break;
		case "russian":
			fip = new FileInputStream("src\\main\\resources\\lang.russian.properties");
			break;
		default:
			break;
		}
		 
		prop.load(fip);
		return prop;
		
	}
}
