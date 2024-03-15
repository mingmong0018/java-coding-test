package Temp;

abstract public class Deco implements Coffee{
	private Coffee coffee;
	Deco(Coffee coffee) {
		this.coffee = coffee;
	}
	@Override
	public void getCost() {
		coffee.getCost();
	}

	@Override
	public void getSugar() {
		coffee.getSugar();
	}
}
