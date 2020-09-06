import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int [] digit = new int[n];
        int how = 0;
        for (int i = 0; i < n; i++) {
            digit[i] = reader.nextInt();
        }

        int length = digit.length;
        int min = digit[0];
        for (int j = 0; j < length; j++) {
            if (j + 3 > length) {
                break;
            }
            if (digit[j] == digit[j + 1] - 1 && digit[j] == digit[ j + 2] - 2){
                how++;
            }

        }
        System.out.println(how);
    }
}