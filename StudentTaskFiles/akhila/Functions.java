import java.util.Scanner;
public class Functions{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean end=false;
        while(!end){
            System.out.println("Choose the below options :");
            System.out.println("**********************************************************");
            
            System.out.println("1. Arithematic Operations");
            System.out.println("2.Factors of a number");
            System.out.println("3.Check if a number is prime or not");
            System.out.println("4.Letters count of a string");
            System.out.println("5.Bye");
            System.out.println("**********************************************************");
            System.out.println("Enter ur choice :");
            int a = sc.nextInt();
            switch(a){
                case 1:
                    System.out.print("Enter two numbers :");
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();
                    arithematicOperation(num1,num2);
                    continue;
                    
                    case 2:
                        System.out.print("Enter a num to find its factors : ");
                        int num3 = sc.nextInt();
                        factors(num3);
                        continue;
                        
                        case 3:
                            System.out.print("Enter a number to check number if it is prime :");
                            int num4 = sc.nextInt();
                            primeOrNot(num4);
                        continue;
                        case 4:
                            System.out.print("Enter a string to count its letters :");
                            sc.nextLine();
                            String str = sc.nextLine();
                            lettersCounting(str);
                            continue;
                            case 5:
                                end = true;
                                break;
            }
        }
    }
    public static void arithematicOperation(int a , int b){
        System.out.println("Addition of 2 numbers :" + (a+b));
        System.out.println("Substraction of 2 numbers : " + (a-b));
        System.out.println("Multiplication of two numbers : " + (a*b));
        System.out.println("Division of 2 numbers : " + (a/b));
        System.out.println("Modulus of 2 numbers : " + (a%b));
        System.out.println("**********************************************************");
        
    }
    public static void factors(int num){
        System.out.print("Factors of a" + " " +num + " " +"are:");
        for(int i = 1;i<=num;i++){
            if(num %i==0){
                System.out.print(i + " ");
                
            }
        }
        System.out.println();
        System.out.println("**********************************************************");
        
    }
    public static void primeOrNot(int num){
        boolean v = false;
        for(int i=2; i<=num;i++){
            if(num %i==0){
                v=true;
                break;
                
            }
            
        } 
        if(!v)
        System.out.println(num + "is a prime number");
        System.out.println(num + " is not a prime number");
        System.out.println("**********************************************************");
        
        
    }
    public static void lettersCounting(String s){

        String countedLetter=" ";
        for(int i=0;i<s.length();i++){
            char currentLetters=s.charAt(i);
            if(countedLetter.indexOf(currentLetters)==-1){
                int count=0;
                
            
            for (int j = 0; j<s.length(); j++){
                if(s.charAt(j)== currentLetters){
                    count++;
                }
                
        }
            System.out.println(currentLetters + " -" + count);
            countedLetter+=currentLetters;

       }
      
    }
     System.out.println("**********************************************************");
    } 
}