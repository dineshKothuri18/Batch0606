import java.util.Scanner;
public class Funtion{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number1: ");
        int Number1 = sc.nextInt();
        System.out.println("Enter a Number2: ");
        int Number2 = sc.nextInt();
        
        int add = Number1+Number2;
        add(add);
        
        int sub = Number1-Number2;
        sub(sub);
        
        int mult = Number1*Number2;
        mult(mult);
        
        prime(Number1);
            
        factor(Number1);

        name();
    
    }
        public static void add(int a){
            System.out.println("Addition of a two Number: " + a);
        System.out.println("********************************************");
            
        } 
        public static void sub(int a){
            System.out.println("Subtration of two Number:  "+ a);
        System.out.println("********************************************");

        }
        public static void mult(int a){
            System.out.println("Multiplication of two Number: "+ a);
        System.out.println("********************************************");
        }
        public static void prime(int n){
         boolean flag = true;
           for(int i=1; i<=n; i++){
            if(n%i==0){
                flag=false;
                System.out.print("the given number is not prime");
            System.out.println("****************************");
                break;
            }
        }

        if(flag==true){
            System.out.println("This is prime number");
        System.out.println("********************************");
            }
       }
       
       public static void factor(int n){
           System.out.println("factors of numbers: ");
           for(int i=2; i<=n; i++){
           if(n%i==0){
               System.out.println(i+ "  ");
           }
       }
        System.out.println();
     System.out.println("**************************************");
      }
      
      public static void name(){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the string");
          String name = sc.nextLine();
          System.out.println("Length of a String:" + name.length());
          System.out.println("**************************");
      } 
      
   
 }




        
        
        
    
       
        
    

    

        




