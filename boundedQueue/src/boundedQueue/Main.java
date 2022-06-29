package boundedQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Main extends Thread {

	static volatile ArrayBlockingQueue<String> blockingQueue = new ArrayBlockingQueue<String>(10);

	public static void main(String[] args) {

		WritingThread writingThread = new WritingThread(blockingQueue);
		ReadingThread readingThread = new ReadingThread(blockingQueue);
		blockingQueue.add("Input");
		blockingQueue.add("Input");
		blockingQueue.add("Input");

		System.out.print("in Main: " + blockingQueue);

		writingThread.start();
		;
		readingThread.start();
		;
		System.out.print("in Main: " + blockingQueue);
	}

}
