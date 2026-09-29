class Array12 {
public static void main(String[] args) {
int a[] = {10, 20, 30, 40, 50};
int x = a[a.length - 1];
for (int i = a.length - 1; i > 0; i--) {
a[i] = a[i - 1];
}
a[0] = x;
for (int i = 0; i < a.length; i++) {
System.out.print(a[i] + " ");
}
}
}