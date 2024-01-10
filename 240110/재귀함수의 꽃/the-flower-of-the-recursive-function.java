import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        print2(n);
        print1(n);
    }

    private static void print1(int n) {
        if(n == 0) {
            return;
        }

        print1(n - 1);
        System.out.print(n+" ");
    }

    private static void print2(int n) {
        if(n == 0) {
            return;
        }

        System.out.print(n+" ");
        print2(n - 1);
    }
}