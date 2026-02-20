import java.io.*;
class truthtable
{
public static void main(String ar[])throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
int r=0, c=0, i, j;
String str[][], exp="";
str=new String[5][5];
System.out.println("Enter an expression");
exp=ob.readLine();
for(i=0;i<exp.length();i++)
{
a:if(exp.charAt(i)!='+'&&exp.charAt(i)!='.'&&exp.charAt(i)!='\'')
{
while(str[0][c]!=null)
{
if(exp.charAt(i+1)=='\'')
if(str[0][c].equals(exp.charAt(i)+'\''))
break a;
else
if(str[0][c].equals(exp.charAt(i)+""))
break a;
c++;
}
if(exp.chartAt(i+1)='\'')
str[0][c]=exp.charAt(i)+"\'";
else
str[0][c]=exp.charAt(i)+"";
}
}
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
System.out.print(str[i][j]);
System.out.println();
}
}
}
