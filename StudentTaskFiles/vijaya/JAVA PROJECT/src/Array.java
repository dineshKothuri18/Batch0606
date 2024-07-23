public class Array{
    public static void main(String[] args){
        
        String[] javastudent = {"vijaya","kavya","sumanth","sathvika","Narasimha","Hemanth ","Mohith Sai","Akhila","Sai Charan","Karishma","Aparna","Lakshmi Chaitanya","Rahul","Saikumar","Raghu ","Suvarchala","Saideepa","Siva Nageswararao","Sai Kiran"};
        //String[] javastuQual={"ECE","ECE","EEE","CSE","CSE","IT","CSE","CSE","CSE","IT","CSE","CSE","ECE","ELC","CSE","ECE","ECE","MSCS","MPCS",};
        //String[] javasubjects = {"Java,HTML,SQL,JS"};
        int[] javamarks ={30,80,89,75,58,46,38,78,60,90,50,68,68,78,69,58,37,72,68};
        int[] htmlmarks ={40,50,76,88,69,65,97,54,38,74,94,85,70,59,71,87,94,28,94};
        int[] sqlmarks ={60,80,76,94,69,70,64,85,93,71,94,62,74,56,49,58,69,59,96};
        int[] jsmarks ={75,87,96,70,84,95,62,38,94,85,64,93,64,62,91,64,73,88,92};
        
        //if(javamarks>=40 && htmlmarks>=40 && sqlmarks>=40 && jsmarks>=40){
        for(int i=0; i<javastudent.length; i++){
            if(javamarks[i]>=40 && htmlmarks[i]>=40 && sqlmarks[i]>=40 && jsmarks[i]>=40){
        int sum = javamarks[i]+htmlmarks[i]+sqlmarks[i]+jsmarks[i];
        int avg = sum /4;
        float perc = sum/4f;
        System.out.println(i);
        System.out.println("Name of the student : "+javastudent[i]);
        System.out.println("Total marks : "+sum);
        System.out.println("Average of student : "+avg);
        System.out.println("Percentage of student : "+perc);
        System.out.println("-----------------------------------------------");
        }  
        else{
            System.out.println("Failed in anyone subject");
            System.out.println(javastudent[i]);
            System.out.println("Subject marks are : \n"+javamarks[i]+"\n"+htmlmarks[i]+"\n"+sqlmarks[i]+"\n"+jsmarks[i]);
            System.out.println("-----------------------------------------------");
            
        }
        }
    }
}