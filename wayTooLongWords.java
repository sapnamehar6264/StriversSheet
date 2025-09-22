import java.util.*;

public class wayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // first line: number of words
        while (n-- > 0) {
            String s = sc.next(); // read one word
            if (s.length() > 10) {
                System.out.println("" + s.charAt(0) + (s.length() - 2) + s.charAt(s.length() - 1));
            } else {
                System.out.println(s);
            }
        }

        sc.close();
    }
}
