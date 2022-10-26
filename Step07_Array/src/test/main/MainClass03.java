package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		//String type을 담을 수 있는 
		//방3개짜리 빈 배열객체를 만들어서 참조값을 지역변수 nams에 담기
		String[] names = new String[3];
		
		//2. 3개의 방에 순서대로 친구의 이름을 담아보세요 
		names[0] = "이친구";
		names[1] = "삼친구";
		names[2] = "사친구";
		
		
		//3. 배열에 들어있는 친구의 이름을 하나씩 순서대로
		//콘솔창에 출력해보세요.
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
	}
}
