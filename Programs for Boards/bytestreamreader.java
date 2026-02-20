import java.io.*;
class bytestreamreader
{
public static void main(String ar[])throws Exception
{
FileInputStream fn=new FileInputStream("Sparsh.secret");
DataInputStream dn=new DataInputStream(fn);
int R;
String N, C;
double m1, m2, m3;
while(true)
{
try
{
R=dn.readInt();
}
catch(EOFException m)
{
break;
}
System.out.println("Roll Number \n"+R);
N=dn.readUTF();
System.out.println("Name \n"+N);
C=dn.readUTF();
System.out.println("Class \n"+C);
m1=dn.readDouble();
System.out.println("Marks in English \n"+m1);
m2=dn.readDouble();
System.out.println("Marks in Physics \n"+m2);
m3=dn.readDouble();
System.out.println("Marks in Maths \n"+m3+"\n");
}
dn.close();
fn.close();
}
}