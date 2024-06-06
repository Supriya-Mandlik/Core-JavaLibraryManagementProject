package Main;

import java.util.Arrays;
import java.util.Scanner;

public class StudentRecords {
	
	void student() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Total Student number:");
		int totalstudent = sc.nextInt();
		
		String[] stuName = new String[totalstudent];
		int[] stuRollno = new int[totalstudent];
		
		StudentRecords sr1 = new StudentRecords();
		
		int i;
		
		do {
			
		System.out.println("***Student Page***");
		System.out.println("1]Add Students\n"+"2]Display All Students\n"+"3]Exit");
		System.out.println("Enter any option:");
		
		 i = sc.nextInt();
		
		switch (i) {
		case 1:
			System.out.println("Add student name and Roll number:");
			sr1.takeStudent(stuName, stuRollno, totalstudent);
			break;
			
        case 2:
			System.out.println("List of students with Roll number:");
			sr1.getstudent(stuName, stuRollno, totalstudent);
			break;
			
        case 3:
			System.out.println("Exit");
			break;
		}
		}while(i!=3);
		
	}
	
	void takeStudent(String[] stuName ,int[] stuRollno,int totalstudent) {      
		
		Scanner sc1 = new Scanner(System.in);
		
		for(int i=0 ; i<totalstudent ; i++) {
			
			System.out.println("Enter Student Roll Number:");
			stuRollno[i]=sc1.nextInt();
			System.out.println("Enter Student Name:");
			stuName[i]=sc1.next();
				
		}
		
		System.out.println("***Students Added Successfully***");
		
    }
	
	 void getstudent(String[] stuName ,int[] stuRollno,int totalstudent) {   
		
		 for(int i=0 ;i<totalstudent;i++) {
	 System.out.println(i+1+" "+"Student Roll Number:"+stuRollno[i]+" "+"Student Name:"+stuName[i]);
		 }
		 
	}
		
}
