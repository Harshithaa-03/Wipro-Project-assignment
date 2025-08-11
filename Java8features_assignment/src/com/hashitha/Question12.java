package com.hashitha;

import java.util.*;

public class Question12 {

	public static void main(String[] args) {
        List<String> names = Arrays.asList("Usha", "Dhanu", "Harsh", "Ram", "Seetha");

        names.sort(String::compareTo);

        System.out.println("Sorted Names:");
        names.forEach(System.out::println);
    }
}



