package com.coffee.myCoffeeShop;

public class Milk extends CondimentDecorator {
	
	Beverage beverage;
	
	public Milk(Beverage bvg) {
		this.beverage = bvg;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	@Override
	public double cost() {
		return .10 + beverage.cost();
	}


}
