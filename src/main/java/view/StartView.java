package view;

import controller.AcademyProjectController;
import domain.Lecture;
import domain.LectureInformation;
import domain.Student;
import domain.Teacher;

public class StartView {

	public static void main(String[] args) {
		
		// 강사
		// 번호, 이름, 연락처, 이메일, 전공, 경력
		Teacher teacher1 = new Teacher(11, "김종원", "010-1111-2222", "jongwon@playdata.com", "영어", 5);
		Teacher teacher2 = new Teacher(22, "윤지원", "010-3333-2322", "jiwon@playdata.com", "중국어", 6);
		Teacher teacher3 = new Teacher(33, "김예지", "010-9877-6544", "yeji@playdata.com", "일본어", 3);

		// 수강생
		// 번호, 이름, 연락처, 수업명, 등록날짜
		Student student1 = new Student(1, "김정민", "010-4567-3453", "jlptN2반", "2022-01-11");
		Student student2 = new Student(2, "조선하", "010-3232-4555", "HSK5급반", "2021-12-5");
		Student student3 = new Student(3, "이혜지", "010-2342-2525", "flex일본어", "2022-01-02");
		Student student4 = new Student(4, "강찬표", "010-5253-4543", "TOEFL주5일고급특강", "2021-11-23");
		Student student5 = new Student(5, "박지민", "010-4333-6567", "한달완성900점", "2022-01-09");
		Student student6 = new Student(6, "한지수", "010-2222-2344", "HSK5급반", "2021-10-25");
		Student student7 = new Student(7, "장선형", "010-4235-5667",  "TOEFL주5일고급특강", "2021-09-30");
		Student student8 = new Student(8, "도재현", "010-1445-0999", "flex일본어", "2022-01-07");

		// 강의
		// 강의 이름, 강사, 시험이름, 개강날짜, 종강날짜
		LectureInformation lectureInformation1 = new LectureInformation("한달완성900점", "TOEIC", "2022-02-01", "2022-03-01");
		LectureInformation lectureInformation2 = new LectureInformation("HSK5급반", "HSK", "2022-02-05", "2022-04-04");
		LectureInformation lectureInformation3 = new LectureInformation("jlptN2반", "jlpt", "2022-02-10", "2022-04-09");
		LectureInformation lectureInformation4 = new LectureInformation("TOEFL주5일고급특강", "TOEFL", "2022-01-24", "202202-28");
		LectureInformation lectureInformation5 = new LectureInformation("flex일본어", "flex", "2022-01-31", "2022-02-20");

		// 진행중인 강의
		Lecture toeicTest = new Lecture("01한달완성900점", teacher1, lectureInformation1, student5);
		Lecture hskTest = new Lecture("02HSK5급반", teacher2, lectureInformation2, student2);
		Lecture jlptTest = new Lecture("03jlptN2반",  teacher3, lectureInformation3, student1);
		Lecture toeflTest = new Lecture("04TOEFL주5일고급특강", teacher1, lectureInformation4, student4);
		Lecture flexTest = new Lecture("05flex일본어", teacher3, lectureInformation4, student3);
		
		AcademyProjectController controller = AcademyProjectController.getInstance();
		
		System.out.println("---- 강의 개설 ----");
		controller.lectureInsert(toeicTest);
		controller.lectureInsert(hskTest);
		controller.lectureInsert(jlptTest);
		controller.lectureInsert(toeflTest);
		controller.lectureInsert(flexTest);

		// 개설된 모든 강의 정보 출력
		System.out.println("\n--- 모든 강의 정보 ---");
		controller.getLectureList();

		// 강의 정보 검색
		System.out.println("\n\n--- 04TOEFL주5일고급특강 강의 검색 ---");
		controller.getLecture("04TOEFL주5일고급특강");
		
		System.out.println("\n--- 05flex일본어 강의 검색 ---");
		controller.getLecture("05flex일본어");

		// 수강생 정보 출력
		System.out.println("\n\n--- 04TOEFL주5일고급특강 수강생 정보 ---");
		controller.getLectureStudent("04TOEFL주5일고급특강");
		
		System.out.println("\n--- 05flex일본어 수강생 정보 ---");
		controller.getLectureStudent("05flex일본어");

		// 강사 정보 출력
		System.out.println("\n\n--- 04TOEFL주5일고급특강 강사 정보 ---");
		controller.getLectureTeacher("04TOEFL주5일고급특강");
		
		System.out.println("\n--- 05flex일본어 강사 정보 ---");
		controller.getLectureTeacher("05flex일본어");

		// 04TOEFL주5일고급특강 강의 개강 날짜 변경 및 검색
		System.out.println("\n\n--- 04TOEFL주5일고급특강 강의 개강 날짜 변경 ---");
		controller.lectureDateUpdate("04TOEFL주5일고급특강", "2022-02-01");
		
		// 04TOEFL주5일고급특강 강사 변경
		System.out.println("\n\n--- 04TOEFL주5일고급특강 강사 변경 ---");
		controller.lectureTeacherUpdate("04TOEFL주5일고급특강", teacher2);

		// 04TOEFL주5일고급특강 수강생 변경
		System.out.println("\n\n--- 04TOEFL주5일고급특강 수강생 변경 ---");
		controller.lectureStudentUpdate("04TOEFL주5일고급특강", student7);
		
		// 04TOEFL주5일고급특강 강의 삭제
		System.out.println("\n\n--- 04TOEFL주5일고급특강 강의 삭제 ---");
		controller.lectureDelete("04TOEFL주5일고급특강");
		controller.getLecture("04TOEFL주5일고급특강");
	}
}
