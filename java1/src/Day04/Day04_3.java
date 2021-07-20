package Day04;

import java.util.Scanner;

public class Day04_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("가위바위보 ");
		
		System.out.println("사람 1: ");
		String per1 = input.next();
		System.out.println("사람 2: ");
		String per2 = input.next();
		
		if (per1.equals("가위")) {
			if (per2.equals("가위")) {
				System.out.println("무승부");
			}
			else if (per2.equals("바위")) {
				System.out.println("승자는 person2");
			}
			else {
				System.out.println("승자는 person1");
			}
		} else if (per1.equals("바위")) {
			if (per2.equals("바위")) {
				System.out.println("무승부");
			}
			else if (per2.equals("보")) {
				System.out.println("승자는 person2");
			}
			else {
				System.out.println("승자는 person1");
			}
		} else {
			if (per2.equals("보")) {
				System.out.println("무승부");
			}
			else if (per2.equals("가위")) {
				System.out.println("승자는 person2");
			}
			else {
				System.out.println("승자는 person1");
			}
		}
	}

}
