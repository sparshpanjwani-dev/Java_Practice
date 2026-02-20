import java.util.*;
class  palendrome
{
publlic static void main(String ag[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String");
String u=sc.nextLine();
String S=u.toUpperCase();
int l=S.length();
StringBuffer SB=new StringBuffer(S);
String s=SB.reverse(S);
String s=SB.toString();
int m=0;
for(int i=1;i<=l;i++)
{
char c=S.charAt(m);
char d=S.charAt(i);
if(c.equals(d))
{
String j=S.substring(m,i+1);
}
else
m++;
}
int e=0;
for(int i=1;i<=l;i++)
{
char t=s.charAt(e);
char y=S.charAt(i);
if(t.equals(y))
{
String r=S.substring(e,i+1);
}
else
e++;
}
if(j.equals(r)
System.out.println("Palendrome is="+j);
}
}