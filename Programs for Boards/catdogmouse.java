import java.io.*;
class catdogmouse
{
public static void main(String ar[])throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
int lines=0,i, m, n, jump=0, catr=0, catc=0, rr=0, cc=0;
String game[][], s;
System.out.println("Enter number of lines");
lines=Integer.parseInt(ob.readLine());
System.out.println("Enter Map");
s=ob.readLine();

game=new String[lines][(s.length()/2)+1];
game[0]=s.split(" ");
for(i=1;i<lines;i++)
{
s=ob.readLine();
game[i]=s.split(" ");
}

for(m=0;m<lines;m++)
{
for(n=0;n<s.length()/2-1;n++)
System.out.print(game[m][n]+" ");
System.out.println();
}

for(m=0;m<lines;m++)
{
for(n=0;n<s.length()/2+1;n++)
if(game[m][n].equals("C"));
{
catr=m;
catc=n;
}
}

m=0;
n=0;
System.out.println("How long can the Cat Jump?");
jump=Integer.parseInt(ob.readLine());
while(m!=catr && n!=catc)
{
rr=m+jump;
if(rr>=lines)
rr=rr-lines;
while(rr!=m)
{
if(game[rr][cc].equals("M")||game[rr+1][cc].equals("M")||game[rr][cc].equals("M"))
{
System.out.print("Caught");
System.exit(0);
}
else
{
rr+=jump;
if(rr>=lines)
rr-=lines;
}

cc=n+jump;
if(cc>=s.length()/2+1)
cc-=s.length()/2+1;
while(cc!=n)
{
if(game[m][cc].equals("M")||game[m][cc+1].equals("M")||game[m][cc-1].equals("M"))
{
System.out.print("Caught");
System.exit(0);
}
else
{
cc+=jump;
if(cc>=s.length()/2+1)
cc-=s.length()/2+1;
}
}


cc=n-jump;
if(cc<=0)
cc+=s.length()/2-1;
while(cc!=n)
{
if(game[m][cc].equals("M")||game[m][cc+1].equals("M")||game[m][cc-1].equals("M"))
{
System.out.print("Caught");
System.exit(0);
}
else
{
cc-=jump;
if(cc<=0)
cc+=s.length()/2-1;
}
}
}
}



for(m=0;m<s.length()/2+1;m++)
{
for(n=0;n<lines;n++)
System.out.print(game[m][n]+" ");
System.out.println();
}
}
}