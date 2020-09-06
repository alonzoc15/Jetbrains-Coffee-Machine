import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int runner = 0;

        for (int i = 0; i <= n; i++) {
            if (runner == n) {
                break;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
                runner++;
                if (runner == n) {
                    break;
                }
            }
        }
    }
}