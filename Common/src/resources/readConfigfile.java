package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class readConfigfile {
	public static String urlval=null;
	public static String browserval=null;
	
	public static void readConfig(){
		Properties prop = new Properties();
		InputStream input = null;
		
		

		try {
			String workingDir = System.getProperty("user.dir");	
			input = new FileInputStream(workingDir+"\\src\\main\\resources\\Config.properties");

			// load a properties file
			prop.load(input);

			// get the property value and print it out
			System.out.println(prop.getProperty("url"));
			System.out.println(prop.getProperty("browsertype"));
			browserval=prop.getProperty("browsertype");
			urlval=prop.getProperty("url");
			

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		
	}

}
