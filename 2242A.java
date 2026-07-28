
import java.util.Scanner;
public class 2242A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int k = scanner.nextInt();
            
            boolean hasAtLeastThree = false;
            int countAtLeastTwo = 0;
            
            for (int i = 0; i < k; i++) {
                int count = scanner.nextInt();
                
                if (count >= 3) {
                    hasAtLeastThree = true;
                }
                if (count >= 2) {
                    countAtLeastTwo++;
                }
            }
            
            if (hasAtLeastThree || countAtLeastTwo >= 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}

