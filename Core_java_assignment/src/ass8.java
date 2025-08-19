import java.util.*;
public class ass8 {

	public static void main(String[] args) {

		Deque<String> history = new ArrayDeque<>();
        String[] msgs = {"hi", "how r u", "fine", "send file", "got it", "thanks"};
        for (String m : msgs) {
            if (history.size() == 4) history.removeFirst();
            history.addLast(m);
            System.out.println(history);
        }
        System.out.println("Last 4: " + history);

	}

}
