package resources.test;


import java.util.Date;

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import reporter.domain.RecordType;
import reporter.domain.TestSuite;
import reporter.domain.TestRun;

public class ReporterTest {

	@Test
	public void test() {
		// create the test case
		TestSuite testSuite = new TestSuite();
		testSuite.setId((long) 1);
		// test data type
		RecordType recordType = new RecordType();
		recordType.setId((long) 1);

		// create test run
		TestRun testRun = new TestRun();
		testRun.setResult(true);
		testRun.setUsername(System.getProperty("user.name"));
		testRun.setGeneratedDataType(recordType);
		testRun.setGeneratedDataCount((long)10);
		testRun.setTestCase(testSuite);
		testRun.setStartDateTime(new Date());
		testRun.setEndDateTime(new Date());

		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").create();
		System.out.println(gson.toJson(testRun));
	}

}
