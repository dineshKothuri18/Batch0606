import java.util.*;

public class Main
{
	
	public static void main(String[] args) {
	
		String s = sc.nextLine()
		s = s.toLowerCase();
		String ar[] = s.split(" ");
		String target = "class";
		int count = 0;
		for(int i=0;i<ar.length;i++){
			if(target.equals(ar[i])){
				count++;
			}
		}
		System.out.println("Count of \""+target+"\" in string is: "+count);
		
	}
}