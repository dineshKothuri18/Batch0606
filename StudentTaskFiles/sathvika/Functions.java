import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
         boolean flag = true;
        while(flag){
             System.out.println("choose the below options:");
             System.out.println("1. Arithematic operators");
             System.out.println("2. Check The given number is Prime Or not");
             System.out.println("3. Factors of a given number");
             System.out.println("4. Letters count of the given string");
             System.out.println("5. End");
             System.out.println();
             System.out.println("Please enter vaild number:");
             int a = sc.nextInt();
             switch(a){
                 case 1:
                  System.out.println("Enter selected option is Arithemetic");
                  System.out.println("Enter the 1st number:");
                    int num1=sc.nextInt();
                    System.out.println("Enter the 2nd number:");
                    int num2=sc.nextInt();
                    System.out.println("Addition of "+num1+"and "+num2+"is:"+(num1+num2));
                    System.out.println("Subtraction of "+num1+"and "+num2+"is:"+(num1-num2));
                    System.out.println("Multiplication of "+num1+"and "+num2+"is:"+(num1*num2));
                    System.out.println("Division of "+num1+"and "+num2+"is:"+(num1/num2));
                    System.out.println("+++++++++++++++++++");
                    break;
                    case 2:
                        prime();
                        break;
                    case 3:
                        factors();
                        break;
                    case 4:
                        System.out.println("Enter a String:");
                        sc.nextLine();
                        String s = sc.nextLine();
                        lettersCount(s);
                        break;
                    default:
                    System.out.println("please enter vaild number");
                    System.out.println("#################");
                    break;
             }
        }
    }
         public static void prime(){
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter a number to check prime or not:");
             int num = sc.nextInt();
             boolean flag = true;
             for(int i=2;i<=num;i++){
                 if(num%i==0){
                     flag=false;
                     System.out.println("The number is not a prime number");
                     break;
                 }
                 }
                 if(flag==true){
                     System.out.println("The number is a prime number");
                 }
                 System.out.println("----------------------------------");
             }
             public static void factors(){
                 Scanner sc = new Scanner(System.in);
                 System.out.println("Enter a number to check its factors");
                  int num = sc.nextInt();
                  System.out.println("Factors of "+num+"are:");
                  for(int i=1;i<=num;i++){
                      if(num%i==0){
                          System.out.print(i+" ");
                      }
                  }
                  System.out.println();
                   System.out.println("---------------------------------");
             }
             public static void lettersCount(String s){
                 for(int i=0;i<s.length();i++){
                     int count=0;
                     for(int j=0;j<s.length();j++){
                         if(s.charAt(i)==s.charAt(j)){
                             count=count+1;
                         }
                     }
                     System.out.println(s.charAt(i)+":"+count);
                
                    }
                  
         }
}