import java.io.*;
class fileeditor
{
public static void main(String ar[])throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
FileInputStream fr;
DataInputStream dn;
FileOutputStream fw;
DataOutputStream ds;
String S, n="", ch="";
int i, r1=0, r, c=0, j;
double m1=0.0, m2=0.0, m3=0.0;
a:for(j=0;;j++)
{
System.out.println("What do you want to make changes in?\n1)Name\n2)Class\n3)Marks\n4)EXIT");
c=Integer.parseInt(ob.readLine());
if(c==4)
break a;
System.out.println("Enter the Roll number of the Student");
r=Integer.parseInt(ob.readLine());
fr=new FileInputStream("Sparsh.secret");
dn=new DataInputStream(fr);
fw=new FileOutputStream("stemp.TOPSECRET");
ds=new DataOutputStream(fw);
while(r1!=r)
{
r1=dn.readInt();
n=dn.readUTF();
ch=dn.readUTF();
m1=dn.readDouble();
m2=dn.readDouble();
m3=dn.readDouble();
if(r1!=r)
{
ds.writeInt(r1);
ds.writeUTF(n);
ds.writeUTF(ch);
ds.writeDouble(m1);
ds.writeDouble(m2);
ds.writeDouble(m3);
}
}
dn.close();
fr.close();
ds.close();
fw.close();
if(c==1)
{
System.out.println("Enter the Correct Name");
n=ob.readLine();
}
if(c==2)
{
System.out.println("Enter the Correct Class");
ch=ob.readLine();
}
if(c==3)
{
System.out.println("Which marks do you want to make changes in? \n 1)English\n2)Physics\n3)Maths");
i=Integer.parseInt(ob.readLine());
System.out.println("Enter new Marks");
if(i==1)
m1=Double.parseDouble(ob.readLine());
if(i==2)
m2=Double.parseDouble(ob.readLine());
if(i==3)
m3=Double.parseDouble(ob.readLine());
}
fr=new FileInputStream("Sparsh.secret");
dn=new DataInputStream(fr);
fw=new FileOutputStream("stemp.TOPSECRET");
ds=new DataOutputStream(fw);
ds.writeInt(r1);
ds.writeUTF(n);
ds.writeUTF(ch);
ds.writeDouble(m1);
ds.writeDouble(m2);
ds.writeDouble(m3);
dn.close();
fr.close();
ds.close();
fw.close();
}
fr=new FileInputStream("Sparsh.secret");
dn=new DataInputStream(fr);
fw=new FileOutputStream("stemp.TOPSECRET");
ds=new DataOutputStream(fw);
while(true)
{
try
{
r1=dn.readInt();
n=dn.readUTF();
ch=dn.readUTF();
m1=dn.readDouble();
m2=dn.readDouble();
m3=dn.readDouble();
ds.writeInt(r1);
ds.writeUTF(n);
ds.writeUTF(ch);
ds.writeDouble(m1);
ds.writeDouble(m2);
ds.writeDouble(m3);
}
catch(EOFException m)
{
break;
}
}
dn.close();
fr.close();
ds.close();
fw.close();
File F=new File("Sparsh.secret");
F.delete();
F=new File("stemp.TOPSECRET");
F.renameTo(new File("Sparsh.secret"));
}
}

