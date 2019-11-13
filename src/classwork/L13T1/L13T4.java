package classwork.L13T1;

import classwork.taskclass.List;

import java.util.ArrayList;
import java.util.Arrays;

public class L13T4 {
    public static ArrayList<Integer> gen_prime(int count) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 10000; i <count; i++) {
            if (IsPrime(i)) {
                list.add(i);
            }

        }
        System.out.println(list.size());
        return (list);
    }

    public static boolean IsPrime(int i) {
        for (int j = 2; j <i; j++) {
            if (i % j == 0) {
                return  false;
            }
        }

        return  true;
    }

    public static void main(String[] args) {

        int count = 99999;
        System.out.println(gen_prime(count));


    }


}
