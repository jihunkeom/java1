package Day11;

public class Car {
	
	Tire fl = new Tire("앞왼쪽", 10);
	Tire fr = new Tire("앞오른쪽", 8);
	Tire bl = new Tire("뒤왼쪽", 9);
	Tire br = new Tire("뒤오른쪽", 4);
	
	public int run() {
		System.out.println("드라이브");
		
		if(fl.rotate()==false) {
			stop();
			return 1;
		}
		if(fr.rotate()==false) {
			stop();
			return 2;
		}
		if(bl.rotate()==false) {
			stop();
			return 3;
		}
		if(br.rotate()==false) {
			stop();
			return 4;
		}
		return 0;
	}
	
	public void stop() {
		System.out.println("주차");
		
		
	}
	

}
