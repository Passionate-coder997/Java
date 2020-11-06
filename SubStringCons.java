Class SubStringCons
{
public static void main(String args[])
{
byte asc[]={65,66,67,68,69,70};
String str1= new String(asc);
System.out.println(str1);
System.out.println(str1.length());

String str2= new String(asc,2,3);
System.out.println(str2);
System.out.println(str2.length());
}
}