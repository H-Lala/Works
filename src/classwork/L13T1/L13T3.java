package classwork.L13T1;

public class L13T3 {
    public static void main(String[] args) {
        int origin = 121;
        System.out.println(check(origin));

    }
        private static boolean check ( int origin){
            int n = 0;
            int remainder = 0, i = 0;
            int copy =origin;
            while (origin != 0) {
                remainder = origin % 10;
                origin /= 10;
                n += remainder*(Math.pow(10, i));
                i++;
            }
            if (copy == n) return true;

            else return  false;


    }
}