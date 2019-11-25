package me.brunosantana.headfirst.design_patterns.decorator;

public abstract class Beverage {
	
	String description = "Unknown Beverage";
	
	public String getDescription() {
		return this.description;
	}
	
	public abstract double cost();
}
