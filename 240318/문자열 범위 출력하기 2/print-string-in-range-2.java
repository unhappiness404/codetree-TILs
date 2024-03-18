import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = sc.nextInt();

        int totLength = str.length();

        for(int i = totLength -1; i >= totLength - n; i--) {
            System.out.print(str.charAt(i));
        }
    }
}