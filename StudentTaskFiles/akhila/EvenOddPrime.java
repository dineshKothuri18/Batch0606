import java.util.Scanner;
public class EvenOddPrime{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
        System.out.println("Enter the First number:");
        int num1 =input.nextInt();
        System.out.println("Enter the Second number:");
        int num2 =input.nextInt();

      System.out.println("Even and Odd numbers between"+num1+"and"+num2+":");
        
       for(int i=num1; i<=num2; i++){
         if(i%2==0){
           System.out.println(i+"is even");
    }
      else{

           System.out.println(i+"is odd");
}
      if(isPrime(i))
{
        System.out.println(i+"is prime");
}
}
 System.out.println("Multiplication table of"+num1+"upto"+num2+":");
   for(int i=num1; i<=num2; i++){
      System.out.println(num1 + "*" +i+"="+(num1*i));
}
           
}
 public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}     
