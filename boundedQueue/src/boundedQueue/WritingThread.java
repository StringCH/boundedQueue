package boundedQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class WritingThread extends Thread {

	public ArrayBlockingQueue<String> blockingQueue;

	WritingThread(ArrayBlockingQueue<String> boundedQueue) {
		this.blockingQueue = boundedQueue;
	}

	public void run() {

		while (true) {
			if (this.blockingQueue.remainingCapacity() > 0) {
				this.blockingQueue.add("Input");
				System.out.println("Writing Thread" + blockingQueue);
			} else
				System.out.print("\"Writing Thread\" Queue is full!");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// handle exception here
			}
		}
	}
}
