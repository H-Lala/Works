package classwork.L13T1;

public class L13T1 {
    public static void main(String[] args) {
        StringBuilder origin = new StringBuilder();
        origin.append("Hello");


        for (int i = 0; i < origin.length(); i++) {
            if (origin.charAt(i) == 'e' || origin.charAt(i) == 'o') {
                origin.deleteCharAt(i);
            }
        }
        System.out.println(origin);

    }
}
