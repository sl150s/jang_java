package test.main;
/*
 * c:/acorn202210/myFolder/memo.txt ㅍ일에 기록된 문자열을 읽어서
 * 콘솔창에 출력해보세요
 * 
 * -hint
 * FileReader 객체를 잘 활용해보세요. 
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainClass13 {
	public static void main(String[] args) {
		//File 객체 
		File memoFile = new File("c:/acorn202210/myFolder/memo.txt");
		try {
			//파일에서 문자열을 읽어들일 수 있는 객체 생성
			FileReader fileRead = new FileReader(memoFile);
			BufferedReader br = new BufferedReader(fileRead);
			//반복문 돌면서 
			while(true) {
				//개행기호를 기준으로 한줄씩 읽어오기 때문에 개행기호는 읽어오지 않는다.
				String line = br.readLine();
				if(line == null) {
					break;
				}
				//읽어낸 문자열 콘솔에 출력하기
				System.out.println(line);
			}
		} catch (Exception e) {
			
		}
		
		

	}
}
