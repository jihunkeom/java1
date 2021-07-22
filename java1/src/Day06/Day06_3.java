package Day06;

import java.util.Random;
import java.util.Scanner;

public class Day06_3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		//1. game board
		String[] game_board = {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"};
		
		//2.
		while (true) {
			for(int i =0; i < game_board.length; i++) {
				System.out.print(game_board[i]);
				if((i+1)%3==0) {
					System.out.println();
				}
				
				
			}
			
			while(true) {
				System.out.println("위치 입력 : ");
				int idx = scanner.nextInt();
				if(game_board[idx].equals("[ ]")) {
					game_board[idx] = "O";
					break;
				}
				else {
					System.out.println("Wrong input");
				}
			}
			
			while(true) {
				int ridx = random.nextInt(9);
				if(game_board[ridx].equals("[ ]")) {
					game_board[ridx] = "X";
					break;
				}
				else {
					System.out.println("Wrong input");
				}
			}
			
			if(game_board[0]=="[O]"&&game_board[1]=="[O]"&&game_board[2]=="[O]") {
				System.out.println("You Win!");
				break;
			}
			else if(game_board[3]=="[O]"&&game_board[4]=="[O]"&&game_board[5]=="[O]") {
				System.out.println("You Win!");
				break;
			}
			else if(game_board[6]=="[O]"&&game_board[7]=="[O]"&&game_board[8]=="[O]") {
				System.out.println("You Win!");
				break;
			}
			
		}
		
	}

}
