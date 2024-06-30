
import java.util.Scanner;

public class Loops {


	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number");

		int num = scan.nextInt();

		for(int i=1; i<=100; i++){
			if(i%2==0){
				System.out.print("Yes " + i + " is even");
			}else{
				System.out.print("Yes " + i + " is odd");
			}
		}
		
/*		write a programme to take 2 numbers as input and print its even, odd, prime between them
		also print num1 Table upto num2

		Output:	
		Please Enter number1 : 3
		Please Enter number2 : 30
		Even numbers between 3-30 are : .........
		Odd numbers between 3-30 are : .........
		Prime numbers between 3-30 are : .........
		Table is
			3*1 = 3
			3*2 = 6
			3*3 = 9
			.
			.
			.
			3*30 = 90
*/		
	
	}

}





















/*
			while, do while,for
		for(initilisation;Condition;increment)



		
		for(int num=1; num <=5; num ++){
			System.out.println(i);
		}
		1 true execute increment
		2 true execute increment
		3 true execute increment
		4 true execute increment
		5 true execute increment
		6 false skip
		System.out.println("Loop End");

		print 100 numbers using for loop
		write a program to print even numbers within 100
		write a program to print odd numbers within 100
		write a program to print prime numbers
		write a program to print a given table

		*/
				
		