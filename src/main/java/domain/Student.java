package domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
	
	// 수강생 번호
	private int sNo;
	
	// 수강생 이름
	private String name;
	
	// 수강생 연락처
	private String contactInformation;
	
	// 수강하고 있는 강의
	private String lectureName;
	
	// 등록 날짜
	private String regDate;
	
	public Student() {
		super();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[학생 정보 : ");
		builder.append(sNo);
		builder.append(", 이름 : ");
		builder.append(name);
		builder.append(", 연락처 : ");
		builder.append(contactInformation);
		builder.append(", 수강중인 강의 : ");
		builder.append(lectureName);
		builder.append(", 등록날짜 : ");
		builder.append(regDate);
		builder.append("]");
		return builder.toString();
	}
}
