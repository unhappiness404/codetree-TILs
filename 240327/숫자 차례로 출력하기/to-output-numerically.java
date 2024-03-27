import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        increaseNum(n);
        System.out.println();
        decreaseNum(n);
    }

    public static void increaseNum(int n) {
        if(n == 0) {
            return;
        }

        increaseNum(n - 1);

        System.out.print(n + " ");
    }

    public static void decreaseNum(int n) {
        if(n == 0) {
            return;
        }

        System.out.print(n + " ");

        decreaseNum(n - 1);
    }
}