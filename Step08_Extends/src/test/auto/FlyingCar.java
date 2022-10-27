package test.auto;

public class FlyingCar extends Car {

	public FlyingCar(Engine engine) {
		super(engine);
	}
	
	public void fly() {
		System.out.println("하늘을 날아요");
	}
	
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		super.drive();
	}
	
	
}
