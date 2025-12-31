import java.util.*;

public class A4_CF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w;

        // Take valid input only
        while (true) {
            w = sc.nextInt();
            if (w >= 1 && w <= 100) {
                break;
            }
            System.out.println("Enter a number between 1 and 100:");
        }

        // Check condition
        if (w > 2 && w % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
