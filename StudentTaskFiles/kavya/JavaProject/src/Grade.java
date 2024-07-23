/*   the program to display grade and result */

public class Grade{
    public static void main(String[] args) {
        String name,qualification,pass;
        int s1, s2, s3,s4,s5,s6, totalStudentMarks, totalMarks=600,subjectTotalMarks=100,subjectPassMarks=36;
        float totalPercentage;

        name = "Kavya";
        qualification = "BTech";
        pass="PASS";
        s1 = 90;s2 = 50;s3 = 90;s4 = 90;s5 = 90;s6 = 90;

        totalStudentMarks = s1 + s2 + s3+ s4 + s5 + s6;
        totalPercentage = (totalStudentMarks / (float) totalMarks) * 100;
        //percentage=83.33333
        System.out.println("Name: " + name);
        System.out.println("Qualification: " + qualification);
        System.out.println("Total Student Marks: " + totalStudentMarks);
        System.out.println("Total Percentage: " + totalPercentage);

        if(totalPercentage >=50 && totalPercentage <60 )
        {
            System.out.println("Grade:"+ " C");
            System.out.println("Result:"+   pass);

        }
        if(totalPercentage >=60 && totalPercentage <70 )
        {
            System.out.println("Grade:"+ " B");
            System.out.println("Result:"+  pass);

        }
        if(totalPercentage >=70 && totalPercentage <90)
        {
            System.out.println("Grade:"+ "  A");
            System.out.println("Result:"+   pass);

        }
        if(totalPercentage >=90){
            System.out.println("Grade:"+ " A+");
            System.out.println("Result:"+ " DISTINCTION");
        }else if(totalPercentage >=90){
            System.out.println("Grade:"+ " F");
            System.out.println("Result:"+ " FAIL");
        }

                /*
		 if(totalPercentage <50){
                    System.out.println("Grade:"+ " F");
                    System.out.println("Result:"+ " FAIL");

							     */
    }

}
