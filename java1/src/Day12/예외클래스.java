package Day12;

public class 예외클래스 {
	
	
	public static void 예외함수() throws Exception {
				
		//forname: 클래스 찾기 -> class.forname("클래스명"): 무조건 예외 발생 => 클래스가 없을 경우의 수 
		Class class1 = Class.forName("문자클래스");
	}

}
