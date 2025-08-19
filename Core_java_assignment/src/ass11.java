import java.util.concurrent.*;
public class ass11 {
	    static class Task {
	        final int id;
	        Task(int id) { this.id = id; }
	        public String toString() { return "T" + id; }
	    }


	public static void main(String[] args)throws Exception{
		LinkedBlockingQueue<Task> stage1 = new LinkedBlockingQueue<>();
        LinkedBlockingQueue<Task> stage2 = new LinkedBlockingQueue<>();

        for (int i = 1; i <= 8; i++) stage1.add(new Task(i));

        Thread worker = new Thread(() -> {
            try {
                while (!stage1.isEmpty()) {
                    Task t = stage1.take();
                    if (t.id % 2 == 0) stage2.put(t);
                    System.out.println("Processed: " + t + " -> " + (t.id % 2 == 0 ? "S2" : "discard"));
                }
                stage2.put(new Task(-1)); // poison
            } catch (InterruptedException ignored) {}
        });

        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    Task t = stage2.take();
                    if (t.id == -1) break;
                    System.out.println("Stage2 run: " + t);
                }
            } catch (InterruptedException ignored) {}
        });

        worker.start(); consumer.start();
        worker.join(); consumer.join();

	}

}
