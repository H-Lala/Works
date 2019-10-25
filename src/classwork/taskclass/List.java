package classwork.taskclass;

import java.util.ArrayList;
import java.util.Random;

public class List {
    public static void main(String[] args) {
        Random R = new Random();
       ArrayList <Integer> arr = new ArrayList<Integer>();
        ArrayList <Integer> arrodd = new ArrayList<Integer>();
        ArrayList <Integer> areven = new ArrayList<Integer>();
        for (int i = 0; i <100 ; i++) {
            arr.add(R.nextInt(100));
        }
        for (Integer item:arr) {
            if (item % 2 == 0) {
                areven.add(item);
            } else {
                arrodd.add(item);
            }
        }
            System.out.println("Random numbers");
            arr.forEach(System.out::println);

            System.out.println("Odd numbers");
            arrodd.forEach(System.out::println);

            System.out.println("Even numbers");
            areven.forEach(System.out::println);




        }

    }


