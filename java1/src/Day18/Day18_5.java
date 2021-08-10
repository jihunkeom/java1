package Day18;

import java.util.Scanner;
import java.util.Stack;

public class Day18_5 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Stack<String> stack = new Stack<>();
		
		for(int i=0; i<3; i++) {
			System.out.println("문자입력 ");
			stack.push(scanner.next());
		}
		
		while(!stack.empty()) {
			System.out.print(stack.pop());
		}
		
	}
	
	

}
