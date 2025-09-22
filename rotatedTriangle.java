import java.util.Scanner;

public class rotatedTriangle {

    public static void nStarTriangle(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j <= n - i - 2; j++) {
                System.out.print("*");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

            System.out.println();

        }

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = s.nextInt();

        rotatedTriangle obj = new rotatedTriangle();
        obj.nStarTriangle(n);
    }

}
