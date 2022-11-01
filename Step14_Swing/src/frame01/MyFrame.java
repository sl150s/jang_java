package frame01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	//생성자
	public MyFrame(String title) {
		super(title);
		
		//프레임의 초기 설정 작업하기
		//.setBounds : 좌표 x 100, y 100, 높이 500, 가로 500 
		this.setBounds(100,100,500,500);
		
		//.setDefaultCloseOperation 
		//x버튼 (close버튼)을 눌렀을 때 프로세스도 같이 종료 되도록 설정
		//이 설정이 없으면 프로세스가 보이지 않지만 살아있음.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//레이아웃 매니저는 아직 사용하지 않겠다(모든 ui를 절대 좌표에 배치하겠다.)
		this.setLayout(null);
		
		//버튼 하나를 만들어서
		JButton btn1 = new JButton("버튼1");
		
		//ㅇ위치를 설정하고
		btn1.setLocation(10,10);
		
		//크기도 설정해서
		btn1.setSize(100,30);
		
		//프레임에 추가하기
		this.add(btn1);
		
		//프레임을 화면상에 실제 보이게하기(false하면 화면에 보이지 않는다)
		this.setVisible(true);
	}
	
	//run 했을 때 실행의 흐름이 시작되는 특별한 메소드
	public static void main(String[] args) {
		//MyFrame 객체 생성하기
		new MyFrame("나의 프레임");
	}
}

