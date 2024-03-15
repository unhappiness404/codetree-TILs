import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printString(n);
    }

    public static void printString(int rownum) {
        for(int i=0; i<rownum; i++) {
            System.out.println("12345^&*()_");
        }
    }
}