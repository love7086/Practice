package com.yingda.mianshi.MultiThread;

public class ThreadTest1 {
	public static void main(String[] args) {
		Object lock = new Object();
		Test a = new Test(lock, "a");
		Thread ta = new Thread(a);

		Test b = new Test(lock, "b");
		Thread tb = new Thread(b);

		Test c = new Test(lock, "c");
		Thread tc = new Thread(c);

		ta.start();
		tb.start();
		tc.start();
	}

}

class Test implements Runnable {
	Object lock;
	String str;

	public Test(Object lock, String str) {
		this.lock = lock;
		this.str = str;
	}

	@Override
	public void run() {
		for (int i = 0; i < 15; i++) {
			System.out.println("before synchronized " + str + " " + Thread.currentThread().getName());
			synchronized (lock) {
				System.out.println(str + i);

				lock.notify();
				try {
					lock.wait();
				} catch (InterruptedException e) {
					System.out.println(str + " is interrupted..");
				}
				System.out.println("after wait " + str);
			}

		}

	}
}