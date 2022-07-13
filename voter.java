import java.util.*;
class A
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("Enter your name:");
String n=s.nextLine();
System.out.print("Enter your age:");
int a=Integer.parseInt(s.nextLine());
if(a>=18)
System.out.print(n+"you are a voter");
else
System.out.print(n+"you are not a voter");
}
}