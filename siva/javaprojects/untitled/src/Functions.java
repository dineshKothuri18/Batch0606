import java.util.*;
public class Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean fal = false;

        while (!fal) {
            System.out.println("1. Arithmetic operation");
            System.out.println("2. Check if a number is Prime");
            System.out.println("3. Factors of a number");
            System.out.println("4. Letters count of a string");
            System.out.println("5. End");
            System.out.println();
            System.out.println("*******************************");
            System.out.println();
            System.out.print("Enter The Option:  ");
            int a = sc.nextInt();
            sc.nextLine();

            switch (a) {
                case 1:
                    System.out.println("Enter The First Number: ");
                    int n1 = sc.nextInt();
                    System.out.println("Enter The Second Number: ");
                    int n2 = sc.nextInt();
                    arithmeticOperation(n1, n2);
                    break;
                case 2:
                    System.out.println();
                    System.out.print("Enter a number to check if it is prime: ");

                    int n3 = sc.nextInt();
                    primeOrNot(n3);
                    break;

                case 3:
                    System.out.println();
                    System.out.print("Enter a number to find its factors: ");

                    int n4 = sc.nextInt();
                    factors(n4);
                    break;
                case 4:
                    System.out.println();
                    System.out.print("Enter the string name: ");

                    String n5 = sc.nextLine();
                    lettersCount(n5);
                    break;
                case 5:
                    fal = true;
                    break;

            }

        }

    }

    public static void arithmeticOperation(int a, int b) {
        System.out.println();
        System.out.println("Addition of two numbers: " + (a + b));
        System.out.println("Subtraction of two numbers: " + (a - b));
        System.out.println("multiplication of two numbers: " + (a * b));
        System.out.println("division of two numbers: "+a/b);
        System.out.println("###########################################");
        System.out.println();
    }

    public static void primeOrNot(int num) {
        boolean bol = false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                bol = true;
                break;
            }
        }
        if (!bol) {
            System.out.println();
            System.out.println(num + " is a prime number");
            System.out.println();
        } else {
            System.out.println();
            System.out.println(num + " is not a prime number");
            System.out.println();
        }
        System.out.println("######################################");
        System.out.println();
    }

    public static void factors(int num) {
        System.out.print("Factors of a  " + num + " are: ");

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");

            }

        }

        System.out.println();

    }

    public static void lettersCount(String str) {
        for(int i=0;i<str.length();i++){
            int count=1;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count=count+1;
                }
            }
            System.out.println(str.charAt(i)+":  "+count);

        }
        System.out.println("######################################");
        System.out.println();

    }

}
