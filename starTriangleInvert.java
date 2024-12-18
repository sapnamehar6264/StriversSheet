import java.util.Scanner;

public class starTriangleInvert {
    public static void star1(int n) {
        int Q = (n - 1) + n;
        int currentOdd = Q;

        for (int i = 0; i < n; i++) {
            int space = 0 + i;

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
            currentOdd = currentOdd - 2;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = s.nextInt();

        starTriangleInvert obj = new starTriangleInvert();
        obj.star1(n);
    }

}
