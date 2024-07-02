import java.util.Scanner;
  
  public class EvenOdd{
      public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter Highest number");
          int number1=sc.nextInt();
          System.out.println("Enter Smallest number");
          int number2=sc.nextInt();
          System.out.println("Even numbers between" +  number1  + "and" +  number2);
          for(int i=number1;i>=number2;i--)
          if(i%2==0){
              System.out.println(i);
          }
    
       System.out.println("Odd numbers between" + number1 + "and" + number2);
          for(int i=number1;i>=number2;i--)
          if(i%2==1){
              System.out.println(i); 
          }
          System.out.println("Multiplcation table of" + number1 + "upto" + number2 + ":");
          for(int i=1;i<=number2;i++){
              System.out.println(number1 + "*" + i + "=" + (number1*i));
          }
          
      }
  }