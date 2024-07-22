import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
        int number;
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int reversenum = 0, temp = number;
        while(temp > 0){
            int remainder = temp%10;
            reversenum = reversenum*10 + remainder;
            temp = temp/10;
        }
        if(number == reversenum)
    System.out.println("Number is palindrome");
    else
    System.out.println("Number is  not palindrome");
        
    }
    
}