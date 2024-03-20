import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        if(a.indexOf(b) > 0) {
            System.out.print(a.indexOf(b));
        } else {
            System.out.print("No");
        }
    }
}