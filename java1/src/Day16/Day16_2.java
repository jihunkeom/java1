package Day16;

import java.util.Arrays;

public class Day16_2 {
	
	public static void main(String[] args) {
		
		코스<사람> 사람코스 = new 코스<사람>("일반인과정", 5);
		
		사람코스.추가(new 사람("강호동"));
		사람코스.추가(new 학생("유재석"));
		사람코스.추가(new 직장인("김모씨"));
		수강생출력(사람코스);
		
		코스<직장인> 직장인코스 = new 코스<>("직장인과정", 5);
		직장인코스.추가(new 직장인("강호동"));
		직장인코스.추가(new 직장인("김모씨"));
		수강생출력(직장인코스);
		
		코스<학생> 학생코스 = new 코스<>("학생과정", 5);
		학생코스.추가(new 학생("강호동"));
		학생코스.추가(new 학생("김모씨"));
		학생수강생출력(학생코스);
		
		코스<고등학생> 고등학생코스 = new 코스<>("고등학생과정", 5);
		고등학생코스.추가(new 고등학생("강호동"));
		고등학생코스.추가(new 고등학생("김모씨"));
		학생수강생출력(고등학생코스);
		
		직장인수강생출력(직장인코스);
		직장인수강생출력(사람코스);
		
	}
	
	// ?: 와일드카드 (모든 클래스에 대응 가능)
	// static: 정적할당 (프로그램 시작 시 메모리 할당 / 프로그램 종료시 메모리 초기화)
	public static void 수강생출력(코스<?> course) {
		System.out.println(course.get과정명() + "수강생명단 :" + Arrays.toString(course.get회원목록()));
		//Arrays.toString(배열): 배열 내 전체 요소들의 정보 출력 
		
	}
	
	// ? extends: 학생클래스 또는 학생클래스로부터 상속받은 클래스들만 
	public static void 학생수강생출력( 코스 < ? extends 학생> course) {
		System.out.println(course.get과정명() + "수강생 명단 : " + Arrays.toString(course.get회원목록()));
	}
	
	// ? super 직장인: 직장인클래스 또는 직장인클래스의 상위클래스들 
	public static void 직장인수강생출력( 코스 < ? super 직장인 > course) {
		System.out.println(course.get과정명() + "수강생 명단 : " + Arrays.toString(course.get회원목록()));
		
	}

}
