/*  Write a program to take input of a student ,Name,age,email,gender,s1,s2,s3,s4,s5,s6	and calculate totalMarks,percentage and g give grade as per our previous task, also print pass/fail
	o/p
		Name : Dinesh
		Age : 33
		Email : din@gmail.com
		Gender : M
		Subject1 : 100
		Subject2 : 100
		Subject3 : 100
		Subject4 : 100
		Subject5 : 100
		Subject6 : 100
		TotalMarks : 600
		Percentage : 100
		Grade : A+
		Result : Passed in Distinction */



import java.util.Scanner;
public class ScannerClass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Name: ");
        String sname=sc.nextLine();
        System.out.println("Age: ");
        String sage=sc.nextLine();
        System.out.println("Email: ");
        String semail=sc.nextLine();
        System.out.println("Gender: ");
        String sgender=sc.nextLine();
        System.out.println("S1");
        float sub1=sc.nextFloat();
        System.out.println("S2");
        float sub2=sc.nextFloat();
        System.out.println("S3");
        float sub3=sc.nextFloat();
        System.out.println("S4");
        float sub4=sc.nextFloat();
        System.out.println("S5");
        float sub5=sc.nextFloat();
        System.out.println("S6");
        float sub6=sc.nextFloat();
        float totalmarks = sub1+sub2+sub3+sub4+sub5+sub6;

        float percentage = (totalmarks/(float)600)*100;

        System.out.println(".........................................................");
        System.out.println("    Here is a Student Reort ");
        System.out.println("Name: "+sname);
        System.out.println("Age: "+sage);
        System.out.println("Email:"+semail);
        System.out.println("Gender:"+sgender);
        System.out.println("Subject1 :"+sub1);
        System.out.println("Subject2 :"+sub2);
        System.out.println("Subject3 :"+sub3);
        System.out.println("Subject4 :"+sub4);
        System.out.println("Subject5 :"+sub5);
        System.out.println("Subject6 :"+sub6);
        System.out.println("Total Marks :"+totalmarks);
        System.out.println("percentage: "+percentage+"%");
        if(percentage >=50 && percentage <60 )
        {
            System.out.println("Grade:"+ " C");
        }
        else if(percentage >=60 && percentage <70 )
        {
            System.out.println("Grade:"+ " B");
        }
        else if(percentage >=70 && percentage <90)
        {
            System.out.println("Grade:"+ "  A");
        }
        else if(percentage >=90){
            System.out.println("Grade:"+ " A+");
            System.out.println("Result:"+ " DISTINCTION");
        }
        if(percentage >=50&& sub1>=50&& sub2>=50&& sub3>=50&& sub4>=50&& sub5>=50&& sub6>=50){
            System.out.println("Passed in all subjects");
        }else{
            System.out.println("Result: "+"Failed,Because you failed in some Subjects" );
        }

    }
}