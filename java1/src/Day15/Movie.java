package Day15;

public class Movie extends Thread {
	
	@Override
	public void run() {
		while (true) {
			System.out.println("영화 재생 ");
			
			try {
				Thread.sleep(2000);
			}
			catch (Exception e) {
				
			}
			
		}
	}

}
