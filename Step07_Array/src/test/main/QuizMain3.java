package test.main;

import java.util.Random;

public class QuizMain3 {
   
   public static void main(String[] args) {
	   
	   //점수 부여하기
	   
		/* 
		 *  3개가 모두 같게 나왔다면 10점을 부여하기
		*/
	   
      String[] items={"cherry", "apple", "banana", "melon", "7"};
      //랜덤한 숫자를 얻어내기 위한 객체 
      Random ran=new Random();
      
      //for문 안에서 얻어낸 랜덤한 숫자 3개를 저장할 배열 객체 생성
      int[] nums = new int[3];
      
      for(int i=0; i<3; i++) {
    	  
          // 0~4 사이의 랜덤한 숫자를 하나 얻어내서 
          int ranNum=ran.nextInt(5);
          // 배열의 인덱스로 활용해서 문자열 출력하기
          System.out.print(items[ranNum]);
          if(i < 2) {
        	  System.out.print(" | ");
          }
          //printIn을 사용하게 되면 개행기호(엔터)가 출력 되기 때문에 한줄로 출력하기 위해선
          //print를 사용해야한다. 
          
          //배열에 얻어낸 랜덤한 숫자를 저장하기
          nums[i] = ranNum; 
      }
      
      //개행기호를 출력하기위한 코드 
      System.out.println();
      
      //nums 배열에 저장된 3개의 숫자가 모두 같은지 여부를 boolean type으로 얻어내기
      boolean isEqual = nums[0] == nums[1] && nums[1] == nums[2];
//      String bool = isEqual ? ("당첨되었습니다") : ("실패했습니다.");
//      System.out.println(bool);
      if(isEqual) {
    	  System.out.println("10점입니다.");
      }
      System.out.println("꽝입니다");
   }
}
