public sssssclass Matrix
{
public static void main(String args[])
{
int[][] a={{1,2,3},{4,5,6},{7,8,9}};
int[][] b={{1,2,3},{4,5,6},{7,8,9}};
int c[][]=new int[3][3];
int i,j,k;
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
c[i][j]=0;
for(k=0;k<3;k++)
c[i][j]=c[i][j]+a[i][k]*b[i][k];
}
}
System.out.println("Multiplied matrix:");
System.out.print(c[3][3]);
}
}