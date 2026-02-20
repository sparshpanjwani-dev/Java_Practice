import java.io.*;
import java.util.*;
class day
{
public static void main(String ar[])throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
int i, j, m, d, y, dn=0;
String date, day;
System.out.print("Date:");
date=ob.readLine();
StringTokenizer st=new StringTokenizer(date,"/-."); //to break the string separated by /-, 	
d=Integer.parseInt(st.nextToken());//to get day from date
m=Integer.parseInt(st.nextToken());//to get month from date
y=Integer.parseInt(st.nextToken());//to get year from date
System.out.print("Day on 1st January:");
day=ob.readLine();
if(day.equalsIgnoreCase("Monday"))
dn=1;
if(day.equalsIgnoreCase("Tuesday"))
dn=2;
if(day.equalsIgnoreCase("Wednesday"))
dn=3;
if(day.equalsIgnoreCase("Thursday"))
dn=4;
if(day.equalsIgnoreCase("Friday"))
dn=5;
if(day.equalsIgnoreCase("Saturday"))
dn=6;
if(day.equalsIgnoreCase("Sunday"))
dn=7;
for(i=1;i<=m-1;i++)//modifying day after odd ordered months
{
if(i==1||i==3||i==5||i==7||i==8||i==10||i==12)
dn+=3;
else if(i==2)//modifying day after even ordered months
if((y%100==0&&y%400==0)||(y%100!=0&&y%4==0))//checking leap years
dn+=1;
else 
dn+=0;
else
dn+=2;
}
dn=dn+d-1;//modifying date
dn=dn%7;//checking the day on the given date
if(dn==1)
System.out.print("Monday");
else if(dn==2)
System.out.print("Tuesday");
else if(dn==3)
System.out.print("Wednesday");
else if(dn==4)
System.out.print("Thursday");
else if(dn==5)
System.out.print("Friday");
else if(dn==6)
System.out.print("Saturday");
else 
System.out.print("Sunday");
}
}

