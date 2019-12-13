package me.brunosantana.headfirst.design_patterns.singleton_not_thread_safe;

//NOTE: This is not thread safe!

public class Singleton {
	private static Singleton uniqueInstance;

	private Singleton() {}

	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			waitOneSecond();
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}

	//wait one second to simulate the problem with multiple threads
	private static void waitOneSecond() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
