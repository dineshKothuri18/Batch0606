public class Array1{
	public static void main(String[] args){
		
String[] studentNames = {"Narasimha A","Hemanth Ch","Sumanth M","Mohith Sai K","Vijaya Lakshmi P","Kavya Sri K","Akhila D","Sai Charan P","Sathvika A","Karishma Md","Aparna K","Lakshmi Chaitanya L","Rahul","Saikumar J","Raghu J","Suvarchala K","Saideepa K","Siva Nageswararao Ch","Sai Kiran V"};
int[] javaSubject = {50,40,10,0,80,70,9,12,10,52,28,58,72,68,12,79,56,18,90};
int[] subjectHTML = {50,58,72,68,12,79,56,18,90,50,40,10,20,80,70,9,12,10,52};
int[] subjectSQL = {50,30,45,50,55,60,65,79,56,18,90,50,40,10,0,80,70,9,12};
int[] javaScript = {50,30,45,50,55,60,65,50,55,60,65,79,56,18,90,50,40,80,70};

int min =javaSubject[0];
int max =javaSubject[0];
for (int i = 1; i < javaSubject.length; i++) {
    if (javaSubject[i] < min) {
        min =javaSubject[i];
    }
else if(javaSubject[i]> max){
        max = javaSubject[i];
}
}
System.out.println("Least number in javaSubject : " + min);
System.out.println("Highest number in javaSubject : " +max);
 System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-**-*-*-");
min =subjectHTML[0];
max =subjectHTML[0];

for (int i = 1; i < subjectHTML.length; i++) {
    if (subjectHTML[i] < min) {
        min =subjectHTML[i];

    }
else if(subjectHTML[i]>max){
max = subjectHTML[i];
}
}

System.out.println("Least number in subjectHTML : " + min);
System.out.println("Highest number in subjectHTML : " +max);
System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");


min =subjectSQL[0];
max =subjectSQL[0];

for (int i = 1; i < subjectSQL.length; i++) {
    if (subjectSQL[i] < min) {
        min =subjectSQL[i];
    }
else if(subjectSQL[i]>max){
max=subjectSQL[i];
}
}

System.out.println("Least number in subjectSQL: " + min);
System.out.println("Highest number in subjectSQL: " + max);
System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

min = javaScript[0];
max = javaScript[0];
for(int i=1;i<javaScript.length;i++){
if(javaScript[i]<min){
min = javaScript[i];
}
else if(javaScript[i]>max){
max = javaScript[i];
}
}
System.out.println("Least number in subjectSQL: " + min);
System.out.println("Highest number in subjectSQL: " + max);
System.out.println("-*-*-*-**-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");



for(int i=0;i<studentNames.length;i++){
               int sum = javaSubject[i] + subjectHTML[i] + subjectSQL[i] + javaScript[i];
		float perc = (sum/400f)*100;
		int avg = (sum/4);

if(javaSubject[i]>=35 && subjectHTML[i]>=35 && subjectSQL[i]>=35 && javaScript[i]>=35){
		System.out.println("Name : "+studentNames[i]);
System.out.println("Marks are : "+" "+ javaSubject[i] +" "+ subjectHTML[i] +" "+ subjectSQL[i] +" "+ javaScript[i]);
System.out.println("sum is : "+sum);
System.out.println("percentage is : "+perc);
System.out.println("average is : "+avg);
System.out.println("Passed in all subjects");
System.out.println("--------------------------------------------------");
}
else{
System.out.println("Name : "+studentNames[i]);
System.out.println("Marks are : "+" "+ javaSubject[i] +" "+ subjectHTML[i] +" "+ subjectSQL[i] +" "+ javaScript[i]);
System.out.println("sum is : "+sum);
System.out.println("percentage is : "+perc);
System.out.println("average is : "+avg);
System.out.println("failed in one or more subject");
System.out.println("--------------------------------------------------");
}
}
}
}

