package Day10;

import java.util.Scanner;

public class Day10_3 {
	// ATM 클래스 
	
		// main 밖에 선언하는 이유 : 다른 클래스나 다른 패키지에서 호출하기위해 
		public static Account[] accounts = new Account[100];
			// 계좌객체 100개를 저장할수 있는 배열 
		
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			while(true) {
				System.out.println("1.신한은행 2.국민은행");
				int bank = scanner.nextInt();
				while(true) {
					System.out.println("1.계좌생성");
					System.out.println("2.계좌입금");
					System.out.println("3.계좌출금");
					System.out.println("4.계좌이체");
					System.out.println("5.뒤로가기");
					int ch = scanner.nextInt();
					if( ch == 1 && bank ==1  ) {
						Sbank sbank = new Sbank();
						sbank.create();
					}
					if( ch == 2&& bank ==1  ) {
						Sbank sbank = new Sbank();
						
						sbank.deposit();
					}
					if( ch == 3 && bank ==1  ) {
						Sbank sbank = new Sbank();
						sbank.withdraw();
					}
					if( ch == 4  ) {}
					if( ch == 5  ) { break;}
				}
			}
		}

}
