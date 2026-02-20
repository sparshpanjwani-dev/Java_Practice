import java.io.*;
class farmerlightingissues
{
public static void main(String ar[])throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
int r, c, field[][], lamp, lr, lc, lampnumber, z, x, y=0, m, n, cc=0, i, j, k;
System.out.println("Enter length and breadth of the field respectively");
r=Integer.parseInt(ob.readLine());
c=Integer.parseInt(ob.readLine());
field=new int[r][c];
System.out.println("Enter number of lamps in the field");
lampnumber=Integer.parseInt(ob.readLine());
for(z=0;z<lampnumber;z++)
{
System.out.println("Enter lamp ("+(z+1)+") co-ordinates(row and column)");
lr=Integer.parseInt(ob.readLine());
lc=Integer.parseInt(ob.readLine());
lr--;
lc--;
field[lr][lc]=10;
}
System.out.println("The field right now is------>");
for(m=0;m<r;m++)
{
for(n=0;n<c;n++)
System.out.print(field[m][n]+"\t");
System.out.println();
}
for(m=0;m<r;m++)
{
for(n=0;n<c;n++)
{
if(field[m][n]>=10)
{
for(x=m-1;x<=m+1;x++)
for(y=n-1;y<=n+1;y++)
{
if(x>-1&&x<r&&y>-1&&y<c)
field[x][y]+=1;
}
field[m][n]-=1;
}
}
}
System.out.println("The farm lighting condition right now is------>");
for(m=0;m<r;m++)
{
for(n=0;n<c;n++)
System.out.print(field[m][n]+"\t");
System.out.println();
}
for(m=0;m<r;m++)
{
for(n=0;n<c;n++)
{
if(field[m][n]>9)
{
a:for(x=m-1;x<=m+1;x++)
{
for(y=n-1;y<=n+1;y++)
{
if(x>-1&&x<r&&y>-1&&y<c)
{
if(x==m&&y==n)
field[x][y]=field[x][y]-10;
else
field[x][y]--;
if(field[x][y]==0)
{
cc=0;
break a;
}
else
cc=cc+1;
}
}
if(cc==9)
{
System.out.println("the lamp at "+(m+1)+" "+(n+1)+" is unnecessary");
cc=0;
field[m][n]=0;
}
}
}
}
}
System.out.println("The Lamps in the field should be arranged like this---->");
for(k=0;k<c;k++)
System.out.print("------");
System.out.println();
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
if(field[i][j]>=10)
field[i][j]=10;
else
field[i][j]=0;
if(field[i][j]==0)
System.out.print("| "+field[i][j]+" | ");
else
System.out.print("| "+"L"+" | ");
}
System.out.println();
for(k=0;k<c;k++)
System.out.print("------");
System.out.println();
}
}
}
