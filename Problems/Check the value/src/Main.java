import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h1 = scanner.nextInt();

        boolean lessThanTen = h1 < 10;

        System.out.println(lessThanTen);
    }
}