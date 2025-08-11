package com.hashitha;

import java.util.*;
import java.util.stream.Collectors;


public class Question5 {

	public static void main(String[] args) {
		
		
        List<String> names = Arrays.asList("Anu", "Bannu", "Abhi", "Charu", "Anna", "Daara");

        List<String> aNames = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
                                   
        

        System.out.println("Names starting with 'A':");
        aNames.forEach(System.out::println);
    }
}


   
