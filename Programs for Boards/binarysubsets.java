import java.io.*;
class binarysubsets
{
public static void main(String ar[])throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
String num, s="";
int i, j;
System.out.println("Enter a binary number");
num=ob.readLine();
for(i=0;i<num.length();i++)
{
if(num.charAt(i)=='1')
{
System.out.println("1");
for(j=i+1;j<num.length();j++)
{
if(num.charAt(j)=='1')
{
s=num.substring(i, j+1);
System.out.println(s); 
}
}
}
}
}
}