package test.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainClass10 {
	public static void main(String[] args) {
		
		// 
		
		//HashSet 객체에 정수를 순서없이 담고
		Set<Integer> set1 = new HashSet<>();
		set1.add(30);
		set1.add(20);
		set1.add(50);
		set1.add(10);
		set1.add(40);
		
		//HashSet 객체에 담긴 아이템을 순서있게 관리하도록 
		//ArrayList 생성자의 인자에 넣어서 객체 생성하기.
		List<Integer> list = new ArrayList<>(set1); 
		//HashSet 객체는 Collection 타입이기도 해서 
		//ArrayList 인자 값으로 넣을수 있다. 
		//Set은 Collection을 상속받는다. 
		
		//정렬해주는 메소드
		Collections.sort(list);
		
		for(int tmp:list) {
			System.out.println(tmp);
		}
	}
	
	
}
