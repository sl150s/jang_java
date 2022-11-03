package test.main;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass06 {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		//학습을 위해서 PrintStream 객체를 부모 type OutputStream으로 받아보기
		//OutputStream도 1byte 처리 스트림이다. 
		OutputStream os = ps;
		
		//2byte 처리 스트림
		OutputStreamWriter osw = new OutputStreamWriter(os);
		
		//조금더 좋은 기능을 가지고 있는 BufferdWriter 객체 사용해 보기
		BufferedWriter bw = new BufferedWriter(osw);
		try {
			bw.write("하나\r\n"); // 줄바꿈: \r\m -> 개행기호
			bw.write("두울"); 
			bw.newLine();// 줄바꿈 : 개행기호를 출력해주는 메소드
			bw.write("세엣"); 
			bw.flush(); //방출 
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
