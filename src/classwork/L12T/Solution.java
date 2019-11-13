package classwork.L12T;

public class Solution {

    public static int Solution(String origin){
        int temp=0;
        int pairs=0;

       for(int i= 0; i<origin.length();i++) {
           switch (origin.charAt(i)){
               case 'R': temp++;
                   break;
               case 'L':
                   temp--;
                   break;
           }
           if(temp==0) {
               pairs++;
           }
           else {

           }

       }

        return pairs;
    }


    public static void main(String[] args) {
        String origin="RLLLRRRLLR";


       System.out.println(Solution(origin));
    }
}
