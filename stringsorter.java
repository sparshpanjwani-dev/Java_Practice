import java.io.*;
class stringsorter
{
public static void main(String ar[])throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
String s="", sn="", sc="", sf="", scc="";
int n, i, j, k;
System.out.println("Enter String to be Sorted");
s=ob.readLine();
System.out.println("Enter size of substrings to be removed");
n=Integer.parseInt(ob.readLine());
for(i=0;i<s.length()-n;i++)
{
for(j=0;j<n;j++)
sc+=s.charAt(i);
scc=s.substring(i, i+n);
System.out.println(scc);
if(scc.equals(sc))
{
System.out.println("S");
for(k=0;k<s.length();k++)
{
if(k<i||k>i+n)
sn+=s.charAt(k);
System.out.print("S");
}
sf=sn;
}
sc=null;
sn=null;
}
System.out.print(sf);
}



}