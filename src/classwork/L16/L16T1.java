package classwork.L16;

import java.util.ArrayList;
import java.util.List;


public class L16T1 {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList();
        List<String> verbs =    new ArrayList();
        ArrayList objects =  new ArrayList();
        ArrayList<String> sentences = new ArrayList<>();
        subjects.add("Noel");
        subjects.add("The cat");
        subjects.add("The dog");

        verbs.add(" wrote");
        verbs.add(" chased");
        verbs.add(" slept on");

        objects.add(" the book");
        objects.add(" the ball");
        objects.add(" the bed");

        for (int i = 0; i <subjects.size() ; i++) {
            for (int j = 0; j <verbs.size(); j++) {
                for (int k = 0; k <objects.size() ; k++) {
                    System.out.println(subjects.get((int) (Math.random()*subjects.size())) +
                            verbs.get((int) (Math.random()*verbs.size()))
                            + objects.get((int) (Math.random()*objects.size())));


                }

            }

        }

    }
}
