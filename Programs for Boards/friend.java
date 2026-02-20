import java.io.*;
class friend
{
String f[][], m="", n="", mc="", nc="";
int pairs, i, j, z=0;
System.out.println("How many pairs you want to input?");
pairs=Integer.parseInt(ob.readLine());
f[][]=new String[pairs][pairs];
for(i=0;i<pairs;i++)
{
System.out.println("__is a friend of__");
m=ob.readLine();
n=ob.readLine();
for(j=0;j<=i;j++)
{
if(n.equals(f[j][0].charAt(0)))
{
while(f[j][z]!=null)
z++;
f[j][z]=n+m;
}
else
f[i][0]=n+m;
}
z=0;
}
System.out.println("You want to check if __ is a friend of __");
mc=ob.readLine();
nc=ob.readLine();
for(i=0;i<pairs;i++)
{
while(f[i][z]!=null)
{
if(f[i][z].indexOf(1).equals(mc))
{
for(j=0;j<pairs;j++)
{
if(f[j][0].equals(nc))
{
for(k=0;k<pairs;k++)
{
while(f[j][zz]!=null)
{
if(