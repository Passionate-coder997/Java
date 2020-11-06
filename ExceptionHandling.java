class ExceptionHandling {
public static void main(String args[]) {
int d =1;
int n =20;
try {
int f = n/d;
int g[] = {
1
};
g[20] =100;
System.out.println("Divide by zero exception");
}
catch(ArithmeticException e)
{
System.out.println("In the catch block due to exception = "+e);
} catch(ArrayIndexOutOfBoundsException e)
{ System.out.println("In the catch block due to exception ="+e);
}
System.out.println("End of Main"); 
}
}