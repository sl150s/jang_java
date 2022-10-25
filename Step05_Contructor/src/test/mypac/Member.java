package test.mypac;

public class Member {
	// 번호, 이름, 주소 
	
	public int number;
	public String name;
	public String addr;
	
	
	//생성자를 하나라도 정의하면 기본 생성자는 없다고 간주 되기 때문에 
	// 기본 생성자도 필요하면 명시적을 정의해야 한다.
	// 굳이 정의할 필요는 없지만 Member m1 = new Member(); 이라고 객체 생성하고싶을 경우.. 하는게좋음
	public Member() {
		
	}
	//3개의 인자를 전달 받을 준비가 된 생성자 
	public Member(int num, String name, String addr) {//생성자에도 매개변수를 선언할 수 있다.
		//메서드와 비슷해보이지만 완전히 다름 , return type이 명시되어있지 않음 
		
		//생성자의 인자로 전달받은 값을 필드에 저장하기
		this.number=num;
		this.name=name;
		this.addr=addr;
	}
	
	
	//메서드 
	public void showInfo() {
		//필드에 저장된 내용을 활용해서 정보를 출력하기
		System.out.println("번호:"+this.number+", 이름"+this.name+", 주소:"+this.addr);
	}
	
	// 회원 정보는 static으로 만들지 않는 것이 좋음. 여러명의 정보를 
	// 관리해야되기 때문.(static으로 설정된 class는 하나만 사용가능, 재사용 불가능) 
	
}
