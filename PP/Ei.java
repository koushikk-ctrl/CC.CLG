class Ei{
int getLeftSum(int a[],int i)
{
int sum = 0;
for(int j=0;j<i;j++){
sum=sum+a[j];
}
return sum;
}
int getRightSum(int a[],int i)
{
int sum = 0;
for(int j=i+1;j<a.length;j++){
sum=sum+a[j];
}
return sum;
}
public static void main(String[]agrs)
{
int a[]={10,20,30,40,50,10};
Ei E1=new Ei();
for(int i=0;i<=a.length;i++)
{
int n=E1.getLeftSum(a,i);
int m=E1.getRightSum(a,i);
if(n==m)
{
System.out.println("Equivilance index found"+i);
}
else
{
System.out.println("Not Equivilance index"+i);
}
}
}
}