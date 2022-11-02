package frame10;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/*
 * 입력창의 텍스트 작성후 엔터키를 누르면 JLabel에 그 텍스트가 들어가도록 해보기
 */
public class MyFrame extends JFrame {
	//생성자
	public MyFrame(String title) {
		super(title);
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//흐르듯이 배치하는 레이아웃
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JTextField inputMsg = new JTextField(10);
		//JLabel : 글자 출력할 수 있는 UI
		JLabel label = new JLabel("레이블..");
		
		add(inputMsg);
		add(label);
		//addKeyListener : 키보드를 눌렀을 때 호출될 메소드를 가지고 있는
		//KeyListener 인터페이스 type 객체
		//인터페이스는 객체 생성이 안되기 때문에 익명 클래스를 만들어야한다. 
		KeyListener listener = new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) { //키를 쳤을때 
				// TODO Auto-generated method stub
				System.out.println("keyTyped()");
			}

			@Override
			public void keyPressed(KeyEvent e) { // 키를 눌렀을때 
				// TODO Auto-generated method stub
				System.out.println("keyPressed()");
			}

			@Override
			public void keyReleased(KeyEvent e) { // 키를 눌렀다가 뗐을 때 
				// TODO Auto-generated method stub
				System.out.println("keyReleased()");
				
				//getKeyCode : 눌러진 키의 코드값 읽어오기
				int code = e.getKeyCode();
				
				System.out.println("code:" + code);
				
				//만일 엔터를 눌렀다면
				if(code == KeyEvent.VK_ENTER) { //code == 10
					String msg = inputMsg.getText();
					//.setText: 텍스트 선언하는 메소드
					label.setText(msg);
				}
			}
			
		};
		inputMsg.addKeyListener(listener);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame("나의 프레임10");
	}
}
