import java.io.*;
class minesweeper
{
public static void main(String ar[])throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
int r, c, frame[][], game[][], i, y, choice, m, n, x, ll, score=0, rr=0, cc=0, f=0, rrr, ccc, fc=0, fw=0, dc=0, dw=0, randomr=0, randomc=0, bn;

System.out.println("\t\t\tWELCOME TO MINESWEEPER(early access)\n \t\t\t\t made by Sparsh Panjwani");
System.out.println("What Size do You want of the Game?");
System.out.print("No. of rows-");
rr=Integer.parseInt(ob.readLine());
System.out.print("No. of columns-");
cc=Integer.parseInt(ob.readLine());
frame=new int[rr][cc];
game=new int[rr][cc];
System.out.println("Enter the Number of Bombs You want to be in the Game");
bn=Integer.parseInt(ob.readLine());
for(i=0;i<bn;i++)
{
randomr=(int)(Math.random()*5);
randomc=(int)(Math.random()*5);
frame[randomr][randomc]=10;
}
for(m=0;m<5;m++)
for(n=0;n<5;n++)
{
if(frame[m][n]>=10)
{
for(x=m-1;x<=m+1;x++)
for(y=n-1;y<=n+1;y++)
{
if(x>-1&&x<5&&y>-1&&y<5)
frame[x][y]+=1;
if(x==m&&y==n)
frame[x][y]--;
}
}
}
a:for(ll=0;ll<=rr*cc;ll++)
{
for(m=0;m<rr;m++)
{
for(n=0;n<cc;n++)
{
