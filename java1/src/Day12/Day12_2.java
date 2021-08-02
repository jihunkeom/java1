package Day12;

public class Day12_2 {
	
	public static void main(String[] args) {
		
		//예외 던지기 
			// 특정 위치에서 예외 처리 한 번에 처리
			// 형테: 메소드명() throws Exception
				//메소드 호출했던 곳으로 예시 전달
		
		try {
			예외클래스.예외함수();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
