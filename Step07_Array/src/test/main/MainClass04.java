package test.main;

import test.mypac.Bike;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * 1. Bike 객체를 담을 수 있는 방 3개짜리 배열객체를 생성해서
		 * 참조값을 bikes라는 지역변수에 담아보세요.
		 * 
		 * 2. 배열의 각각의 방(0,1,2번)에 Bike 객체를 생성해서 담아보세요
		 * 
		 * 3. 반복문 for을 이용해서 순서대로 배열의 각각의 방에 있는 Bike 객체의 
		 * ride() 메소드를 호출해보세요. 
		 */
		
		Bike[] bikes = new Bike[3];
		//Bike 객체를 생성한 것이 아닌, Bike 객체를 담을 수 있는 빈방 3개 짜리를 생성한 것이다. 
		//Bike type 과 Bike[] type 은 다르다 
		//new Bike; -> 바이크 객체 생성 
		//new Bike[3]; -> 객체를 담을 수 있는 비어있는 배열 객체 생성
		
		bikes[0] = new Bike();
		bikes[1] = new Bike();
		bikes[2] = new Bike();
		
		for(int i = 0; i<bikes.length; i++) {
			bikes[i].ride();
		}
		
	}
}
