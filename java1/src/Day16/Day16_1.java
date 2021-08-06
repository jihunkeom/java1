package Day16;

public class Day16_1 {
	
	public static void main(String[] args) {
		
		// 제네릭: 하나의 값이 여러 다른 데이터 타입들을 가질 수 있도록 하는 기술 
			// 자료형/클래스 => 매개값 
			// 목적: 하나의 객체가 여러 개의 자료형으로 변결되는 경우 
				// Integer 객체 -> String 객체 -> Char 객체 
		
		// 1. 제네릭 없는 경우 
		Box box1 = new Box();
		box1.setObject("사과");
		
		String name1 = (String)box1.getObject();
		
		System.out.println(name1);
		
		box1.setObject(new Apple());
		
		Apple apple = (Apple)box1.getObject();
		
		Box boxx = new Box();
		boxx.setObject(32232);
		
		
		//2. 제네릭 있는 경우  
		Box2<String> box2 = new Box2<>();
		
		box2.set제네릭객체("사과");
		String name2 = box2.get제네릭객체();
		System.out.println(name2);
		
		
		Box2<Integer> box3 = new Box2<>();
		box3.set제네릭객체(100);
		int name3 = box3.get제네릭객체();
		System.out.println(name3);
		
		Box2<Apple> box4 = new Box2<>();
		box4.set제네릭객체(new Apple());
		Apple apple2 = box4.get제네릭객체();
		System.out.println(apple2);
		
		
		// 3. 멀티 제네릭 
		Product<Television, String> product1 = new Product<>();
		product1.setKind(new Television());
		product1.setModel("Smart Television");
		
		System.out.println(product1.getKind() + product1.getModel());
		
		
		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("Disel Car");
		
		System.out.println(product2.getModel() + product2.getKind());
		
	}

}
