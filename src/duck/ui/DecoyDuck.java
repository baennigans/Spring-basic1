package duck.ui;

import duck.fly.FlyWithWings;
import duck.quack.Quack;

public class DecoyDuck implements Duck {

	Quack quack;
	FlyWithWings fly;
	
	
	public void setQuack(Quack quack) {
		this.quack = quack;
	}

	public void setFly(FlyWithWings fly) {
		this.fly = fly;
	}
	
	@Override
	public void displayName() {
		System.out.println("NAME = DecoyDuck!!");	
	}

	@Override
	public void performQuack() {
		quack.quack();
	}

	@Override
	public void performFly() {
		fly.fly();
	}
}
