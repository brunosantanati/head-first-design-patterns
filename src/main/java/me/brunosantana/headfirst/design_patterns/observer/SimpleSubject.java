package me.brunosantana.headfirst.design_patterns.observer;

import java.util.ArrayList;

public class SimpleSubject implements Subject{
	
	private ArrayList<Observer> observers;
	private int value = 0;
	
	public SimpleSubject() {
		observers = new ArrayList<>();
	}

	public void registerObserver(Observer o) {
		observers.add(o);		
	}

	public void removeObserver(Observer o) {
		int index = observers.indexOf(o);
		if(index >= 0)
			observers.remove(index);
	}

	public void notifyObservers() {
		observers.stream().forEach((o) -> o.update(this.value));
	}
	
	public void setValue(int value) {
		this.value = value;
		notifyObservers();
	}

}
