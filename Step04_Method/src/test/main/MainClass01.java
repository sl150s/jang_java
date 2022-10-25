package test.main;

import test.mypac.MyObject;
import test.mypac.Car;

public class MainClass01 {
	public static void main(String[] args) {
		
		/*
		 * MyObject 객체를 하나만 생성해서 그 객체가 가지고 있는
		 * walk(), getNumber(), getFreegint() 메소드를 차례로 호출해 보세요.
		 * 단, 메소드가 어떤 data를 리턴하면 해당 데이터를 지역변수에 담으세요. 
		 */
		
		
		MyObject obj = new MyObject();
		
		
		obj.walk();
		int num = obj.getNumber();
		String get = obj.getGreeting();
		Car car = obj.getCar();
		
		//setNum(9), setName(), useCar() 메소드도 호출해보세요.
		
		
		
		//메소드를 ㅎ출하면서 인자로 전달할 데이터를 즉석에서 만들어서 전달하기
		obj.setNum(1);
		obj.setName("안녕하세요");
		obj.useCar(new Car());
		
		
		
		
		//메소드 호출하면서 인자로 전달할 값이 지역변수에 이미 존재하는 경우라고 가정하자
		int a = 999;
		String b = "누구게";
		Car c1 = new Car();
		
		//전달할 값이 들어 있는 변수명으로 전달할 수도 있다.
		obj.setNum(a);
		obj.setName(b);
		obj.useCar(c1);
		
		
		//doSomething() 메소드를 호출해보세요. 
		obj.doSomething(a,b,c1);
		
	}
}
