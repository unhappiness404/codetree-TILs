import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        int aLen = a.length();
        int bLen = b.length();
        int cLen = c.length();

        int max = max(aLen, bLen, cLen);
        int min = min(aLen, bLen, cLen);

        System.out.println(max - min);
    }

    public static int max(int a, int b, int c) {
        int max = a;
        if(b > max) {
            max = b;
        }
        if(c > max) {
            max = c;
        }
        return max;
    }

    public static int min(int a, int b, int c) {
        int min = a;
        if(b < min) {
            min = b;
        }
        if(c < min) {
            min = c;
        }
        return min;
    }
}