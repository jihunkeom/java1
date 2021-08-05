package Day15;

import java.awt.Toolkit;

public class Sound extends Thread {
	
	@Override
	public void run() { //multi thread method
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0;i<5; i++) {
			toolkit.beep();
			
			try {
				Thread.sleep(800);
			}
			catch (Exception e) {
				
			}
		}
		
	}

}
