import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int cnt = 1;
        String answer = "";

        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i-1) != str.charAt(i)) {
                answer+=str.charAt(i-1)+String.valueOf(cnt);
                cnt = 0;
            } 
            if( i == str.length() - 1) {
                answer+=str.charAt(i)+String.valueOf(cnt+1);
            }
            cnt++;
        }
        System.out.println(answer.length());
        System.out.println(answer);
    }
}