import java.util.*;
class painting
{
Scanner sc=new Scanner(System.in);
protected double wallarea;
protected int colorcode;
public painting(double wallarea, int colorcode)
{
this.wallarea=wallarea;
this.colorcode=colorcode;
}
public void Pdata()
{
System.out.println("Enter correct new area and colorcode");
wallarea=sc.nextDouble();
colorcode=sc.nextInt();
}

public void Pview()
{
System.out.println("Wall Area="+wallarea+"\nColorCode="+colorcode);
}
}

class Billing extends painting
{
private int charges;
private int sid;
private String address;
public Billing(double wallarea, int colorcode, int sid, String address)
{
super(wallarea,colorcode);
this.sid=sid;
this.address=address;
}
public void calculate()
{
if(wallarea<100&&(colorcode>=1000&&colorcode<=2000))
charges=1200;
else if(wallarea<200&&(colorcode>2000&&colorcode<=2500))
charges=1500;
else if(wallarea>=200&&(colorcode>2500&&colorcode<=3500))
charges=2000;
}
public void display()
{
charges+=charges+((18*charges)/100);
System.out.println("SID "+sid+"\nAddress "+address+"\nCharges="+charges);
}
}

class paintingcharges
{
public static void main(String ar[])throws Exception
{
Scanner sc=new Scanner(System.in);
double wallarea=0.0;
int colorcode=0, sid=0;
String address="";
char choice='\u0000';
System.out.println("Enter wallarea, colorcode, SID, and your address");
wallarea=sc.nextDouble();
colorcode=sc.nextInt();
sid=sc.nextInt();
address=sc.nextLine();
Billing b=new Billing(wallarea,colorcode,sid,address);
b.Pview();
System.out.println("Is your given wallarea and colorcode correct? Y:Yes N:No");
sc.nextInt();
choice=sc.next().charAt(0);
while(choice!='Y')
{
b.Pdata();
b.Pview();
System.out.println("Is your given wallarea and colorcode correct? Y:Yes N:No");
sc.nextInt();
}
b.calculate();
b.display();
}
}
