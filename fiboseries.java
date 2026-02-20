import java.io.*;
class fiboseries
{
public static void main(String ar[])throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
String f;
char i;
int l, c1=0, c2=0, c3=0, j;
System.out.println("Enter the String to be checked for Fibo Series");
f=ob.readLine();
l=f.length();//taking out length of given fibo series
for(i='a';i<='z';i++)//main loop for checking first alphabet of the series
{
for(j=0;j<l;j++)//loop for checking frequency of the alphabets
{
if(f.charAt(j)==i)
c1+=1;
}
if(c1!=0&&c2==0&&c3==0)//checking for fibo series
{
c2=c1;
c1=0;
}
if(c1!=0&&c2!=0&&c3==0)//checking for fibo series
{
c3=c1;
c1=0;
}
if(c2!=0&&c3!=0&&c1!=0)
{
if(c1!=c2+c3)//checking for fibo series
{
System.out.print("Not a Fibo Series");
System.exit(0);
}
else
{
c2=c3;
c3=c1;
c1=0;
}
}
}
System.out.print("It is a Fibo Series");
}
}