import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int aLen = a.length();
        int bLen = b.length();

        if(aLen > bLen) {
            System.out.println(a+" "+aLen);
        }else if(aLen < bLen){
            System.out.println(b+" "+bLen);
        } else {
            System.out.println("same");
        }
    }
}