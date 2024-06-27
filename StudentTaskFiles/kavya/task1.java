import java.util.Scanner;
public class Square{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1=sc.nextInt();
        System.out.println("Enter second number:");
        int num2=sc.nextInt();
        
        //num1=2
        //num2=3
        int add=num1+num2;
        int sub=num1-num2;
        int mul=num1*num2;
        float div=num1/(float)num2;
        int mod=num1%num2;
        int square=(num1*num2)+(num1*num2);
        
        System.out.println("Choose required formula ");
        int operator=sc.nextInt();
       
        switch(operator){
            case 1:
                System.out.println("The addition of two numbers are :"+add);
                break;
            case 2:
                System.out.println("The subtraction of two numbers are: "+sub);
                break;
            case 3:
                System.out.println("The multiplication of two numbers are: "+mul);
                break;
            case 4:
                System.out.println("The division of two numbers are: "+div);
                break;
            case 5:
                System.out.println("The modules of two numbers are: "+mod);
                break;
            case 6:
                System.out.println("The square of two numbers are: "+square);
                break;
            default:
            System.out.println("Invalid choice");
        }
    }
}