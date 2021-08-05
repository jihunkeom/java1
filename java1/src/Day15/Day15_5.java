package Day15;

import java.util.Scanner;

public class Day15_5 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean sw = true;
		
		while (true) {
			System.out.println("[[[ 1.음악재생 2.영화재생 ]]]");
			int ch = scanner.nextInt();
			
			if (ch==1) {
				Thread th1 = new Music();
				
				if(sw) {
					Music.musicstop(sw);
					th1.start();
					sw = false;
				}
				else {
					Music.musicstop(sw);
					sw = true;
				}
				

						
			}
			else if (ch==2) {
				Thread th2 = new Movie();
				
				th2.start();
			}
		}
		
	}

}
