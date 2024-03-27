import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printString(n);
    }

    public static void printString(int n) {
        if(n == 0) {
            return;
        }

        printString(n - 1);
        System.out.println("HelloWorld");
    }
}