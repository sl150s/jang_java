package test.main;

import test.mypac.Car;

//import test.mypac.Car;

/*
 * 자동 import 하는 방법 2가지
 * 
 * 1. 클래스명을 작성하고 ctrl + space
 * 2. ctrl + shift + o 
 */

public class MainClass01 {
	public static void main(String[] args) {

		//test.mypac 패키지에 있는 Car 클래스로 객체를 생성해서 참조값을 얻어냈지만 사용하지 않고 버리기
		new Car(); 
		//import 를 사용하지 않는 다면 
		//test.mypac.Car()로도 사용할 수 있지만 불편하므로
		//import를 사용하거나 자동 import를 한다. 
		
		//test.mypac 패키지에 있는 Car 클래스로 객체르 생성해서 참조값을 얻어내서 car1이라는 지역변수에 담기
		Car car1 = new Car();
		
		//필드에 값 대입하기
		car1.name = "소나타";
		
		//메서드 호출하기
		car1.drive();
		car1.stop();
		
		Car car2 = new Car(); //다시 새로 불러와짐 
		car2.name="람보르기니"; 
		car2.drive();
		car2.stop();
		
	}
}
