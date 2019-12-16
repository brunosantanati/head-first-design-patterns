package me.brunosantana.headfirst.design_patterns.singleton_inicializacao_rapida;

public class SingletonTestDrive {

	public static void main(String[] args) {
		
		//start more than one thread to guarantee It's thread safe!
		
		new Thread(() -> {
			System.out.printf("Thread %d is running...%n", Thread.currentThread().getId());
			Singleton s = Singleton.getInstance();
			System.out.printf("%d - %s%n", Thread.currentThread().getId(), s);
			System.out.println(s.getDescription());
		}).start();
		
		new Thread(() -> {
			System.out.printf("Thread %d is running...%n", Thread.currentThread().getId());
			Singleton s = Singleton.getInstance();
			System.out.printf("%d - %s%n", Thread.currentThread().getId(), s);
			System.out.println(s.getDescription());
		}).start();
		
	}

}
