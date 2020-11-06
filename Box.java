public class Box
{
	int width,height,depth;

Box(Box b)
{
width=b.width;
height=b.height;
depth=b.depth;
}
Box(int w,int h,int d)
{
	width=w;
	height=h;
	depth=d;
}
Box()
{
width=3;
height=5;
depth=2;
}
double volume() {
System.out.print("Volume of box is:"+ width*height*depth);
}
}

class Boxweight extends Box 
{
	int weight;

Boxweight(int w,int h,int d, int m)
{
width=w;
height=h;
depth=d;
weight=m;
}
}

class demoboxweight {
public static void main(String args[]){
Boxweight b1=new Boxweight(3,5,2,1);
int vol;

vol=Box.volume( );
System.out.print("The volume of box is: " + vol);
System.out.print("The weight of box is: " + Box.weight);
}
}