package Day10;

public class Vip extends 회원 {
	String level;
	
	public Vip() {
		super();
	}

	public Vip(String id, String pwd, String level) {
		super(id, pwd);
		this.level = level;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	@Override
	public void 정보() {
		// TODO Auto-generated method stub
		super.정보();
		System.out.println("level: "+ level);
	}
	
	
}
