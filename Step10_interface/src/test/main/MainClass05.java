package test.main;

import test.mypac.Joinner;

public class MainClass05 {
	public static void main(String[] args) {
		Joinner j1 = new Joinner() {
			@Override
			public String join(String one, String two) {
				// TODO Auto-generated method stub
				return one+two;
			}
		};
		String result1 = j1.join("안녕","하세요");
		
		
		
		//1줄로 쓰기 
		//type은 생략 가능하다. String one -> one만 적을 수있다
		Joinner j2 = (one,two)->{
			return one+two;
		};
		
		
		
		//더 줄여서 쓰기
		//메소드 안에서 특별히 실행할 코드가 없다면 
		//아래와 같이 중괄호 생략하고 리턴할 값만 명시하면 된다. 
		
		Joinner j3 = (one,two) -> one+two;
	}
}
