import java.util.*;
class A
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Digit:");
int a=s.nextInt();
switch(a)
{
case 0:
	System.out.println("Zero");
	break;
case 1:
	System.out.println("One");
	break;
default:
	System.out.println("Not a Binary Digit");
	break;
}
}
}