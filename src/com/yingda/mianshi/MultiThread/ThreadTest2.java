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

	int i;// ��Ա����

	@Override
	public void run() {

//		int i = 0;// �ֲ����� ���ǵ���Ա����

		while (true) {

			System.out.println("i=" + i++);

			if (i == 20) {
				break;
			}
		}

	}
}