import java.io.*;
class Sop
{
private String str;
public void read()throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
str=ob.readLine();
}
public int rotations()
{
int count=0;
String s, w;
s=w=str;
while(true)
{
s=rotate(s);
if(s.equals(w))
break;
else
count+=1;
}
count++;
return count;
}

public String rotate(String k)
{
String s2;
char ch;
StringBuffer Sb=new StringBuffer(k);
ch=Sb.charAt(0);
Sb.deleteCharAt(0);
Sb.append(ch);
s2=Sb.toString();
return s2;
}

public void disp()
{
System.out.println(str);
}
}

class a
{
public static void main(String ar[])throws Exception
{
Sop A=new Sop();
A.read();
int co;
co=A.rotations();
System.out.println(co);
}
}