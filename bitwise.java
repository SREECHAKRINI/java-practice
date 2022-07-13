class A
{
public static void main(String args[])
{
int a=2;
int b=3;
int c;
boolean d=false;
d=!d; System.out.println("d=!d->"+d);
c=~a; System.out.println("c=~a->"+c);
c=a&b; System.out.println("c=a&b->"+c);
c=a|b; System.out.println("c=a|b->"+c);
c=a^b; System.out.println("c=a^b->"+c);
c=a<<1; System.out.println("c=a<<b->"+c);
c=a>>1; System.out.println("c=a>>1->"+c);
c=a>>>1; System.out.println("c=a>>>1->"+c);
}
}