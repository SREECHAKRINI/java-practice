class A
{
public static void main(String args[])
{
int a=20;
int c;
c=a++; System.out.println("c=a++"+c);
a=20;
c=++a; System.out.println("c=++a"+c);
a=20;
c=a--; System.out.println("c=a--"+c);
a=20;
c=--a; System.out.println("c=--a"+c);
}
}