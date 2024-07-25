public class Array {
        public static void main(String[] args){

            String[] studentNames = {"Narasimha A","Hemanth Ch","Sumanth M","Mohith Sai K","Vijaya Lakshmi P","Kavya Sri K","Akhila D","Sai Charan P","Sathvika A","Karishma Md","Aparna K","Lakshmi Chaitanya L","Rahul","Saikumar J","Raghu J","Suvarchala K","Saideepa K","Siva Nageswararao Ch","Sai Kiran V"};
            int[] javaSubject = {50,40,10,0,80,70,9,12,10,52,28,58,72,68,12,79,56,18,90};
            int[] subjectHTML = {50,58,72,68,12,79,56,18,90,50,40,10,0,80,70,9,12,10,52};
            int[] subjectSQL = {50,30,45,50,55,60,65,79,56,18,90,50,40,10,0,80,70,9,12};
            int[] javaScript = {50,30,45,50,55,60,65,50,55,60,65,79,56,18,90,50,40,80,70};


            for(int i=0;i<studentNames.length;i++){
                if(javaSubject[i]>=35 && subjectHTML[i]>=35 && subjectSQL[i]>=35 && javaScript[i]>=35){

                    int sum = javaSubject[i] + subjectHTML[i] + subjectSQL[i] + javaScript[i];
                    float perc = (sum/400f)*100;
                    int avg = (sum/4);

                    System.out.println("Name : "+studentNames[i]);
                    System.out.println("Marks are : "+" "+ javaSubject[i] +" "+ subjectHTML[i] +" "+ subjectSQL[i] +" "+ javaScript[i]);
                    System.out.println("sum is : "+sum);
                    System.out.println("percentage is : "+perc);
                    System.out.println("average is : "+avg);
                    System.out.println("--------------------------------------------------");
                }
                else{
                    int sum = javaSubject[i] + subjectHTML[i] + subjectSQL[i] + javaScript[i];
                    float perc = (sum/400f)*100;
                    int avg = (sum/4);
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



