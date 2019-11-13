package classwork.L13T1;

public class L13T2 {
    public static void main(String[] args) {
        int number = 75;
        System.out.println(check(number));
    }

    private static boolean check(int number) {
        int count = 0;
        for (int i = 1; i < Math.sqrt(number); i++) {
            if (number % i != 0) {
                count++;
            }
        }
        if (count == 2) return true;

        else return false;
    }
}
