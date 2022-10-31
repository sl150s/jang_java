package test.main;

import test.mypac.Drill;

public class MainClass04 {
	public static void main(String[] args) {
		useDrill(new Drill() {
			
			@Override
			public void hole() {
				// TODO Auto-generated method stub
				System.out.println("바닥에 구멍이 뚫어요");
			}
		});
		
		//위를 아래처럼 줄여쓸 수 있다. 이 줄였느느 용도는 추상 메소드가 하나일 때만 사용가능 
		useDrill(()->{
			System.out.println("천장에 구멍을 뚫어요");
		});
		
	}
	
	//1개의 추상메소드로 구성되어있는 Drill 객체를 인자로 전달받는 메소드 
	public static void useDrill(Drill d) {
		d.hole();
	}
	

}
