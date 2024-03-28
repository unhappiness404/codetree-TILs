import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(f(n));
    }

    public static int f(int n) {
        if(n == 1) {
            return 1;
        }
        if(n == 2) {
            return 1;
        }

        return f(n-2) + f(n-1);
    }
}

// 1527: () + 1527 % 10 7
// 152: () + 152 % 10 2
// 15: () + 15 % 10 5
// 1: () + 1 % 10 1