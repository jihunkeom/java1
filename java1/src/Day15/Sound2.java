package Day15;

import java.awt.Toolkit;

public class Sound2 implements Runnable {
	
	@Override
	public void run() {
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
