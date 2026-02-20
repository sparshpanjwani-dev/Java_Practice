import java.io.*;
class rec
{
private int adj[][], c1, c2, s, n, ncheck;
public int find(int adj[][], int s,int c1, int c2)
{
this.s=s;
this.adj=adj;
this.c1=c1;
this.c2=c2;
if(n==s)
{
return ncheck;
}
while(n!=s)
{
if(adj[c1-1][n]!=0)
{
ncheck=c2;
if(adj[c1-1][c2-1]==1&&adj[c2-1][c1-1]==1)
return 0;
