import java.util.Date;
import java.text.SimpleDateFormat;
class A
{
public static void main(String args[])throws Exception
{
Date d=new Date();
System.out.println(d);
SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
String str=sf.format(d);
System.out.println(str);
}
}