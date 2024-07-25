import java.util.Scanner;

public class tax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your salary: ");
        int Salary = sc.nextInt();
        tax_on_salary(Salary);
    }
    public static void tax_on_salary(int salary){
        if(salary>=0 && salary<=300000){
            System.out.println("Your tax is Nil");
            System.out.println("Enjoy mawa,nek tax led Motham salary neke");
        }
        else if(salary>300000 && salary<=700000){
            System.out.println("Your tax is 5%");
            System.out.println("Tax Amount to be paid is "+(salary*0.05));
        }
        else if(salary>700000 && salary<=1000000){
            System.out.println("Your tax is 10%");
            System.out.println("Tax Amount to be paid is "+(salary*0.1));
        }
        else if(salary>1000000 && salary<=1200000){
            System.out.println("Your tax is 15%");
            System.out.println("Tax Amount to be paid is "+(salary*0.15));
        }
        else if(salary>1200000 && salary<=1500000){
            System.out.println("Your tax is 30%");
            System.out.println("Tax Amount to be paid is "+(salary*0.3));
        }
    }
}
