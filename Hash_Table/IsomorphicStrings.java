package Hash_Table;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IsomorphicStrings {

    public static boolean isIsomorphic(String a, String b) {

        Map<Character, Character> mapAb = new HashMap<>();
        Map<Character, Character> mapBa = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {

            char c1 = a.charAt(i);
            char c2 = b.charAt(i);

            if (mapAb.containsKey(c1)) {
                if (mapAb.get(c1) != c2) {
                    return false;
                }
            }else {
                mapAb.put(c1, c2);
            }

            if (mapBa.containsKey(c2)) {
                if (mapBa.get(c2) != c1) {
                    return false;
                }
            }else {
                mapBa.put(c2, c1);
            }

        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Enter a string: ");
        String t = sc.nextLine();

        boolean isomorphic = isIsomorphic(s,t);

        System.out.println(isomorphic ? "Isomorphic" : "Not Isomorphic");
    }
}
