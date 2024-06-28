/*1.  Write a java program to define a class with 5 constructors in a class and execute all constructor statements .*/


class Chaitu1
{
    int a;
    int b;
    int c;
    int d;
    int e;
    Chaitu1(int a,int b,int c,int d,int e)
{
    this.a=a;
    this.b=b;
    this.c=c;
    this.d=d;
    this.e=e;
}
void m1()
{
    System.out.println(a+" "+b+" "+c+" "+d+" "+e);
}
public static void main(String[] args)
{
    Chaitu1 s=new Chaitu1(38,98,87,766,765);
    s.m1();
}
}
