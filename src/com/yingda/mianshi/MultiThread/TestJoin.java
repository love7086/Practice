package com.yingda.mianshi.MultiThread;

public class TestJoin {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " start");
		ThreadTest t1 = new ThreadTest("A");
		ThreadTest t2 = new ThreadTest("B");
		ThreadTest t3 = new ThreadTest("C");
		System.out.println("t1start");
		t1.start();
		System.out.println("t2start");
		t2.start();
		System.out.println("t3start");
		t3.start();
		System.out.println(Thread.currentThread().getName() + " end");
	}

}

class ThreadTest extends Thread {
	private String name;

	public ThreadTest(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(name + "-" + i);
		}
	}

}
