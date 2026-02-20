import java.util.*;
class paragraph
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
String s,st,stt,si="";
int a,a2,l="";
char c
System.out.println(" ENTER A PARAGRAPH----------------->>>>>>>>> ");
s=sc.nextLine();
st=s;
stt=s;
StringTokenizer s1=new StringTokenizer(st,"?!.");
StringTokenizer s2=new StringTokenizer(stt," _");
a=s1.countTokens();
a2=s2.countTokens();
System.out.println(" NO. OF SENTENCES "+a);
for(int x=1; x<=a2; x++)
{
si=s2.nextToken();
for(int i=0;i<si.length();i++)
{
c=sc.charAt(0);
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'

}
}