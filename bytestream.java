import java.io.*;
class bytestream
{
public static void main(String ar[])throws Exception
{
FileOutputStream fs=new FileOutputStream("Sparsh.secret", true);
DataOutputStream ds=new DataOutputStream(fs);
DataInputStream ob=new DataInputStream(System.in);
int R=0, n;
String N="", C="";
double m1=0.0, m2=0.0, m3=0.0;
System.out.println("How many enteries do you want to make?");
n=Integer.parseInt(ob.readLine());
while(n>0)
{
System.out.println("Enter Roll no.");
R=Integer.parseInt(ob.readLine());
ds.writeInt(R);
System.out.println("Enter Name");
N=ob.readLine();
ds.writeUTF(N);
System.out.println("Enter Class");
C=ob.readLine();
ds.writeUTF(C);
System.out.println("Enter marks in English");
m1=Double.parseDouble(ob.readLine());
ds.writeDouble(m1);
System.out.println("Enter marks in Physics");
m2=Double.parseDouble(ob.readLine());
ds.writeDouble(m2);
System.out.println("Enter marks in Maths");
m3=Double.parseDouble(ob.readLine());
ds.writeDouble(m3);
n--;
}
ds.close();
fs.close();
}
}