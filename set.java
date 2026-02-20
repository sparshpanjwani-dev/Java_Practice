import java.io.*;
class set
{
int Arr[];
int N;

void in()
{
DataInputStream ob=new DataInputStream(System.in);
System.out.println("ENTER THE SIZE OF ARRAY");
N=Integer.parseInt(ob.readLine());
System.out.println("ENTER UNIQUE NOS. IN ARRAY !!!!!");

Arr[0]=Integer.parseInt(ob.readLine());

for(int i=1;i<N;i++)
{
Arr[i]=Integer.parseInt(ob.readLine());
if(Arr[0]==Arr[i])
{
Arr[i]=Integer.parseInt(ob.readLine());
}

void out()
{
for(int i=0;i<N;i++)
System.out.print(" "+Arr[i]);
}

set(int N)
{
this.N=N;
Arr=new int[N];
}

set union(set m)
{
set z=new set(this.N+m.N);
for(int i=0;i<this.N;i++)
{
z.Arr[i]=this.Arr[i];
}
for(int i=0;i<m.N;i++)
{
z.Arr[this.N+i]=m.Arr[i];
}
for(int i=0;i<this.N+m.n;i++)
{
for(int j=0;j<this.N+m.N;j++)
{
if(z.Arr[i]==z.Arr[j])
z.Arr[i]=0;
}

set intersection(set m)
void cartesianPro(set m)
set add(set m)
{
set b=new set(this.N+m.N)
for(int i=0;i<this.N+m.N;i++)
{
b.Arr[i]=a[i]+m.a[i];
}
return b;
}

public static void main(String ar[])
{
set s1,s2,s3;
s1=new set(4);
s1=new set(5);
s1.in();
s2.in();
s3=s1.intersection(s2);
s3=s1.union(s2);
s3.out();
s3=s1.add(s2);
s3.out();
s1.cartesianpro(s2);
}
}