import java.io.*;
class tictactoe
{
public static void main(String ar[])throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
int i=0, m, n=0, game[][], r=0, c=0, c1=0, c2=0, c3=0, c4=0, rr, cc, ns=0, s=0, j=0;
String n1, n2;
System.out.println("\t\t\tWELCOME TO ENDLESS TIC TAC TOE(early access)\n \t\t\t\t made by Sparsh Panjwani");
System.out.println("Enter the number of rows and columns you want");
r=Integer.parseInt(ob.readLine());
c=Integer.parseInt(ob.readLine());
System.out.println("Enter length of pattern to win");
ns=Integer.parseInt(ob.readLine());
ns--;
game=new int[r][c];
for(m=0;m<r;m++)
{
for(n=0;n<c;n++)
game[m][n]=32;
}
System.out.println("Enter player 1's name");
n1=ob.readLine();
System.out.println("Enter player 2's name");
n2=ob.readLine();
a:for(int jjjj=0;jjjj<(r*c)-1;jjjj++)
{
do
{
System.out.println("Its "+n1+"'s"+" turn");
rr=Integer.parseInt(ob.readLine());
rr--;
cc=Integer.parseInt(ob.readLine());
cc--;
}
while(rr>=r||rr<0||cc>=c||cc<0||game[rr][cc]!=32);
game[rr][cc]=88;
System.out.print("\t\t\t");
for(int jj=0;jj<5*c;jj++)
System.out.print("-");
System.out.println();
for(m=0;m<r;m++)
{
System.out.print("\t\t\t");
for(n=0;n<c;n++)
System.out.print(" | "+(char)(game[m][n]));
System.out.println(" |");
System.out.print("\t\t\t");
for(int jj=0;jj<5*c;jj++)
System.out.print("-");
System.out.println();
}

for(m=0;m<r;m++)
{
for(n=0;n<c;n++)
{
i=m;
j=n;
s=0;
if(game[m][n]==88)
{
do
{
if(s==ns)
{
System.out.print(n1+" wins");
System.exit(0);
}
s++;
i--;
if(i==-1)
break;
}
while(game[i][j]==88&&i!=0);

i=m;
j=n;
s=0;
do
{
if(s==ns)
{
System.out.print(n1+" wins");
System.exit(0);
}
s++;
i++;
if(i==r)
break;
}
while(game[i][j]==88);

i=m;
j=n;
s=0;
do
{
if(s==ns)
{
System.out.print(n1+" wins");
System.exit(0);
}
s++;
j--;
if(j==-1)
break;
}
while(game[i][j]==88);

i=m;
j=n;
s=0;
do
{
if(s==ns)
{
System.out.print(n1+" wins");
System.exit(0);
}
s++;
j++;
if(j==c)
break;
}
while(game[i][j]==88);

i=m;
j=n;
s=0;
do
{
if(s==ns)
{
System.out.print(n1+" wins");
System.exit(0);
}
s++;
i--;
j--;
if(i==-1||j==-1)
break;
}
while(game[i][j]==88);

i=m;
j=n;
s=0;
do
{
if(s==ns)
{
System.out.print(n1+" wins");
System.exit(0);
}
s++;
i++;
j++;
if(i==r||j==c)
break;
}
while(game[i][j]==88);

i=m;
j=n;
s=0;
do
{
if(s==ns)
{
System.out.print(n1+" wins");
System.exit(0);
}
s++;
i--;
j++;
if(i==-1||j==c)
break;
}
while(game[i][j]==88);

i=m;
j=n;
s=0;
do
{
if(s==ns)
{
System.out.print(n1+" wins");
System.exit(0);
}
s++;
i++;
j--;
if(i==r||j==-1)
break;
}
while(game[i][j]==88); 
}
}
}


if(jjjj==m*n/2)
break a;
do
{
System.out.println("Its "+n2+"'s"+" turn");
rr=Integer.parseInt(ob.readLine());
rr--;
cc=Integer.parseInt(ob.readLine());
cc--;
}
while(game[rr][cc]!=32);
game[rr][cc]=79;
System.out.print("\t\t\t");
for(int zj=0;zj<5*c;zj++)
System.out.print("-");
System.out.println();
for(m=0;m<r;m++)
{
System.out.print("\t\t\t");
for(n=0;n<c;n++)
System.out.print(" | "+(char)(game[m][n]));
System.out.println(" |");
System.out.print("\t\t\t");
for(int jjj=0;jjj<5*c;jjj++)
System.out.print("-");
System.out.println();
}
for(m=0;m<r;m++)
{
for(n=0;n<c;n++)
{
i=m;
j=n;
s=0;
if(game[m][n]==79&&m!=0&&n!=0&&m!=r&&n!=c)
{
do
{
if(s==ns)
{
System.out.print(n2+" wins");
System.exit(0);
}
s++;
i--;
if(i==-1)
break;
}
while(game[i][j]==79);

i=m;
j=n;
s=0;
do
{
if(s==ns)
{
System.out.print(n2+" wins");
System.exit(0);
}
s++;
i++;
if(i==r)
break;
}
while(game[i][j]==79);

i=m;
j=n;
s=0;
do
{
if(s==ns)
{
System.out.print(n2+" wins");
System.exit(0);
}
s++;
j--;
if(j==-1)
break;
}
while(game[i][j]==79);

i=m;
j=n;
s=0;
do
{
if(s==ns)
{
System.out.print(n2+" wins");
System.exit(0);
}
s++;
j++;
if(j==c)
break;
}
while(game[i][j]==79);

i=m;
j=n;
s=0;
do
{
if(s==ns)
{
System.out.print(n2+" wins");
System.exit(0);
}
s++;
i--;
j--;
if(i==-1||j==-1)
break;
}
while(game[i][j]==79);

i=m;
j=n;
s=0;
do
{
if(s==ns)
{
System.out.print(n2+" wins");
System.exit(0);
}
s++;
i++;
j++;
if(i==r||j==c)
break;
}
while(game[i][j]==79);

i=m;
j=n;
s=0;
do
{
if(s==ns)
{
System.out.print(n2+" wins");
System.exit(0);
}
s++;
i--;
j++;
if(i==-1||j==c)
break;
}
while(game[i][j]==79);

i=m;
j=n;
s=0;
do
{
if(s==ns)
{
System.out.print(n2+" wins");
System.exit(0);
}
s++;
i++;
j--;
if(i==r||j==-1)
break;
}
while(game[i][j]==79);
}
}
}
}


System.out.println("Khichdi pak gyi");
}
}