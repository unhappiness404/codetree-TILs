import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++) {

            for(int j=0; j<(n*2)-(i+1)*2; j++) {
                System.out.print(" ");
            }

            for(int j=0; j<(i*2)+1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

// 0 3
// 1 1

// n 3
// 0 4 1 = 
// 1 2 3 = 
// 2 0 5 = 

// n 4
// 0 6 1 = i
// 1 4 3
// 2 2 5
// 3 0 7