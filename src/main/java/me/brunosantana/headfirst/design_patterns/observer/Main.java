package me.brunosantana.headfirst.design_patterns.observer;

public class Main {

	public static void main(String[] args) {
		SimpleSubject subject = new SimpleSubject();
		
		Observer observer = new SimpleObserver(subject);
		Observer observer2 = new SimpleObserver(subject);
		
		subject.setValue(80);
	}

}
