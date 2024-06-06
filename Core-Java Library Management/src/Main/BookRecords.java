package Main;

import java.util.Scanner;

public class BookRecords {
	
 public void book() {
	
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter total Number of books:");
	 int totalbooks=sc.nextInt();
	 
	 BookRecords b1 = new BookRecords();
	 
	 String[] bookName = new String[totalbooks];
	 int[] bookNumber = new int[totalbooks];
	 
	 int i;
		
	 do {
		 
		System.out.println("***Books Page***");
		System.out.println("1]Add Books\n"+"2]Display All Books\n"+"3]Exit");
		System.out.println("Enter any option:");
		
		i = sc.nextInt();
		
		switch (i) {
		case 1:
			System.out.println("Add books");
			b1.addbook(bookName, bookNumber, totalbooks);
			break;
			
		case 2:
			System.out.println("All Available Books");
			b1.display(bookName, bookNumber, totalbooks);
			break;
			
		case 3:
			System.out.println("Exit");
			break;
		}
	 }while(i!=3);
}	
   
   void addbook( String[] bookName,int[] bookNumber,int totalbooks) { 
	   
	   Scanner sc1 = new Scanner(System.in);
	   
	   for(int i=0;i<totalbooks;i++) {
		   System.out.println("Enter Book number:");
		   bookNumber[i]=sc1.nextInt();
		   System.out.println("Enter Book Name:");
		   bookName[i]=sc1.next();
	   }
	   
	   System.out.println("***All Books Added Successfully***");
	   
} 
   
   void display(String[] bookName,int[] bookNumber,int totalbooks) {  
	   
	   System.out.println("***List of Available Books***");
	   
	   for(int i=0 ; i<totalbooks;i++) {
		   System.out.println(i+1+" "+"Book Number:"+bookNumber[i]+" "+"Book Name:"+bookName[i]);
	   } 
   } 
   
	   void managebook() {
			
			System.out.println("**Manage Books Page");
			System.out.println("1]Issue Books\n"+"2]Return Books\n"+"3]Exit");
			System.out.println("Enter any option:");
			
			 BookRecords b2 = new BookRecords();
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			
			switch (i) {
			case 1:
				System.out.println("Issue Book");
				b2.IssueBook();
				break;
				
			case 2:
				System.out.println("Return book");
				b2.ReturnBook();
				break;

			case 3:
				System.out.println("Exit");
				break;

			}	
		}
	   
	   void IssueBook() {
	    	
	    	Scanner sc = new Scanner(System.in);
	    	
	    	System.out.println("Enter Student Roll number:");
	    	int rollnum = sc.nextInt();
	    	System.out.println("Enter book Name:");
	    	String bookname = sc.next();
	    	
	    	System.out.println("***List of Issued books with Student Roll Number*** ");
	    	System.out.println("Student Roll Number:"+rollnum+" "+"Issued Book Name:"+bookname);
	    	
	    }
	   
	   void ReturnBook() {
	    	
	    	Scanner sc = new Scanner(System.in);
	    	
	    	System.out.println("Enter Student Roll number:");
	    	int rollnum = sc.nextInt();
	    	System.out.println("Enter book Name:");
	    	String bookname = sc.next();
	    	
	    	System.out.println("***List of Return books with Student Roll Number*** ");
	    	System.out.println("Student Roll Number:"+rollnum+" "+"Return Book Name:"+bookname);
	    	
	    }

}
