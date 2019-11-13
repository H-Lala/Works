package classwork.NumericalMethods;

public class NMT1 {
    public static void main(String[] args) {


        float p[] = new float[5];
        float q[] = new float[5];
        float b[] = new float[4];
        float h = 0.1F, x0 = 0.2F;
        float a = (1 / (h * h));
        float d = 3F;
        q[1] = 2;
        p[1] = 0;
        for (int i = 1; i <= 3; i++) {
            b[i] = ((2 / (h * h)) + (2 / h) + (1 / (x0 + i * h)));
        }
        float c = ((1 / (h * h)) + 2 / h);
        System.out.printf("c = %.4f\n", c);
        System.out.printf("a = %.4f\n", a);
        System.out.println("d = " + d);

        for (int i = 1; i < 4; i++) {
            q[i + 1] = (((a * q[i]) - d) / (b[i] - a * p[i]));
            p[i + 1] = (c / (b[i] - a * p[i]));
        }
        for (int i = 1; i <= 3; i++) {
            System.out.printf("b%d = %.4f q%d = %.4f p%d = %.4f\n", i, b[i], i, q[i], i, p[i]);

        }

        float y0 = 2F;
        float y2 = (p[3] - 19 * q[3]) / (-19 + 20 * p[3]);
        float y1 = p[2] * y2 + q[2];
        float y3 = (1 - 20 * y2) / (-19);
        System.out.println("y0 = " + y0);
        System.out.println("y1 = " + y1);
        System.out.println("y2 = " + y2);
        System.out.println("y3 = " + y3);

    }

}
