package test.main;

import java.util.HashMap;

public class MainClass06 {
	public static void main(String[] args) {
		//HashMap도 포괄클래스임.
		//java에서 어떤 데이터를 key:value의 쌍으로 
		
		Object obj=true;
		/*
		 * 번호 : 1
		 * 이름 : 김구라
		 * 여자인지 여부: true
		 */
		
		//
		HashMap<String ,Object> map1 = new HashMap<>();
		
		//.put : key, value값 넣기 
		map1.put("num", 1);
		map1.put("name", "김구라");
		map1.put("isMan", true);
		
		//.getOrDefault : 특정 키값으로 저장된 값을 가지고 오는, 없으면 디폴트 값이라는 뜻.
		map1.getOrDefault(obj, map1);
		
		//.get : 키값을 넣으면 오브젝트 타입이 나온다. 
		//int num = (int)map1.get("num");
		
		/*
		 * value의 Generic 클래스가 Object로 지정되어있기 때문에
		 * 리턴되는 Object type을 원래 type으로 casting해야한다. 
		 */
		int num=(int)map1.get("num");
		String name=(String)map1.get("name");
		boolean isMan=(boolean)map1.get("isMan");
		
		//동일한 key 값으로 다시 담으면 수정
		map1.put("name", "에이콘");
		
		//특정 key값으로 담긴 내용 삭제, 성공하면 true, 실패하면 false 리턴 
		map1.remove("isMan");
		
		//모두 삭제
		map1.clear();
		
		
		
		
		
		
		
		
		
		
		
	}
}
