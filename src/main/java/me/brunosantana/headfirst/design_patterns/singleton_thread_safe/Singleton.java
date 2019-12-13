package me.brunosantana.headfirst.design_patterns.singleton_thread_safe;

public class Singleton {
	private static Singleton uniqueInstance;

	private Singleton() {}

	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			waitOneSecond();
			uniqueInstance = new Singleton();
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
