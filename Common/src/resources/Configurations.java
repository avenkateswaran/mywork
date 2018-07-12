package resources;

import java.io.File;

public class Configurations {
	public final static String TEST_DATA_ROOT_FOLDER = "\\Automation\\Data\\";
	public final static String REPORTING_SERVER = "http://automation:8080/testruns";
	
	public static String getDataRootFolder(){
		String path = "";
		File f = new File("E:\\");
		if (f.exists()){
			path = "E:"+Configurations.TEST_DATA_ROOT_FOLDER;
		} else{
			path = "C:"+Configurations.TEST_DATA_ROOT_FOLDER;
		}
		
		return path;
	}
}
