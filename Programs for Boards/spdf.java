import java.io.*;
class spdf
{
public static void main(String ar[])throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
String orbital[];
int a, i, p=0;
orbital=new String[14];
orbital[0]="1s2";
orbital[1]="2s2";
orbital[2]="2p6";
orbital[3]="3s2";
orbital[4]="3p6";
orbital[5]="4s2";
orbital[6]="3d10";
orbital[7]="4p6";
orbital[8]="5s2";
orbital[9]="4d10";
orbital[10]="5p6";
orbital[11]="4f14";
orbital[12]="5d10";
orbital[13]="5f14";
System.out.println("Enter atomic number of  the element");
a=Integer.parseInt(ob.readLine());
for(i=0;i<14;i++)
{
if(orbital[i].length()==3)
p=Integer.parseInt(orbital[i].charAt(2)+"");
else 
{
p=Integer.parseInt(orbital[i].charAt(2)+""+orbital[i].charAt(3)+"");
}
if(a>=p)
{
System.out.print(orbital[i]+" ");
a-=p;
if(a==0)
System.exit(0);
}
else 
{
System.out.print(orbital[i].substring(0,2)+a);
System.exit(0);
}
}
}
}