class Array3{
public static void main(String[]args){
int x=20;
int count=0;
int a[]={10,20,30,20,50};
for(int i=0; i<5; i++)
{
if(a[i]==x)
{
count++;
}
}
System.out.println(x+" occurs "+count+" Times");
}
}