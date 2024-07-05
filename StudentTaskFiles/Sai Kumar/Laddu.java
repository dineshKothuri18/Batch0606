import java.util.Scanner;

public class Laddu{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a  number : ");
	int a = sc.nextInt();
	for (int i=3;i<=a;i+=3){
		if (((27*i+38)%8)==0){
			System.out.println(((27*i+38)/8));
}

}
		
}
}