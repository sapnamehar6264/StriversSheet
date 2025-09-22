import java.util.HashMap;
import java.util.Scanner;

public class isAnagram {

    public static boolean checkAnagram(String str1, String str2) {

        if (str1.length() != str2.length())
            return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char c : str1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        return map1.equals(map2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the first string:");
        String str1 = sc.nextLine();

        System.out.print("Input the second string:");
        String str2 = sc.nextLine();

        boolean res = checkAnagram(str1, str2);

        if (res) {
            System.out.print("Yay your strings are anagram");
        } else {
            System.err.print("Opps! your strings are not anagram");
        }

        sc.close();

    }
}
