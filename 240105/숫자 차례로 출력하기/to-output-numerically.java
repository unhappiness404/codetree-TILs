import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        
        print1(n);
        System.out.println();
        print2(n);
    }

    private static void print1(int count) {
        if(count == 0) {
            return ;
        }

        print1(count - 1);
        System.out.print(count+" ");
    }

    private static void print2(int count) {
        if(count == 0) {
            return ;
        }

        System.out.print(count+" ");
        print2(count - 1);
    }
}