import java.util.concurrent.*;
public class ass10 {

	public static void main(String[] args) throws Exception{
		LinkedBlockingQueue<String> buffer = new LinkedBlockingQueue<>();
        int MAX = 5;

        Thread producer = new Thread(() -> {
            int i = 1;
            try {
                while (i <= 12) {
                    // pause if queue too big
                    while (buffer.size() >= MAX) Thread.sleep(100);
                    buffer.put("msg-" + i++);
                }
                buffer.put("END");
            } catch (InterruptedException ignored) {}
        });

        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    String m = buffer.take();
                    if (m.equals("END")) { buffer.put("END"); break; }
                    System.out.println("Read: " + m + " (queue=" + buffer.size() + ")");
                    Thread.sleep(150);
                }
            } catch (InterruptedException ignored) {}
        });

        producer.start(); consumer.start();
        producer.join(); consumer.join();
        System.out.println("Done");
    }


	}

