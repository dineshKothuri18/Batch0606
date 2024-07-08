public class Arrays{
 		
	public static void main(String[] args){


		String[] javastudents ={"MohithSai","Suvarchala","Deepa","Sivanageswarao","Saikiran","Narsimha","Aparna","Chaitana","Raghu","Hemanth","Rahul","Sai Kumar","Sumant","Akhika","Karishma","Kavya","Sai charan","Sathvika","Vijaya"};


		int[] javastudentsRollNumbers = { 601,602,603,604,605,606,607,608,609,610,611,612,613,614,615,616,617,618,619};

 		int[] javaMarks = {95,98,83,62,73,52,43,64,54,42,62,51,46,62,23,63,6,23,54};
 		int[] htmlMarks = {93,94,63,73,51,63,35,73,34,62,42,37,73,64,65,54,24,65,45};
   		int[] sqlMarks  = {90,95,72,56,64,46,54,45,66,53,54,53,32,54,23,65,14,34,75};
		int[] jsMarks   = {94,91,52,64,63,56,65,25,45,64,52,19,56,45,66,34,27,78,55};
  		

		String[] studentQual = {"CSE","ECE","CSE","CSE","EEE","ECE","IT","AI","MEC","CSE","CSE","IT","AI","ECE","EEE","AI","CSE","EEE","ECE"};

		//System.out.println(javastudents.length);

		for (int i=0; i<javastudents.length; i++ ) {
		    int total=javaMarks[i]+htmlMarks[i]+sqlMarks[i]+jsMarks [i];
       float percentage =(total/400f)*100f;
        //System.out.println("percentage:"+percentage);

		System.out.println("Student name : "+javastudents[i]+"\nRoll number: " +javastudentsRollNumbers[i]+"\nTotal marks: "+total+"\nPercentage: "+percentage);
		System.out.println("-------------------------------");
		
		}
    
		}
	}
  