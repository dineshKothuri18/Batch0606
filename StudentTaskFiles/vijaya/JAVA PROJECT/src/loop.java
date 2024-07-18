import java.util.Scanner;

public class loop{
    public static void main(String[] args){
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num1 = sc.nextInt();
        System.out.println("enter a number : ");
        int num2 = sc.nextInt();
        
        
        System.out.print("even numbers between"+num1+"and"+num2+": ");
        for(int i=num1; i<=num2; i++){
             if(i%2==0){
                 System.out.print(i +" ");
            }
        }
        System.out.print("\nodd numbers between"+num1+"and"+num2+": ");
        for(int i=num1; i<=num2; i++){
             if(i%2==1){
                 System.out.print(i+" ");
            }
        } 
        System.out.println(" ");
        for(int i=1; i<=num2; i++){
                
                 System.out.println(num1+"*"+i+"="+ (num1*i));
        }
        System.out.print("\nprime numbers between"+num1+"and"+num2+": ");
        for(int i=2;i<=num2;i++){
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