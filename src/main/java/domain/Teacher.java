package domain;

public class Teacher {
	// 강사 번호
	private int tNo;
	
	// 강사 이름
	private String name;
	
	// 강사 연락처
	private String contactInfomation;
	
	// 강사 이메일
	private String email;
	
	// 강사 전공
	private String major;
	
	// 강사 경력
	private int career;

	public Teacher() {
		super();
	}

	public Teacher(int tNo, String name, String contactInfomation, String email, String major, int career) {
		super();
		this.tNo = tNo;
		this.name = name;
		this.contactInfomation = contactInfomation;
		this.email = email;
		this.major = major;
		this.career = career;
	}

	public int getNo() {
		return tNo;
	}

	public void setNo(int tNo) {
		this.tNo = tNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactInfomation() {
		return contactInfomation;
	}

	public void setContactInfomation(String contactInfomation) {
		this.contactInfomation = contactInfomation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getCareer() {
		return career;
	}

	public void setCareer(int career) {
		this.career = career;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[강사 번호 : ");
		builder.append(tNo);
		builder.append(", 이름 : ");
		builder.append(name);
		builder.append(", 연락처 : ");
		builder.append(contactInfomation);
		builder.append(", 이메일 : ");
		builder.append(email);
		builder.append(", 전공 : ");
		builder.append(major);
		builder.append(", 경력 : ");
		builder.append(career);
		builder.append("]");
		return builder.toString();
	}
}
