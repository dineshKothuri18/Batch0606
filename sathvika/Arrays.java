public class Arrays{
   public static void main(String[] args){
       String[] StudentNames = { "Narasimha A ", "Hemanth Ch","Sumanth M", "Mohith Sai K", "Vijaya Lakshmi P", "Kavya Sri K", "Akhila D", "Sai Charan P","Sathvika A", "Karishma Md", "Aparna K","Lakshmi Chaitanya L","Rahul R","Saikumar J","Raghu J","Suvarchala K","Saideepa K","Siva Nageswararao Ch","Sai Kiran V"};
int[]javaSubject = { 60,65,55,50,70,75,80,85,90,95,45,33,68,69,72,76,21,22,36};
int[]HtmlSubject = { 55,78,45,30,35,66,55,77,88,91,94,50,45,88,75,69,45,54,58};
int[]SQLSubject  = { 45,42,51,52,36,79,89,63,68,56,66,78,89,90,56,78,32,14,39};
int[]javaScript  = { 29,31,10,78,9,39,40,45,50,11,56,66,36,34,90,56,67,11,33};

for(int i=0;i<StudentNames.length;i++){
int sum= javaSubject[i]+ HtmlSubject[i] +SQLSubject[i]+javaScript[i];
float perc = (sum/400f)*100;
float avg = (sum/4f);
if(javaSubject[i]>=35 && HtmlSubject[i]>=35 && SQLSubject[i]>=35 && javaScript[i]>=35){
System.out.println(StudentNames[i]);

System.out.println(sum);
System.out.println(perc);
System.out.println(avg);
System.out.println("---------------------------");

}
else{
    System.out.println("Failed in one Subject");
    System.out.println(StudentNames[i]);
	System.out.println(perc);
    System.out.println("*****************************");
 }}
}
}
