import java.util.Scanner;

class EvenLengthWords {

    public static void printWords(String s) {
        for (String w : s.split(" ")) {
            if (w.length() % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input you sentence:");
        String s = sc.nextLine();
        printWords(s);

        sc.close();
    }

}