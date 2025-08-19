import java.util.*;

public class ass7 {
	static class Job {
        final String name;
        final int urgency; // 1 = most urgent
        Job(String name, int urgency) { this.name = name; this.urgency = urgency; }
        public String toString() { return name + "(u=" + urgency + ")"; }
	}

	public static void main(String[] args) {
		  Comparator<Job> cmp = Comparator
	                .comparingInt((Job j) -> j.urgency)              // lower first
	                .thenComparingInt(j -> j.name.length());         // shorter name wins
	        PriorityQueue<Job> pq = new PriorityQueue<>(cmp);

	        pq.add(new Job("DBFix", 2));
	        pq.add(new Job("UI", 2));
	        pq.add(new Job("ProdOutage", 1));
	        pq.add(new Job("Mail", 3));

	        while (!pq.isEmpty()) System.out.println("Picked: " + pq.poll());

	}

}
