package classwork.NumericalMethods;
import java.util.Scanner;
public class Lab9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x0, xn, h, x, tm, t0, tao, n, m;
        System.out.println("x0-i daxil edin");
        x0 = sc.nextDouble();
        System.out.println("x1-i daxil edin");
        xn = sc.nextDouble();
        System.out.println("n-i daxil edin: ");
        n = sc.nextDouble();
        System.out.println("t0-i daxil edin");
        t0 = sc.nextDouble();
        System.out.println("tm-i daxil edin");
        tm = sc.nextDouble();
        System.out.println("m-i daxil edin");
        m = sc.nextDouble();
        h = (xn - x0) / n;
        tao = (tm - t0) / m;
        if (tao / h < 1) {
            double U[][] = new double[(int) (n + 1)][(int) (m + 1)];
            for (int i = 1; i < n; i++) {
                x = x0 + i * h;
                U[i][0] = (x + 0.5) * (x - 1);
                System.out.printf("U[%d][0] = %f\n", i, U[i][0]);
            }
            for (int i = 1; i < n; i++) {
                x = x0 + i * h;
                U[i][1] = Math.sin(x + 0.2) * tao + U[i][0];
                System.out.printf("U[%d][1] = %f\n", i, U[i][1]); }
            for (int j = 0; j <m; j++) {
                double t = t0 + j * tao;
                U[0][j] = t - 0.5;
                System.out.printf("U[0][%d] = %f\n", j, U[0][j]);
            }
            for (int j = 0; j < m; j++) {
                double t = t0 + j * tao;
                U[(int) n][j] = t * 3;
                System.out.printf("U[%d][%d] = %f\n", (int) n, j, U[(int) n][j]);
            }
            for (int i = 1; i < (int) n; i++) {
                for (int j = 2; j < m; j++) {
                    U[i][j] = 2 * U[i][j - 1] - U[i][j - 2] + tao * tao * (U[i + 1][j - 1] - 2 * U[i][j - 1] + U[i - 1][j - 1]) / (h * h);
                    System.out.printf("U[%d][%d] = %f \n", i, j, U[i][j]);

                }

            }
        }

    }
}
