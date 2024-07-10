public class Arrays19stud{

	public static void main(String[] args){


String[] javaStudents = {"Karishma","Narasimha","Hemanth","Sumanth","MohithSai","Vijaya Lakshmi","Kavya Sri","Akhila","Sai Charan", "Sathvika", "Aparna", "Lakshmi Chaitanya","Rahul","Saikumar","Raghu","Suvarchala","Sai deepa","Siva Nageswararao","Sai Kiran"};
int[]javaStudentsRollNumbers = {600,601,602,603,604,605,606,607,608,609,610,611,612,613,614,615,616,617,618};
String[]javaStudentsQualification = {"CSE","IT","EEE","CSE","ECE","ECE","CSE","CSE","CSE","ECE","IT","CSE","CSE","ELC","CSE","ECE","ECE","MSCS","MPCS"};
String[]javaStudentsyears={"2024","2025","2024","2024","2024","2024","2024","2024","2024","2024","2024","2024","2024","2024","2024","2024","2024","2024","2024",};   
int[]javaMarks ={90,40,10,0,80,70,90,45,47,67,89,78,65,56,77,26,89,80,90};
int[] HTMLMarks={100,30,45,50,32,60,65,56,78,98,87,67,56,87,9,87,27,98,36};
int[]SQLMarks ={90,30,45,50,55,60,65,32,46,47,58,69,98,76,98,97,69,56,46};
int[]JSMarks ={50,30,45,50,55,60,65,45,56,67,89,98,76,16,76,75,74,87,96,8};
         for(int i=0;i<javaStudents.length;i++){
         if(javaMarks[i]>35 && HTMLMarks[i]>35 && SQLMarks[i]>35 && JSMarks[i]>35){
  System.out.println("STUDENT HAS PASSED");
         }
        else{
             System.out.println("STUDENT HAS FAILED");
         }
         
int add =javaMarks[i]+HTMLMarks[i]+SQLMarks[i]+JSMarks[i];
float avg= add/4f;
float per=((float)add/400)*100;
 System.out.println(javaStudents[i]);
 System.out.println("Sum "+ add);
 System.out.println("Average " + avg);
 System.out.println("percentage " + per + "%");
  System.out.println("**************************************************");
 System.out.println(javaStudents[i] +"\n"+javaStudentsRollNumbers[i] +"\n"+javaStudentsQualification[i]+"\n"+ javaStudentsyears[i]+"\n"+ javaMarks[i]+"\n"+ HTMLMarks[i]+"\n"+ SQLMarks[i]+"\n"+JSMarks[i]);
                 }
}
}