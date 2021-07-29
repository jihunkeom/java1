package Day10;

public class 학생 extends 사람 {
	
	private int 학년;
	
	public 학생() {
		super();
	}

	

	public 학생(String 이름, int 나이, int 학년) {
		super(이름, 나이); //슈퍼클래스의 생성자
		this.학년 = 학년;		
	}


	public int get학년() {
		return 학년;
	}

	public void set학년(int 학년) {
		this.학년 = 학년;
	}



	@Override
	public void 정보() {
		super.정보();
		System.out.println("학년: " + 학년);
	}
	
	
	

}
