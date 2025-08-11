package com.hashitha;

@FunctionalInterface
interface MessagePrinter {
    void print(String message);
}
public class Question3 {


	    public static void greet(String name, MessagePrinter printer) {
	        String message = "Hello, " + name + "!";
	        printer.print(message);
	    }

	    public static void main(String[] args) {
	        greet("Harshitha", msg -> System.out.println(msg));

	        greet("Dhanu", msg -> System.out.println("Greeting: " + msg));
	    }
	}

