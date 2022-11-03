package test.main;

import java.io.File;
import java.io.FileWriter;

public class MainClass11 {
	public static void main(String[] args) {
		//문자열을 저장할 파일을 만들기 위한 File객체
		File memoFile = new File("c:/acorn202210/myFolder/memo.txt");
		
		try {
			//만일 파일이 존재하지 않으면 / .exists -> 파일 존재여부 확인 
			if(!memoFile.exists()) {
				//파일을 만들고
				memoFile.createNewFile();
			}
			//파일의 문자열을 출력할 수 있는 객체의 참조값 얻어내기 
			FileWriter pw = new FileWriter(memoFile);
			new FileWriter(memoFile, true);
			pw.write("김구라");
			pw.write("\r\n");
			pw.write("해골");
			pw.write("\r\n");
			pw.write("\t"); // \t는 tab들여쓰기 이다 
			pw.write("\r\n");
			pw.write("원숭이 \r\\n");
			pw.flush();
			pw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
