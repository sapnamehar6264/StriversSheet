import java.util.Scanner;

public class insertString {

    public static void printString(String original, String toInsert, int index) {

        if (index > 0 && original.charAt(index - 1) != ' ') {
            toInsert = " " + toInsert;
        }
        if (index < original.length() && original.charAt(index) != ' ') {
            toInsert = toInsert + " ";
        }

        StringBuilder newString = new StringBuilder(original);
        newString.insert(index, toInsert);
        System.out.print(newString.toString());
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Input the Original String:");
        String original = s.nextLine();

        System.out.print("Input the String you want to Insert:");
        String toInsert = s.nextLine();

        System.out.print("Input the indext at which you want to insert:");
        Integer index = s.nextInt();

        printString(original, toInsert, index);
        s.close();
    }
}
