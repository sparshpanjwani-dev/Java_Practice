import java.io.*;
import java.util.*;
class pascalarray
{
public static void main(String ar[])throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
int iteration=0, arr[][], i, m, n, j, c=0, column=0;
String in="", cc="", ccc="";
System.out.println("Input");
in=ob.readLine();
System.out.println("Enter no. of Iterations");
iteration=Integer.parseInt(ob.readLine()); 
for(i=0;i<iteration;i++)
{
StringTokenizer sb=new StringTokenizer(in, ",");
in="";
c=sb.countTokens();
System.out.println(c);
cc=sb.nextToken();
for(j=0;j<c-1;j++)
{
ccc=sb.nextToken();
in=cc+","+(Integer.parseInt(cc)+Integer.parseInt(ccc))+",";
cc=ccc;
}
in=in+sb.toString().charAt(sb.toString().length()-1);
System.out.println(in);
cc="";
ccc="";
}
System.out.println(in);
}
}
