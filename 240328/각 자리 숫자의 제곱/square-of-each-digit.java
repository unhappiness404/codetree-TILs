import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(f(n));
    }

    public static int f(int n) {
        if(n < 10) {
            return n * n;
        }

        return f(n / 10) + (n % 10) * (n % 10);
    }
}

// 1527: () + 1527 % 10 7
// 152: () + 152 % 10 2
// 15: () + 15 % 10 5
// 1: () + 1 % 10 1