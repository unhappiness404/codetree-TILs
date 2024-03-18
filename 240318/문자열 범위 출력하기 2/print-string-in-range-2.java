import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = sc.nextInt();

        int totLength = str.length();
        int cnt = 0;

        for(int i = totLength -1; i >= 0; i--) {
            if(cnt > n) {
                break;
            }
            System.out.print(str.charAt(i));
            cnt++;
        }

    }
}