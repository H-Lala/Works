import java.util.Random;
public class RandomNumbers {
    public static void main(String[] args) {
        Random R =new Random();
        int length=20;
        int [] arr = new int [length];
        for (int i = 0; i <length ; i++) {
            arr[i] = R.nextInt(10);
        }
        for (int i = 0; i <length ; i++) {
            if(arr[i]%2==0 && arr[i]%3!=0){
                System.out.println("fizz");
            }
              if (arr[i]%3==0 && arr[i]%2!=0){
                System.out.println("buzz");
            }
             if(arr[i]%2==0 && arr[i]%3==0){
                System.out.println("fizzbuzz");
            }
             else {
                System.out.println(" ");
            }

        }
    }
}
