package test.main;

import test.mypac.Weapon;
import test.mypac.YourWeapon;

public class MainClass04 {
	
	//1. 내부 클래스 (inner Class)
	//내부 클래스를 static 내부 메소드에서 사용하려면 내부클래스도 static 이어야한다. 
	//단, 내부클래스일시에만!  
	static class staticYourWeapon extends Weapon{

		@Override
		public void attack() {
			// TODO Auto-generated method stub
			System.out.println("공중 공격을 해요 ");
		}
	}
	
	public static void main(String[] args) {
		Weapon w1 = new YourWeapon();
		useWeapon(w1);
		
		//2. local Inner Class 
		//메소드안에서 클래스 만들기 
		class OurWeapon extends Weapon{
			public void attack() {
				System.out.println("지겹다 이제 아무나 공격하자!");
			}
		}
		Weapon w2 = new OurWeapon();
		useWeapon(w2);
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
