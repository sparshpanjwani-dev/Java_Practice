import java.io.*;
class crossword
{
public static void main(String ar[])throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
int r, c, i, j, nw=0, l=0, m, n, a1=0, a2=0, a3=0, a4=0, a5=0, a6=0,a7=0, a8=0, b1=0, b2=0, b3=0, b4=0, b5=0, b6=0, b7=0, b8=0;
String crossword[][], words="", new_s1="", new_s2="", new_s3="", new_s4="", new_s5="", new_s6="", new_s7="", new_s8="", finall="";
System.out.println("Enter dimensions of the array");
r=Integer.parseInt(ob.readLine());
c=Integer.parseInt(ob.readLine());
System.out.println("Enter number of words");
nw=Integer.parseInt(ob.readLine());
crossword=new String[r][c];
System.out.println("Enter CrossWord");
for(m=0;m<r;m++)
{
for(n=0;n<c;n++)
crossword[m][n]=ob.readLine();
}

for(m=0;m<r;m++)
{
System.out.print("\t\t\t|");
for(n=0;n<c;n++)
{
System.out.print(crossword[m][n]+" | ");
}
System.out.println();
}


for(i=0;i<nw;i++)
{
System.out.println("Enter word ("+(i+1)+")");
words=ob.readLine();

l=words.length();
a:for(m=0;m<r;m++)
{
for(n=0;n<c;n++)
{
a1=m;
a2=m;
a3=m;
a4=m;
a5=m;
a6=m;
a7=m;
a8=m;
b1=n;
b2=n;
b3=n;
b4=n;
b5=n;
b6=n;
b7=n;
b8=n;
new_s1=crossword[a1][b1];
new_s2=crossword[a2][b2];
new_s3=crossword[a3][b3];
new_s4=crossword[a4][b4];
new_s5=crossword[a5][b5];
new_s6=crossword[a6][b6];
new_s7=crossword[a7][b7];
new_s8=crossword[a8][b8];
for(j=1;j<l;j++)
{
try
{
new_s1=new_s1+crossword[++a1][b1];
}
catch(Exception zz)
{
}
try
{
new_s2=new_s2+crossword[--a2][b2];
}
catch(Exception zz)
{
}
try
{
new_s3=new_s3+crossword[a3][++b3];
}
catch(Exception zz)
{
}
try
{
new_s4=new_s4+crossword[a4][--b4];
}
catch(Exception zz)
{
}
try
{
new_s5=new_s5+crossword[++a5][++b5];
}
catch(Exception zz)
{
}
try
{
new_s6=new_s6+crossword[++a6][--b6];
}
catch(Exception zz)
{
}
try
{
new_s7=new_s7+crossword[--a7][++b7];
}
catch(Exception zz)
{
}
try
{
new_s8=new_s8+crossword[--a8][--b8];
}
catch(Exception zz)
{
}

}

if(new_s1.equals(words)||new_s2.equals(words)||new_s3.equals(words)||new_s4.equals(words)||new_s5.equals(words)||new_s6.equals(words)||new_s7.equals(words)||new_s8.equals(words))
{
finall=finall+words+'\t'+"yes"+'\n';
break a;
}

}
}


if(new_s1.equals(words)||new_s2.equals(words)||new_s3.equals(words)||new_s4.equals(words)||new_s5.equals(words)||new_s6.equals(words)||new_s7.equals(words)||new_s8.equals(words))
finall=finall;
else
finall=finall+words+'\t'+"no"+'\n';
words="";
}
System.out.println(finall);
}
}