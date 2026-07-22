package Hash_Table;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInt {

    public static int romanToInt(String s) {

        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int sum = 0;
        int prev = 0;
        int curr = 0;

        for (int i = s.length()-1; i >=0; i--) {

            curr = romanMap.get(s.charAt(i));

            if (curr<prev) {
                sum -= curr;
            }else{
                sum += curr;
            }

            prev = curr;
        }

        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        String roman =s.toUpperCase();
        System.out.println("The roman to int is: "+ romanToInt(roman));

    }


}
