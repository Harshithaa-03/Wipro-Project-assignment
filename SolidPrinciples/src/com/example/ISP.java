package com.example;

interface Applicance{
	void turnOn();
}
class Smartlight implements Applicance{
	public void turnOn()
	{
		System.out.println("Light is on");
	}
}

public class ISP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Applicance ap=new Smartlight();
		ap.turnOn();

	}

}
