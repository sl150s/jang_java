package test.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class MainClass04 {
	public static void main(String[] args) {
		//콘솔창과 연결된 객체의 참조값
		PrintStream ps = System.out; //출력하는 객체 
		
		//학습을 위해서 PrintStream 객체를 부모 type OutputStream으로 받아보기
		//OutputStream도 1byte 처리 스트림이다. (한글 처리 불가)
		OutputStream os = ps;
		
		try {
			os.write(97);// .write -> 코드값을 적으면 1byte내의 chr타입이 나온다.
			os.write(90);
			os.write(80);
			os.flush(); //방출 - flush(방출) 까지 해줘야만 출력한다. 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
