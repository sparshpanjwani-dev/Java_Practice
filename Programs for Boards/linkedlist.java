import java.io.*;
class node
{
int a;
node next;
}

class x
{
public static void main(String ar[])throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
int k;
char P;
node n1, n2=null;
k=Integer.parseInt(ob.readLine());
n1=n2;
n2=null;
do
{
System.out.println("Enter k");
k=Integer.parseInt(ob.readLine());
if(n1==null)
{
n1=n2=new node();
n1.a=k;
n1.next=null;
}
else
{
n2.next=new node();
n2=n2.next;
n2.a=k;
n1.next=null;
}
System.out.print("Do you want to continue?");
P=Character.toUpperCase((char)(ob.read()));
}
while(P!='N');
for(n2=n1;n2!=null;n2=n2.next)
System.out.println(n2.a);
}
}