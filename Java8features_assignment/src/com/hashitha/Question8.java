package com.hashitha;


import java.util.*;
import java.util.stream.Collectors;

public class Question8 {
	public static void main(String[] args) {
        List<String> cities = Arrays.asList("Karnataka", "Bangalore", "Tumkur", "Mysore", "Mangalore");

        String joinedCities = cities.stream().collect(Collectors.joining(", "));
                                    

        System.out.println("Cities: " + joinedCities);
        
    }
	
}

