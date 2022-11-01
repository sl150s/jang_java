package test.main;

import java.util.ArrayList;
import java.util.List;

public class MainClass03 {
	public static void main(String[] args) {
		//정수를 저장할 수 있는 ArrayList 객체를 생성해서 
		//참조값을 List 인터페이스 type의 지역변수 nums에 담기
		
		//포괄클래스는 기본데이터(byte,short,int,long, float, double, boolean,char) 타입으로 선언할 수 없다. 
		//기본 데이터 타입의 객체형 래퍼 (Byte,short,Integer...)로 써야함 
		List<Integer> nums = new ArrayList<>();
		System.out.println(nums);
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		
		//확장 for문을 이용해서 저장된 정수를 순서대로 콘솔창에 출력하기 
		for(Integer tmp:nums) {
			System.out.println(tmp);
		}
		System.out.println("-----");
	      nums.forEach((item)->{
	         System.out.println(item);
	      });

	}
}
