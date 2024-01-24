import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int a = 0;
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        int b = 0;

        for(int i=1; i<=m1; i++) {
            a +=num_of_days[i];
        }
        a += d1;
        for(int i=1; i<=m2; i++) {
            b +=num_of_days[i];
        }
        b += d2;

        System.out.print(b-a);

    }
}