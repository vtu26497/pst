import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((i % 3 == 0 && s.charAt(i) != 'S') ||
                (i % 3 == 1 && s.charAt(i) != 'O') ||
                (i % 3 == 2 && s.charAt(i) != 'S'))
                count++;
        }
        System.out.println(count);
        sc.close();
    }
}