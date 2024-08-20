import java.util.Scanner;
public class Function{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter of Num1: ");
            int num1=sc.nextInt();
            System.out.println("Enter of Num2: ");
            int num2=sc.nextInt();
            int add=num1+num2;
            add(add);
            
            int sub=num1-num2;
            sub(sub);
            
            int mul=num1*num2;
            mul(mul);
            
            prime(num1);
            
            factor(num1);
            
            name();
    }
    public static void add(int a){
        System.out.println("Additon of Two Numbers: "+a);
        System.out.println("-------------------------------------------");
    }
    public static void sub(int a){
    System.out.println("Subtraction of Two Numbers: "+a);
    System.out.println("--------------------------------------------");
}
public static void mul(int a){
    System.out.println("Multiplication of Two Numbers: "+a);
    System.out.println("--------------------------------------------");
}
public static void prime(int n){
    boolean flag=true;
    for(int i=2; i<n; i++){
        if(n%i==0){
            flag=false;
            System.out.println("The given Number is Not a Prime");
            System.out.println("--------------------------------------------");
            break;
        }
    }
    if(flag==true){
        System.out.println("The given Number is a Prime");
        System.out.println("--------------------------------------------");
    }
    
    }
public static void factor(int n){
    System.out.print("The factors of a given Number are: ");
    for(int i=1; i<=n; i++){
        if(n%i==0){
            System.out.print(i+ "  ");
        }
    }
    System.out.println();
    System.out.println("--------------------------------------------");
    } 
    public static void name(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String name = sc.nextLine();
        System.out.println("Length of a String: "+ name.length());
        System.out.println("--------------------------------------------");
        System.out.println("*****THE END*****");
    }
}
