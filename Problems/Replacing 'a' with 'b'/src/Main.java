import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner =new Scanner(System.in);
        String y=scanner.nextLine();

        String x=y.replace("a","b");

        System.out.println(x);
    }
}