public class GenericMethodTest
{
	public static <E> void myArray(E[] input)
	{
		for(E element : input)
		{
			System.out.printf("%s", element);
		}
		System.out.println();
	}
public static void main(String args[])
{
	//creating arrays
Integer[] intArray = {100,200,300,450,650};
Double[] doubleArray = {1.2,2.3,3.4,4.5,5.6,6.7};
Character[] charArray = {'F','D','A','H','J','Y'};

System.out.println("Integer Array contains:");
myArray(intArray"\n");

System.out.println("\n Double Array contains:");
myArray(doubleArray);

System.out.println("\n Character Array contains:");
myArray(charArray);
}
}