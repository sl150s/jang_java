package test.main;
/*
 * while 문을 활용해서 원하는 횟수만큼 반복하기 
 * 
 * - 반복 횟수가 명확히 정해져 있으면 for 문으로 반복문을 도는게 좋다. 
 * - 반복 횟수가 명확히 정해져 있지 않고 반복을 돌아봐야 횟수를 아는 경우 while문으로 반복문을 도는게 좋다.
 */

public class MainClass08 {
	public static void main(String[] args) {
		
		
		// 1번 방법 ))))))))))))))))))))))))))))))) 
		//카운트를 셀 변수를 미리 만들어서 0으로 초기화 
		int count = 0;
		//무한루프로 돌다가
		while(true) {
			System.out.println("안녕!");
			count++;
			//특정 조건 하에서 무한 루프 빠져나오기
			if(count==5) {
				break;
			}
		}
		
		
		System.out.println("--------------------");
		count=0; //카운트를 다시 0으로 만들고 

		
		// 2번 방법 ))))))))))))))))))))))))))))))) 
		//카운트가 5보다 작을 동안 반복문 수행 
		while(count<5) { //조건부를 true로 바뀌게끔 해놓기 
			System.out.println("안녕");
			count++;
		}
		
		
		System.out.println("--------------------");
		
		//무한루프
		for(;;) {
			//while문의 무한반복과 동일함 while(true){}
		}
		
		
		//for문과 while문의 차이점
		// for문의 카운트는 for문이 종료되면 사라진다. while문 종료되어도 유지된다.
		
	}
}
