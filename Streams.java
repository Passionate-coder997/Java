import java.io.*;
import java.util.stream.*;

class Streams {
public static void main(String args[]) 
{
	String ReadString;
	InputStreamReader inputReader= new InputStreamReader(System.in);
	BufferedReader BufferStream = new BufferedReader();
	ReadString = BufferStream.ReadLine();
	System.out.println(ReadString);
}
}
