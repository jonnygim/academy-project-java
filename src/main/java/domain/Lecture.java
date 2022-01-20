package domain;

public class Lecture {

	// 진행중인 강의 고유 이름
	private String lectureName;
	
	// 강사
	private Teacher teacher;
	
	// 강의 정보
	private LectureInformation lectureInformation;
	
	// 수강생 정보
	private Student student;

	public Lecture() {
		super();
	}

	public Lecture(String lectureName, Teacher teacher, LectureInformation lectureInformation, Student student) {
		super();
		this.lectureName = lectureName;
		this.teacher = teacher;
		this.lectureInformation = lectureInformation;
		this.student = student;
	}

	public String getLectureName() {
		return lectureName;
	}

	public void setLectureName(String lectureName) {
		this.lectureName = lectureName;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public LectureInformation getLectureInformation() {
		return lectureInformation;
	}

	public void setLectureInformation(LectureInformation lectureInformation) {
		this.lectureInformation = lectureInformation;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n * 강의 이름 : ");
		builder.append(lectureName);
		builder.append("\n * 강사 정보 : ");
		builder.append(teacher);
		builder.append("\n * 강의 정보 : ");
		builder.append(lectureInformation);
		builder.append("\n * 수강생 정보 : ");
		builder.append(student);
		return builder.toString();
	}
	
}
