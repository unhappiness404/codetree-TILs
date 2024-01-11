import java.util.Scanner;

public class Main {

    public static final int MAX_N = 100;
    public static int[] arr = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(f(n-1));
    }

    private static int f(int n) {
        if(n == 0) {
            return arr[0];
        }

        return Math.max(f(n-1), arr[n]);
    }

}