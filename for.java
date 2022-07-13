import java.util.*;
class A
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("Enter a number:");
int a=s.nextInt();
for(int i=1;i<=10;i++)
{
System.out.println(a+"*"+i+"="+(a*i));
}
}
}
