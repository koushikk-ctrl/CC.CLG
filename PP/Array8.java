class Array8{
public static void main(String[]args){
int a[]={10,20,30,40,20,50,60};
int x=20;
for(int i=0;i<a.length;i++){
if(a[i]==x)
{
for(int j=i; j<a.length-1; j++){
a[j]=a[j+1];
}
}
}
for(int i=0;i<a.length-1;i++){
System.out.print(a[i]+" ");
}
}
}