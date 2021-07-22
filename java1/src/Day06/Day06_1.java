package Day06;

public class Day06_1 {
	public static void main(String[] args) {
		//switch
		int 점수 = 80;
		switch(점수) {
			case 90 : {
				System.out.println("90점 입니다");
				break;
			}
			case 80 : {
				System.out.println("80점 입니다");
				break;
			}
			case 70 : {
				System.out.println("70점 입니다");
				break;
			}
			default : {
				System.out.println("탈락입니다");
				break;
			}
		}
		
		int 버튼 = 3;
		switch (버튼) {
			case 1: {
				System.out.println("button 1");
				break;
			}
			case 2: {
				System.out.println("button 2");
				break;
			}
			case 3 : {
				System.out.println("button 3");
				break;
			}
			default : {
				System.out.println("wrong");
				break;
			}
		}
		
		int 국어 = 80, 영어 = 80, 수학 = 90;
		int 평균 = (국어+영어+수학)/3;
		
		switch(평균/10) {
			case 9 : System.out.println("A"); break;
			case 8 : System.out.println("B"); break;
			default : System.out.println("Fail"); break;
		}
		
		
	}

}
