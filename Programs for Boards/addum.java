import java.io.*;
class addum
{
public static void main(String ar[])throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
String num="", sqnum="";
int sq=0, i;
for(i=0;i<1000;i++)
{
num=i+"";
sq=Integer.parseInt(num)*Integer.parseInt(num);
sqnum=sq+"";
StringBuffer sb=new StringBuffer(num);
StringBuffer sbb=new StringBuffer(sqnum);
if(Math.pow(Integer.parseInt(sb.reverse().toString()),2)==Integer.parseInt(sbb.reverse().toString()))
{
System.out.println("Addum no.   "+i);
}
}
}
}