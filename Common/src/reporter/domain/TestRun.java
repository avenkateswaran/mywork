package reporter.domain;

import java.util.Date;

public class TestRun {

	private Boolean result;
	private Date startDateTime;
	private Date endDateTime;
	private String username;
	private String message;
	private Long generatedDataCount;
	private RecordType generatedDataType;
	private TestSuite testSuite;
	public Boolean getResult() {
		return result;
	}
	public void setResult(Boolean result) {
		this.result = result;
	}

	public Date getStartDateTime() {
		return startDateTime;
	}
	public void setStartDateTime(Date startDateTime) {
		this.startDateTime = startDateTime;
	}
	public Date getEndDateTime() {
		return endDateTime;
	}
	public void setEndDateTime(Date endDateTime) {
		this.endDateTime = endDateTime;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Long getGeneratedDataCount() {
		return generatedDataCount;
	}
	public void setGeneratedDataCount(Long generatedDataCount) {
		this.generatedDataCount = generatedDataCount;
	}
	public RecordType getGeneratedDataType() {
		return generatedDataType;
	}
	public void setGeneratedDataType(RecordType generatedDataType) {
		this.generatedDataType = generatedDataType;
	}
	public TestSuite getTestCase() {
		return testSuite;
	}
	public void setTestCase(TestSuite testSuite) {
		this.testSuite = testSuite;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
