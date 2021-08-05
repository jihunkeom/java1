package Day15;

public class Print extends Thread {
	
	// 스레드 이름 
	public Print(String name) {
		setName(name); //Thread 슈퍼클래스의 메소드 
		
	}
	
	@Override
	public void run() {
		for(int i=0; i<200000000; i++) {
			
		}
		
		System.out.println(getName());
	}

}
