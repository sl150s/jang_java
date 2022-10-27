package test.main;

import java.util.Scanner;

public class TestMain2 {
	public static void main(String[] args) {
		int point = 1000;
		 Scanner scan = new Scanner(System.in);
		
		//아래의 무한 루트임
		while(true) {
			//while의 {}는 무한대로 돈다, 언제까지? while() 가로안의 false로 바뀔 때까지. 
			
			//만일 point가 0이면
			if(point == 0) {
				break; //반복문 loop 탈출
			}
			
			//속도 조절하기 - 엔터 칠때마다 돌아감. 
			System.out.println("Enter를 치세요");
			//사용자가 글자나 엔터, 같은 상호작용을 하기 전까지 실행되지 않는 블로킹 역할을 해줌
			scan.nextLine();
			
			//point를 10 감소시키면서
			point -= 10; 
			
			//원하는 작업 수행
			System.out.println("수행중...");
			//이따가 점수를 얻어와서 얻으면 획득한 점수를 저장해서.. 100점이면 선물을 주는 ~
			// 코드 만들어보기. 
			// 현재 저장된 포인트도 볼수 있게 출력하기... 
			
			
		}
		
		System.out.println("main 메소드가 종료됩니다.");
	}
}
