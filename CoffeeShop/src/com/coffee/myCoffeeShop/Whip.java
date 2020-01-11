package com.coffee.myCoffeeShop;

public class Whip extends CondimentDecorator {
	
	Beverage beverage;
	
	public Whip(Beverage bvg) {
		this.beverage = bvg;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return .20 + beverage.cost();
	}
	

}
