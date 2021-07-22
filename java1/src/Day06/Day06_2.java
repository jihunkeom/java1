package Day06;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Day06_2 {
	public static void main(String[] args) {
		//배열: 같은 종류의 데이터가 순차적으로 저장되어 값의 번호가 곧 배열의 시작점으로부터 값이 저장되어 있는 상대적인 위치 
		//배열 선언
		int[] 정수배열1 = new int[3]; //int형 3개를 저장할 수 있는 메모리 할당받은 배열 
		정수배열1[0] = 3;
		정수배열1[1] = 4;
		정수배열1[2] = 5;
		
		String[] 문자열배열2 = {"유재석", "강호동", "신동엽"};
		
		System.out.println(문자열배열2);
		System.out.println(문자열배열2[0]);
		System.out.println(문자열배열2[1]);
		System.out.println(문자열배열2[2]);
		System.out.println("배열의 길이 : " + 문자열배열2.length);
		
		//ex1
		Scanner scanner = new Scanner(System.in);
		Integer[] students = null;
		int end = 0;
		
		while (true) { //종료조건 : 4번 입력
			System.out.println("메뉴: 1. 학생 수 2. 점수입력 3. 분석[등수,평균] 4.종료");
			int option = scanner.nextInt();
			
			switch (option) {
				case 1: {
					System.out.println("학생 수 입력 : ");
					int count = scanner.nextInt();
					students = new Integer[count];
					break;
				}
				case 2: {
					
					for (int i =0; i<students.length; i++) {
						System.out.println(i + "번째 학생의 점수입력 : ");
						int score = scanner.nextInt();
						students[i] = score;
					}
					break;
				}
				case 3: {
					System.out.println("분석: 등수, 평균");
					
					Arrays.sort(students, Collections.reverseOrder());
					System.out.println();
					
					
					int cumsum = 0;
					for (int i=0;i<students.length; i++) {
						System.out.println((i+1)+"등 점수 : " + students[i]);
						
						cumsum += students[i];
					}

					System.out.println("평균 : " + cumsum / students.length);
					
					
					break;
				}
				case 4: {
					end = 1;
					break;
				}
				default : {
					System.out.println("알 수 없는 번호입니다");
				}
				
			}
			if (end == 1) {
				break;
			}
		}
		
	}

}
