import java.util.*;
public class ass12 {
	static class Patient {
        final String name;
        final int severity;     // 1 = most urgent
        final long ts;          // arrival time
        Patient(String name, int severity, long ts) {
            this.name = name; this.severity = severity; this.ts = ts;
        }
        public String toString() { return name + "(sev=" + severity + ", ts=" + ts + ")"; }
    }

	public static void main(String[] args) {
		Comparator<Patient> cmp = Comparator
                .comparingInt((Patient p) -> p.severity)
                .thenComparingLong(p -> p.ts);
        PriorityQueue<Patient> pq = new PriorityQueue<>(cmp);

        add(pq, new Patient("A", 3, 1), 5, cmp);
        add(pq, new Patient("B", 1, 2), 5, cmp);
        add(pq, new Patient("C", 2, 3), 5, cmp);
        add(pq, new Patient("D", 2, 4), 5, cmp);
        add(pq, new Patient("E", 5, 5), 5, cmp);
        add(pq, new Patient("F", 1, 6), 5, cmp); // should displace worst if needed

        while (!pq.isEmpty()) System.out.println("Treat: " + pq.poll());
    }

    // keep only best 5 (by priority); drop the worst if new is better
    static void add(PriorityQueue<Patient> pq, Patient p, int cap, Comparator<Patient> cmp) {
        if (pq.size() < cap) { pq.add(p); return; }
        // find current worst
        Patient worst = Collections.max(pq, cmp);
        if (cmp.compare(p, worst) < 0) {
            pq.remove(worst);
            pq.add(p);
        } // else ignore new one

	}

}
