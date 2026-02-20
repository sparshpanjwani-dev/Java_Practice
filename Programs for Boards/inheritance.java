import java.io.*;
abstract class x
{
abstract void out();
void in()
{
System.out.print("Dance");
}
}
class y extends x
{
void out()
{
System.out.println("hi");
}
}
class inheritance
{
public static void main(String ar[])throws Exception
{

x x1=new y();
x1.out();
x1.in();
}
}
