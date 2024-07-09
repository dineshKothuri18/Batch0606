 
 
 /*Write a program to take day as input and print the subject on that day using switch   19-06-2024
	Monday: Android
	Tuesday: Java
	Wednesday: Python
	Thursday: PHP
	Friday: HTML
	Saturday: SQL

		Enter day : Monday
		o/p: Today you have Android Class
*/
 

 import java.util.Scanner;
 public class SwitchClass{
    public static void main(String[] args){
        
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the day: ");
        String day = sc.nextLine();
        switch (day){
            
            case "monday":
                System.out.println("Today you have Android class");
                break;
            case "tuesday":
                System.out.println("Today you have Java class");
                break;
            case "Wednesday":
                System.out.println("Today you have Python class");
                break;
            case "Thursday":
                System.out.println("Today you have PHP class");
                break;
            case "Friday":
                System.out.println( "Today you have HTML class");
                break;
            case "saturday":
                System.out.println( "Today you have SQL class");
                break;
                default:
                System.out.println("no class");
            
        }
    }
}




