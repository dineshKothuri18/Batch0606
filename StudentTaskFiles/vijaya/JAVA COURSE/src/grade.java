
/*Percentage 14-06-2024
Grade
O/p
>50  <60
C
Obtained Grade C
>=60  <70
B
Obtained Grade B
>=70  <90
A
Obtained Grade A
>=90
A+
Distinction
*/




public class Percentage{
    public static void main(String[] args)
        {
            
            String name,qualification;
            int s1,s2,s3,s4,s5,s6,totalStudentMarks, totalMarks = 600;
            float  totalPercentage;
            
            name = "vijayalakshmi";
            qualification = "betch";
            
             /*s1=36;s2=36;s3=36;s4=36;s5=36;s6=36;
            totalStudentMarks = s1+s2+s3+s4+s5+s6;
            totalPercentage = (totalStudentMarks / (float) totalMarks) * 100;
            */
            totalPercentage = 80;
            
            
            System.out.println("name:"+name);
            System.out.println("qualification:"+qualification);
            System.out.println("TotalPercentage: " + totalPercentage + "%");
           // System.out.println("Total Student Marks: " + totalStudentMarks);
            
                if(totalPercentage >=50 && totalPercentage <60 )
                {
                System.out.println("Grade:"+ " c");
                
                }
                else if(totalPercentage >=60 && totalPercentage <70 )
                {
                    System.out.println("Grade:"+ " b");
                }else if(totalPercentage >=70 && totalPercentage <90 )
                {
                    System.out.println("Grade:"+ " a");
                }else if  (totalPercentage >=90 )
                {
                    System.out.println("Grade:"+ " a+");
                    System.out.println("Grade:"+ "distinction ");
                }
                else
                {
                    System.out.println("result:"+ " passed in all subjects");
                }
    }
}
