import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int height = sc.nextInt();
        int weight = sc.nextInt();
        
        double bmi = weight / Math.pow(height / 100.0, 2);
        
        System.out.println((int) bmi);
        
        if (bmi >= 25) {
            System.out.println("Obesity");
        }
    }
}