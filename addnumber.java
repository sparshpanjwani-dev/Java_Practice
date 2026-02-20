import java.io.*;
class addnumber
{
public static void main(String ar[])throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
int num, a=0, newnum=0, o=0, i;
System.out.println("Enter a number");
num=Integer.parseInt(ob.readLine());
num-=1;
while(num!=0)
{
a++;
System.out.println(num+" "+a);
while(a!=1)
{
o++;
System.out.print(num);
for(i=0;i<=a;i++)
System.out.print(" 1");
System.out.println();
}
num--;
}
}
}

