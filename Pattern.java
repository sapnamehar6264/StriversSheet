import java.util.Scanner;

public class Pattern {

    void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the size of the pattern ");
        int n = myObj.nextInt();

        Pattern obj = new Pattern();
        obj.pattern1(n);
    }

}