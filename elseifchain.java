import java.util.*;
class A
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("A:");
int a=s.nextInt();
System.out.println("B:");
int b=s.nextInt();
System.out.println("C:");
int c=s.nextInt();
if(a>b && a>c)
	System.out.println(a+"Is largest");
else if(b>c)
	System.out.println(b+"Is largest");
else
	System.out.println(c+"Is largest");
}
}