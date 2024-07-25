import java.util.Scanner;

public class Functions_Creations{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First Number :  ");
        int num1 = sc.nextInt();
        System.out.println("Enter Your Second Number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter Your String Details : ");
        String myWord = sc.nextLine();
        sc.nextLine();
        System.out.println("ARITHMETIC OPERATION");
        System.out.println("PRIME NUMBER");
        System.out.println("FACTORS OF THE GIVEN NUMBERS");
        System.out.println("LETTERS COUNT OF GIVEN STRING");
        while(true){
            System.out.println("Enter Your Choice : ");
            String choice = sc.nextLine();
            switch (choice) {
                case "ARITHMETIC OPERATION":
                    addOfTwoNumbers(num1, num2);
                    subOfTwoNumbers(num1, num2);
                    mulOfTwoNmubers(num1, num2);
                    divOfTwoNumbers(num1, num2);
                    moduleOfTwoNumbers(num1, num2);
                    break;
                case "PRIME NUMBER":
                    checkForPrimeNumberorNot(num1, num2);
                    break;
                case "FACTORS OF THE GIVEN NUMBERS":
                    findingFactorsOfTheNUmbers(num1, num2);
                    break;
                case "LETTERS COUNT OF GIVEN STRING":
                    System.out.println("Number of letters count in the String are : "+lettersCountInString(myWord));
                    break;
                default:
                    System.out.println("Invaild choice");
                    break;
            }
        }
    }
    public static int addOfTwoNumbers(int num1,int num2){
        int num3 = num1+num2;
        System.out.println("The Sum of two Numbers : " +num3);
        return num3;
    }
    public static int subOfTwoNumbers(int num1,int num2){
        int num3 = num1-num2;
        System.out.println("The Result of two Numbers : " +num3);
        return num3;
    }
    public static int mulOfTwoNmubers(int num1, int num2){
        int num3 = num1*num2;
        System.out.println("The Product of two Numbers is : "+num3);
        return num3;
    }
    public static float divOfTwoNumbers(int num1, int num2){
        float num3 = num1/num2;
        System.out.println("The Result of two Numbers is : "+num3);
        return num3;
    }
    public static double moduleOfTwoNumbers(int num1,int num2){
        double num3 = num1%num2;
        System.out.println("THe Result of two Numbers is : "+num3);
        return num3;
    }
    public static void checkForPrimeNumberorNot(int num1, int num2){
        if(isPrime(num1)){
            System.out.println("The given Number1 is a Prime Number");
        }
        else {
            System.out.println("The given Number1 is not a Prime NUmber");
        }
        if(isPrime(num2)){
            System.out.println("The given Number2 is a Prime Number");
        }
        else{
            System.out.println("The given Number2 is not a Prime Number");
        }
    }
    public static boolean isPrime(int num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }
    public static void findingFactorsOfTheNUmbers(int num1,int num2){
        System.out.println("Factors of"+num1+"are : ");
        for(int i=1;i<=num1;i++){
            if(num1%i==0){System.out.println(i);
            }
        }
        System.out.println("Factors of"+num2+"are : ");
        for(int j=1;j<=num2;j++){
            if(num2%j==0){
                System.out.println(j);
            }
        }
    }
    public static int lettersCountInString(String myWord) {
        int count = 0;
        for (int i = 0; i < myWord.length(); i++) {
            count++;
        }
        return count;
    }

}



