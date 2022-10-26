package test.main;

import java.util.Random;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 *  0 ~ 10 사이의 랜덤한 정수를 얻어내서 콘솔창에 출력하고 싶다...
		 *  
		 *  hint) Random 클래스를 import 해서 사용해보세요.
		 */
//		
//		Random.class(1,10);
//		Math.random();
		
		
		//random 객체를 생성해서
		Random ran = new Random();
		
		//nextInt() 메소드를 호출해서 정수 하나를 리턴 받아서
		int num = ran.nextInt(0, 10);
		
		//콘솔창에 출력해보기
		System.out.println(num);
		
		
		//1~45 사이의 랜덤한 정수 하나를 얻어내서 ranNum2 라는 지역 변수에 담아보세요,
		int ranNum2 = ran.nextInt(1,46); //1이상, 46 미만
		System.out.println(ranNum2);

		//true or false 중에 랜덤한 boolean 값을 얻어내서 isRun이라는 지역 변수에 담아보세요. 
		boolean isRun = ran.nextBoolean();
		System.out.println(isRun);

//		System.out.println("0부터 N까지 무작위 랜덤 숫자 : " + random.nextInt(100));
//		System.out.println("무작위 Int 값 : " + random.nextInt());
//		System.out.println("무작위 Long 값 : " + random.nextLong());
//		System.out.println("무작위 Double 값 : " + random.nextDouble());
//		System.out.println("무작위 Float 값 : " + random.nextFloat());
//		System.out.println("무작위 정규 분포의 랜덤 값 : " + random.nextGaussian());
//		System.out.println("true, false : " + random.nextBoolean());
		
		
	}
}
