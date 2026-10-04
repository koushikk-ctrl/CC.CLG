import java.util.Scanner;
class Ei{
int getEquilibriumIndex(int a[]){
int totalSum=0;
for(int i=0;i<a.length;i++){
totalSum=totalSum+a[i];
}
int leftSum = 0;
for(int i=0;i<a.length;i++){
int rightSum=totalSum-leftSum-a[i];
if(leftSum==rightSum){
return i;
}
leftSum=leftSum+a[i];
}
return -1;
}
public static void main(String[]agrs)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Size of Array:");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter Array Element:");
for(i=0;i<a.length;i++){
int a[i]=sc.nextInt();
}
try{
Ei E1=new Ei();
int n=E1.getEquilibriumIndex(a);
if(n!=-1)
{
System.out.println("Equivilance index found"+n);
}
else
{
System.out.println("No Equivilance index");
}
}
catch(NullPointerException e){
System.err.println("Hello User!!");
System.err.println("This Array is Empty Please Enter Elements.......");
}
}
}
