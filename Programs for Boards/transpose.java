import java.util.*;
class transpose
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
int a[][], m, n, x, y, z, b, i, j, gg, p, o;
System.out.println("Enter size of your array");
m=sc.nextInt();
n=m;
a=new int[m][n];
System.out.println("Enter value for your array");
for(i=0;i<m;i++)
for(j=0;j<n;j++)
a[i][j]=sc.nextInt();
System.out.println("Your Given Array Is--->");
for(o=0;o<m;o++)
{
for(p=0;p<n;p++)
System.out.print(a[o][p]);
System.out.println();
}
System.out.println("Array After Transpose is--->");
for(x=0;x<m;x++)
for(y=0;y<n;y++)
{
if(y>=x)
{
gg=a[y][x];
a[y][x]=a[x][y];
a[x][y]=gg;
}
}
for(z=0;z<m;z++)
{
for(b=0;b<n;b++)
System.out.print(a[z][b]);
System.out.println();
}
}
}