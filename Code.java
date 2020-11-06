class Code
{
public static void main(String args[])
{
int x=5;
int y=6;
x=x++ + ++y;
y=++y;
System.out.println(x + y);
System.out.println(x);
System.out.println(y);
}
}