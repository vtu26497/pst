import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();
            System.out.println(twoStrings(s1, s2));
        }
        sc.close();
    }

    static String twoStrings(String s1, String s2) {
        HashSet<Character> set = new HashSet<>();
        for (char c : s1.toCharArray())
            set.add(c);

        for (char c : s2.toCharArray())
            if (set.contains(c))
                return "YES";

        return "NO";
    }
}