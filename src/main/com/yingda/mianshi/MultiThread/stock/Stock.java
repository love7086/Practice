package main.com.yingda.mianshi.MultiThread.stock;

public class Stock {
	static volatile Integer stock = 0;
//	static Object prod = new Object();
//	static Object cons = new Object();
	static Object lock = new Object();
	static volatile Integer count = 0;

	static class Producer extends Thread {
		static volatile int n = 0;

		public void run() {
			while (stock < 10) {
				if (count >= 30)
					break;
				try {
					System.out.println("producing " + n++);
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				synchronized (lock) {
					while (stock == 10) {
						System.out.println("Producer " + Thread.currentThread().getName() + " waiting");
						try {
							lock.wait();
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
					}
					stock++;
					lock.notify();
				}
			}
		}
	}

	static class Consumer extends Thread {

		static volatile Integer n = 0;

		public void run() {

			synchronized (lock) {
				try {
					lock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			while (stock > 0) {
				if (count >= 30)
					break;
				try {
					System.out.println("consuming " + n++);
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				synchronized (lock) {
					while (stock == 0) {
						System.out.println("Consumer " + Thread.currentThread().getName() + " waiting");
						try {
							lock.wait();
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
					}
					stock--;
					if (count++ == 30) {
						System.out.println("DONE");
						Thread.currentThread().stop();
					} else {
						lock.notify();
					}
				}
			}

		}
	}

	public static void main(String[] args) {
		Consumer c = new Consumer();
		Producer p = new Producer();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		Thread t3 = new Thread(p);
		Thread t4 = new Thread(p);
		t3.start();
		t4.start();
		t1.start();
		t2.start();

	}
}// if (count++ == 30) {
//System.out.println("Done");
//} else {
//lock.notifyAll();
//}
