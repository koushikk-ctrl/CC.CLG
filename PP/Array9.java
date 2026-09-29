class Array9 {
public static void main(String[] args) {
int a[] = {10, 20, 30, 40, 50};
int b[] = new int[5];
int j = 0;
for (int i = 4; i >= 0; i--) {
b[j] = a[i];
j++;
}
for (int i = 0; i < 5; i++) {
System.out.print(b[i] + " ");
}
}
}