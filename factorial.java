import java.util.Scanner;

public class factorial
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int n;

System.out.println("Enter number to find its factorial:");

n=sc.nextInt();

int fact=1;
int i=1;

while(i!=n+1)
{
fact*=i;
i++;
}
System.out.println("Factorial of"+n+" is "+fact);
}
}