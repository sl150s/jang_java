package frame05;

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
	//필드 (저장소) 역할 
	JButton sendBtn;
	JButton closeBtn;

	
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
		sendBtn = new JButton("전송");
		add(sendBtn);
		
		closeBtn = new JButton("삭제");
		add(closeBtn);
		
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
	@Override
	public void actionPerformed(ActionEvent e) {
		//눌러진 버튼의 참조값 얻어내기 
		Object which = e.getSource();
		
		//생성자 안에서 생성된 변수는 지역변수 이기 때문에 다른 클래스에서 사용할 수 없음 
		if(which == sendBtn) {
			JOptionPane.showConfirmDialog(this,"전송");
		}else if(which == closeBtn) {
			JOptionPane.showConfirmDialog(this,"삭제");
		}
		 
		//e의 메소드
		// 1) .getSource() : 참조값이 전달된다. 
		
		
		
	}
	
	
	
	
}
