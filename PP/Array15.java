class Array15 {
public static void main(String[] args) {
int a[] = {10, -5, 20, -3, 40, -8};
int j = 0;
for (int i = 0; i < a.length; i++) {
if (a[i] >= 0) {
a[j] = a[i];
j++;
}
}
for (int i = 0; i < j; i++) {
System.out.print(a[i] + " ");
}
}
}