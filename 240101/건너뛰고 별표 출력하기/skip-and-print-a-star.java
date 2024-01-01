import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt = n*2-1;

        for(int i=0; i<cnt; i++) {
            for(int j=0; j<i / 2 + 1; j++) {
                if(i%2 != 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        for(int i=cnt-2; i>=0; i--) {
            for(int j=0; j<i / 2 + 1; j++) {
                if(i%2 != 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

// 0 1 == i %2 +1
// 2 2
// 4 3
// 6 4