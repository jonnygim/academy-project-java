package view;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;

import domain.Lecture;

public class EndView {

	// 개설된 모든 강의 출력
	public static void lectureListView(ArrayList<Lecture> allLecture) {
		Optional<Object> datas = Optional.ofNullable(allLecture);

		allLecture.stream().forEach(v -> {
			System.out.println("[진행 중인 project] " + v);
		});

		datas.orElse("현재 개설된 강의가 없습니다.");
	}

	// 강의 이름 입력 받아 출력
	public static void lectureView(Lecture lecture) {
		if (lecture != null) {
			System.out.println(lecture);
		} else {
			System.out.println("해당 강의는 존재하지 않습니다.");
		}
	}

	// 수강생 정보 출력
	public static void lectureStudentView(Lecture lecture) {
		if (lecture.getStudent() != null) {
			System.out.println(lecture.getStudent());
		} else {
			System.out.println("해당 강의의 학생이 존재하지 않습니다.");
		}
	}
	
	// 강사 정보 출력
	public static void lectureTeacherView(Lecture lecture) {
		if(lecture.getTeacher() != null) {
			System.out.println(lecture.getTeacher());
		}else {
			System.out.println("해당 강의의 강사가 존재하지 않습니다.");
		}
	}
	
	// 성공시 출력
	public static void successView(String message) {
		System.out.println(message);
	}

}
