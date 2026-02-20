import java.io.*;
class rotatearray
{
public static void main(String ar[])throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
String arr[][], c="";
int n, i, mm, m, j;
System.out.println("Enter dimensions of the square array to be rotated");
n=Integer.parseInt(ob.readLine());
arr=new String[n][n];
for(m=0;m<n;m++)
{
System.out.println("Enter values for row "+(m+1));
for(mm=0;mm<n;mm++)
arr[m][mm]=ob.readLine();
System.out.println();
}

for(m=0;m<n;m++)
{
for(mm=0;mm<n;mm++)
System.out.print(arr[m][mm]+"   ");
System.out.println();
}
System.out.println();
System.out.println();


for(j=0;j<n/2;j++)
{
for(i=j;i<n;i++)
{
c=arr[i][j];
arr[i][j]=arr[n-1-j][i];
arr[n-1-j][i]=arr[n-1-i][n-1-j];
arr[n-1-i][n-1-j]=arr[i][n-1-j];
arr[i][n-1-j]=c;
}
}

for(m=0;m<n;m++)
{
for(mm=0;mm<n;mm++)
System.out.print(arr[m][mm]+"   ");
System.out.println();
}
}
}