import java.util.*;
class A
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter your age:");
int age=s.nextInt();
if(age>0 && age<=100)
{
	if(age>=18)
		System.out.println("voter");
	else
		System.out.println("Not a Voter");
}
else
{
System.out.println("invalid Age");
}
}
}
