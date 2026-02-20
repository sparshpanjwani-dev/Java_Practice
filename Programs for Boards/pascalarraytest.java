import java.io.*;
import java.util.*;
class pascalarray
{
public static void main(String ar[])throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
int iteration=0, arr[][], i, m, n, j, cc=0, c=0, column=0;
String in="";
System.out.println("Input");
in=ob.readLine();
System.out.println("Enter no. of Iterations");
iteration=Integer.parseInt(ob.readLine());
StringTokenizer sb=new StringTokenizer(in, ",");
c=sb.countTokens();
m=c;
column=c;
for(i=0;i<iteration;i++)
{
m=(m*2)-1;
column+=m;
}
arr=new int[iteration+1][column];
for(i=0;i<c;i++)
{
arr[0][i]=Integer.parseInt(sb.nextToken());
}
m=0;
m=c*2;
for(i=1;i<iteration+1;i++)
{
j=0;
cc=0;
while(j!=m-1)
{
arr[i][j]=arr[i-1][cc];
j+=2;
cc+=1;
}
j=1;
cc=0;
while(j!=m-1)
{
arr[i][j]=arr[i-1][cc]+arr[i-1][cc+1];
cc+=1;
j+=2;
}
m=(m*2)-1;
}

for(m=0;m<column;m++)
{
System.out.println(arr[iteration][m]+"   ");
}
}
}