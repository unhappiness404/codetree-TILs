import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = sc.nextInt();

        int totLength = str.length();

        if(totLength - n > 0) {
            for(int i = totLength -1; i >= totLength - n; i--) {
                System.out.print(str.charAt(i));
            }
        } else {
            for(int i = totLength -1; i >= 0; i--) {
                System.out.print(str.charAt(i));
            }
        }

    }
}