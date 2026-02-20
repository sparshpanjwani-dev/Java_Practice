import java.util.*;
class qsort
{
public static void qsort(int a[],int lo,int hi)
{
int l,r,m;
l=lo;
r=hi;
m=a[(l+r)/2];
do
{
while(a[l]<m)
l++;
while(a[r]>m)
r--;
if(l<=r)
{
int t=a[l];
a[l]=a[r];
a[r]=t;
l++;
r--;
}
}
while(l<=r);
if(l<hi)
qsort(a,l,hi);
if(r>lo)
qsort(a,lo,r);
}
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
int n,b[];
System.out.println("Enter Length of Array");
n=sc.nextInt();
b=new int[n];
System.out.println("Enter Elements of Array to be Sorted");
for(int x=0;x<n;x++)
b[x]=sc.nextInt();
qsort(b,0,n-1);
System.out.println("Sorted Array");
for(int x=0;x<n;x++)
System.out.print(b[x]+" ");
}
}
