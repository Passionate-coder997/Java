public class StrExtraction{
public static void main (String [] args){
System.out.print("\tString Extraction Function");
System.out.print("\n1.charAt method");
char ch;
ch= 'Program';
System.out.print(ch);
System.out.print("\n2.getChars method");
String s = "This is good PL";
int start=8;
int end=15;
char buf[]= new char[end-start];
s.getChars(start, end, buf, 0);
System.out.println("\n");
System.out.println(buf);
}
}