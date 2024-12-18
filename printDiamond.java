import java.util.Scanner;

public class printDiamond {

    public static void nStarDiamond(int n) {
        int currentOdd = 1;
        int Q = (n - 1) + n;

        for (int i = 0; i < n; i++) {

            for (int j = 1; j <= n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= currentOdd; j++) {
                System.out.print("*");
            }

            System.out.println();
            currentOdd = currentOdd + 2;
        }

        for (int i = 0; i < n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= Q; j++) {
                System.out.print("*");
            }

            System.out.println();

            Q = Q - 2;
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = s.nextInt();

        printDiamond obj = new printDiamond();
        obj.nStarDiamond(n);
    }

}
