package Day16;

import java.util.Arrays;
import java.util.Scanner;

public class Day16_3 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		People<Kid> kids = new People("어린이", 5);
		People<Teen> teens = new People("청소년들", 5);
		People<Adult> adults = new People("어른들", 5);
		
		while (true) {
			System.out.println("메뉴 1.명단추가 2.명단출력 ");
			
			
			int ch = scanner.nextInt();
			if(ch==1) {
				System.out.println("name");
				String name = scanner.next();
				
				System.out.println("age");
				int age = scanner.nextInt();
				
				if (age<8) {
					kids.add(new Kid(name, age));
				}
				else if (age>7 && age <20) {
					teens.add(new Teen(name, age));
				}
				else {
					adults.add(new Adult(name, age));
				}
				
				
			}
			
			if (ch==2) {
				print(kids);
				print(teens);
				print(adults);
			}
			
		}
	}
	
	public static void print(People <?> people) {
		System.out.println(Arrays.toString(people.getList()));
	}
	

}
