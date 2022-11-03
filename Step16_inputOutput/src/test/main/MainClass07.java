package test.main;

import java.io.File;

public class MainClass07 {
	public static void main(String[] args) {
		File f = new File("c:/");
		String[] names = f.list();
		
		for(int i=0; i<names.length; i++) {
			String tmp = names[i];
			System.out.println(tmp);
		}
		
		System.out.println("------------");
		
		for(String tmp:names) {
			System.out.println(tmp);
		}
	}
	
}
