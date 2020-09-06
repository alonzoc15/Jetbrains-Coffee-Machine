import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        Scanner input = new Scanner(System.in);

        System.out.print("Input an integer between 0 and 1000: ");
        int num = input.nextInt();

        int firstDigit = num % 100;
        int remainingNumber = num / 10;
        int SecondDigit = remainingNumber % 100;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 100;
        remainingNumber = remainingNumber / 10;
        int fourthDigit = remainingNumber % 100;
        int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit;
        System.out.println(sum);
    }
}