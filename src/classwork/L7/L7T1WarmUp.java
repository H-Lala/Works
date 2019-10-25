package classwork.L7;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class L7T1WarmUp {


    public static void main(String[] args) {
        Random R = new Random();
        Set<Integer> unique = new HashSet<>(20);
        while (unique.size() != 20) {
            unique.add(R.nextInt(20) - 9);
        }
        unique.forEach(System.out::println);


    }
}

