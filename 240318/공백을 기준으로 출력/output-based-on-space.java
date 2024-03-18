import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = str1 + str2;

        String answer = "";
        for(int i=0; i<str3.length(); i++) {
            if(str3.charAt(i) != ' '){
                answer += str3.charAt(i);
            }
        }

        System.out.print(answer);
    }
}