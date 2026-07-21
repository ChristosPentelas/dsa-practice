package String_Practice;

public class AddBinary {
    public static void main(String[] args) {

        String binary1 = "1010";
        String binary2 = "1011";

        int i = binary1.length()-1;
        int j = binary2.length()-1;
        StringBuilder result = new StringBuilder();
        int carry = 0;

        while(i >= 0 || j >= 0 || carry==1) {

            int sum = carry;

            if (i >= 0) {
                sum += binary1.charAt(i--) - '0';
            }

            if (j >= 0) {
                sum += binary2.charAt(j--) - '0';
            }

            result.append(sum%2);
            carry = sum/2;
        }

        System.out.println(result.reverse().toString());
    }
}
