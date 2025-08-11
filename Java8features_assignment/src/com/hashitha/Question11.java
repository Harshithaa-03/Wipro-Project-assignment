package com.hashitha;


import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Question11 {

	public static void main(String[] args) {
		
		
        List<String> names = Arrays.asList("Anna", "Ajuna", "Dhanu", "Harsh", "Akka", "Ram", "Anita");

        Predicate<String> startsWithA = name -> name.startsWith("A");

        Predicate<String> endsWithA = name -> name.endsWith("a");

        List<String> filteredNames = names.stream().filter(startsWithA.and(endsWithA)).collect(Collectors.toList());
                                          
                                          

        System.out.println("Names starting with 'A' and ending with 'a':");
        filteredNames.forEach(System.out::println);
    }
}




   