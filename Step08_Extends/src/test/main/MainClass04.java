package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass04 {
	public static void main(String[] args) {
		//HandPhone 객체를 생성해서 그 참조값을 Object type p3 지역변수에 담는다.
		Object p3 = new HandPhone();
		
		//Object type 변수에 담긴 값을 Phone type 변수에 담기
		//그냥 담을 경우 에러가 뜨기 때문에 지역변수를 담고있는 타입으로 casting(변경) 해야한다. 
		Phone p2 = (Phone)p3; //casting 연산자를 이용하면 가능하다.
		HandPhone p1 = (HandPhone)p3;
	}
}
