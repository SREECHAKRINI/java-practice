import java.util.*;
class A
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("Enter a number:");
int a=s.nextInt();
int i=1; //int i=100;
do
{
System.out.println(a+"*"+i+"="+(a*i));
i++;
}while(i<=10);
}
}