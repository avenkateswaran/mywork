package reporter;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import reporter.domain.RecordType;
import reporter.domain.TestRun;
import reporter.domain.TestSuite;
import resources.Configurations;

public class Reporter {
	
	public String message;
	
	// returns true if success
	public void createReport(Date startTime, Date endTime, Boolean result, int testSuiteId, int generatedDataType, int generatedDataCount) throws Exception{
		// create the test case
		TestSuite testSuite = new TestSuite();
		testSuite.setId((long) testSuiteId);
		

		// create test run
		TestRun testRun = new TestRun();
		testRun.setResult(result);
		testRun.setUsername(System.getProperty("user.name"));
		
		
		// test data type
		
		if(generatedDataType>0) {
			RecordType recordType = new RecordType();
			recordType.setId((long) generatedDataType);			
			testRun.setGeneratedDataType(recordType);
		}
		
		testRun.setGeneratedDataCount((long) generatedDataCount);
		testRun.setTestCase(testSuite);
		testRun.setStartDateTime(startTime);
		testRun.setEndDateTime(endTime);
		if (message != null && message != ""){
			testRun.setMessage(message);
			message = null;
		}
			
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").create(); 
		sendReport(gson.toJson(testRun));
	}
	
	public void createReport(Date startTime, Date endTime, Boolean result, int testSuiteId) throws Exception{
		// create the test case
		TestSuite testSuite = new TestSuite();
		testSuite.setId((long) testSuiteId);

		// create test run
		TestRun testRun = new TestRun();
		testRun.setResult(result);
		testRun.setUsername(System.getProperty("user.name"));
		testRun.setTestCase(testSuite);
		testRun.setStartDateTime(startTime);
		testRun.setEndDateTime(endTime);
		if (message != null && message != ""){
			testRun.setMessage(message);
			message = null;
		}
		
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").create(); 
		sendReport(gson.toJson(testRun));
	}
	
	private static Boolean sendReport(String json) throws Exception {
		
		try{
			URL obj = new URL(Configurations.REPORTING_SERVER);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();

			con.setRequestMethod("POST");
			con.setRequestProperty("Content-Type", "application/json");
			con.setDoOutput(true);
		    
			OutputStream os = con.getOutputStream();
		    os.write(json.getBytes());
		    os.flush();
			
			if (con.getResponseCode() == 201){
				return true;
			}
			else{
				String error = String.format("Failure to submit %s, HTTP code %d", json, con.getResponseCode());
				System.out.println(error);
				return false;
			}
		}
		catch (Exception e){
			System.out.println(e.getMessage());
			String error = String.format("Failure to submit %s", json);
			System.out.println(error);
			return false;
		}

	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}