package frame04;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	//생성자
	public MyFrame(String title) {
		super(title);
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//흐르듯이 배치하는 레이아웃
		//BorderLayout: 프레임의 경계선에 맞춰 위치한다
		//(그래서 버튼 하나가 화면 전체를 채운것같은 효과를 준다)
		setLayout(new BorderLayout());
		
		
		//add하면서 옵션값도 전달할 수 있다.
		JButton btn1 = new JButton("버튼1");
		add(btn1,BorderLayout.NORTH); //프레임에 btn1 추가하기
		
		JButton btn2 = new JButton("버튼2");
		add(btn2,BorderLayout.EAST);
		
		JButton btn3 = new JButton("버튼3");
		add(btn3,BorderLayout.SOUTH);
		
		JButton btn4 = new JButton("버튼4");
		add(btn4,BorderLayout.WEST);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame("나의 프레임3");
	}
}
