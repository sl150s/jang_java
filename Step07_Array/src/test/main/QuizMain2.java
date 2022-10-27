package test.main;

import java.util.Random;

public class QuizMain2 {
   
   public static void main(String[] args) {
		/* 2.run했을 때
		* 5개의 문자열 중에서 3개가 한줄에 한번에 랜덤하게 출력되게 해보세요. 
		* 얘 cherry/apple/cherry... 
		*/
      String[] items={"cherry", "apple", "banana", "melon", "7"};
      
      for(int i=0; i<3; i++) {
    	  //랜덤한 숫자를 얻어내기 위한 객체 
          Random ran=new Random();
          // 0~4 사이의 랜덤한 숫자를 하나 얻어내서 
          int ranNum=ran.nextInt(5);
          // 배열의 인덱스로 활용해서 문자열 출력하기
          System.out.print(items[ranNum]);
          if(i < 2) {
        	  System.out.print(" | ");
          }
          //printIn을 사용하게 되면 개행기호(엔터)가 출력 되기 때문에 한줄로 출력하기 위해선
          //print를 사용해야한다. 
      }
      
      
      
      
   }
}
