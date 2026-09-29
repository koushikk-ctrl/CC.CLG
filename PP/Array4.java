class Array4{
public static void main(String[]args){
int x=20;
int temp=0;
int a[]={10,20,30,20,50,20};
System.out.print("Indices:");
for(int i=0; i<6; i++)
{
if(a[i]==x)
{
temp = i;
System.out.print("  "+temp);
}
}
}
}