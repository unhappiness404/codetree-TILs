import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String zip = "";

        int cnt = 1;

        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i-1) != str.charAt(i)) {
                zip += str.charAt(i-1) + String.valueOf(cnt);
                cnt = 0;
            }
            cnt++;
        }
        zip += str.charAt(str.length()-1) + String.valueOf(cnt);

        System.out.println(zip.length());
        System.out.println(zip);
        
    }
}