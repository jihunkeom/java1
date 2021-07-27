package Day08;

public class Day08_1 {
	
	public static void main(String[] args) {
		Member member = new Member();
		
		Member member2 = new Member("samkeom", "sam", 1111, "Keom", "samkeom@korea.ac.kr");
		
		Member member3 = new Member("asd", 32);
		
		member3.info();
		String a = member2.getEmail();
		System.out.println(a);
		
		member2.setName("금지헌");
	}

}
