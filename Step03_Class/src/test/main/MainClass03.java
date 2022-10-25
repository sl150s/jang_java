package test.main;

import test.mypac.Member;

/*
 * 1. 한명의 회원정보를 담을 수 있는 객체를 생성할 Member 클래스를 
 * test.mypac 패키지에 만들어 보세요.
 * 
 * 회원 한명의 정보는 번호, 이름, 주소로 이루어져 있다. 
 */
public class MainClass03 {
	public static void main(String[] args) {
		//2. Member 클래스로 객체를 생성해서(new Member()) 
		//참조값을 m1 이라는 지역 변수에 담아보세요 
		
		Member m1 = new Member();
		//변수선언 = new 클래스이름 
		
		
		//3. m1에 담긴 참조값을 이용해서 1, 김구라, 노량진 이라는 정보를 
		// 객체 저장해보세요 
		m1.number = 1 ;
		m1.name = "김구라";
		m1.addr = "노량진";
		
		
		//System.out.println(m1.number+","+m1.name+","+m1.addr);
		
		// 2, 해골, 행신동 이라는 회원정보도 Member 객체에 담아보세요 
		Member m2 = new Member();
		m2.number = 2;
		m2.name = "해골";
		m2.addr = "행신동"; 
		
		//m1 안에 있는 참조값을 이용해서 콘솔창에 김구라의 정보를 아래와 같은 형식으로 출력해보세요. 
		//번호:1, 이름: 김구라, 주소: 노량진
		
		System.out.println("번호:"+m1.number+", 이름:"+m1.name + ", 주소:"+m1.addr);
		//m1.showInfo();
		
		
	}
}
