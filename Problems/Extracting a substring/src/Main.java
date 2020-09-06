import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int range = scanner.nextInt();
        int rangee = scanner.nextInt();
        String goToHere = word.substring(range, rangee + 1);
        System.out.println(goToHere);
    }
}