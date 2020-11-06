public class employee
{
String EmpName;
int EmpSal;
public employee()
{
EmpName="Bhaskar";
EmpSal=10000;
}
void Display()
{
System.out.println(EmpName);
System.out.println(EmpSal);
}
public static void main(String[] args)
{
employee emp=new employee();
emp.Display();
}
}