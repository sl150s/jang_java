package test.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuizMain {
	public static void main(String[] args) {
		//sample 데ㅣ터
		Map<String, String> dic = new HashMap<>();
		dic.put("house", "집");
		dic.put("phone", "전화기");
		dic.put("car", "자동차");
		dic.put("pencil", "연필");
		dic.put("eraser", "지우개");
		
		/*
		 * 검색할 단어를 입력하세요:hosuse
		 * house의 뜻은 집입니다. 
		 * 
		 * 검색할 단어를 입력하세요:gura
		 * gura는 목록에 없습니다.
		 */
		
		//inputStream은 키보드, 파일, 네트워크로부터
		//읽어들일 수 있다.
		//new Scanner(System.in) -> 키보드 값을 입력받는 메서드
		Scanner scan2 = new Scanner(System.in);
		//System.in은 키보드로부터 읽어들임 
		System.out.println("검색할 단어를 입력하세요:");
		String line= scan2.nextLine(); 
		//.nextLine()은 한줄 전부 입력받을때 
		
		//입력받은 단어를 Map의 key값으로 활용해서 value값을 읽어와본다.
		//해당 key값으로 저장된 value가 없을수도 있다.
		String mean = dic.get(line);
		if(mean == null) { //만일 찾는 단어가 없으면
			System.out.println(mean+"는 목록에 없습니다.");
		}else { //찾는 단어가 있으면
			System.out.println(line+"의 뜻은 "+mean+"입니다.");
		}
		
		
		// ## 정수값(int)을 리턴해주는 메소드가 있는데, 
		//만약 리턴할게 없다면
		//더이상 읽어낼게 없다면 보통 -1을 많이 리턴해줌. 
		
		
		
		
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("검색할 단어를 입력하세요 : ");
		String txt = scan.nextLine(); //하우스 
		
		//.containsKey  
		//HashMap에 인자로 전달된 key가 존재하면 true를 리턴하고 그렇지 않으면 false를 리턴합니다.
		if(dic.containsKey(txt)) {
			System.out.println(txt + "의 뜻은 "+dic.get(txt)+"입니다.");
			return;
		}System.out.println(txt + "는 목록에 없습니다.");
		
	}
}
