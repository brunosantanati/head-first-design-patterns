package me.brunosantana.headfirst.design_patterns.strategy;

public class MuteQuack implements QuackBehavior {

	public void quack() {
		System.out.println("<< Silence >>");
	}

}
