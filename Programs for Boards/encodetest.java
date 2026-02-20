import java.util.*;
class decode
{
private String word, new_word;
private int length;
public decode()
{
word="";
new_word="";
length=0;
}

public void acceptWord()
{
Scanner sc=new Scanner(System.in);
word=sc.nextLine();
}
public void findWord()
{
int m1=0, m2=0, c=1;
String bin="";
word+=" ";
length=word.length();
m2=(int)(word.charAt(0))-96;
for(int i=0;i<length;i++)
{
m1=(int)(word.charAt(i))-96;
if(m2==m1)
{
if(c==m1)
{
new_word+=word.charAt(i);
if(i+1<length)
m2=(int)(word.charAt(i+1))-96;
c=1;
bin="";
}
else
{
c++;
bin+=word.charAt(i);
}
}
else if(m2!=m1&&c!=1)
{
new_word+=bin;
bin="";
m2=m1;
c=1;
}
}
}

public void display()
{
System.out.println("Input Word: "+word);
System.out.print("Encoded Word: "+new_word);
}
}
class encodetest
{
public static void main(String ar[])
{
decode d=new decode();
d.acceptWord();
d.findWord();
d.display();
}
}
          