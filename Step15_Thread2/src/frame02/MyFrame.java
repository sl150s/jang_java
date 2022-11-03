package frame02;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import test.mypac.AnotherThread;

public class MyFrame extends JFrame implements ActionListener{
   
   //생성자
   public MyFrame(String title) {
      super(title);
      //프레임의 초기 설정 작업하기 
      setBounds(100, 100, 500, 500);
      // 이프레임(MyFrame)의 x 버튼 (close 버튼) 을 눌렀을때 프로세스도 같이 종료 되도록 설정 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //레이아웃 설정
      setLayout(new FlowLayout());
      
      JButton startBtn=new JButton("작업 시작");
      startBtn.addActionListener(this);
      //프레임에 버튼 추가
      add(startBtn);
      
      JTextField tf = new JTextField(10);
      //프레임에 JTextField 추가
      add(tf);
      
      // 프레임을 화면상에 실제 보이게 하기( false 하면 화면에 보이지 않는다 )
      setVisible(true);
   }
   
   
   
   //===============아래처럼 run버튼 눌렀을때 실행이 되는 걸 스레드(Thread)라고 한다.
   //run 했을때 실행의 흐름이 시작되는 특별한 메소드 
   public static void main(String[] args) {
      //MyFrame 객체 생성하기
      new MyFrame("나의 프레임");
   }
   //===============스레드(Thread)
   
   

   @Override
   public void actionPerformed(ActionEvent e) {
      System.out.println("새로운 스레드를 시작합니다.");
      //스레드 객체를 생성해서 
      Thread t = new AnotherThread();
      /*
       * start()메소드를 호출하면 새로운 스레드가 시작된다
       * ㅅ로운 스레드(작업단위)는 위에서 생성한 스레드 객체의 run() 메소드가
       * 자동으로 호출되면서 시작된다.
       * run()메소드의 리턴 여부와 상관 없이 start() 메소드는 바로 리턴된다.(바로 빠져나옴)
       * 스레드객체는 재활용이 안됨(한번 리턴되면 버리는 값임)
       * 때문에 반드시 일회성 객체를 만들어야 한다? 
       * start() 메소드를 호출한 스레드는 main 스레드이기 때문에
       * main 스레드는 또 다른 작업을 할 수가 있다. 
       */
      
      t.start();
   }
   
}







