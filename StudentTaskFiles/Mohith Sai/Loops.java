import java.util.Scanner;

public class Loop{
    public static void main(String[] args){
        
        int number1 = 0;
        int number2 = 0;
        while(number1>=num2){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a number : ");
            num1 = sc.nextInt();
            System.out.println("enter a number2 : ");
            num2 = sc.nextInt();
            System.out.println("enter the correct number");
        }
            
            
            
            System.out.print("even numbers between"+number1+"-"+number2+": ");
            for(int i=number1; i<=number2; i++){
             if(i%2==0){
                 System.out.print(i +" ");
               }
            }
            
                 
            System.out.print("\nodd numbers between"+number1+"-"+number2+": ");
            for(int i=number1; i<=number2; i++){
             if(i%2==1){
                 System.out.print(i+" ");
               }
            }
           System.out.println(" ");
        for(int i=1; i<=number2; i++){
                
                 System.out.println(number1+"*"+i+"="+ (number1*i));
        }
        System.out.print("\nprime numbers between"+number1+"and"+number2+": ");
        for(int i=2;i<=number2;i++){
            boolean flag=true;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag==true)
            System.out.print(i+" ");
        }
                 
    
        } 
        }