package com.hashitha;


interface PowerOperation {
	 int power(int base, int exponent);

	 default void showInfo() {
	     System.out.println("This operation calculates power using base and exponent.");
	 }
}
public class Question4 implements PowerOperation {
	@Override
	 public int power(int base, int exponent) {
	     return (int) Math.pow(base, exponent);
	 }

	
	 public static void main(String[] args) {
		 Question4 dp = new Question4();

	     int result = dp.power(2, 3);
	     System.out.println("2 raised to the power 3 is: " + result);

	     dp.showInfo();
	 }

}

