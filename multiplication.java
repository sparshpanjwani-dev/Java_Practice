import java.io.*;
class multiplication
{
public static void main(String ar[])throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
String n11, n22;
int n1=0, n2=0, i, j, k, n=0, a=-1, l1, l2;
System.out.println("Enter the numbers-->");
n11=ob.readLine();
n22=ob.readLine();
l1=n11.length();
l2=n22.length();
if(l2>l1)
{
for(k=0;k<l2-l1;k++)
System.out.print(" ");
System.out.println(n11);
System.out.print(" ");
System.out.println("X"+n22);
}
else
{
System.out.print(" ");
System.out.println(n11);
for(k=0;k<l1-l2;k++)
System.out.print(" ");
System.out.println("X"+n22);
}
n1=Integer.parseInt(n11);
n2=Integer.parseInt(n22);
if(l1>l2)
{
for(i=0;i<2*l1-1;i++)
System.out.print("-");
}
else
{
for(i=0;i<2*l2-1;i++)
System.out.print("-");
}
System.out.println();
for(j=l2-1;j>=0;j--)
{
a+=1;
for(k=0;k<j;k++)
System.out.print(" ");
n=Integer.parseInt(Character.toString(n22.charAt(j)))*n1;
System.out.print(n);
for(i=0;i<a;i++)
System.out.print("X");
System.out.println();
}
if(l1>l2)
{
for(i=0;i<2*l1-1;i++)
System.out.print("-");
}
else
{
for(i=0;i<2*l2-1;i++)
System.out.print("-");
}
System.out.println();
System.out.print(n1*n2);
}
}