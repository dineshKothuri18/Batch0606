
import java.util.Scanner; 

public class ScannerClass{

	public static void main(String[] args){
		
	
		Scanner sc = new Scanner(System.in);	

		System.out.println("Please enter Student Name");
		String sName = sc.nextLine();
		System.out.println("Please enter sub1 Marks");
		float sub1 = sc.nextFloat();		
		System.out.println("Please enter sub2 Marks");
		float sub2 = sc.nextFloat();
			
		float total = sub1 + sub2;
		
		System.out.println("Name " + sName);
		System.out.println("Entered sub1 marks are " + sub1);
		System.out.println("Entered sub2 marks are " + sub2);
		System.out.println("Total marks are " + total);
		
	
		
	}
} 



/* 
	1.Write a program to take input of a student ,Name,age,email,gender,s1,s2,s3,s4,s5,s6	and calculate totalMarks,percentage and g give grade as per our previous task, also print pass/fail	
	o/p 
		Name : Dinesh
		Age : 33
		Email : din@gmail.com
		Gender : M
		Subject1 : 100
		Subject2 : 100
		Subject3 : 100
		Subject4 : 100
		Subject5 : 100
		Subject6 : 100
		TotalMarks : 600
		Percentage : 100
		Grade : A+
		Result : Passed in Distinction

	2.Write a program to take day as input and print the subject on that day using 		switch
	Monday: Android
	Tuesday: Java
	Wednesday: Python
	Thursday: PHP
	Friday: HTML
	Saturday: SQL

		Enter day : Monday
		o/p: Today you have Android Class
*/






