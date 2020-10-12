package com.yingda.mianshi.MultiThread;

public class ThreadTest2 {
	public static void main(String[] args) {

		Test1 t = new Test1();

		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		t1.start();
		t2.start();

	}

}

class Test1 implements Runnable {

	int i;// 成员变量

	@Override
	public void run() {

//		int i = 0;// 局部变量 覆盖掉成员变量

		while (true) {

			System.out.println("i=" + i++);

			if (i == 20) {
				break;
			}
		}

	}
}