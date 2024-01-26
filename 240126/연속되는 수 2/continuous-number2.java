import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int cnt = 1;
        int maxCnt = 1;

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=1; i<n; i++) {
            if(arr[i] == arr[i-1]) {
                cnt++;
            } else {
                if(maxCnt < cnt) {
                    maxCnt = cnt;
                }
                cnt = 1;
            }
        }
        System.out.print(maxCnt);
    }
}