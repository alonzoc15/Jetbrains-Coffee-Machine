import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        if (a > -15 && a <= 12) {
            System.out.println("True");
        } else if (a > 14 && a < 17) {
            System.out.println("True");
        } else if (a >= 19) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}