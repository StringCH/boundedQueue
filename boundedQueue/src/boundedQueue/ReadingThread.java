package boundedQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class ReadingThread extends Thread {

	ArrayBlockingQueue<String> blockingQueue;

	ReadingThread(ArrayBlockingQueue<String> boundedQueue) {
		this.blockingQueue = boundedQueue;
	}

	public void run() {

		while (true) {
			this.blockingQueue.poll();
			System.out.println("Reading Thread:" + blockingQueue);
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// handle exception here
			}
		}
	}
}
