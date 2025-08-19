import java.util.*;
public class ass2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>tasks=new LinkedList<>();
		String[] input= {"buy milk","fix bug!","call mom","read book"};
		for(String t:input)
		{
			if(t.endsWith("!"))tasks.addFirst(t);
			else tasks.addLast(t);
		}
		System.out.println("Original order:"+tasks);
		System.out.println("Reverse print:");
		Iterator<String>it=tasks.descendingIterator();
		while(it.hasNext())
			System.out.println(it.next()+"");
			
		
					
				

	}

}
