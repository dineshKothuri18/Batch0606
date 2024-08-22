
import java.util.Scanner;
public class Palindrome{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String a=scan.nextLine();
		int i=0;
		int j=a.length();
j--;
		boolean flag=true;
		while(i<=j){
			if (a.charAt(i)!=a.charAt(j)){
				flag=false;
			}
			i++;
			j--;
		}
		if (flag){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("NOT Palindrome");
		}
		
		
		
				
}
}