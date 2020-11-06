import java.util.Scanner;

public class User
{
public static void main(String args[]){
int m;

Scanner Scan=new Scanner(System.in);

System.out.println("Enter his/her marks:");
m=Scan.nextInt();

if(m>=90)
System.out.println("Grade A");

else if(m>=80)
System.out.println("Grade B");

else if(m>=60)
System.out.println("Grade C");

else if(m>=35)
System.out.println("Grade D");

else
System.out.println("Fail!! Better Luck Next Time");
}
} 