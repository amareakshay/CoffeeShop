package com.coffee.myCoffeeShop;

public class Mocha extends CondimentDecorator {
	
	Beverage beverage;
	
	public Mocha(Beverage bvg) {
		this.beverage = bvg;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return .30 + beverage.cost();
	}


}
