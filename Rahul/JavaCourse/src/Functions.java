import java.util.*;
public class Functions{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("Please choose any one of the below available services: ");
            System.out.println("1. Arithematic Calulations");
            System.out.println("2. Check whether number is Prime or not");
            System.out.println("3. Factors of the given number");
            System.out.println("4. Letter count of a String");
            System.out.println("5.Exit");
            System.out.println();
            System.out.println("Enter the required service number: ");
            int user_input;
            while (true) {

                try
                {
                    user_input = sc.nextInt();
                    switch(user_input){
                        case 1:
                            arithmetic();
                            break;
                        case 2:
                            prime();
                            break;
                        case 3:
                            factors();
                            break;
                        case 4:
                            count_of_string();
                            break;
                        case 5:
                            flag = false;
                            System.out.println("Thanks for visiting :)");
                            break;
                        default:
                            System.out.println("Please enter the valid Service Number :)");
                            System.out.println("-------------------------------------------------------------------------------");
                    }
                }
                catch (InputMismatchException e)
                {
                    sc.next();
                    System.out.print("That’s not an integer. Try again: ");
                }
            }

        }

    }
    public static void arithmetic(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Any of the Following Arithmetic Operations ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Please select the Arithmetic service number: ");
        int user_input = sc.nextInt();
        switch(user_input){
            case 1:
                System.out.println("Selected Operation is Addition");
                System.out.println("Enter the 1st number: ");
                int num1 = sc.nextInt();
                System.out.println("Enter the 2nd number: ");
                int num2 = sc.nextInt();
                System.out.println("Addition of "+num1+" and "+num2+" is: "+(num1+num2));
                System.out.println("-------------------------------------------------------------------------------");
                break;
            case 2:
                System.out.println("Selected Operation is Subtraction");
                System.out.println("Enter the 1st number: ");
                num1 = sc.nextInt();
                System.out.println("Enter the 2nd number: ");
                num2 = sc.nextInt();
                System.out.println("Subtraction of "+num1+" and "+num2+" is: "+(num1-num2));
                System.out.println("-------------------------------------------------------------------------------");
                break;
            case 3:
                System.out.println("Selected Operation is Multiplication");
                System.out.println("Enter the 1st number: ");
                num1 = sc.nextInt();
                System.out.println("Enter the 2nd number: ");
                num2 = sc.nextInt();
                System.out.println("Multiplication of "+num1+" and "+num2+" is: "+(num1*num2));
                System.out.println("-------------------------------------------------------------------------------");
                break;
            case 4:
                System.out.println("Selected Operation is Division");
                System.out.println("Enter the 1st number: ");
                num1 = sc.nextInt();
                System.out.println("Enter the 2nd number: ");
                num2 = sc.nextInt();
                while(num2 == 0){
                    System.out.println("Division by Zero is invalid");
                    System.out.println("Please Enter num2 Again");
                    num2 = sc.nextInt();
                }
                System.out.println("Divsion of "+num1+" and "+num2+" is: "+(num1/num2));
                System.out.println("-------------------------------------------------------------------------------");
                break;
            default:
                System.out.println("Enter the valid Arithmetic service number");
                System.out.println("-------------------------------------------------------------------------------");
                break;

        }
    }
    public static void prime(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is prime or not:");
        int num = sc.nextInt();
        boolean flag = false;
        for(int i =2; i*i<=num;i++){
            if(num%i==0){
                flag = true;
                System.out.println(num+" is not Prime");
                break;
            }
        }
        if(flag == false){
            System.out.println(num+" is prime");
        }
        System.out.println("-------------------------------------------------------------------------------");
    }
    public static void factors(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check its factors");
        int num = sc.nextInt();
        System.out.println("Factors of "+num+" are:");
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+"  ");
            }
        }
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------");
    }
    public static void count_of_string(){
        Scanner sc = new Scanner(System.in);
        System.out.println("String enter chei ra babuu : ");
        String s = sc.nextLine();
        s = s.toLowerCase();
        int ar[] = new int[127];
        for(int i=0;i<s.length();i++){

            int ascii = s.charAt(i);
            ar[ascii]++;
        }
        for(int i=0;i<s.length();i++){
            int ascii = s.charAt(i);
            if(ar[ascii]>0){
                System.out.println(Character.toUpperCase(s.charAt(i)) +"-"+ar[ascii]);
                ar[ascii] = 0;
            }
        }
        System.out.println("-------------------------------------------------------------------------------");
    }
}
