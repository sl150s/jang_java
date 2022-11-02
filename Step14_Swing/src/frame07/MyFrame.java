package frame07;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener{
	
	
	//생성자
	public MyFrame(String title) {
		super(title);
		
		//다형성 확인 : this 예약어를 이용해서 MyFrame 객체의 다형성 확인
		MyFrame a = this;
		JFrame b = this;
		Component c = this;
		Object d = this;
		
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		//객체 생성해서 참조값을 필드에 저장 
		JButton sendBtn = new JButton("전송");
		add(sendBtn);
		//버튼에 액션 command를 설정
		sendBtn.setActionCommand("send");
		
		
		JButton closeBtn = new JButton("삭제");
		add(closeBtn);
		closeBtn.setActionCommand("delete");
		
		
		sendBtn.addActionListener(this);
		closeBtn.addActionListener(this);
	}
	
	public static void main(String[] args) {
		
		MyFrame y = new MyFrame("나의 프레임6");
		y.setVisible(true);
		
	}
	
	/*
	 * 전송버튼, 삭제버튼을 누르면 호출되는 메소드
	 * 메소드 안에서 어떤 버튼을 눌렀는지 확인해서 분기해야 한다.
	 * 메소드에 선언된 매개변수 ActionEvent e 에 눌러진 버튼에 대한 정보가 담겨 있따.
	 * 해당 객체를 활용해서 분기를 하면 된다. 
	 */
	
	//방법 2)))))))))) getActionCommand 를 이용해서 객체 담기 
	@Override
	public void actionPerformed(ActionEvent e) {
		//눌러진 버튼의 액션 command 값을 읽어온다. 
		String command = e.getActionCommand();
		if(command.equals("send")) {
			JOptionPane.showMessageDialog(this, "전송합니다");
		}else if(command.equals("delete")) {
			JOptionPane.showMessageDialog(this, "삭제 합니다");
		}
		
	}
	
	
	
	
}
