package frame05;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	//생성자
	public MyFrame(String title) {
		super(title);
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JButton sendBtn = new JButton("전송");
		add(sendBtn);
		
		
		
		//ActionListener 인터페이스 type의 참조값 얻어내서 
		ActionListener listener = new ActionListener() {

			@Override
			//ActionListener 인터페이스가 가지고 있는 
			//추상 메소드를 전부 오버라이드하는게 강제된다.
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("전송버튼이 눌렸습니다.");
			}
			
		};
		
		
		//전송버튼에 등록하기
		sendBtn.addActionListener(listener);
		
	
		
		//setVisible(true);
	}
	
	public static void main(String[] args) {
		
		MyFrame y = new MyFrame("나의 프레임5");
		y.setVisible(true);
		
	}
}
