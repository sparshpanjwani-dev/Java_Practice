import java.io.*;
class converter
{
public static void main(String ar[])throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
String infix, postfix, prefix,s1="";
int choice, i, l, j=0, k=0;
char c, answer[];
System.out.println("Enter the infix expression");
infix=ob.readLine();
System.out.println("To which do you want to convert your expression?-->"+"\n"+"1)Prefix Expression"+"\n"+"2)Postfix Expression");
choice=Integer.parseInt(ob.readLine());
l=infix.length();
for(i=0;i<l;i++)
{
c=infix.charAt(i);
if(c=='+')
s1=s1+"1";
else if(c=='-')
s1=s1+"2";
else if(c=='*')
s1=s1+"4";
else if(c=='/')
s1=s1+"5";
else if(c=='^')
s1=s1+"7";
else
s1=s1+c;
}
answer=new char[100];
System.out.println("New String"+s1);
if(choice==2)
{
for(i=0;i<s1.length();i++)
{
c=s1.charAt(i);
if(c>96&&c<123)
System.out.print(c);
else
{
answer[i]=c;
if(i!=0)
{
j=i;
k=j;
System.out.print(j);

while(answer[k-1]=='\u0000')
k--;
System.out.print(answer[k-1]);
if(Integer.parseInt(""+answer[k-1])==Integer.parseInt(""+answer[j])||Integer.parseInt(""+answer[k-1])==Integer.parseInt(""+answer[j]+1)||Integer.parseInt(""+answer[k-1])>Integer.parseInt(""+answer[j]))
{
if(Integer.parseInt(""+answer[k-1])==1)
System.out.print("+");
if(Integer.parseInt(""+answer[k-1])==2)
System.out.print("-");
if(Integer.parseInt(""+answer[k-1])==4)
System.out.print("*");
if(Integer.parseInt(""+answer[k-1])==5)
System.out.print("/");
if(Integer.parseInt(""+answer[k-1])==7)
System.out.print("^");
answer[k-1]='\u0000';
}
}
}
}
i=j;
while(i>=0)
{
if(answer[i]!='\u0000')
System.out.print(answer[i]);
i--;
}
}
}
}