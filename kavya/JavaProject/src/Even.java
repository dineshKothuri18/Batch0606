import java.util.Scanner;
public class Even{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1=sc.nextInt();
        System.out.println("Enter a number: ");
        int num2=sc.nextInt();

        System.out.println("The even numbers between "+ num1+ "and "+num2);
        for(int i=num1; i<num2; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println(" ");
        System.out.println("The odd numbers between "+ num1+ "and" +num2);
        for(int i=num1; i<num2; i++){
            if(i%2==1){
                System.out.print(i+" ");
            }
        }
        System.out.println(" ");
        System.out.println("The mnultiplication between "+ num1+ "and" +num2);
        for(int i=1; i<=num2; i++)
        {
            System.out.println(num1+"*"+ i +"="+(num1*i));
        }
        System.out.println(" ");
        System.out.println("The prime numbers between"+num1+ "and" +num2+":" );
        for(int i=2; i<=num2; i++){
            boolean flag=true;
            for(int j=2; j*j<=i; j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag==true)
                System.out.println(i+" ");
        }
    }
}

