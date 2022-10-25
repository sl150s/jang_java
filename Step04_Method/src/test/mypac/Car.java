package test.mypac;
/*
 * class의 역할
 * 
 * 1. 객체의 설계도 역할
 * 2. data type 역할( 클래스 명이 데이터 타입명과 같음 / ex: 클래스 명이 car일 경우 사용할때 car car1 = new Car(); ) 
 * 3. static 필드와 메서드를 포함하는 역할  
 *
 */
public class Car {
	//저장소(field)
	public String name;
	//필드를 선언만 하고 값을 넣지않으면 기본값 null이 들어감. 
	//즉 필드는 선언만으로도 가능하다(

	//달리는 기능(method)
	public void drive() { 
		// <-이 내용은 js에서 function drive(){}의 함수를 만든 느낌과 비슷함 

		/*
		 * 이 클래스로 객체가 생성이 된다면 바로 그 객체의 참조값을
		 * 가리키는 예약어가 this이다. 
		 */
		System.out.println(this.name+"이(가) 달려요!");
	}
	
	//멈추는 기능(method)
	public void stop() {
		System.out.println("멈춰요!");
	}
	
	
}
