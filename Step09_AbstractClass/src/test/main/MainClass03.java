package test.main;

import test.mypac.Zoo;
import test.mypac.Zoo.Monkey;
import test.mypac.Zoo.Tiger;

public class MainClass03 {
	//Zoo 클래스에 있는 getMonkey() 메소드를 호출해서
	//리턴되는 값을 m1이라는 지역변수에 담아보세요. 
	
	public static void main(String[] args) {
		Zoo z = new Zoo();
		Monkey m1 = z.getMonkey();
		m1.say();
		
		Tiger t1 = z.getTiger();
		t1.say();
		
		
		
		//메소드 안에서도 클래스를 정의할 수 있다.
		//지역 내부 클래스, Local Inner Class
		class Gura{
			public void say() {
				System.out.println("안녕 나는 구라야!");
			}
		}
		
		Gura g1 = new Gura();
		g1.say();
	}
	
}
