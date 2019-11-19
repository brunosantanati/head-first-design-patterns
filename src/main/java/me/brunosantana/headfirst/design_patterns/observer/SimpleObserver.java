package me.brunosantana.headfirst.design_patterns.observer;

import java.util.Random;

public class SimpleObserver implements Observer {

	private String name = this.getClass().toString() + (new Random().hashCode());
	private int value;
	private Subject subject;
	
	public SimpleObserver(Subject subject) {
		this.subject = subject;
		subject.registerObserver(this);
	}
	
	@Override
	public void update(int value) {
		this.value = value;
		display();
	}
	
	private void display() {
		System.out.println(this.name + " Value: " + this.value);
	}

}
