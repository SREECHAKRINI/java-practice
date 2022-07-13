import java.util.*;
class A
{
public static void main(String args[])
{
System.out.println("Enter Celsius temperature:");
Scanner s=new Scanner(System.in);
float celsius=s.nextFloat();
float fahrenheit=((celsius*9)/5)+32;
System.out.println("celsius to fahrenheit temperature value is:"+fahrenheit);
}
}
