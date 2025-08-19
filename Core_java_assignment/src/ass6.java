import java.util.*;

public class ass6 {

	public static void main(String[] args) {
		
		Deque<String> q = new ArrayDeque<>();
        String[] names = {"Ana", "Mark", "John", "Lia", "Eve"};
        for (String n : names) {
            if (n.length() % 2 == 0) q.addFirst(n);
            else q.addLast(n);
            System.out.println(q);
        }
        System.out.println("Serving order:");
        while (!q.isEmpty()) System.out.println(q.pollFirst());

	}

}
