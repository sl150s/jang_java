package frame09;

import java.awt.FlowLayout;
/*
 * JTextFied 객체의 메소드를 잘 활용해서
 * 메세지를 입력하고 전송 버튼을 누르면
 * 입력한 메세지가 알림창에 출력되도록 프로그래밍 해보세요.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	//생성자
	public MyFrame(String title) {
		super(title);
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//흐르듯이 배치하는 레이아웃
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		//문자열을 한줄 입력할 수 있는 JTextField
		JTextField inputMsg = new JTextField(10);
		JButton sendBtn = new JButton("전송");
		add(inputMsg);
		add(sendBtn);
		
		
		
		
		
		//====================================방법 1 =============
		
		
		
		// 1)) ActionListener type의 참조값을 얻어내서 
		ActionListener lisen = new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String msg = inputMsg.getText();
					
					//알림으로 띄우기 
					JOptionPane.showConfirmDialog(MyFrame.this, msg);
					
		}};// <- 이게 안되기 때문에 이너클래스{}를 이용해서 추상 메소드를 오버라이드 해야함.
				
		// ActionListener의 참조값을 구해야하는데, ActionListener 는 인터페이스이다. 
		//인터페이스의 추상메소드가 하나 있기 때문에, 오버라이드해줘야한다. 
		
		//2))버튼을 눌렀을 때 실행할 메소드를 가지고 있는 객체를 등록하는 메소드 .
		sendBtn.addActionListener(lisen);
		
		
		
		
		//====================================방법 2 =============
		
		sendBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//입력한 문자열 읽어오기 
				String msg = inputMsg.getText();
				
				//알림으로 띄우기 
				JOptionPane.showConfirmDialog(MyFrame.this, msg);
			}
		});
		
		sendBtn.addActionListener(this);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame("나의 프레임8");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String txt = e.getActionCommand();
		System.out.println(txt);
	}
	

	
	
}
