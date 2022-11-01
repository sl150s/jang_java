package test.main;

import java.util.Scanner;

import test.mypac.Weapon;

public class MainClass05 {
	//필드를 선언하면서 값 얻어내서 대입하는 코드
	int num = 999; 
	String name = "kim";
	Scanner scan = new Scanner(System.in);
	
	//필드는 선언만하면 기본값이 들어간다. 
	int weight; //0
	String msg; //null
	Scanner scan2; // null
	boolean isRun ; //false
	
	//static 영역에 올리고 싶은 필드는 static 예약어를 이용해서 만든다.
	static String greet = "안녕";
	
	
	//익명의 inner Class 
	//Anonymous Local Inner Class를 이용해서 Weapon type 의 참조값 얻어내
	static Weapon w1 = new Weapon() { 
		// {}이 중괄호 열고 닫고가 뜻하는 바 -> 
		// class A {} 클래스를 만들때의 중괄호와 같다. 
		// 여기에서 쓰이는 { } 는 익명 클래스이다. 
		// class ? extends Weapon{} Weapon을 상속받은 익명 클래스
		@Override
		public void attack() {
			// TODO Auto-generated method stub
			System.out.println("무엇인지 모르겠지만 공격하자");
		}
	}; 
	
	
	public static void main(String[] args) {
		//☆☆☆ 메소드 호출하면서 static 필드에 미리 준비된 값을 전달하기 
		useWeapon(w1);
		
		//Anonymous Local Inner Class를 이용해서 Weapon type 의 참조값 얻어내
		useWeapon(new Weapon() {
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("다같이 열심히 공격하자");
			}
		});
		//☆☆☆ 메소드 호출하면서 지역변수에 미리 준비된 값 전달하기 
		//useWeapon(w2);
	}
	
	
	
	
	
	
	
	
	//☆☆☆ 메소드 호출하면서 값을 즉석에서 만들어서 전달하기 
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
	
	
	//////////위의 [메소드 호출하면서 값을 즉석에서 만들어서 전달하기 ] 내용 보충 설명 
	
	public void useNum(int num) {}
	//이 메소드를 호출한다면 useNum(999) 이런 느낌 
	
	public void useString(String str) {}
	//이 메소드를 호출한다면 useString("kim") 이런 느낌 
	
	public void useScanner(Scanner s) {}
	//이 메소드를 호출한다면 useScanner(new Scanner());
	//스캐너 타입의 참조값을 얻어내는 것. 
	
	//public void useWeapon(Weapon w) {}
	//이 메소드를 호출할때는 useWeapon(new Weapon(){});
	//웨폰 타입의 참조값을 얻어내는 것. 
	//웨폰타입의 추상 타입이다. 
	
	
}







