import java.util.*;
class smallestbase
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
int m1=0, mx=0, my=0, xa[], ya[], xb=0, yb=0, n=0, n1=0, valuex=0, valuey=0;
String x="", y="";
char c='\u0000';
xa=new int[20];
ya=new int[20];
System.out.println("Enter two numbers");
x=sc.nextLine();
y=sc.nextLine();
for(int i=0;i<x.length();i++)
{
m1=(int)(x.charAt(i));
if(m1>mx)
{
mx=m1;
m1=0;
}
m1=0;
}
for(int i=0;i<y.length();i++)
{
m1=(int)(y.charAt(i));
if(m1>my)
{
my=m1;
m1=0;
}
m1=0;
}
mx-=47;
my-=47;

xb=mx;
yb=my;
n=x.length()-1;
for(int i=0;i<=20;i++)
{

while(n>-1)
{
valuex+=((int)(x.charAt(n))-48)*Math.pow(xb,n1);
n1++;
n--;
}
n1=0;
n=y.length()-1;
while(n>-1)
{
valuey+=((int)(y.charAt(n))-48)*Math.pow(yb,n1);
n1++;
n--;
}
n1=0;
if(valuey==valuex)
{
System.out.println(x+"(base"+xb+")="+y+"(base"+yb+")");
System.exit(0);
}
xa[xb]=valuex;
ya[yb]=valuey;

if(xb<=20)
xb++;
if(yb<=20)
yb++;
if(xb==20&&yb==20)
break;

}

for(int i=0;i<21;i++)
{
for(int j=0;j<21;j++)
{
if(xa[i]==ya[j]&&xa[i]!=0)
{
System.out.println(x+"(base"+i+")="+y+"(base"+j+")");
System.exit(0);
}
}
}
}
}

