import java.util.Scanner;

public class Looping{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        
        while (true) {
            System.out.print("Please Enter number1: ");
            num1 = scanner.nextInt();
            System.out.print("Please Enter number2: ");
            num2 = scanner.nextInt();
            
            if (num1 > num2) {
                System.out.println("Please enter valid numbers.");
            } else {
                break;
            }
        }
        
        System.out.println("Even numbers between " + num1 + "-" + num2 + " are:");
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        
        System.out.println("Odd numbers between " + num1 + "-" + num2 + " are:");
        for (int i = num1; i <= num2; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        
        System.out.println("Prime numbers between " + num1 + "-" + num2 + " are:");
        for (int i = num1; i <= num2; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        
        System.out.println("Table of " + num1 + " up to " + num2 + " is:");
        for (int i = 1; i <= num2; i++) {
            System.out.println(num1 + " * " + i + " = " + (num1 * i));
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