package Day15;

import java.awt.Toolkit;

public class Day15_1 {
	
	//스레드 : 프로세스 내에서 실행되는 흐름의 단위
		//프로세스 : 컴퓨터에서 연속적으로 실행되고 있는 프로그램
			//프로그램 : 작업을 수행하는 명령어[코드] 집합 
	
	//멀티스레드
		//Thread 클래스
			//run 메소드: 멀티 스레드의 실행코드 정의 
			//start 메소드: 멀티 스레드 시작 (run 실행) 
		//Runnable 인터페이스 
			//run 추상메소드 구현 
			//start는 없기 때문에 스레드로 다시 만들어서 실행해야 함 
	
				
				// 상속 vs 인터페이스  
				// extends 하나의 클래스명 (다중 상속 불가)
				// 다중상속을 하려면 인터페이스 활용해야 함 (인터페이스는 implements 뒤에 여러 개 올 수 있음)
	
	
		//병행처리를 하는 건 아님 (두 스레드 왔다갔다 하면서 처리하는건데 컴퓨터가 워낙 빨라서 병행처리 처럼 보이는 것 뿐)
			//CPU가 운영체제로부터 자원을 할당 받아 분
	
	public static void main(String[] args) {
		//메인 스레드 포함(단일 스레드)
		
		//1. 단일 스레드
		
		//소리 
		/*Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++) {
			toolkit.beep();
			
			try {
				Thread.sleep(1000);
			} 
			catch (Exception e) {
				
			}
		}
		
		//출력 
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			
			try {
				Thread.sleep(1000); //스레드 일시 정지 (밀리초)
			}
			catch (Exception e) {
				
			}
		}*/
		
		
		//멀티스레드 [소리와 출력 동시에] 
		 
//		Thread thread = new Sound();
//		thread.start(); // 클래스의 run이라는 멀티스레드 메소드와 한 세트 
//		
//		
//		for(int i=0; i<5; i++) {
//			System.out.println("띵");
//			
//			try {
//				Thread.sleep(800); //스레드 일시 정지 (밀리초)
//			}
//			catch (Exception e) {
//				
//			}
//		}
//		
//		
//		
//		System.out.println("------- 멀티스레드 인터페이스 시작 -------");
//		//3. 멀티 스레드 (인터페이스로 사용) 
//		
//		Runnable runnable = new Sound2();
//		// runnable: start 메소드 없음 
//		Thread thread2 = new Thread(runnable);
//		thread2.start();
//		
//		for(int i=0; i<5; i++) {
//			System.out.println("띵");
//			
//			try {
//				Thread.sleep(800); //스레드 일시 정지 (밀리초)
//			}
//			catch (Exception e) {
//				
//			}
//		}
//		
//		
//		System.out.println("----- 멀티스레드 인터페이스 시작 ------");
//		Thread thread3 = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				
//				for(int i=0;i<5; i++) {
//					toolkit.beep();
//					
//					try {
//						Thread.sleep(800);
//					}
//					catch (Exception e) {
//						
//					}
//				}
//				
//			}
//		});
//		thread3.start();
//		
//		for(int i=0; i<5; i++) {
//			System.out.println("띵");
//			
//			try {
//				Thread.sleep(800); //스레드 일시 정지 (밀리초)
//			}
//			catch (Exception e) {
//				
//			}
//		}
		
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0; i<5; i++) {
					System.out.println("bark");
					
					try{
						Thread.sleep(1000);
					}
					catch(Exception e) {
						
					}
				}
				
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0; i<5; i++) {
					System.out.println("meow");
					
					try{
						Thread.sleep(1000);
					}
					catch(Exception e) {
						
					}
				}
				
			}
		});
		
		Thread thread3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0; i<5; i++) {
					System.out.println("어흥");
					
					try{
						Thread.sleep(1000);
					}
					catch(Exception e) {
						
					}
				}
				
			}
		});
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		System.out.println(thread1.getName());
		System.out.println(thread2.getName());
		System.out.println(thread3.getName());
		
	}

}
