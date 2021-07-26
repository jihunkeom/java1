package Day07;

public class Day07_1 {
	
	public static void main(String[] args) {
		int[] int_arr = new int[100];
		
		for (int i =0; i<100; i++) {
			int_arr[i] = i;
//			System.out.println("배열의 "+i+"번째 인덱스 : " + int_arr[i]);
		}
//		
//		for(int temp : int_arr) {
//			System.out.print(temp + " ");
//		}
		
		
		// 2차원 배열 
		int[][] two_arr = new int[2][3];
		int[][] two_arr2 = { {20,30,40}, {40,50,60} };
		
		
		int[][] two_arr3 = new int[2][50];
		for (int i = 0; i<100; i++) {
			if (i < 50) {
				two_arr3[0][i] = i;
				System.out.println("첫행 " + two_arr3[0][i]);
			}
			else {
				two_arr3[1][i%50] = i;
				System.out.println("두번째 행 " + two_arr3[1][i%50]);
			}
		}
		
	}

}
