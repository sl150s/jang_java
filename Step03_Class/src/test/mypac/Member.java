package test.mypac;

public class Member {
	// 번호, 이름, 주소 
	
	public int number;
	public String name;
	public String addr;
	
	
	//메소드 
	public void showInfo() {
		//필드에 저장된 내용을 활용해서 정보를 출력하기
		System.out.println("번호:"+this.number+", 이름"+this.name+", 주소:"+this.addr);
	}
	
	// 회원 정보는 static으로 만들지 않는 것이 좋음. 여러명의 정보를 
	// 관리해야되기 때문.(static으로 설정된 class는 하나만 사용가능, 재사용 불가능) 
	
}
