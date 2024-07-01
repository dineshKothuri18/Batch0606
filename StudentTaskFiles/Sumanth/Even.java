import java.util.Scanner;
public class Even{
	public static void main(String[] args){
               	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int number1 = sc.nextInt();
		System.out.println("Enter a limit  : ");
		int number2 = sc.nextInt();   
	 System.out.print("Even numbers between " + number1 + "-" + number2 + " are : ");
         for (int i = number1; i <= number2; i++) 
            if (i % 2 == 0) 
              System.out.print(i + " ");

           	System.out.print("\nodd numbers between " + number1 + "-" + number2 + " are : ");
        for (int i = number1; i <= number2; i++) 
            if (i %2 != 0) 
                System.out.print(i + " ");
	
			System.out.println("\nMultiplication of " +number1+"*"+number2 + ":");
		for (int i = 1; i <= number2; i++)  
            		System.out.println(number1+ "*" +i + "="+(number1*i));


    
       
}
}