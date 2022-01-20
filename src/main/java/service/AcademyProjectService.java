package service;

import java.util.ArrayList;

import exception.LectureNameDuplicationException;
import exception.LectureNotFoundException;
import domain.Lecture;
import domain.Student;
import domain.Teacher;

public class AcademyProjectService {
	private static AcademyProjectService instance = new AcademyProjectService();
	
	private AcademyProjectService() {}
	public static AcademyProjectService getInstance() {
		return instance;
	}
	
	private ArrayList<Lecture> lectureList = new ArrayList<Lecture>();
	
	// 모든 강의 검색
	public ArrayList<Lecture> getLectureList() {
		return lectureList;
	}
	
	// 강의 생성
	public void lectureInsert(Lecture lecture) throws LectureNameDuplicationException {
		for(Lecture l : lectureList) {
			if(l.getLectureName().equals(lecture.getLectureName())) {
				throw new LectureNameDuplicationException("이미 존재하는 강의입니다.");
			}
		}
		lectureList.add(lecture);
	}
	
	// 강의 정보 검색
	public Lecture getLecture(String lectureName) throws LectureNotFoundException {
		for(Lecture l : lectureList) {
			if(l.getLectureName().equals(lectureName)) {
				return l;
			}
		}
		throw new LectureNotFoundException("요청하신 강의는 존재하지 않습니다.");
	}
	
	// 강의 이름으로 수강생 출력
	public Lecture getLectureStudent(String lectureName) throws LectureNotFoundException {
		for(Lecture l : lectureList) {
			if(l.getLectureName().equals(lectureName)) {
				return l;
			}
		}
		throw new LectureNotFoundException("요청하신 강의는 존재하지 않습니다.");
	}
	
	// 강의 이름으로 강사 출력
	public Lecture getLectureTeacher(String lectureName) throws LectureNotFoundException {
		for(Lecture l : lectureList) {
			if(l.getLectureName().equals(lectureName)) {
				return l;
			}
		}
		throw new LectureNotFoundException("요청하신 강의는 존재하지 않습니다.");
	}
	
	// 강의 개강 날짜 변경
	public boolean lectureDateUpdate(String lectureName, String information) {
		for(Lecture l : lectureList) {
			if(l.getLectureName().equals(lectureName)) {
				l.getLectureInformation().setStartDate(information);
				return true;
			}
		}
		return false;
	}
	
	// 강의 강사 변경
	public boolean lectureTeacherUpdate(String lectureName, Teacher teacher) {
		for(Lecture l : lectureList) {
			if(l.getLectureName().equals(lectureName)) {
				l.setTeacher(teacher);
				return true;
			}
		}
		return false;
	}
	
	// 강의 수강생 정보 변경
	public boolean lectureStudentUpdate(String lectureName, Student student) {
		for(Lecture l : lectureList) {
			if(l.getLectureName().equals(lectureName)) {
				l.setStudent(student);
				return true;
			}
		}
		return false;
	}
	
	// 강의 삭제
	public boolean lectureDelete(String lectureName) {
		Lecture lecture = null;
		int count = lectureList.size();
		
		for(int i = 0; i < count; i++) {
			lecture = lectureList.get(i);
			
			if(lecture.getLectureName().equals(lectureName)) {
				lectureList.remove(i);
				return true;
			}
		}
		return false;
	}
}
