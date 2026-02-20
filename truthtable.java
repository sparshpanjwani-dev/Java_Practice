import java.io.*;
class truthtable
{
public static void main(String ar[])throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
int tt[][], r=5, c=3, i, j, checker=0, ch=0, maker=0, z=0;
String e="", sub="";
System.out.println("Enter the expression");
e=ob.readLine();

for(i=0;i<e.length();i++)
{
if(e.charAt(i)=='\''&&e.charAt(i-1)=='A')
{
c++;
checker+=1;
break;
}
}
for(i=0;i<e.length();i++)
{
if(e.charAt(i)=='\''&&e.charAt(i-1)=='B')
{
checker+=2;
c++;
break;
}
}

if(e.substring(0,e.indexOf("+")-1).equals(e.substring(e.indexOf("+")+1,e.length()-1)))
c++;
else
c+=2;

tt=new int[r][c];
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
if((j==0&&(i>0&&i<=2))||(j==1&&(i==1||i==3)))
tt[i][j]=0;
else 
tt[i][j]=1;
}
}
tt[0][0]=65;
tt[0][1]=66;
if(checker==1)
{
tt[0][2]=65;
for(i=1;i<=4;i++)
{
if(tt[i][0]==1)
tt[i][2]=0;
else 
tt[i][2]=1;
}
}
if(checker==2)
{
tt[0][2]=66;
for(i=1;i<=4;i++)
{
if(tt[i][1]==1)
tt[i][2]=0;
else 
tt[i][2]=1;
}
}
if(checker==3)
{
tt[0][2]=65;
tt[0][3]=66;
for(i=1;i<=4;i++)
{
if(tt[i][0]==1)
tt[i][2]=0;
else 
tt[i][2]=1;
if(tt[i][1]==1)
tt[i][3]=0;
else
tt[i][3]=1;
}
}

if(tt[0][2]==65)
tt[0][2]=1065;
if(tt[0][2]==66)
tt[0][2]=1066;


if(tt[0][3]==65)
tt[0][3]=1065;
if(tt[0][3]==66)
tt[0][3]=1066;

if(e.substring(0,e.indexOf("+")-1).equals(e.substring(e.indexOf("+")+1,e.length()-1)))
{
while(e.charAt(z)=='+')
{
if(tt[0][maker]!=1)
maker++;
tt[0][maker]=0;
if(e.charAt(z)=='A')
if(e.charAt(z+1)=='\'')
tt[0][maker]=5;
else 
tt[0][maker]=65;

if(e.charAt(z)=='B')
if(e.charAt(z+1)=='\'')
tt[0][maker]+=10;
else
tt[0][maker]=66;
z++;
}
}


for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
if(tt[i][j]==1065)
System.out.print("A'   ");
else if(tt[i][j]==1066)
System.out.print("B'   ");
else if(tt[i][j]==70)
System.out.print("AA'  ");
else if(tt[i][j]==76)
System.out.print("BB'  ");
else if(tt[i][j]==130)
System.out.print("AA");
else if(tt[i][j]==132)
System.out.print("BB");
else if(tt[i][j]>64)
System.out.print((char)(tt[i][j])+"    ");
else
System.out.print(tt[i][j]+"    ");
}
System.out.println();
}
}
}