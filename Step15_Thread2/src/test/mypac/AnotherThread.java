package test.mypac;

/*/
 * 새로운 스레드 만드는 방법
 * 
 * 1. Thread 클래스를 상속 받을 클래스로 정의한다.
 * 2. run() 메소드를 오버라이드 한다. (run -> 스페이스 엔터 해서 오버라이드) 
 * 3. run() 메소드 안에서 ㅅ로운 스레드에서 해야할 작업을 코딩한다.
 * 4. 만든 클래스로 객체를 생성하고 해당 객체의 start() 메소드를 호출하면
 *    새로운 스레드가 시작된다.
 */
public class AnotherThread extends Thread{
	//2. 
	@Override
	public void run() { //run 메소드에서는 또다른 스레드가 시작된다. 
		//AnotherThread 객체는 여러번 만들 수 있다 (new 할때마다 생겨남)
		//run 메소드가 독립적으로 존재함. 때문에 스레드를 각각 독립적으로 만들수있음. 
		
		System.out.println("작업을 시작합니다.");
	      
	      
	      try {
	         Thread.sleep(10000);
	      } catch (InterruptedException e1) {
	         e1.printStackTrace();
	      }
	      
	      System.out.println("작업이 끝났습니다.");
	}
}
