package Day11;

public class Tire {
	
	int duration;
	int circles = 0;
	String location;
	
	public Tire(String loc, int life) {
		this.duration = life;
		this.location = loc;
	}
	
	public boolean rotate() {
		circles ++;
		if (circles < duration) {
			System.out.println(location+"타이어 수명 " + (duration-circles) + "회 남음 ");
			return true;
		} else {
			System.out.println(location+" 타이어 펑크 ");
			return false;
		}
	}
	

}
