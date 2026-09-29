import java.util.Scanner;
class Array6 {
public static void main(String[] args) {
System.out.print("Enter position:");
Scanner sc=new Scanner(System.in);
int index = sc.nextInt();
int a[] = {10, 20, 30, 40, 50};
for (int i = index; i < a.length - 1; i++) {
a[i] = a[i + 1];
 }
for (int i = 0; i < a.length - 1; i++) {
System.out.print(a[i] + " ");
}
}
}