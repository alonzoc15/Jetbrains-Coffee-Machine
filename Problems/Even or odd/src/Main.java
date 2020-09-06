import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);

        int number;
        while ((number = in.nextInt()) != 0) {
            if (number % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}