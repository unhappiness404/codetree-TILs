import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(sum(n));
    }

    private static int sum(int n) {
        if(n < 10) {
            return n*n;
        }
        
        return sum(n / 10) + sum(n % 10);
    }
}

// 1527 152 + 7
// 152 15 + 2
// 15 1 + 5