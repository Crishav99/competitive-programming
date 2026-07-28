 import java.util.*;

public class 546A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();

        int totalCost = 0;

        for (int i = 1; i <= w; i++) {
            totalCost += i * k;
        }

        if (totalCost > n) {
            System.out.println(totalCost - n);
        } else {
            System.out.println(0);
        }
    }
}
 
