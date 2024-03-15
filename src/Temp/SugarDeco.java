package Temp;

public class SugarDeco extends Deco{
	SugarDeco(Coffee coffee) {
		super(coffee);
	}
	@Override
	public void getSugar() {
		super.getSugar();
		System.out.println("1");
	}

	@Override
	public void getCost() {
		super.getCost();
		System.out.println("2");

	}
}
