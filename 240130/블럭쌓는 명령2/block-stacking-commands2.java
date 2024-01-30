import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<k; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            for(int j=a; j<=b; j++) {
                arr[j] += 1;
            }
        }
        int max = 0;
        for(int i=0; i<n; i++) {
            max = Math.max(max, arr[i]);
        }
        System.out.print(max);
    }
}