package com.hashitha;


import java.util.*;


public class Question1 {

    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Anu", "Harshitha", "Dhanu", "Seetha", "Lakshmi");

        names.sort((name1, name2) -> name1.compareTo(name2));

        System.out.println("Sorted Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
