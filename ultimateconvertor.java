import java.io.*;
class ultimateconvertor
{
String dtb(int v)
{
int a=0;
String s="";
while(v!=0)
{
a=v%2;
s=a+s;
v=v/2;
}
return s;
}
String dto(int v)
{
int a=0;
String s="";
while(v!=0)
{
a=v%8;
s=a+s;
v=v/8;
}
return s;
}
double hdtd(String vs)
{
double s1=0.0;
String s="";
int n=0;
for(int i=vs.length();i>0;i--)
{
s=vs.substring(i-1,i);
if(s.equals("A"))
s1=s1+10*Math.pow(16,n);
else if(s.equals("B"))
s1=s1+11*Math.pow(16,n);
else if(s.equals("C"))
s1=s1+12*Math.pow(16,n);
else if(s.equals("D"))
s1=s1+13*Math.pow(16,n);
else if(s.equals("E"))
s1=s1+14*Math.pow(16,n);
else if(s.equals("F"))
s1=s1+15*Math.pow(16,n);
else
s1=s1+Integer.parseInt(s)*Math.pow(16,n);
n++;
}
return s1;
}
String dthd(int v)
{
int a=0;
String s="";
while(v!=0)
{
a=v%16;
if(a<10)
s=a+s;
else if(a==10)
s="A"+s;
else if(a==11)
s="B"+s;
else if(a==12)
s="C"+s;
else if(a==13)
s="D"+s;
else if(a==14)
s="E"+s;
else
s="F"+s;
v=v/16;
}
return s;
}
double btd(int v)
{
double s1=0.0;
int a=0, n=0;
while(v!=0)
{
a=v%10;
s1=s1+a*Math.pow(2,n);
n++;
v=v/10;
}
return s1;
}
double otd(int v)
{
double s1=0.0;
int a=0, n=0;
while(v!=0)
{
a=v%10;
s1=s1+a*Math.pow(8,n);
n++;
v=v/10;
}
return s1;
}

public static void main(String ar[])throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
int ch, v=0, bdi=0, bdi2=0, cc=0, aaa=0, bb=0, check1=0, i, v2=0;
double s1=0.0, bd=0.0;
String s="", vs="", b="", check2="", ii="", sum="";
char iii='\u0000';
System.out.println("What function do you want to perform? \n1)Decimal to Binary\n2)Decimal to Octal\n3)Decimal to HexaDecimal\n4)Binary to Decimal\n5)Octal to Decimal\n6)HexaDecimal to Decimal\n7)Binary to Octal\n8)Binary to HexaDecimal\n9)Octal to Binary\n10)Octal to HexaDecimal\n11)HexaDecimal to Octal\n12)HexaDecimal to Binary\n13)BinaryAddition using 1's Complement\n14)BinaryAddition using 2's Complement\n15)Binary Multiplication\n16)Octal Addition\n17)Octal Multiplication\n18)HexaDecimal Addition\n19)HexaDecimal Multiplication");
ch=Integer.parseInt(ob.readLine());
if(ch>19||ch<1)
{
System.out.print("Option Does Not Exists");
System.exit(0);
}
System.out.println("Enter the value to be Converted");
if(ch==6||ch==11||ch==12)
vs=ob.readLine();

if(ch==4||ch==7||ch==8)
{
while(check1!=-1)
{
check2="";
v=Integer.parseInt(ob.readLine());
check2+=v;
for(i=2;i<=9;i++)
{
ii+=i;
check1=check2.indexOf(ii);
ii="";
if(check1!=-1)
break;
}
}
check2="";
check1=0;
}

else if(ch==5||ch==9||ch==10)
{
while(check1!=-1)
{
check2="";
v=Integer.parseInt(ob.readLine());
check2+=v;
for(i=8;i<=9;i++)
{
ii+=i;
check1=check2.indexOf(ii);
ii="";
if(check1!=-1)
break;
}
}
check2="";
check1=0;
}

else if(ch==6||ch==11||ch==12)
{
while(check1!=-1)
{
vs=ob.readLine();
for(iii='G';iii<='Z';iii++)
{
check1=vs.indexOf(iii);
if(check1!=-1)
break;
}
}
check1=0;
}

else if(ch==13)
{
System.out.println("Enter 2 Binary numbers");
while(check1!=-1)
{
check2="";
v=Integer.parseInt(ob.readLine());
check2+=v;
for(i=2;i<=9;i++)
{
ii+=i;
check1=check2.indexOf(ii);
ii="";
if(check1!=-1)
break;
}
}
check2="";
check1=0;
while(check1!=-1)
{
check2="";
v2=Integer.parseInt(ob.readLine());
check2+=v2;
for(i=2;i<=9;i++)
{
ii+=i;
check1=check2.indexOf(ii);
ii="";
if(check1!=-1)
break;
}
}
check2="";
check1=0;
}
ultimateconvertor aa=new ultimateconvertor();
switch(ch)
{
case 1:
b=aa.dtb(v);
break;
case 2:
b=aa.dto(v);
break;
case 3:
b=aa.dthd(v);
break;
case 4:
bd=aa.btd(v);
break;
case 5:
bd=aa.otd(v);
break;
case 6:
bd=aa.hdtd(vs);
break;
case 7:
bd=aa.btd(v);
bdi=(int)bd;
b=aa.dto(bdi);
break;
case 8:
bd=aa.btd(v);
bdi=(int)bd;
b=aa.dthd(bdi);
break;
case 9:
bd=aa.otd(v);
bdi=(int)bd;
b=aa.dtb(bdi);
break;
case 10:
bd=aa.otd(v);
bdi=(int)bd;
b=aa.dthd(bdi);
break;
case 11:
bd=aa.hdtd(vs);
bdi=(int)bd;
b=aa.dto(bdi);
break;
case 12:
bd=aa.hdtd(vs);
bdi=(int)bd;
b=aa.dtb(bdi);
break;
case 13:
while(v!=0&&v2!=0)
{
aaa=v%10;
bb=v2%10;
v/=10;
v2/=10;
cc=aaa+bb+cc;
sum=cc%2+sum;
cc/=2;
}
while(cc!=0)
{
sum=cc%2+sum;
cc/=2;
}
break;
}

if(ch>3&&ch<7)
System.out.print(bd);
else if(ch==13)
System.out.print(sum);
else
System.out.print(b);
}
}
