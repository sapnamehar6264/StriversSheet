import java.util.Scanner;

public class isPalindrome {
    public static void checkPalindrome(String original) {

        original = original.toLowerCase();
        String result = "";

        for (int i = 0; i < original.length(); i++) {
            result = original.charAt(i) + result;
        }

        if (result.equals(original)) {
            System.out.print("yes");
        } else {
            System.out.print("No");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the String to check if it's palindrome:");
        String original = sc.nextLine();

        checkPalindrome(original);
        sc.close();

    }
}
