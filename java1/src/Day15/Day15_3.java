package Day15;

public class Day15_3 {
	
	// 스레드 우선순위  
		//여러 개의 스레드는 운영체제로부터 스케줄링을 받기 때문에 사용자가 조정할 수 없음 (랜덤 순서로 스레드 실행된다~)
			//바꾸고 싶으면 priority 설정하자 (조금이나마 순서 조정가능 )(완전 조정은 안됨) 
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			Thread thread = new Print("스레드번호 " + i);
			
			//우선순위 
			if (i!=9) {
				thread.setPriority(Thread.MIN_PRIORITY); //9번 아니면 낮은 우선 순위 설정 
			}
			else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			
			thread.start();
		}
		
	}

}
