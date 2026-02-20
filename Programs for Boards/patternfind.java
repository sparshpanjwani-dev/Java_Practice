import java.io.*;
import java.util.*;
class patternfind
{
public static void main(String ar[])throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
String input="", output="", arr[][];
int i, j;
System.out.println("Enter pattern");
input=ob.readLine();
System.out.println("Enter string to be checked for pattern");
output=ob.readLine();
arr=new String[2][input.length()];
StringTokenizer st=new StringTokenizer(output," ");
if(st.countTokens()!=input.length())
{
System.out.print("False");
System.exit(0);
}

for(i=0;i<input.length();i++)
{
arr[0][i]=input.charAt(i)+"";
arr[1][i]=st.nextToken();
}

for(i=0;i<input.length();i++)
{
for(j=0;j<input.length();j++)
{
if(arr[0][j].equals(arr[0][i])&&arr[1][j].equals(arr[1][i]))
continue;
else if(
else
{
System.out.print("False");
System.exit(0);
}
}
}

System.out.print("True");
}
}