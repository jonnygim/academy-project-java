package domain;

public class LectureInformation {
	
	// 강의 이름
	private String lectureInfoName;
	
	// 시험 이름
	private String testName;
	
	// 강의 시작일
	private String StartDate;
	
	// 강의 종료일
	private String EndDate;
	
	public LectureInformation() {
		super();
	}

	public LectureInformation(String lectureInfoName, String testName, String startDate, String endDate) {
		super();
		this.lectureInfoName = lectureInfoName;
		this.testName = testName;
		StartDate = startDate;
		EndDate = endDate;
	}

	public String getLetureName() {
		return lectureInfoName;
	}

	public void setLetureName(String lectureInfoName) {
		this.lectureInfoName = lectureInfoName;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public String getStartDate() {
		return StartDate;
	}

	public void setStartDate(String startDate) {
		StartDate = startDate;
	}

	public String getEndDate() {
		return EndDate;
	}

	public void setEndDate(String endDate) {
		EndDate = endDate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[강의명 : ");
		builder.append(lectureInfoName);
		builder.append(", 시험명 : ");
		builder.append(testName);
		builder.append(", 개강일 : ");
		builder.append(StartDate);
		builder.append(", 종강일 : ");
		builder.append(EndDate);
		builder.append("]");
		return builder.toString();
	}
	
}
