public class Array{

 public static void main(String [] args){

      String[] StudentNames = {"Hemanth", "Kavya sri", "Vijaya Lakshmi", "Sumanth", "Aparna", "Lakshmi Chaitanya", "Sai charan", "Mohith", "Karishma", "Akhila", "Rahul", "Sai kumar", "Siva Nagesswararao", "Sai deepa", "Suvarchala", "Sai kiran", "Sathvika"};

int java[] = {80,80,75,90,70,65,60,55,50,45,40,35,30,25,20,15,10,05};
int html[] = {65,80,85,75,70,60,65,40,45,50,55,90,95,30,35,20,25,15};
int sql[]  = {75,70,85,80,95,90,65,60,55,50,45,40,35,30,25,20,15,10};
int js[]   = {95,90,85,80,75,70,65,60,55,50,45,39,31,28,25,22,17,9};
 for(int i=0;i<StudentNames.length;i++){
if(java[i]>=35 && html[i]>=35 && sql[i]>=35 && js[i]>=35){
System.out.println("PASS");
}
else{
     System.out.println("FAIL");
}

int add=java[i]+html[i]+sql[i]+js[i];
float avg=add/4f;
float per=((float)add/400)*100;
System.out.println("Name : "+ StudentNames[i]);
System.out.println("Sum: "+ add);
System.out.println("Average: "+ avg);
System.out.println("Percentage: "+ per);
System.out.println("-----------------------------<<<");
}
}
}