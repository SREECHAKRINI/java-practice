class A
{
public static void main(String args[])
{
Object x=10;
if(x instanceof Integer)
  System.out.println("Yes,it is integer");
else
  System.out.println("No,it is"+x.getClass().getName());
}
}