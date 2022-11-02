package frame06;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame {
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
		
		JButton sendBtn = new JButton("전송");
		add(sendBtn);
		
		//이너 클래스 사용
		ActionListener listener = new ActionListener() {
			//익명 클래스 사용 (Anonymous Class)
			@Override
			//ActionListener 인터페이스가 가지고 있는 
			//추상 메소드를 전부 오버라이드하는게 강제된다.
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("전송버튼이 눌렸습니다.");
				
				JOptionPane.showMessageDialog(MyFrame.this, "전송합니다.");
				
				Component n = MyFrame.this;
				ActionListener m = this; 
				//그냥 this를 클랙할 경우 이너 클래스의 객체를 가리킨다. 
				//이너 클래스를 포함하고 있는 아웃픗 클래스의 객체를 가리키고 싶으면 
				// 아웃풋 클래스.this 로 표기한다. 예) Component n = MyFrame.this;
			}
			
		};
		
		//전송버튼에 등록하기
		sendBtn.addActionListener(listener);
		
		
		
		/* 예시 ))))))))))))))))))))))))))))))))))))))
		 * 삭제 버튼도 프레임에 배치하고, 해당 버튼을 눌렀을 때 [삭제 버튼을 눌렀네] 라는
		 * 메세지를 콘솔창에 출력되도록 프로그래밍 해보세요. 
		 */
		JButton closeBtn = new JButton("삭제");
		add(closeBtn);
		
		//익명 클래스 사용 (Anonymous Class)
		ActionListener closeClick = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stubㅋ
				System.out.println("삭제 버튼을 눌렀네 ");
				JOptionPane.showConfirmDialog(MyFrame.this, "삭제");
			}};
		closeBtn.addActionListener(closeClick);
		//setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		
		MyFrame y = new MyFrame("나의 프레임6");
		y.setVisible(true);
		
	}
}
