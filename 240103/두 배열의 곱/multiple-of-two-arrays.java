import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];
        int[][] brr = new int[3][3];

        int num = 1;

        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                brr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print((arr[i][j]*brr[i][j])+" ");
            }
            System.out.println();
        }

    }
}