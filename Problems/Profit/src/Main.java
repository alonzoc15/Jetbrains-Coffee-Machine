import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextInt();
        double p = scanner.nextInt();
        double k = scanner.nextInt();

        int years = 0;

        while (k > m) {
            m = p / 100 * m + m;
            years++;
        }
        System.out.println(years);
    }
}