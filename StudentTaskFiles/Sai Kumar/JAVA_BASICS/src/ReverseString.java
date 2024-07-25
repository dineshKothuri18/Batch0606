import java.util.Scanner;
public     class ReverseString{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=scan.nextLine();
				String g="";
		for (int i=(s.length()-1);i>=0;i--){
			g=g+s.charAt(i);
}
		System.out.println("Reversed String is:"+g);
		
		
}
}