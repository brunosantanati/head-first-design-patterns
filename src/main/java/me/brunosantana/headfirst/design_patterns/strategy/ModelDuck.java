package me.brunosantana.headfirst.design_patterns.strategy;

public class ModelDuck extends Duck {
	
	public ModelDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("I'm a model duck");		
	}

}
