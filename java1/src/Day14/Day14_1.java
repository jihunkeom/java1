package Day14;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Random;

public class Day14_1 {
	
	public static void main(String[] args) {
		
		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println(zonedDateTime);
		
		ZonedDateTime newyork = zonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(newyork);
		
		//Math 클래스: 수학 계산 관련 메소드 제공 
		int a = Math.abs(-5);
		System.out.println(a);
		
		double b = Math.abs(-3.14);
		System.out.println(b);
		
		
		double c = Math.ceil(5.3);
		System.out.println(c);
		
		
		Random random = new Random();
		System.out.println(random.nextGaussian());
		System.out.println(Math.random());
		
		System.out.println("round : " + Math.rint(5.3));
		
		System.out.println((double)Math.round(12.3456*100)/100);
		
		
		// 차량번호 랜덤으로 0000 ~ 9999 난수를 10개 생성  
		// 1. [차량번호] 난수 10개 배열에 저장
		// 2. 끝자리가 홀수 // 끝자리가 짝수
		
		String[] arr = new String[10];
		for (int i=0; i<arr.length; i++) {
			arr[i] = String.format("%04d", random.nextInt(10000));
			System.out.println(arr[i]);
		}
		
		for(int i=0; i<10; i++) {
			int q = Integer.parseInt(arr[i].substring(3));
			if(q%2 == 0) {
				System.out.println("짝수 " + q);
			} else {
				System.out.println("홀수 " + q);
			}
		}
		
		
	}

}
