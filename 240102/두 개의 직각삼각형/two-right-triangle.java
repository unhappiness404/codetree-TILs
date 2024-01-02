import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++) {

            for(int j=n-i; j>0; j--) {
                System.out.print("*");
            }

            for(int j=0; j<i; j++) {
                System.out.print(" ");
            }

            for(int j=0; j<i; j++) {
                System.out.print(" ");
            }

            for(int j=n-i; j>0; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

// 0 3
// 1 1

// n 3
// 0 3 0 = 
// 1 2 1 = 
// 2 1 2 = 

// n 4
// 0 6 1 = i
// 1 4 3
// 2 2 5
// 3 0 7