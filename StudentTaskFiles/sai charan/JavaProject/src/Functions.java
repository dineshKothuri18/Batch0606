package com.charan.functions;
import java.util.Scanner;

public class Function{
public static void main(String[] args) {

    Scanner sc =new Scanner(System.in);
    
    System.out.println("ENTER FIRST NUM1");
    int num1 = sc.nextInt();
    System.out.println("ENTER SECOND NUM2");
    int num2= sc.nextInt();
     additionOfTwoNumbers(num1,num2);
     subtractionOfTwoNumbers(num1,num2);
    multiplicationOfTwoNumbers(num1,num2);
    primenumbers(num1);
}
public static int additionOfTwoNumbers(int num1, int num2){
    int sum = num1+num2;
    System.out.println("Addition of given two numbers: "+sum);
    return sum;
    

}
public static int subtractionOfTwoNumbers(int num1, int num2){
    int sub = num1-num2;
    System.out.println("Subtraction of given two numbers: "+sub);
    return sub;
    
}
public static int multiplicationOfTwoNumbers(int num1, int num2){
    int multiply = num1*num2;
    System.out.println("Multiplication of given two numbers: "+multiply);
    return multiply;
}

public static void primenumbers(int a) {
	  int i,m=0,count=0;      
	  int n=a;//it is the number to be checked    
	  m=n/2;      
	  if(n==0||n==1){  
	   System.out.println(n+" given number is not prime number");      
	  }else{  
	   for(i=2;i<=m;i++){      
	    if(n%i==0){      
	     count++;      
	     break;      
	    }      
	   }      
	   if(count==0)
	   { System.out.println(n+" given number is prime number"); } 
	   else {
		   System.out.println(n+" given number is not prime number");  
	   }
	  }
	    
}
}