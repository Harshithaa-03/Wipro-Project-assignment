import java.util.*;

public class ass5 {

	public static void main(String[] args) {
		
		LinkedList<String> apps = new LinkedList<>();
        String[] opened = {"YT", "Maps", "Chrome", "YT", "Twitter", "Chrome"};
        for (String a : opened) {
            apps.remove(a);      
            apps.addFirst(a);    
            System.out.println("Opened " + a + " -> " + apps);
        }
        
        System.out.println("Final after 5 opens: " + apps.subList(0, Math.min(5, apps.size())));
 

	}

}
