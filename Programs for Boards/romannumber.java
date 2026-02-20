import java.io.*;
class romannumber
{
public static void main(String ar[])throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
String roman;
int number=0, i, n1=0, n2=0;
System.out.println("Enter a roman number");
roman=ob.readLine();
roman=roman+" ";
for(i=0;i<roman.length()-1;i++)
{
if(roman.charAt(i)=='I')
n1=1;
if(roman.charAt(i)=='V')
n1=5;
if(roman.charAt(i)=='X')
n1=10;
if(roman.charAt(i)=='L')
n1=50;
if(roman.charAt(i)=='C')
n1=100;
if(roman.charAt(i)=='D')
n1=500;
if(roman.charAt(i)=='M')
n1=1000;
if(roman.charAt(i+1)=='I')
n2=1;
if(roman.charAt(i+1)=='V')
n2=5;
if(roman.charAt(i+1)=='X')
n2=10;
if(roman.charAt(i+1)=='L')
n2=50;
if(roman.charAt(i+1)=='C')
n2=100;
if(roman.charAt(i+1)=='D')
n2=500;
if(roman.charAt(i+1)=='M')
n2=1000;
if(n1>=n2)
number+=n1;
else if(n1<n2)
{
number+=n2-n1;
i++;
}
}
System.out.print(number);
}
}