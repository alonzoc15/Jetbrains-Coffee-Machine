import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        int sum = 0;

        n = scanner.nextInt();
        int a[] = new int [n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            sum = sum + a[i];
        }
        System.out.println(sum);
    }
}