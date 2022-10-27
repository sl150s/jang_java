package test.main;

public class TestMain {
	public static void main(String[] args) {
		String[] name = {"김구라"};
		
		//name 안에 있는 값을(참조값) tmp에 복사해서 넣어주기
		String[] tmp = name;
		
		//tmp에 원래 "김구라"의 참조값이 들어 있었는데 "원숭이"라는 새로운 참조값으로 덮어쓰기
		//tmp = "원숭이";
		//name = "원숭이"; 
		//tmp = tmp.replace("김","원");
		
		name[0] = "붕가루";
		
		System.out.println(tmp[0]);
		System.out.println(name[0]);
		
	}
}
