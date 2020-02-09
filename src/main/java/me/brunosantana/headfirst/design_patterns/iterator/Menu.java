package me.brunosantana.headfirst.design_patterns.iterator;

import java.util.Iterator;

public interface Menu {
	public Iterator<MenuItem> createIterator();
}
