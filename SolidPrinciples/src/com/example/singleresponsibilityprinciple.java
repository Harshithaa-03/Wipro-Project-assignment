package com.example;
 
class User{
	String name;
	String email;
	
	public User(String name,String email) {
		this.name=name;
		this.email=email;
		
	}
}
	class UserSaver{
	public void saveToFile(User user)
	{
		System.out.println("Saving user"+user.name+"to file");
	}
	
}

public class singleresponsibilityprinciple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user=new User("abc","abc@gmail.com");
		UserSaver saver=new UserSaver();
		saver.saveToFile(user);
		
	}

}
