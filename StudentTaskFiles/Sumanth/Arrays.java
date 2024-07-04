public class Arrays{
	public static void main(String[] args){
		
String[] studentNames = {"Narasimha A","Hemanth Ch","Sumanth M","Mohith Sai K","Vijaya Lakshmi P","Kavya Sri K","Akhila D","Sai Charan P","Sathvika A","Karishma Md","Aparna K","Lakshmi Chaitanya L","Rahul","Saikumar J","Raghu J","Suvarchala K","Saideepa K","Siva Nageswararao Ch","Sai Kiran V"};
int[] javaSubject = {50,40,10,0,80,70,9,12,10,52,28,58,72,68,12,79,56,18,90};
int[] subjectHTML = {50,58,72,68,12,79,56,18,90,50,40,10,20,80,70,9,12,10,52};
int[] subjectSQL = {50,30,45,50,55,60,65,79,56,18,90,50,40,10,0,80,70,9,12};
int[] javaScript = {50,30,45,50,55,60,65,50,55,60,65,79,56,18,90,50,40,80,70};
int l = studentNames.length;
int min=javaSubject[0];
int max = 0;
String min_name="";
String max_name="";
for(int i=0;i<l;i++){
if(javaSubject[i]<min){
min=javaSubject[i];
min_name=studentNames[i];
}
if(javaSubject[i]>max){
max=javaSubject[i];
max_name=studentNames[i];
}
}
System.out.println(min_name+"("+min+") ");
System.out.println(max_name+"("+max+")");
min=subjectHTML[0];
 max = 0;
for(int i=0;i<l;i++){
if(subjectHTML[i]<min){
min=subjectHTML[i];
min_name=studentNames[i];
}
if(subjectHTML[i]>max){
max=subjectHTML[i];
max_name=studentNames[i];
}
}
System.out.println(min_name+"("+min+") ");
System.out.println(max_name+"("+max+")");
min=subjectSQL[0];
 max = 0;
for(int i=0;i<l;i++){
if(subjectSQL[i]<min){
min=subjectSQL[i];
min_name=studentNames[i];
}
if(subjectSQL[i]>max){
max=subjectSQL[i];
max_name=studentNames[i];
}
}
System.out.println(min_name+"("+min+") ");
System.out.println(max_name+"("+max+")");
min=javaScript[0];
 max = 0;
for(int i=0;i<l;i++){
if(javaScript[i]<min){
min=javaScript[i];
min_name=studentNames[i];
}
if(javaScript[i]>max){
max=javaScript[i];
max_name=studentNames[i];
}
}
System.out.println(min_name+"("+min+") ");
System.out.println(max_name+"("+max+")");

float[] perc = new float[20];
perc[0] =(javaSubject[0]+subjectHTML[0]+subjectSQL[0]+javaScript[0])/4f;
float minp=perc[0];
float maxp = 0;
String minp_name="";
String maxp_name="";
for(int i=0;i<l;i++){
perc[i] =(javaSubject[i]+subjectHTML[i]+subjectSQL[i]+javaScript[i])/4f;
if(perc[i]<minp){
minp=perc[i];
 minp_name=studentNames[i];
}
if(perc[i]>maxp){
maxp=perc[i];
 maxp_name=studentNames[i];
}
}
System.out.println("Percentage of"+" "+minp_name+" "+minp);
System.out.println("Percentage of"+" "+maxp_name+" "+maxp);

for(int i=0;i<l;i++){
if(javaSubject[i]<35)
System.out.println("javaSubject"+" "+javaSubject[i]+" "+studentNames[i]);
if(subjectHTML[i]<35)
System.out.println("HTML"+" "+subjectHTML[i]+" "+studentNames[i]);
if(subjectSQL[i]<35)
System.out.println("SQL"+" "+subjectSQL[i]+" "+studentNames[i]);
if(javaScript[i]<35)
System.out.println("JS"+" "+javaScript[i]+" "+studentNames[i]);
System.out.println("------------------------------------------------");
}
for(int i=0;i<l;i++)
		{
		    if(perc[i]>=50 && perc[i]<60)
		    System.out.println("Name : "+" "+studentNames[i]+"\n"+"Grade : C "+"\n "+"Percentage : " +perc[i]+"\n"+"---------------------");
		    else if(perc[i]>=60 && perc[i]<70)
		    System.out.println("Name : "+" "+studentNames[i]+"\n "+"Grade : B "+"\n "+"Percentage : " +perc[i]+"\n"+"---------------------");
		    else if(perc[i]>=70 && perc[i]<90)
		    System.out.println("Name : "+" "+studentNames[i]+"\n "+"Grade : A "+"\n"+"Percentage : " +perc[i]+"\n"+"---------------------");
		    else if(perc[i]>=90)
		    System.out.println("Name : "+" "+studentNames[i]+"\n "+"Grade : Distinction "+"\n "+"Percentage : " +perc[i]+"\n"+"---------------------");
		    else
		    System.out.println("Name : "+" "+studentNames[i]+"\n "+"Grade : Fail "+"\n "+"Percentage : " +perc[i]+"\n"+"---------------------");
		}
}
}















