package Day07;

import java.util.Random;
import java.util.Scanner;

public class Day07_2 {
	public static void main(String[] args) {
		//로또판별기
		Scanner scanner = new Scanner(System.in);
		int[] nums = new int[6];
		Random random = new Random();
		int[] answers = new int[6];
		
		for (int i=0; i<6; i++) {
			System.out.println("로또번호 입력: ");
			int choice = scanner.nextInt();
			if (choice < 1 || choice > 45) {
				System.out.println("Wrong input! 1~45");
				i--;
			} else {
				for (int temp : nums) {
					if (temp == choice) {
						System.out.println("이미 입력한 값입니다");
						i--;
						break;
					}
				}
				nums[i] = choice;
			}
		}
		
		for (int i=0; i<6; i++) {
			int choice = random.nextInt(45);
			if (choice < 1 || choice > 45) {
				i--;
			} else {
				for (int temp : answers) {
					if (temp == choice) {
						i--;
						break;
					}
				}
				answers[i] = choice;
			}
		}
		
		int answer = 0;
		for (int tmp : nums) {
			for (int tmp2 : answers) {
				if (tmp == tmp2) {
					answer ++;
				}
			}
		}
		
		System.out.println("총 맞은 개수 : " + answer);
		
		
	}

}
