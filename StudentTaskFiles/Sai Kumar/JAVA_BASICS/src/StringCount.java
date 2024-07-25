import java.util.Scanner;
public class StringCount{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER THE STRING:");
		String s=scan.nextLine();
		s=s.toLowerCase();
		int[] arr=new int[127];
		for (int i=0;i<s.length();i++){
			int asciii=s.charAt(i);
			arr[asciii]++;
}

		for (int i=0;i<s.length();i++){
			int asciii=s.charAt(i);
			if (arr[asciii]>0){
			char a=(char)(asciii);
			System.out.println(a+"-"+arr[asciii]);
arr[asciii]=0;
}
}
		
		
		
		
}
}