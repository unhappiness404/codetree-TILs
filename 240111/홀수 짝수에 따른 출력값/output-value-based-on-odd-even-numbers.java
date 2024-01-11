import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(f(n));
    }

    private static int f(int n) {
        if(n <= 2) {
            return n;
        }

        if(n % 2 == 0) {
            return f(n-2) + n;
        } else {
            return f(n-2) + n;
        }
    }
}