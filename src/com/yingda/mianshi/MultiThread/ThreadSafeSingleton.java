package com.yingda.mianshi.MultiThread;

public class ThreadSafeSingleton {
	private volatile static ThreadSafeSingleton singleton;

	private ThreadSafeSingleton() {

	}

	public synchronized ThreadSafeSingleton get() {
		if (singleton == null) {
			synchronized (this) {
				if (singleton == null) {
					singleton = new ThreadSafeSingleton();
				}
			}
		}
		return singleton;
	}

}
