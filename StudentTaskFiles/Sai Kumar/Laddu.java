import java.util.Scanner;

public class Laddu{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a  number solution you want: ");
	int a = sc.nextInt();
	int i=3;
	while(a>0){
		if (((27*i+38)%8)==0){
			System.out.println(((27*i+38)/8));
a--;
}
		i+=3;

}		
}
}