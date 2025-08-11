package com.hashitha;

import java.util.*;
import java.util.stream.Collectors;

public class Question10 {
	
	
	public static void main(String[] args) {
		
        List<String> names = Arrays.asList("Nandana", "Anu", "Arjun", "Dhanu", "ABhi", "Ambu", "Anu");

        Map<String, Long> nameFrequency = names.stream().collect(Collectors.groupingBy(name -> name,Collectors.counting()));
                                                   
                                               

        System.out.println("Name Frequencies:");
        
        nameFrequency.forEach((name, count) -> System.out.println(name + ": " + count));
            
        
    }
}



   
