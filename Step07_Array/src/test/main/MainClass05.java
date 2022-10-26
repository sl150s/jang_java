package test.main;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		//키보드로부터 입력받을 수 있는 기능을 가진 객체 생성
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열 한줄 입력:");
		//키보드와 관련된 건 System.in
		//콘솔과 관련된 건 System.out
		
		// 한줄 입력 받고
		// .nextLine() -> 입력받은걸 String타입으로 한줄로 리턴해준다는 뜻 
		String str = scan.nextLine();
		
		//입력받은 문자열을 콘솔에 출력
		System.out.println(str);
		
		//종료
		System.out.println("main 메소드가 종료되었씁니다");
	}
}
