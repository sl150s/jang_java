package test.main;
/*
 * c:/acorn202210/myFolder/memo.txt ㅍ일에 기록된 문자열을 읽어서
 * 콘솔창에 출력해보세요
 * 
 * -hint
 * FileReader 객체를 잘 활용해보세요. 
 */

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainClass12 {
	public static void main(String[] args) {
		//File 객체 
		File memoFile = new File("c:/acorn202210/myFolder/memo.txt");
		try {
			//파일에서 문자열을 읽어들일 수 있는 객체 생성
			FileReader fileRead = new FileReader(memoFile);
			//반복문 돌면서 
			while(true) {
				//한글자씩 읽어들인다. 
				int code = fileRead.read(); //.read : 글자 하나의 코드값을 읽어줌. 
				//만일 더이상 읽을 문자가 없으면
				if(code == -1) {break;} //반복문 탈출 
				
				//코드값을 문자로 변환해서
				char ch = (char)code;
				//개행기호 없이 읽은 내용만 출력
				System.out.print(ch);
				
			}
		} catch (Exception e) {
			
		}
		
		
		
		//내가 한 내용 
//		try{
//			if(!memoFile.exists()) {
//				memoFile.createNewFile();
//			}
//			FileReader fileRead = new FileReader(memoFile);
//			int read = fileRead.read();
//			System.out.println((char)read);
//		}catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
	}
}
