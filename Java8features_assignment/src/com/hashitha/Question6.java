package com.hashitha;

import java.util.*;

public class Question6 {
	
	public static void main(String[] args) {
		
		
        List<String> names = Arrays.asList("Harshitha", "Asha", "likitha", "usha", "arjun", "anu");

        long count = names.stream().filter(name -> name.length() > 5).count();
                          
                          

        System.out.println("Number of names longer than 5 characters: " + count);
        
 
	}
	
}

