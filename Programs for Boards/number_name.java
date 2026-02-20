import java.util.*;
class number_name
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
String units[]={"", "one", "two", "three", "four", "five"," six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
String tens[]={"", "" ,"twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
String numbername="";
int number=0;
System.out.println("Enter number upto 1 Arab :");
number=sc.nextInt();

if(number==0)
{
System.out.println("0");
}
else
{
if(number<0||number>=1000000000)
numbername="Range Issues";
else if(number>=199999999)
{
numbername+=tens[number/100000000]+" "+units[(number%100000000)/10000000]+" crore ";
number%=10000000;
}
if(number>=10000000)
{
numbername+=units[number/10000000]+" crore ";
number%=10000000;
}
if(number>=1999999)
{
numbername+=tens[number/1000000]+" "+units[(number%1000000)/100000]+" lakh ";
number%=100000;
}
if(number>=100000)
{
numbername+=units[number/100000]+" lakh ";
number%=100000;
}
if(number>=19999)
{
numbername+=tens[number/10000]+" "+units[(number%10000)/1000]+" thousand ";
number%=1000;
}
if(number>=1000)
{
numbername+=units[number/1000]+" thousand ";
number%=1000;
}
if(number>=100)
{
numbername+=units[number/100]+" hundred ";
number%=100;
}
if(number>=19)
{
numbername+=tens[number/10]+" "+units[number%10]+" ";
number/=100;
}
if(number>0)
{
numbername+=units[number]+" ";
}
}
System.out.println(Character.toUpperCase((char)(numbername.charAt(0)))+numbername.substring(1,numbername.length()));
}
}