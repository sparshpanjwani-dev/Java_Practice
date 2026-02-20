import java.io.*;
class luckynumber
{
public static void main(String ar[])throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
int i, j, k, l, N, m=0, r=0, a[], t=0, z=0;
System.out.println("Enter Size of array");
N=Integer.parseInt(ob.readLine());
a=new int[N];//creating of array of size N
System.out.println("Enter values for array");
for(j=0;j<N;j++)
a[j]=Integer.parseInt(ob.readLine());//filling the array
for(i=0;i<N;i++)//loop for finding lucky number
{
t=a[m];
if(i==N-1)
{
System.out.print("Lucky number is ="+t);//finding lucky number
System.exit(0); 
}
if(t<0)
{
t=Math.abs(t);//finding absolute value of t
z=1;
}
a[m]=0;
m=0;
for(k=0;k<t;k++)
{
if(z==0)
{
r++;
if(r>N-1)
r=0;
while(a[r]==0)
{
r++;
if(r>N-1)
r=0;
}
}
else  if(z==1)
{
r--;
if(r<0)
r=N-1;
while(a[r]==0)
{
r--;
if(r<0)
r=N-1;
}
}
}
m=r;
z=0;
}
}
}

 	