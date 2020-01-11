package com.coffee.myCoffeeShop;

public class CoffeeShop {

	public static void main(String[] args) {
		Beverage beverage1 = new Expresso();
		System.out.println("Beverage 1 Description = " + beverage1.getDescription());
		System.out.println("Beverage 1 Cost        = " + beverage1.cost());
		
		Beverage beverage2 = new DarkRoast();
		beverage2= new Mocha(beverage2);
		beverage2= new Mocha(beverage2);
		beverage2= new Whip(beverage2);
		
		System.out.println("Beverage 2 Description = " + beverage2.getDescription());
		System.out.println("Beverage 2 Cost        = " + beverage2.cost());

	}

}
