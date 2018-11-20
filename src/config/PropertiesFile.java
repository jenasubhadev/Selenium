package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.FirstSeleniumTest;

public class PropertiesFile {
	static Properties prop = new Properties(); 
	public static void main(String[] args) {
		//Create an object of class Properties class
		readPropertiesFile();
		writePropertiesFile();
		readPropertiesFile();
	}

	public static void readPropertiesFile(){

		//Create an object of class InputStream
		try {
			InputStream input = new FileInputStream("C:\\Users\\Subha Dev Jena\\workspace\\SeleniumTesting\\src\\config\\config.properties");
			prop.load(input);
			System.out.println(prop.getProperty("browser"));
			FirstSeleniumTest.browser=prop.getProperty("browser");
			System.out.println(FirstSeleniumTest.browser);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	public static void writePropertiesFile(){
		try {
			OutputStream output = new FileOutputStream("C:\\Users\\Subha Dev Jena\\workspace\\SeleniumTesting\\src\\config\\config.properties");
			prop.setProperty("browser", "Chrome");
			prop.store(output, null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}



