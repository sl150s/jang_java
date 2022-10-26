package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		// 0으로 초기화된 방 3개짜리 int[] 객체 만들어서 참조값을 지역변수 nums에 담기
		int[] nums = {0,0,0};
		
		// 0번방에 10, 1번방에 20, 2번방에 30을 저장해보세요.
		nums[0] = 10; 
		nums[1] = 20; 
		nums[2] = 30; 
		
		// 0으로 초기화된 방 1000개짜리 int[] 객체 만들어서 
		//참조값을 지역변수 nums2에 담기
		int[] nums2 = new int[100];
		//생성된 방에는 어떤 값이라도 있어야하기 때문에 자동으로 0 이라는 숫자가 주어진다.
		//아예 아무것도 없는 방은 만들어질 수 없기 때문.(참조값을 담는 데이터 타입엔 null이 담긴다) 
		
		
		// 0으로 초기화된 방 3개짜리 int[] 객체 만들어서 참조값을 지역변수 nums에 담기
		int[] nums3 = new int[3];
		nums3[0] = 100;
		nums3[1] = 200;
		nums3[2] = 300;
		nums3[3] = 400;
		
		System.out.println("main 메소드가 정상 종료됩니다. ");
		
	}
}
