import java.util.Scanner;

public class Pattern3 {

    void number(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(1 + j);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = s.nextInt();

        Pattern3 obj = new Pattern3();
        obj.number(n);

    }
}
