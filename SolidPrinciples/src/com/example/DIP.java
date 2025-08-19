package com.example;

interface Engine
{
	void start();
		
}

class electric_engine implements Engine{
	public void start() {
		System.out.println("engine started");
	}
}
class car
{
	private Engine engine;
	public car(Engine engine)
	{
		super();
		this.engine=engine;
	}
	void drive()
	{
		engine.start();
		System.out.println("car driving");
	}
}

public class DIP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine en=new electric_engine();
		car car=new car(en);
		car.drive();
		

	}

}
