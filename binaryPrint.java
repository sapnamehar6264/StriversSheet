import java.util.Scanner;

public class binaryPrint {

    public static void nStarBinary(int n) {

        String previousOutput = "";

        for (int i = 0; i < n; i++) {

            String currentOutput = "";

            for (int j = 0; j <= i; j++) {
                if (i % 2 == 0) {
                    currentOutput = "1 " + previousOutput;
                }

                else {
                    currentOutput = "0 " + previousOutput;
                }
            }

            System.out.println(currentOutput);

            previousOutput = currentOutput;

        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n: 5");
        int n = s.nextInt();

        binaryPrint obj = new binaryPrint();
        obj.nStarBinary(n);

    }
}
