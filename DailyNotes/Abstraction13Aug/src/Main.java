// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.util.Scanner;

enum WeekDays{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY
}
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Mahindra m1 = new Mahindra();

        Triangle t1 = new Triangle(10,12);
        System.out.println(t1.getArea());

        WeekDays day = WeekDays.MONDAY;

        switch (day){
            case MONDAY -> System.out.println("Java Class");
            case TUESDAY -> System.out.println("Python Class");
            case WEDNESDAY -> System.out.println("SQL");
            case THURSDAY -> System.out.println("HTML");
        }

        for (WeekDays week:
             WeekDays.values()) {
            System.out.println(week);
        }


        try {
            printDetails();
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }
    }

    public static void printDetails() throws Exception{
        Scanner sc = new Scanner(System.in);

        try{
            int age = sc.nextInt();

            if(age>70){
                throw new Exception("Hey he is no more");
            }else {
                System.out.println("Valid age " + age);
            }
        }catch (Exception e){
            throw  new Exception("Invalid entry");
        }
    }

}