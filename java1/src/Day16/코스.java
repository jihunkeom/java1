package Day16;

public class 코스 <T> {
	
	private String 과정명;
	private T[] 회원목록;
	
	public 코스(String 과정명, int 인원수) {
		this.과정명 = 과정명;
		//this.회원목록 = new T[인원수];
		//불가 -> 제네릭 타입으로는 메모리할당 불가 
		
		this.회원목록 = (T[])new Object[인원수];
		
	}
	
	// 배열에 추가하는 메소드 
	public void 추가(T 매개객체) {
		for(int i=0; i<회원목록.length; i++) {
			if(회원목록[i] == null) {
				회원목록[i] = 매개객체;
				break;
			}
		}
	}

	public String get과정명() {
		return 과정명;
	}

	public void set과정명(String 과정명) {
		this.과정명 = 과정명;
	}

	public T[] get회원목록() {
		return 회원목록;
	}

	public void set회원목록(T[] 회원목록) {
		this.회원목록 = 회원목록;
	}
	
	

}
