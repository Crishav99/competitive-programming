import java.util.*;

public class 59A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int upper = 0;
        int lower = 0;

        // Count uppercase and lowercase letters
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isUpperCase(ch)) {
                upper++;
            } else {
                lower++;
            }
        }

        // Convert according to the condition
        if (upper > lower) {
            System.out.println(s.toUpperCase());
        } else {
            System.out.println(s.toLowerCase());
        }
    }
}
 
