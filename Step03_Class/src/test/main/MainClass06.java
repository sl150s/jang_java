package test.main;

import test.mypac.Rect;

public class MainClass06 {
	public static void main(String[] args) {
		//폭과 높이가 10, 20인 사각형 객체
		Rect r1 = new Rect();
		r1.hei = 20;
		r1.wid = 10; 
		r1.square();
		
		//폭과 높이가 30, 40인 사각형 객체 
		Rect r2 = new Rect();
		r2.wid = 30; 
		r2.hei = 40;
		r2.square();
	}
}
