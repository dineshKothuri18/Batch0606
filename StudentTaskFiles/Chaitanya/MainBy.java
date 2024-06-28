import java.util.*;
class  MainBy
{
	int a;
	int b;
	void m4()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st int value:");
		int a = sc.nextInt();
		System.out.print("Enter 2nd int value:");
		int b = sc.nextInt();
		m2(a,b);
		m3(a);
		m4(b);
	}
	void m5(int x,int y)
	{
		System.out.println(x+" "+y);
	}
	void m6(int p)
	{
		System.out.println("1st int value :"+p);
	}
	void m7(int q)
	{
		System.out.println("2nd int value:"+q);
	}
	public static void main(String[] args) 
	{
		Min min = new Min();
		min.m4();
	}
}