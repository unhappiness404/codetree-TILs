import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        print(n);
    }

    private static void print(int count) {
        if(count == 0) {
            return;
        }

        print(--count);
        System.out.println("HelloWorld");
    }
}