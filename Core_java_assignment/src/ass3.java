import java.util.*;
public class ass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Deque<String> last3 = new ArrayDeque<>();
		        String[] searches = {"java", "collections", "deque", "stack", "blockingqueue"};
		        for (String s : searches)
		        {
		            if (last3.size() == 3) last3.removeFirst();
		            last3.addLast(s);
		            System.out.println("After '" + s + "': " + last3);
		        }
		        System.out.println("Final last 3: " + last3);
		    }
		}


