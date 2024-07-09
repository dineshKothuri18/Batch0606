import java.util.Scanner;

public class functions {
    public static void arithematicOperations(int a,int b){
        int sum = a+b; 
        int sub = a-b;
        int multi= a*b;
        System.out.println("The addition of two numbers: "+sum);
        System.out.println("The subtraction of two numbers: "+sub);
        System.out.println("The multiplication of two numbers: "+multi);
    }
    public static void primeCondition( ){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int input=sc.nextInt();
        boolean flag =true;
         for(int i=2;i<=input/2;i++){
            if(input%i==0){
                flag=false;
                break;
            }
        } if(flag=true)
           System.out.println(input+"is a prime number");
          else
           System.out.println(input+"is not a prime number");
    }
    public static void factorsOfaNumber(int n){
      for (int i=1;i<=n;i++){
        if(n%i == 0){
           System.out.println(i+"");
       }
     }
    
    }
    public static void countOfLetters(String s){
    s=s.toUpperCase();
    String countedLetters="";
    for(int i=0;i<s.length();i++){
        char currentLetter=s.charAt(i);
        if(countedLetters.indexOf(currentLetter)==-1){
            int count=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)== currentLetter){
                    count++;
                }
            }
                System.out.println(currentLetter+"-"+count);
                countedLetters+=currentLetter;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1. Arithmetic Operations");
        System.out.println("2. Check Prime");
        System.out.println("3. Factors of a Number");
        System.out.println("4. Count of Letters");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter two numbers:");
                int a = sc.nextInt();
                int b = sc.nextInt();
                arithematicOperations(a, b);
                break;
            case 2:
                primeCondition();
                break;
            case 3:
                System.out.println("Enter a number:");
                int n = sc.nextInt();
                factorsOfaNumber(n);
                break;
            case 4:
                System.out.println("Enter a string:");
                sc.nextLine(); 
                String s = sc.nextLine();
                countOfLetters(s);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
    


