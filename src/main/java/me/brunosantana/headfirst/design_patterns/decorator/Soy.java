package me.brunosantana.headfirst.design_patterns.decorator;

public class Soy extends CondimentDecorator {

	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return .15 + this.beverage.cost();
	}

}
