import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = "";

        for(int i=0; i<1000; i++) {
            str += sc.next();
        }

        System.out.print(str.length());
    }
}