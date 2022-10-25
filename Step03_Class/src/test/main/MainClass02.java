package test.main;

import test.mypac.MyUtill;

public class MainClass02 {
	public static void main(String[] args) {
		//static 메소드는 클래스명에 . 찍어서 바로 호출할 수 있다. 
		MyUtill.send();
		
		//static 메소드는 클래스명에 . 찍어서 바로 호출할 수 있다. 
		MyUtill.version="1.0";
	}
}
