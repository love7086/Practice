package com.yingda.mianshi.MultiThread;

public class SenderReceiver {
	public static void main(String[] args) {
		Data data = new Data();
		Thread sender = new Thread(new Sender(data));
		Thread receiver = new Thread(new Receiver(data));

		sender.start();
		receiver.start();
	}
}
