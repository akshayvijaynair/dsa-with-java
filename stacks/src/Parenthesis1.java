import java.util.Scanner;

public class Parenthesis1 {
    public static boolean match(String parens) throws Exception {
        int count = 0;
        char[] chars = parens.toCharArray();
        for (char c : chars) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                if (count > 0) {
                    count--;
                } else {
                    return false;
                }
            } else {
                throw new Exception("Invalid character " + c);
            }
        }
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println(match(in.nextLine()));
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
