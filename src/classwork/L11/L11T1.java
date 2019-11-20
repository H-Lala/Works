package classwork.L11;

public class L11T1 {
    public static void main(String[] args) {
        String s1 = "()()()()()";
        String s2 = "(()()()()())";
        String s3 = "((()()()()()))";

        System.out.println(F(s1));
        System.out.println(F(s2));
        System.out.println(F(s3));

    }

    public static int F(String s) {
        int temp = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                temp++;
            } else break;

        }
        return temp;
    }
}
