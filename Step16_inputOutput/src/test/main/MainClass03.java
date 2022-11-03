package test.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass03 {
	public static void main(String[] args) {
		//키보드로부터 불러오기 
		/*InputStream is = System.in; //입력받는 객체 
		InputStreamReader isr = new InputStreamReader(is);
		*/
		
		//문자열 1줄씩 입력 받을 수 있는 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("문자열 한줄 입력 : ");
		try {
			//BufferedReader 객체의 readLine() 메소드를 이용해서 문자열 한 줄 읽어들이기
			String line = br.readLine();
			System.out.println("line:"+line);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
