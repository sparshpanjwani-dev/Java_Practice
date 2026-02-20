import java.io.*;
class spiral
{
public static void main(String ar[])throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
int g[][], r, c, num=1, m=0, n=0, i, j, z;
System.out.println("Enter dimensions of Array");
r=Integer.parseInt(ob.readLine());
c=Integer.parseInt(ob.readLine());
g=new int[r][c];
for(z=0;z<=Math.max(r,c);z++)
{
while(n<c&&g[m][n]==0)
{
g[m][n]=num;
num++;
n++;
}
m++;
n--;
while(m<r&&g[m][n]==0)
{
g[m][n]=num;
num++;
m++;
}
n--;
m--;
while(n>-1&&g[m][n]==0)
{
g[m][n]=num;
num++;
n--;
}
m--;
n++;
while(m>-1&&g[m][n]==0)
{
g[m][n]=num;
num++;
m--;
}
m++;
n++;
}
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
if(g[i][j]<10)
System.out.print(g[i][j]+"   ");
else if(g[i][j]<100)
System.out.print(g[i][j]+"  ");
else 
System.out.print(g[i][j]+" ");

}
System.out.println();
}
}
}

