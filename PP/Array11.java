class Array11 {
public static void main(String[] args) {
int a[] = {10, 20, 30, 40, 50};
int x = a[0];
for (int i = 0; i < a.length - 1; i++) {
a[i] = a[i + 1];
}
a[a.length - 1] = x;
for (int i = 0; i < a.length; i++) {
System.out.print(a[i] + " ");
}
}
}