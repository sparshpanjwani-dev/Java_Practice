import java.util.*;
class Product
{
protected String name;
protected int code;
protected double amount;
public Product(String m, int c, double a)
{
name=m;
code=c;
amount=a;
}
public void show()
{
System.out.println("Name: "+name+"\nCode: "+code+"\nAmount: "+amount);
}
}

class Sales extends Product
{
private int dayy, codee;
private double tax, amountt;
private String namee;
public Sales(String name, int code, double amount, int day)
{
super(name, code, amount);
namee=name;
codee=code;
amountt=amount;
dayy=day;

}
public void compute()
{
tax=12.5*amount/100;
amount=amount+tax;
if(dayy>30)
amount=amount+(2.5*amount/100);
}
public void show()
{
super.show();
System.out.println("\nAmount after tax and fine(if Days taken for payment are more than 30): "+amount+"\nTax: "+tax+"\nNo. of days taken for payment: "+dayy);
}
}

class productsale
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
String name;
int code, day;
double amount;
System.out.println("Enter name of customer");
name=sc.next();
System.out.println("Enter code of the product");
code=sc.nextInt();
System.out.println("Enter amount of the product");
amount=sc.nextDouble();
System.out.println("Enter number of days after which the payment is done");
day=sc.nextInt();
Sales s=new Sales(name, code, amount, day);
s.compute();
s.show();
}
}