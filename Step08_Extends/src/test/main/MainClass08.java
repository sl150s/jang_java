package test.main;

import test.utill.MyUtill;

public class MainClass08 {
	public static void main(String[] args) {
		//상속받은 BaseUtil 클래스에 정의된 static 메소드도 모두 사용가능 
		MyUtill.send();
		MyUtill.clear();
		MyUtill.light();
		
	}
}
