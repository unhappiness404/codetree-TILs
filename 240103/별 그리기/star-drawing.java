import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            for(int j=n-i-1; j>0; j--) {
                System.out.print(" ");
            }

            for(int j=0; j<i*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n-2; i>=0; i--) {
            for(int j=n-i-1; j>0; j--) {
                System.out.print(" ");
            }

            for(int j=0; j<i*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// n=3
// 0 2 1 
// 1 1 3
// 2 0 5

// n-i-1
// i*2+1