import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i <= n; i++) {
            printStars(i);
            System.out.println();
        }
        
    }

    private static void printStars(int n) {
        if(n == 0) {
            return;
        }

        System.out.print("*");
        printStars(n - 1);
    }
}