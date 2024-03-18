import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String zip = "";
        int cnt = 1;

        if(str.length() == 1) {
            System.out.println(2);
            System.out.println(str+1);
        } else {
            for(int i = 1; i < str.length(); i++) {
                // 이전 문자와 현재 문자가 다르면
                if(str.charAt(i-1) != str.charAt(i)) {
                    zip += str.charAt(i-1) + String.valueOf(cnt);
                    cnt = 0;
                }
                if(i == str.length() - 1) {
                    zip += str.charAt(i) + String.valueOf(cnt+1);

                }
                cnt++;
            }
            System.out.println(zip.length());
            System.out.println(zip);
        }





    }
}