import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int num;
        int largestNum = 0;

        while (num > 0) {
            num = scan.nextInt();
            if(num > largestNum){
                largestNum = num;
            }
        }

        System.out.println(largestNum);
    }
}