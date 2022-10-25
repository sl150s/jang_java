package test.mypac;

/*
 * [ 메소드를 만들 때 고려해야 하는 것 ]
 * 
 * 1. 접근 지정자 - public... 
 * 2. static or non static  
 * 3. 리턴 type - void ....
 * 4. 메소드명 - walk.... 
 * 5. 메소드에 전달하는 인자의 갯수(비어있으면 0.. )와 데이터 type
 * 
 */
public class MyObject {
	public void walk() {
		System.out.println("걸음을 걸어요");
	}
	//void 어떤 타입도 리턴하지 않음. 
	
	public int getNumber() {
		return 10; 
	}
	// int : int타입을 리턴해야한다 - 반드시 return 값이 있어야함 
	
	public String getGreeting() {
		return "안녕하세요"; 
	}
	// String : String 타입을 리턴해야한다 - 반드시 return 값이 있어야함 
	
	//CAR TYPE을 리턴해주는 메소드
	public Car getCar() {
		return new Car();
	}
	
	//int type을 메소드의 인자로 전달 받는 메소드
	public void setNum(int num) {
		System.out.println("num:"+num);
	}
	
	//string type을 메소드의 인자로 전달 받는 메소드
	public void setName(String name) {
		System.out.println("name:"+name);
	}
	
	//Car type을 메소드의 인자로 전달 받는 메솓
	public void useCar(Car car) {
		car.drive();
	}
	
	// 3개의 type을 메소드의 인자로 전달 받는 메소드
	public void doSomething(int num, String msg, Car c) {
		System.out.println("무언가를 작업합니다.");
	}
	
	
	
	public void send() {
		System.out.println("무언가를 전송해요");
	}
	
	public void send(int num) {
		System.out.println(num + "을 전송해요");
	}
	
	public void send(String name) {
		System.out.println(name+"을 전송해요");
	}
	
	public void send(Car car) {
		System.out.println("자동차를 전송해요");
	}
	
	
	
	
	
	
	
}
