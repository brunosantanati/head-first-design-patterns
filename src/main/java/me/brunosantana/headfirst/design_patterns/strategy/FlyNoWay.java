package me.brunosantana.headfirst.design_patterns.strategy;

public class FlyNoWay implements FlyBehavior {

	public void fly() {
		System.out.println("I can't fly");
	}

}
