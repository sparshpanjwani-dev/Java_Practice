import java.io.*;
class rabbit
{
public static void main(String ar[])throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
String a[][];
int r, c, m, n, j, i, k;
System.out.println("Enter number of rows");
r=Integer.parseInt(ob.readLine());
System.out.println("Enter number of columns");
c=Integer.parseInt(ob.readLine());
a=new String[r][c];
for(j=0;j<r;j++)
for(k=0;k<c;k++)
a[j][k]=ob.readLine();
m=0;
n=0;
for(i=0;i<r*c;i++)
{
try
{
if(a[m][n].equals("L"))
n--;
else if(a[m][n].equals("U"))
m--;
else if(a[m][n].equals("R"))
n++;
else if(a[m][n].equals("D"))
m++;
}
catch(ArrayIndexOutOfBoundsException mm)
{
if(m==r&&n==c-1||m==r-1&&n==c)
{
System.out.println("Rabbit is out");
System.exit(0);
}
else
{
System.out.println("Rabbit won't be out");
System.exit(0);
}
}
}
System.out.println("Rabbit won't be out");
}
}
