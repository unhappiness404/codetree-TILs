import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String str = "";
        int cnt = 0;

        for(int i=0; i<n; i++) {
            String temp = sc.next();
            if(temp.charAt(0) == 'a') {
                cnt++;
            }
            str += temp;
        }

        System.out.print(str.length()+" "+cnt);
    }
}