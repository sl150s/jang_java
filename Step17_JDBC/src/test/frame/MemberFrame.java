package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MemberFrame extends JFrame implements ActionListener{
	// 필드
	JTextField inputName, inputAddr;

	// 생성자
	public MemberFrame() {
		//레이아웃 매니저 설정 
		setLayout(new BorderLayout());

		JLabel label1 = new JLabel("이름");
		inputName = new JTextField(10);

		JLabel label2 = new JLabel("주소");
		inputAddr = new JTextField(10);

		JButton saveBtn = new JButton("저장");
		saveBtn.setActionCommand("save");
		//ㅇ페널에 UI를 배치하고
		JPanel panel = new JPanel();
		panel.add(label1);
		panel.add(inputName);
		panel.add(label2);
		panel.add(inputAddr);
		panel.add(saveBtn);
		//패널째로 프레임의 북쪽에 배치 
		add(panel, BorderLayout.NORTH);
	}
	
	// 테이블에 회원 목록을 출력하는 메소드
	public void displayMember() {
		
	}

	public static void main(String[] args) {
		MemberFrame f = new MemberFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 800, 500);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
