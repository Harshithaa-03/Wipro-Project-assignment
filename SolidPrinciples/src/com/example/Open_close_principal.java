//Open closed principal : 
//open for extension but closed for modification



package com.example;

interface PaymentMethod
{
	void pay();
}

class creditCard implements PaymentMethod
{
	public void pay()
	{
		System.out.println("process creditcard payment");
		}
}
class debitCard implements PaymentMethod
{
	public void pay()
	{
		System.out.println("process debitcard payment");
		}
}

class Processor
{
	void Process(PaymentMethod paymentMethod)
	{
		paymentMethod.pay();
	}
}

public class Open_close_principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Processor p=new Processor();
		p.Process(new creditCard());
		p.Process(new debitCard());

	}

}
