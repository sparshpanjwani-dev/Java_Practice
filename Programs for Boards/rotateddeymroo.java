import java.io.*;
class rotateddeymroo
{
public static void main(String ar[])throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
int m, k, n;
System.out.println("Enter size for array");
n=Integer.parseInt(ob.readLine());
if(n%2==0)
{
System.out.print("Enter odd value lol xD");
System.exit(0);
}
int a[][]=new int[n][n];
for(m=0;m<n;m++)
{
for(k=0;k<n;k++)
{  
if(m>=k&&m+k<=n-1||m+k>=n-1&&m<=k)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}
}
