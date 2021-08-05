package Day15;

public class Music extends Thread {
	
	static boolean msw = true;
	
	public static void musicstop(boolean sw) {
		msw = sw;
		
		if(msw) {
			System.out.println("music start");
		} else {
			System.out.println("music stop");
		}
		
	}
	
	@Override
	public void run() {
		
		while (msw) {
			System.out.println("음악 재생 ");
			
			try {
				Thread.sleep(2000);
			}
			catch (Exception e) {
				
			}
			
		}
	
		
	}

}
