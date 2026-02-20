class Node
{
public int a;
public Node N;
public Node(int P)
{
a=P;
N=null;
}
}

class x
{
private Node L1;
public void add(int M)
{
L1=add(M,L1);
}
Node add(int P, Node K)
{
if(K==null)
{
K=new Node(P);
return K;
}
else 
{
K.N=add(P,K.N);
return K;
}
}
}

class linkedlistr
{
public static void main(String ar[])
{
x x1=new x();
x1.add(2);
}
}