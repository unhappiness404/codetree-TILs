import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h1 = sc.nextInt()*60;
        int m1 = sc.nextInt();
        int h2 = sc.nextInt()*60;
        int m2 = sc.nextInt();

        System.out.print((h2+m2)-(h1+m1));
    }
}