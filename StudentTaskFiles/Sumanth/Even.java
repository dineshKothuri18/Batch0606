import java.util.Scanner;
public class Even{
	public static void main(String[] args){
               	
		int number1=0;
		int number2=0;
		while(number1>=number2){ 
                Scanner sc = new Scanner(System.in);
		System.out.print("enter a number1 : ");
		number1=sc.nextInt();
		System.out.print("enter a number2 : ");
		number2=sc.nextInt();
	 System.out.println("enter correct numbers ");
	break;
	}		 
	 System.out.print("Even numbers between " + number1 + "-" + number2 + " are : ");
         for (int i = number1+1; i <= number2-1; i++) 
            if (i % 2 == 0) 
              System.out.print(i + " ");

           	System.out.print("\nodd numbers between " + number1 + "-" + number2 + " are : ");
        for (int i = number1+1; i <= number2-1; i++) 
            if (i %2 != 0) 
                System.out.print(i + " ");
	
			System.out.println("\nMultiplication of " +number1+"*"+number2 + ":");
		for (int i = 1; i <= number2; i++)  
            		System.out.println(number1+ "*" +i + "="+(number1*i));
		
		System.out.print("Prime numbers are : ");
		for(int i=number1;i<number2;i++){
			int k = i;
			int prime =0;
			for(int j=2;j<k;j++){
				if(k%j==0){
           			prime=1;
				break;
}
}
if(prime==0)
System.out.print(k+" ");
					
		}	
			
    
     }
}