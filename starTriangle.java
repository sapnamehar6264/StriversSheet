import java.util.Scanner;

public class starTriangle {
    public static void star(int n) {
        int currentOdd = 1;
        int Q = (n - 1) + n;
        int p = Math.round(Q / 2);

        for (int i = 0; i < n; i++) {
            int space = p - i;

            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < currentOdd; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            System.out.println();

            currentOdd = currentOdd + 2;
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = s.nextInt();

        starTriangle obj = new starTriangle();
        obj.star(n);
    }

}