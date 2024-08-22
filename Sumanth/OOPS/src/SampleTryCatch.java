import java.util.Scanner;
public class SampleTryCatch {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean a= false;

            while (!a) {
                try {

                    System.out.print("Enter the numerator: ");
                    int numerator = scanner.nextInt();

                    System.out.print("Enter the denominator: ");
                    int denominator = scanner.nextInt();

                    int result = numerator / denominator;
                    System.out.println("Result: " + result);

                    a = true;
                } catch (ArithmeticException e) {

                    System.out.println("Error: Cannot divide by zero. Please try again.");
                }
            }
        }
    }

