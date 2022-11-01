package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * 현재 존재하거나 혹은 존재하지 않는 파일이나 폴더를 제어할 수 있는 객체
		 */
		File f = new File("c:/acorn202210/myFolder/memo.txt");
		
		
		//실제 memo.txt 파일이 존재하지 않으면 파일을 만들고 
		//존재하면 삭제 되도록 프로그래밍 해보세요. 
		
		try {
			if(f.exists()) {
				f.delete();
				System.out.println("파일이 삭제 되었습니다.");
			}else {
				f.createNewFile();
				System.out.println("파일이 만들어졌습니다.");
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		System.out.println("=====================");
		
		
		////내가 한 내용 
		if(!f.exists()) {// 파일이 존재하지 않으면 
			try {
				f.createNewFile();
				System.out.println("파일이 만들어졌습니다.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return;
		}
		f.delete();
		System.out.println("파일이 삭제 되었습니다.");
	}
}
