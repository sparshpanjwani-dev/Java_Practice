import java.io.*;
class palindrome
{
public static void main(String ar[])throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
String s, p="", pf="", pal="";
int l, start=0, pl1=0, pl2=0;
char c;
System.out.println("Enter a String :)");
s=ob.readLine();
l=s.length();
for(int i=1;i<l;i++)
{
for(int j=start;j<l;j++)
{
c=s.charAt(j);
p=p+c;
pl1=p.length();
if(pl1>1)
{
StringBuffer ps=new StringBuffer(p);
ps.reverse();
pf=ps.toString();
ps=null;
if(p.equalsIgnoreCase(pf))
{
if(pl1>pl2)
{
pl2=pl1;
pl1=0;
pal=pf;
}
}
}
pf="";
}
p="";
start++;
}
if(pal="")
System.out.print(" :( No Palindrome");
if(pal.length>1)	
System.out.print("The longest palindrome is "+pal);
}
}


