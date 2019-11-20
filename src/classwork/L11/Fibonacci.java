package classwork.L11;


public class Fibonacci {

    public static void main(String[] args) {
        Fibonacci app = new Fibonacci();
        int n = app.Fibo(10);
        System.out.println(n);
    }

    private int Fibo(int i) {
        if (i == 0) {
            return 0;
        }
        if(i==1 || i==2){
            return 1;
        }
        return
                Fibo(i-1)+Fibo(i-2);

    }
}
