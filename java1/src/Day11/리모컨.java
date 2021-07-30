package Day11;

public interface 리모컨 {
	 //상수, 추상메소드 
	
	int 최대소음 = 10;
	int 최소소음 = 10;
	
	public void 실행();
	public void 종료();
	public void 소음설정(int 소음);
	
	// default 메소드들은 정의도 가능!
	public default void 채널변경() {
		System.out.println("channel changed!");
	}

}
