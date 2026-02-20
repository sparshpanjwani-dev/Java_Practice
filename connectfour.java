import java.io.*;
class connectfour
{
public static void main(String ar[])throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
int r, c, cc, game[][], c1, c2, rr, i, j, m, n=0, rrr, ccc, w=0, ii;
char c11, c22;
System.out.println("Enter the size of the area where you want to play the game");
r=Integer.parseInt(ob.readLine());
c=Integer.parseInt(ob.readLine());
game=new int[r][c];
System.out.println("Player 1, choose your colour---> \n R:Red \n B:Blue \n G:Green \n O:Orange \n Y:Yellow");
c11=ob.readLine().charAt(0);
System.out.println("Player 2, choose your colour---> \n R:Red \n B:Blue \n G:Green \n O:Orange \n Y:Yellow");
c22=ob.readLine().charAt(0);
c1=(int)c11;
c2=(int)c22;
rr=r;
for(ii=0;ii<r*c;ii++)
try
{
System.out.println("Player 1, Its your turn, enter the column");
cc=Integer.parseInt(ob.readLine());
cc--;
while(game[rr][cc]!=0)
rr--;
game[rr][cc]=c1;
while(game[rr++][cc]==c1)
n++;
if(n>=4)
{
w=1;
break;
}
n=0;
while(game[rr--][cc]==c1)
n++;
if(n>=4)
{
w=1;
break;
}
n=0;
while(game[rr][cc++]==c1)
n++;
if(n>=4)
{
w=1;
break;
}
n=0;
while(game[rr][cc--]==c1)
n++;
if(n>=4)
{
w=1;
break;
}
n=0;
while(game[rr++][cc--]==c1)
n++;
if(n>=4)
{
w=1;
break;
}
n=0;
while(game[rr++][cc++]==c1)
n++;
if(n>=4)
{
w=1;
break;
}
n=0;
while(game[rr--][cc++]==c1)
n++;
if(n>=4)
{
w=1;
break;
}
n=0;
while(game[rr--][cc--]==c1)
n++;
if(n>=4)
{
w=1;
break;
}
n=0;
System.out.println("Player 2, Its your turn, enter the column");
cc=Integer.parseInt(ob.readLine());
cc--;
rr=r-1;
while(game[rr][cc]!=0)
rr--;
game[rr][cc]=c2;
while(game[rr++][cc]==c2)
n++;
if(n>=4)
{
w=2;
break;
}
n=0;
while(game[rr--][cc]==c2)
n++;
if(n>=4)
{
w=2;
break;
}
n=0;
while(game[rr][cc++]==c2)
n++;
if(n>=4)
{
w=2;
break;
}
n=0;
while(game[rr][cc--]==c2)
n++;
if(n>=4)
{
w=2;
break;
}
n=0;
while(game[rr++][cc--]==c2)
n++;
if(n>=4)
{
w=2;
break;
}
n=0;
while(game[rr++][cc++]==c2)
n++;
if(n>=4)
{
w=2;
break;
}
n=0;
while(game[rr--][cc++]==c2)
n++;
if(n>=4)
{
w=2;
break;
}
n=0;
while(game[rr--][cc--]==c2)
n++;
if(n>=4)
{
w=2;
break;
}
n=0;
}
catch(Exception mm)
{
}

for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
if(game[i][j]!=0)
{
if(w==1)
System.out.print("| "+c11+" | ");
else if(w==2)
System.out.print("| "+c22+" | ");
}
else
System.out.print("|   | ");
}
System.out.println();
for(m=0;m<r;m++)
System.out.print("----");
System.out.println();
}

}
}