import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            for(int j=n+n%2 - i*2; j>0; j--) {
                System.out.print(" ");
            }

            for(int j=0; j<=i; j++) {
                System.out.print("@ ");
            }
            System.out.println();
        }

        for(int i=n-2; i>=0; i--) {
            for(int j=0; j<=i; j++) {
                System.out.print("@ ");
            }

            for(int j=n+1-i*2; j>0; j--) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}

// n=3
// 0 4 1 
// 1 2 2
// 2 0 3

//3+1 -i*2

// 
// i*2+1

// n=5
// 0 8 1
// 1 6 2
// 2 4 3
// 3 2 4
// 4 0 5
// n+n%2 - i*2