package Temp;

public class CostDeco extends Deco {
	CostDeco(Coffee coffee) {
		super(coffee);
	}
	@Override
	public void getSugar() {
		super.getSugar();
		System.out.println("3");
	}

	@Override
	public void getCost() {
		super.getCost();
		System.out.println("4");

	}
}
