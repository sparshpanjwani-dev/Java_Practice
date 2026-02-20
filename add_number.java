import java.util.*;
class add_number
{
public static void spesh(int y,int z,int c)
{
if(y==0)
{
return;
}
else
{
for(int x=0 ; x<c ; x++)
System.out.print(" 1 ");
c++;
System.out.println(" "+(y)+" ");
if(y!=1)
System.out.print(z);
spesh(y-1,z,c);
return ;
} 
}
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE NUMBER");
int n=sc.nextInt();
int a=n;
int b=0;
for(int x=1;x<=n/2;x++)
{
System.out.print(x);
spesh(a-1,x,b);
System.out.println();
a--;
}
}
}