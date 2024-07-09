import java.util.Scanner;
public class Percentage{
    public static void main(String[] args){
    
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter Name");
            String Name = sc.nextLine();
            System.out.println("Please enter age:");
            String age = sc.nextLine();
            System.out.println("please enter email:");
            String email = sc.nextLine();
            System.out.println("please enter gender:");
            String gender = sc.nextLine();
           System.out.println("Please enter sub1 Marks");
            float sub1 = sc.nextFloat();
            System.out.println("Please enter sub2 Marks");
		    float sub2 = sc.nextFloat();	
		    System.out.println("Please enter sub3 Marks");
		    float sub3 = sc.nextFloat();	
		    System.out.println("Please enter sub4 Marks");
		    float sub4 = sc.nextFloat();	
		    System.out.println("Please enter sub5 Marks");
		    float sub5 = sc.nextFloat();	
		    System.out.println("Please enter sub6 Marks");
		    float sub6 = sc.nextFloat();	
		    float total = sub1+sub2+sub3+sub4+sub5+sub6;
		    //totalPercentage = (totalStudentMarks / (float) totalMarks) * 100;
		     
		    System.out.println("name:"+Name);
		    System.out.println("age:"+age);
		    System.out.println("email:"+email);
		    System.out.println("gender:"+gender);
		    System.out.println("enter sub1 Marks:"+sub1);
		    System.out.println("enter sub1 Marks:"+sub2);
		    System.out.println("enter sub1 Marks:"+sub3);
		    System.out.println("enter sub1 Marks:"+sub4);
		    System.out.println("enter sub1 Marks:"+sub5);
		    System.out.println("enter sub1 Marks:"+sub6);
		    System.out.println("Total marks :"+ total);
		    float Percentage = (total/600) *100;
		    System.out.println("Percentage is:"+Percentage);
		    
		  
		         //System.out.println("passed in all subjects");
		         
		         if(Percentage >=50 && Percentage <60 )
                
                System.out.println("Grade:"+ " c");
                
                
                else if(Percentage >=60 && Percentage <70 )
                
                    System.out.println("Grade:"+ " b");
                else if(Percentage >=70 && Percentage <90 )
                
                    System.out.println("Grade:"+ " a");
                else if  (Percentage >=90 )
                
                    System.out.println("Grade:"+ " a+");
                    //System.out.println("Grade:"+ "distinction ");
                
                else
                
                    System.out.println("result:"+ " passed in all subjects");
    
    }

}
