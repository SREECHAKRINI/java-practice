import java.util.*;
class A
{
public static void main(String args[])
{
System.out.println("Enter USD dollars:");
Scanner s=new Scanner(System.in);
double USD=s.nextDouble();
double INR=78.97*USD;
System.out.println("converting dollar USD to rupees INR amount is:"+INR);
}
}