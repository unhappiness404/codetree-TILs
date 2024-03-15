import java.util.*;

public class Main {

    public static int findGcd(int n, int m) {
        int gcd = 1;
        for(int i=1; i <= Math.min(n,m); i++) {
            if(n % i == 0 && m % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int gcd = findGcd(n, m);
        System.out.print(gcd);
    }
}