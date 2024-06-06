package Main;

import java.util.Scanner;

public class Admin {
	
	void Admin() {
		
		int n1;
		do {
		System.out.println("**Admin Page**");
		System.out.println("1]Student Records\n"+"2]Book Records\n"+"3]Manage Books\n"+"4]Exit");
		System.out.println("Enter any option:");
		
       Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
       
    switch (n1) {
	case 1:
		StudentRecords sr = new StudentRecords();
		sr.student();
		break;
		
	case 2:
		BookRecords obj = new BookRecords();
		obj.book();
		break;
		
	case 3:
		BookRecords obj2 = new BookRecords();
		obj2.managebook();
		break;

	}
		}while(n1!=4);	
	}
}
