package me.brunosantana.headfirst.design_patterns.decorator;

public class HouseBlend extends Beverage{

	public HouseBlend() {
		description = "House Blend Coffee";
	}
	
	@Override
	public double cost() {
		return .89;
	}
	
}
