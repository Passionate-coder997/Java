import java.util.Scanner;

public class palin
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the String you want to check:");
String str=sc.nextLine();
int len=0, i=0, flag=0;
len=str.length();
while(i<len)
{
if(str.charAt(i)==str.charAt(len-1))
{
flag=0;
len--;
i++;
}
else
{
flag=1;
break;
}
}
if(flag==0)
{
System.out.println("Given String is Palindrome");
}
else
{
System.out.println("It is not a Palindrome");
}
}
}