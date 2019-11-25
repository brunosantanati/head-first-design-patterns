package me.brunosantana.headfirst.design_patterns.decorator;

public class Whip extends CondimentDecorator {

	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return .10 + this.beverage.cost();
	}

}