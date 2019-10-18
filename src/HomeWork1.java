import java.util.Random;
import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
         Random  R = new Random();
        Scanner  N = new Scanner (System.in);
        System.out.println("Let the game begin !");
        int name = R.nextInt(100);
        int  n = N.nextInt();
        for(;;){

            if( name == n) {
                System.out.println("Congratulations " + name + " !");
                break;
            }
            else  if (name > n) {
                System.out.println("Your number is too small .Please try again !");
                n = N.nextInt();
                continue;
            }
            else if (n>name){
                System.out.println("Your number is too big. Please try again ! ");
                n=N.nextInt();
                continue;
            }

        }

    }
}
