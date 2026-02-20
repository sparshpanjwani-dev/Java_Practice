import java.io.*;
class totalpalindromes
{
public static void main(String ar[])throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
String s, pn="", ps="", n="";
int l,c=0,i;
System.out.println("Enter a String");
s=ob.readLine();
l=s.length();
for(i=0;i<l-1;i++)
{
pn=s.substring(1, l)+s.charAt(0);
System.out.println(pn);
s=pn;
StringBuffer pf=new StringBuffer(pn);
pf.reverse();
ps=pf.toString();
if(ps.equalsIgnoreCase(pn))
{
n=pn;
n=n+"\n";
c++;
}
}
System.out.println("\n Palindromes of the String are \n"+n);
System.out.print("Number of palindromes="+c);
}
}
