package test.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass05 {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		//학습을 위해서 PrintStream 객체를 부모 type OutputStream으로 받아보기
		//OutputStream도 1byte 처리 스트림이다. 
		OutputStream os = ps;
		
		//2byte 처리 스트림
		OutputStreamWriter osw = new OutputStreamWriter(os);
		try {
			osw.write(48148); //int 타입 전달 
			osw.write(48372); //int 타입 전달 
			osw.write("아니야"); //String 타입 전달 
			osw.flush(); //방출 
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
