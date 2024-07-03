public class Arrays{
    public static void main(String[] args){
        String[] studentNames={"Narasimha","Hemanth","Sumanth","Mohith","Vijay","Kavya","Akhila","Charan","Sathvika","Karishma","Aparna","Chaitanya","Rahul","Saikumar","Raghu","Suvarchala","Saideepa","Siva Nageswararao","Sai Kiran"};
        int[] java={30,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95,100,10};
        int[] html={20,22,33,35,55,65,82,83,46,47,94,84,61,32,52,10,15,70,85};
        int[] sql={50,20,30,40,50,60,70,80,90,95,85,75,65,55,45,35,25,15,88};
        int[] js={25,30,32,55,78,79,80,46,45,22,29,49,47,10,50,60,78,32,35};
        

        for(int i=0;i<studentNames.length;i++){
            if(java[i]>=35 && html[i]>=35 && sql[i]>=35 && js[i]>=35){
                System.out.println("PASS");
            }
                else{
                    System.out.println("FAIL");
                }
            
            int add=java[i]+html[i]+sql[i]+js[i];
            float avg=add/4f;
            float per=((float)add/400)*100;
            System.out.println(studentNames[i]);
            System.out.println("Sum: "+ add);
            System.out.println("Average: "+ avg);
            System.out.println("Percentage: "+ per);
            System.out.println("-----------------------------");
        }
            
    }   
}