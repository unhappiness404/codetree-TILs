import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print(sum(a*b*c));
    }

    private static int sum(int n) {
        if(n < 10) {
            return n;
        }

        return sum(n / 10) + sum(n % 10);
    }
}