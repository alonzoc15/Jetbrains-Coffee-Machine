import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        //Loop as long as n is greater than one.
        //Does this loop forever?
        //No one knows for certain.
        while(n > 1){
            //Print the current Hailstone value.
            System.out.print(n + " ");
            if(n%2 == 0){ //if n is even
                n = n/2;
            }else{ //otherwise, n is odd
                n = 3*n+1;
            }
        }
        System.out.println(n);
    }
}