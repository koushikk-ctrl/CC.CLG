class Array2{
public static void main(String[]args){
int a[]={10,20,30,20,50};
for(int i=4; i<=a.length; i--)
{
if(a[i]==20)
{
System.out.println("The Last Ocuurance of "+a[i]+" = Index "+i);
break;
}
}
}
}