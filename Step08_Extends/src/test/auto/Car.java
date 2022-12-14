package test.auto;

/*
 *  - 접근 지정자 접근범위
 *  
 *  public : 어디에서나 접근 가능(전체공개)
 *  protected : 동일한 package 혹은 상속관계에서 자식에서 접근가능
 *  default : 동일한 package안에서만 접근가능 (class 앞에 default를 쓰는것이 아닌 접근 지정자를 지우는것, 비공개) 
 *  private :  동일한 클래스 혹은 동일한 객체 안에서만 접근가능
 *  (클래스 내부에서만 사용가능하다, 단 클래스가 객체로 생성
 *  되었을 때 사용이 가능한것  ) 
 *  
 *   - 접근 지정자를 붙이는 위치
 *   
 *   1. 클래스를 선언할 때
 *   2. 생성자
 *   3. 필드
 *   4. 메소드
 *   
 *   클래스는 default와 public 두가지의 접근지정자만 지정가능하다.
 *   접근지정자를 생략한것이 default 접근 지정자다. 
 *   
 */
public class Car {
	//필드 (메서드에서 사용하기 위해 값을 저장함) 
	public Engine engine;
	
	//Engine 객체를 인자로 전달 받는 생성자
	public Car(Engine engine) {
		//생성자로 전달 받은 Engine 객체의 참조값을 필드에 저장하기
		this.engine=engine;
	}
	
	//메소드
	public void drive() {
		if(this.engine == null) {
			System.out.println("Engine 객체가 없어서 달릴 수가 없어요");
			return; //메소드 끝내기
		}
		System.out.println("달려요~");
	}
}
