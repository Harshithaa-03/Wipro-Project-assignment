import java.util.*;

public class ass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> commands = new Stack<>();
		
        commands.push("type A");
        commands.push("type B");
        commands.push("type C");
        
        System.out.println("Stack: " + commands);

        String undone = commands.pop(); // undo last
        System.out.println("Undo : " + undone);
        
        commands.push(undone);
        System.out.println("Redo : " + commands);
    }


	}

