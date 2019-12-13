package me.brunosantana.headfirst.design_patterns.singleton_not_thread_safe;

public class SingletonTestDrive {

	public static void main(String[] args) {
		
		//start more than one thread to see the problem with this implementation of Singleton
		
		new Thread(() -> {
			System.out.printf("Thread %d is running...%n", Thread.currentThread().getId());
			Singleton s = Singleton.getInstance();
			System.out.printf("%d - %s%n", Thread.currentThread().getId(), s);
		}).start();
		
		new Thread(() -> {
			System.out.printf("Thread %d is running...%n", Thread.currentThread().getId());
			Singleton s = Singleton.getInstance();
			System.out.printf("%d - %s%n", Thread.currentThread().getId(), s);
		}).start();
		
	}

}
