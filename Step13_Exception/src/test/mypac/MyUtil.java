package test.mypac;

public class MyUtil {
	
	//1. Surround try-catch - 내가 직접 메소드 안에서 처리할거야 
	public static void draw() {
		System.out.println("5초동안 그림을 그려요!");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("그림 완성!");
	}
	
	//2. add throw - 메소드를 사용하는 입장에서 수정하는게 좋아(메소드를 사용할 때 try-catch를 하게한다)
	public static void send() throws InterruptedException {
		System.out.println("5초동안 전송을 해요!");
		Thread.sleep(5000);
		System.out.println("전송 완료!");
	}
}
