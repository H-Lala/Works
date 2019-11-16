package classwork.taskclass;

import java.util.LinkedList;

public class L15T2 {

    class Link{
        Link next;
        int value;

    }
    public static void main(String[] args) {
        LinkedList<Integer> list  =  new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        reverse(list);

    }

    private static void reverse(LinkedList<Integer> list) {
    }
}
