import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[200];

        for(int i=0; i<n; i++) {
            int x = sc.nextInt()+100;
            int y = sc.nextInt()+100;
            for(int j=x; j<y; j++) {
                arr[j] += 1;
            }
        }
        int max = 0;
        for(int i=100; i<200; i++) {
            max = Math.max(arr[i], max);
        }
        System.out.print(max);
    }
}