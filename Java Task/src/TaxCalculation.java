import java.util.Scanner;

public class TaxCalculation {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Calculation();
    }
    public static void Calculation() {
        while (true) {
            System.out.println("Enter Your Salary :");
            double salary = sc.nextDouble();
            double Tax = 0.0;
            System.out.println("Calculation of Tax on Your Salary : " + salary);
            if (salary <= 300000) {
                Tax = 0.0;
                System.out.println("Tax for My Salary : " + salary + " == " + Tax);
            } else if (salary <= 700000) {
                Tax = 0.05 * (salary - 300000);
                System.out.println("Tax for My Salary : " + salary + " == " + Tax);
            } else if (salary <= 1000000) {
                Tax = 0.05 * (salary - 300000) + 0.10 * (salary - 700000);
                System.out.println("Tax for My Salary : " + salary + " == " + Tax);
            } else if (salary <= 120000) {
                Tax = 0.05 * (salary - 300000) + 0.10 * (salary - 700000) + 0.15 * (salary - 1000000);
                System.out.println("Tax for My Salary :" + salary + " == " + Tax);
            } else if (salary <= 150000) {
                Tax = 0.05 * (salary - 300000) + 0.10 * (salary - 700000) + 0.15 * (salary - 1000000) + 0.20 * (salary - 120000);
                System.out.println("Tax for My Salary : " + salary + " == " + Tax);
            } else {
                Tax = 0.05 * (salary - 300000) + 0.10 * (salary - 700000) + 0.15 * (salary - 1000000) + 0.20 * (salary - 1200000) + 0.30 * (salary - 1500000);
            }
            System.out.println("Tax for My Salary : " + salary + " == " + Tax);

        }
    }


}

