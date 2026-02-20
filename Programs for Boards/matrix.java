import java.io.*;
class Arr
{
int A[][], R, C,m,n;

Arr(int R, int C)
{
this.R=R;
this.C=C;
A=new int[R][C];
}

void read();
{
DataInputStream ob=new DataInputStream(System.in);
int m,n;
System.out.println("Enter matrix");
for(int m=0;m<this.R;m++)
for(int n=0;n<this.C;n++)
A[m][n]=Integer.parseInt(ob.readLine());
}

Arr read(Arr p)
{
int m,n;
Arr y=new Arr(R,C);
for(int m=0;m<this.R;m++)
{
for(int n=0;n<this.C;n++)
{
y.A[m][n]=this.A[m][n]+p.A[m][n];
}
}
return y;
}
}
void disp()
{
int m,n;
System.out.println("SUM OF THE MAATRIX");
for(int m=0;m<this.R;m++)
{
for(int n=0;n<this.C;n++)
{
System.out.print(this.A[x][y]);
}
System.out.println();
}

class matrix
{
public static void main(String ar[])throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
int r, c, S[][];
System.out.println("Enter dimensions of both the matrixes, number of rows and columns");
r=Integer.parseInt(ob.readLine());
c=Integer.parseInt(ob.readLine());
Arr A1=new Arr(r,c);
Arr A2=new Arr(r,c);
A1.read();
A2.read();
A3=A1.add(A2);
A3.display();
}
}