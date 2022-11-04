package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass16 {
	public static void main(String[] args) {
		FileInputStream fis = null; 
		FileOutputStream fos = null;
		try {
			//파일에서 byte를 읽어낼 객체
			fis = new FileInputStream("C:\\acorn202210\\myFolder\\bottle.png");
			//파일에 byte를 출력할 객체 
			fos = new FileOutputStream("C:\\acorn202210\\myFolder\\copied2.png");
			byte[] buffer = new byte[1024]; // 한번에 1kilo byte 씩 읽어낼 수 있는 배열 
			while(true) {
				//byte[] 배열을 메소드의 인자로 전달해서 읽어들이고 몇 개를 읽어들였는지 리턴 받는다.
				int readeByte = fis.read(buffer);
				if(readeByte == -1) {
					break;
				}
				//byte[] 배열(buffer)의 0번방에서부터 읽은 만큼(readeByte)만 출력하기
				fos.write(buffer,0,readeByte);
				fos.flush();
				//flush()는 현재 버퍼에 저장되어 있는 내용을 클라이언트로 전송하고 버퍼를 비운다.
			}
				
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(fos != null) fos.close();
				if(fis != null) fis.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}
}
