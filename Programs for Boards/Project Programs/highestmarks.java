import java.util.*;
class Record
{
protected String N[];
protected int M[], size;
public Record(int cap)
{
size=cap;
N=new String[cap];
M=new int[cap];
}

public void read()
{
Scanner sc=new Scanner(System.in);
for(int i=0;i<size;i++)
{
System.out.println("Enter Name of Student "+(i+1));
N[i]=sc.next();
System.out.println("Enter the Marks of the above Student");
M[i]=sc.nextInt();
}
}
public void disp()
{
System.out.println("The Data you Entered-->");
for(int i=0;i<size;i++)
System.out.println(N[i]+"        "+M[i]);
}
}

class Highest extends Record
{
private int ind;
public Highest(int sparsh)
{
super(sparsh);
ind=-1;
}
public void find()
{
int m1=0;
for(int i=0;i<size;i++)
{
if(M[i]>m1)
m1=M[i];
}
ind=m1;
}

public void disp()
{
super.disp();
System.out.println("Students with highest marks are-->");
for(int i=0;i<size;i++)
if(M[i]==ind)
{
System.out.println(N[i]+"        "+M[i]);
}
}
}

class highestmarks
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
int cap;
System.out.println("Enter no. of students");
cap=sc.nextInt();

Highest h=new Highest(cap);
h.read();
h.find();
h.disp();
}
}