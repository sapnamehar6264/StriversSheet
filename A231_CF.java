import java.util.*;

class A231_CF {

    public static int willSolve(int a, int b, int c) {
        return (a + b + c >= 2) ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            count += willSolve(a, b, c);
        }

        System.out.println(count);
        sc.close();
    }
}
