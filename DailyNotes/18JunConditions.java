public class Conditions{

	public static void main(String[] abc){
				
			/*
			A-Z,a-z,0-9,_
			*/
			int num1 = 10;
			int num2 = 100;
			int num3 = 50;
			boolean result = (num1<num2) || (num3>num2); 

			System.out.println(result);


		/* if, if else nested if, switch */
		
			int age = 21;
			
			if(age>=10 && age<=16){	
				System.out.println("Eligible For High School Fees");
			}else if(age>=17 && age<=21){
				System.out.println("Eligible for Undergaduation Fees");
			}else if(age>=22 && age<=30){
				System.out.println("Eligible for Higher Grad Fees");
			}else{
				System.out.println("Not Eligible for any scheme");
			}

			String day = "Thursday";

	/*
			if(day == "Monday"){
					System.out.println("Java Class");
			}else if(day == "Tuesday"){
					System.out.println("Python Class");
			}else if(day == "Wednesday"){
					System.out.println("HTML Class");
			}
*/

			switch(day){
				case "Monday":
					System.out.println("Java Class");
				break;
				case "Tuesday":
					System.out.println("Python Class");
				break;
				case "Wednesday":
					System.out.println("HTML Class");
				break;
				default:
					System.out.println("No Class ");
			}

			
			
	}

} 