import java.util.*;
import java.io.*;
class arrayfold
{
public static void main(String ar[])throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
int arr[], folds, r=0,c=0, i, j, m, tokens=0, half=0;
String input="";
System.out.println("Enter Input");
input=ob.readLine();
StringTokenizer sb=new StringTokenizer(input," ");
tokens=sb.countTokens();
arr=new int[tokens];
for(i=0;i<tokens;i++)
arr[i]=Integer.parseInt(sb.nextToken());
System.out.println("Enter number of folds");
folds=Integer.parseInt(ob.readLine());
half=tokens/2+1;
a:for(j=1;j<=folds;j++)
{
try{
for(i=0;i<half-1;i++)
{
arr[half-i-2]+=arr[half+i];
arr[half+i]=0;
}
}
catch(Exception zz)
{
break a;
}
half=half/2+1;
}

for(m=0;m<half;m++)
System.out.print(arr[m]+" ");
}
}