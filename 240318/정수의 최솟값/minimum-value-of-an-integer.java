import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int minVal = min(a, b, c);

        System.out.print(minVal);
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