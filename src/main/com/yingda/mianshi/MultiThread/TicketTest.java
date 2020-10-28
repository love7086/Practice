package main.com.yingda.mianshi.MultiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TicketTest {
	public static void main(String[] args) {
		ExecutorService threadpool = Executors.newFixedThreadPool(4);
		Integer ticket = 10000;
		for (int i = 0; i < 4; i++) {
			threadpool.execute(new Ticket(ticket));
		}
		threadpool.shutdown();
	}

}

class Ticket implements Runnable {
	private static volatile Integer ticket;

	public Ticket(Integer ticket) {
		this.ticket = ticket;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (ticket) {
				if (ticket > 0) {
//				System.out.println(Thread.currentThread().getName() + " selling " + ticket-- + " ticket");
					System.out.println(ticket--);
				} else {
					break;
				}
			}
		}
	}
}