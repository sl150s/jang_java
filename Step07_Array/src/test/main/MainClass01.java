package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		// int type 5개를 저장하고 있는 배열 객체 생성해서 
		// 참조 값을 nums라는 지역 변수에 담기
		// 배열을 만들고 나면 추후에 배열 방을 추가하거나, 삭제할 수 없다. (.push같은 기능 사용 x)
		// 배열도 정해진 타입만 집어넣을 수 있다. 
		
		int[] nums = {10, 20, 30, 40, 50}; //참조값 
		
		//double type 5개를 저장하고 있는 배열
		double[] nums2 = {10.1, 10.2, 10.3, 10.4, 10.5 };
		
		//boolean type 5개를 저장하고 있는 배열
		boolean[] truth = {true, false, false, true, true};
		
		//String type (참조데이터 type) 5개를 저장하고 있는 배열
		String[] names = {"김구라", "해골" , "원숭이", "주뎅이", "덩어리"}; 
		
		//배열의 각각 방 참조하기
		int result1 = nums[0]; //10
		double result2 = nums2[1]; //10.2
		boolean reuslt3 = truth[3]; // false
		String result4 = names[3]; // "주뎅이"
		
		//배열 객체의 메소드와 필드 사용해보기
		int[] cloned = nums.clone(); //clone()은 복제본 얻어내기(참조값 달라짐)
		//clone() 복제해서 새로만들어냄 - 참조값은 다르지만 들어있는 아이템의 내용은 같음.
		
		int[] copied = nums; //대입은 참조값 복사해주기 
		int size = nums.length; 
	}
}
