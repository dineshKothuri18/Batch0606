import java.util.*;

public class Main
{
	
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
	
		System.out.println("String enter chei ra babuu : ");	
		String s = sc.nextLine();
		
		s = s.toLowerCase();
		
		int ar[] = new int[127];
		
		for(int i=0;i<s.length();i++){
			
			int ascii = s.charAt(i);

				ar[ascii]++;
							
		}
		
		for(int i=0;i<s.length();i++){
			
			int ascii = s.charAt(i);
			
				if(ar[ascii]>0){
					System.out.println(Character.toUpperCase(s.charAt(i)) +"-"+ar[ascii]);

					ar[ascii] = 0;	
			
			}
			
					
		}
	
	}

}