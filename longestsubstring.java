import java.io.*;
class longestsubstring
{
public static void main(String ar[])throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
String s="", sub1, sub2, sub3="", sub4="";
int i, j;
System.out.println("Enter a String");
s=ob.readLine();
for(i=0;i<s.length();i++)
{
sub1+=s.charAt(i);
sub2=s.substring(i+1, s.length()-1);
for(j=0;j<sub1.length();j++)
if(s.charAt(i).equals(sub1.charAt(j)))
{
sub3=s.substring(i, j);
if(sub3.length()>sub4.length())
sub4=sub3;
}
}
System.out.print(sub4);
}
}

