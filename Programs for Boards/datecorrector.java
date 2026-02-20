import java.io.*;
import java.util.*;
class datecorrector
{
public static void main(String ar[])throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
int j, c1=0, c2=0, a1, a2, a3, a[];
String d;
System.out.println("Enter Date");
d=ob.readLine();
System.out.print(d);
d+=" ";
a=new int[13];
a[1]=31;
a[2]=29;
a[3]=31;
a[4]=30;
a[5]=31;
a[6]=30;
a[7]=31;
a[8]=31;
a[9]=30;
a[10]=31;
a[11]=30;
a[12]=31;
StringTokenizer s1=new StringTokenizer(d,"- ");
a1=Integer.parseInt(s1.nextToken());
a2=Integer.parseInt(s1.nextToken());
a3=Integer.parseInt(s1.nextToken());
while(a2>12)
{
a2-=12;
c2++;
}
while(a1>a[a2])
{
a1-=a[a2];
a2++;
if(a2>12)
{
a2=1;
c2++;
}
}
a3+=c2;
System.out.print("----->"+a1+"-"+a2+"-"+a3);
}
}