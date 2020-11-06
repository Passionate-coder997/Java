class Strcmp{
public static void main(String[] args)
{
String s1= "String Comparison";
String s2= "String Comparison";
String s3= "Program";
String s4= "STRING COMPARISON";
System.out.println(s1+" equals "+s2+"->"+s1.equals(s2));
System.out.println(s1+" equals "+s3+"->"+s1.equals(s3));
System.out.println(s1+" equalsIgnoreCase "+s4+"->"+s1.equalsIgnoreCase(s4));
}
}