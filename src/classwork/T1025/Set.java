package classwork.T1025;


import java.util.*;

class    SetTask {
    public static void main(String[] args) {
        Random R = new Random();
        Set<Integer> unique = new HashSet<>(20);
        while (unique.size() != 20) {
            unique.add(R.nextInt(20)-9);
        }
        unique.forEach(System.out::println);


    }
}