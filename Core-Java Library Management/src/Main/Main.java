package Main;

import java.util.Scanner;

public class Main{
	
	static String userId;
	static String password;
	
	public static void main(String[] args) {
		
		int n;
		do {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("***Library Management System***");
		System.out.println("1] Sign Up");
		System.out.println("2] Login");
		System.out.println("3] Exit");
		System.out.println("Enter any option:");
		 n=sc2.nextInt();
		 
		 Main obj1 = new Main();
		 
		 switch (n) {
		case 1:
			obj1.Signup();
			break;
			
		case 2:
			obj1.Login();
			break;
		}
		}while(n!=3);
		
	}
	
	  void Signup() {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Sign up");
		System.out.println("Enter UserId:");
		 userId=sc.next();
		System.out.println("Enter Password:");
	   password=sc.next();	
	}
	public void Login() {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Login");
		System.out.println("Enter UserId:");
		String user=sc1.next();
		System.out.println("Enter Password:");
		 String pass=sc1.next();
		
		if (Main.userId.equals(user) && Main.password.equalsIgnoreCase(pass))
		{	
			System.out.println("Login Successful.Welcome Admin");

			Admin ad = new Admin();
			ad.Admin();	
		} 
		else 
		{	
         System.out.println("You have entered incorrect username and password.Login Unsuccessful.");
		}
	}
	
}

	
	
		
	
	

