package me.brunosantana.headfirst.design_patterns.singleton_bloco_sincronizado;

//
// Danger!  This implementation of Singleton not
// guaranteed to work prior to Java 5
//

public class Singleton {
	private volatile static Singleton uniqueInstance;
 
	private Singleton() {}
 
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {
					waitOneSecond();
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
	
	private static void waitOneSecond() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
