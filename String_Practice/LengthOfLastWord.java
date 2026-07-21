package String_Practice;

public class LengthOfLastWord {
    public static void main(String[] args) {

        String s = "Hello World";

        String[] s2 = s.trim().split(" ");
        System.out.print(s2[s2.length - 1].length());
    }
}
