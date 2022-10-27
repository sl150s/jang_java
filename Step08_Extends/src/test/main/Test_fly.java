package test.main;

import test.auto.Car;
import test.auto.Engine;
import test.auto.FlyingCar;

public class Test_fly {
	public static void main(String[] args) {
		Car car1 = new FlyingCar(new Engine());
		FlyingCar flying = (FlyingCar)car1;
		flying.fly();
	}
}
