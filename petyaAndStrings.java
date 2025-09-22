import java.util.Scanner;

public class petyaAndStrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        int result = s1.compareToIgnoreCase(s2);

        if (result < 0) {
            result = -1;
        } else if (result > 0) {
            result = 1;
        }

        System.out.println(result);

        sc.close();
    }
}
