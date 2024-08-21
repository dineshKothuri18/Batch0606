import java.util.Scanner;

public class tax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your salary: ");
        int Salary = sc.nextInt();
        tax_on_salary(Salary);
    }
    public static void tax_on_salary(int salary){
        float total = 0f;
        if(salary>=0 && salary<=300000){
            System.out.println("Your tax is Nil");
        }
        else if(salary>300000 && salary<=700000){
            System.out.println("Your tax is 5%");
            System.out.println("Tax Amount to be paid is "+((salary-300000)*0.05));
        }
        else if(salary>700000 && salary<=1000000){
            System.out.println("Your tax is 10%");
            total = 400000*0.05f;
            System.out.println("Tax Amount to be paid is "+(total + (salary-700000)*0.1));
        }
        else if(salary>1000000 && salary<=1200000){
            System.out.println("Your tax is 15%");
            total = (400000*0.05f) + (300000*0.1f);
            System.out.println("Tax Amount to be paid is "+(total + (salary-1000000)*0.15));
        }
        else if(salary>1200000 && salary<=1500000){
            System.out.println("Your tax is 20%");
            total = (400000*0.05f) + (300000*0.1f) + (200000*0.15f);
            System.out.println("Tax Amount to be paid is "+(total + (salary-1200000)*0.2));
        }
        else{
            System.out.println("Your tax is 30%");
            total = (400000*0.05f) + (300000*0.1f) + (200000*0.15f) + (300000*0.2f);
            System.out.println("Tax Amount to be paid is "+(total + (salary-1500000)*0.3));
        }
    }
}
