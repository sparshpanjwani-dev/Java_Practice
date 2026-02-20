import java.util.*;
class b
{
int m, n;
void bomb(int br,int bc,char a[][])
{
System.out.print(br+" ");
System.out.println(bc);
try
{
if(m==br+1&&n==bc+1&&a[m][n]!='l')
return;
else
{
a[br][bc]='X';
for(m=br-1;m<=br+1;m++)
for(n=bc-1;n<=bc+1;n++)
{
if(m>0&&m<a.length&&n>0&&n<a[0].length)
{
if(a[m][n]=='l'||a[m][n]=='L')
{
a[m][n]='X';
br=m;
bc=n;
bomb(br,bc,a,bol);
}
if(m==br+1&&n==bc+1)
return;
}
}
}
}
}
}
catch(Exception z)
{
}
}
}
class bombtry
{
public static void main(String ar[])throws Exception
{
Scanner ob=new Scanner(System.in);
int i, j, k, m, r, c, brr, bcc;
boolean bol=true;
char a[][];
System.out.println("Enter no. of rows and no. of columns");
r=ob.nextInt();
c=ob.nextInt();
a=new char[r][c];
System.out.println("Enter L:Land OR W:Water");
for(i=0;i<r;i++)
for(j=0;j<c;j++)
a[i][j]=ob.next().charAt(0);
System.out.println("Your given array is");
for(int o=0;o<r;o++)
{
for(int p=0;p<c;p++)
System.out.print(a[o][p]+ "  ");
System.out.println();
}
System.out.println("Enter row no. and column no. where bomb is to be dropped");
brr=ob.nextInt();
bcc=ob.nextInt();
brr-=1;
b obj=new b();
bcc-=1;
if(a[brr][bcc]=='w'||a[brr][bcc]=='W')
for(int o=0;o<r;o++)
{
for(int p=0;p<c;p++)
System.out.print(a[o][p]+ "  ");
System.out.println();
}
else
{
obj.bomb(brr,bcc,a);
for(int o=0;o<r;o++)
{
for(int p=0;p<c;p++)
System.out.print(a[o][p]+ "  ");
System.out.println();
}
}
}
}

