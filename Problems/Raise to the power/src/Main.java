import java.lang.Math;

public class Main {

    public static long power(int n, int m) {
        // write your code here
        return Math.pow(n, m);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        System.out.println(power(n, m));
    }
}