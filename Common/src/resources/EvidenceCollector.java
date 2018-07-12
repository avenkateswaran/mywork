package resources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import reporter.Reporter;


public class EvidenceCollector {

	private String AUTOMATIONFOLDER = "C:\\Automation";
	private String EVIDENCEFOLDER = "C:\\Automation\\Evidence";
	private DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
	private String screenshotFolder;
	private String logFile;
	private List<String> screenshots = new ArrayList<String>();
	private String currentTestSet;
	public Date testCaseStartTime;
	public Date testCaseEndTime;
	public Reporter reporter = new Reporter();
	
	// construct the object @BeforeClass
	public EvidenceCollector(String testClassName) throws Exception{
		if(new File(EVIDENCEFOLDER).exists() == false){
			new File(AUTOMATIONFOLDER).mkdir();
			new File(EVIDENCEFOLDER).mkdir();
		}
		if(new File(EVIDENCEFOLDER + "\\" + testClassName).exists() == false){
			new File(EVIDENCEFOLDER + "\\" + testClassName).mkdir();
		}

		currentTestSet = EVIDENCEFOLDER + "\\" + testClassName + "\\" + dateFormat.format(new Date());
		new File(currentTestSet).mkdir();
	}
	
	// here is the method to call @Before
	public void newTestCase() throws FileNotFoundException{
		if (testCaseStartTime == null){
			testCaseStartTime = new Date();
		}
		screenshotFolder = currentTestSet + "\\" + dateFormat.format(new Date());
		logFile = screenshotFolder  + ".txt";
		
		if(new File(logFile).exists() == false){
			new File(logFile);
			new File(screenshotFolder).mkdir();
			System.setErr((new PrintStream(new FileOutputStream(logFile))));
		}
	}

	// here is the method to call @After
	public void moveScreenshots() throws Exception {
		testCaseEndTime = new Date();
		//clear list
		screenshots.clear();
		// open log file
		BufferedReader br = new BufferedReader(new FileReader(logFile));
        String line = "";
        
		// find all lines containing screenshot paths
		// extract those pathsjects
        
        while ((line = br.readLine()) != null) {

            if (line.startsWith("SCREENSHOT saved:")) {
            	screenshots.add(line.substring(17)); // 17 is length of "SCREENSHOT saved:"
            }
        }
        br.close();
        
		// move those files to screenshotFolder
        for (String screenshotPath : screenshots)
        {
        	Files.move(Paths.get("C:\\Automation\\ScreenshotNew\\" + screenshotPath), Paths.get(screenshotFolder + "\\" + screenshotPath));
        }
        
	}
	
	// method to move screenshots and test data (.csv) over to test run folder
	public void moveScreenshotsAndTestData(String testDataFileName) throws Exception {
		this.moveScreenshots();
		//String testDataFilePath = Configurations.TEST_DATA_ROOT_FOLDER + testDataFileName;
		
		String testDataFilePath = testDataFileName;
		File f = new File(testDataFilePath);
		if (!f.exists()){
			
			
			testDataFilePath= Configurations.getDataRootFolder()+testDataFileName;
		}
		  Path path = Paths.get(testDataFilePath);
		Files.copy(path, Paths.get(currentTestSet + "\\" + path.getFileName()), StandardCopyOption.REPLACE_EXISTING);
		
	}
	
}
