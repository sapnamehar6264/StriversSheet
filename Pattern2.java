import java.util.Scanner;

public class Pattern2 {
    void starPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n");

        int n = s.nextInt();

        Pattern2 myObj = new Pattern2();
        myObj.starPattern(n);
    }
}