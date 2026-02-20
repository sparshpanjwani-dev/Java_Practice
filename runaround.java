import java.io.*;
class runaround
{
public static void main(String ar[])throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
int n, i, l, j, m, a[], c=0, c1, k;
String n1;
System.out.println("Enter a number to be checked for run around number");
n1=ob.readLine();
l=n1.length();
n=Integer.parseInt(n1);
a=new int[l];
for(i=l-1;i>=0;i--)
{
m=n%10;
a[i]=m;
n=n/10;
}
for(j=0;j<l;j++)
{
c1=a[c];
if(c1==0)
{
System.out.print("Not a run around number");
System.exit(0);
}
a[c]=0;
for(k=0;k<c1;k++)
{
c++;
if(c>l-1)
c=0;
}
}
System.out.print("A run around number");
}
}