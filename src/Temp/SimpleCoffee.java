package Temp;

public class SimpleCoffee implements Coffee{
	@Override
	public void getSugar() {
		System.out.println("커피");
	}

	@Override
	public void getCost() {
		System.out.println("가격");
	}
}
