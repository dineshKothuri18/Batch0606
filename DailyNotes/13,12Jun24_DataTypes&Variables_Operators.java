public class ArithmeticOperators{

	public static void main(String[] args){
			

			/* + , - , *, /,% 

				variable name can have A-Z,a-z,0-9,_
			*/
			
			int num1 = 5, num2 = 4, sum, sub,mul;
			float div, mod;

			sum = num1 + num2;
			sub = num1 - num2;
			mul = num1 * num2;
			div = (float)num1/num2;
			mod = num1 % num2;
			
			float remainder = 4 / 2;

			System.out.println("Addition is " + sum);
			System.out.println("Subtraction is " + sub);
			System.out.println("Multiplication is " + mul);
			System.out.println("Division is " + div);
			System.out.println("Reminder is " + remainder);

			/*Comparison Operators
				>,<,>=,<=,==
			*/

			
			int age = 19;

			/*Conditions
				if, if else,ififif,nested if, switch
			*/
			
			if(age >= 18){
				System.out.println("Is Eligible to vote");
			}else{
				System.out.println("Is Minor");
			}
			

			/*Logical Operators
				&&(all of the statements are true),||(any of the statement is true)
				true && false = false
			*/
				

			if(age >= 5 && age <= 16){				
					System.out.println("Amma Vodi");
				
			}
	
			boolean isPresent = (num1==num2);
			
			System.out.println("isPresent--"+isPresent);
		
			

	}

}



/*
Division (/) Quotient, 
Modulus(%) Remainder
boolean 
Comparison Operators (<,>,==,>=,<=)
Logical Operators (&&,||)
Assignment =
Conditional Statements if,else

Task: Write a program to calculate student total marks, percentage and print details like below
Percent is more than 50 then only print , Pass 
Name : Dinesh
Qualification : BTEch
Total Marks : 200;
Percentage : 33.333%;
Result : Fail

*/

 











