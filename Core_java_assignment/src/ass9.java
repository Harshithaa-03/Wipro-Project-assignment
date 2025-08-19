import java.util.concurrent.*;
public class ass9 {

	public static void main(String[] args)throws InterruptedException {
		 ArrayBlockingQueue<String> printQ = new ArrayBlockingQueue<>(3);
	        String[] jobs = {"doc1", "doc2", "doc3", "doc4", "doc5"};

	        for (String j : jobs) {
	            boolean ok = printQ.offer(j); // won't throw if full
	            System.out.println(ok ? "Queued: " + j : "Skipped (full): " + j);
	        }

	        while (!printQ.isEmpty()) {
	            String j = printQ.take();
	            System.out.println("Printing: " + j);
	            Thread.sleep(200);
	        }

	}

}
