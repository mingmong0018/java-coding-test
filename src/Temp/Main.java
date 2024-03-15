package Temp;

public class Main {
	public static void main(String[] args) {
		new CostDeco(new SugarDeco(new SimpleCoffee())).getSugar();
	}
}
