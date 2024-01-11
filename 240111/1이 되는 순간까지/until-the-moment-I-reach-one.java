import java.util.Scanner;

public class Main {

    public static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(calc(n));
    }

    private static int calc(int n) {
        if(n==1) {
            return 0;
        }

        if(n % 2 == 0) {
            return calc(n / 2)+1;
        } else {
            return calc(n / 3)+1;
        }
    }
}