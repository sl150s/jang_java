package test.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainClass09 {
	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		names.add("주뎅이");
		names.add("덩어리");
		
		
		//메소드 사용 1) Iterator
		//반복자(Iterator) 객체 얻어내기(저장된 item을 일렬고 세웠다고 생각하면됨)
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			//cursor를 다음칸으로 이동해서 커서가 위치한 곳의 item을 읽어오기
			String item = it.next();
			System.out.println(item);
		}
		//.hasNext() 커서 다음에 데이터가 있는지 확인-> 있다면 next로 호출 가능 (1)
		//.next() 실제로 다음 데이터를 빼낸다. (2)
		

		//특정 item(데이터, 참조값) 존wo 여부 알아내기
		boolean isContain = names.contains("김구라");
		
		//저장된 item의 갯수
		int size = names.size();
		
		//특정 item 삭제
		names.remove("해골");
		
		//모든 아이템 삭제
		names.clear();
	}
}
