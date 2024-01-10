import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        print(n);
    }

    private static void print(int n) {
        if(n == 0) {
            return;
        }
        
        for(int i=n; i>0; i--) {
            System.out.print("* ");
        }
        System.out.println();
        
        print(n-1);

        for(int i=n; i>0; i--) {
            System.out.print("* ");
        }
        System.out.println();
    }

}