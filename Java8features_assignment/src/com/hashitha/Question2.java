package com.hashitha;

import java.util.Optional;

public class Question2 {

	    public static Optional<Double> divide(int numerator, int divisor) {
	        if (divisor == 0) {
	            return Optional.empty(); 
	        }
	        return Optional.of((double) numerator / divisor);
	    }

	    public static void main(String[] args) {
	        int a = 10;
	        int b = 2;

	        Optional<Double> result = divide(a, b);

	        if (result.isPresent()) {
	            System.out.println("Result: " + result.get());
	        } else {
	            System.out.println("Not Allowed"); 
	        }
	    }
	}


