import java.util.Scanner;

public class Laddu{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a  number solution you want: ");
	int cnt = sc.nextInt();
	int i=3;
	while(cnt>0){
		if (((27*i+38)%8)==0){
			System.out.println(((27*i+38)/8));
			cnt--;
		}
		i+=3;

	}		
	}
}