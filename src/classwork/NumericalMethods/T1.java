package classwork.NumericalMethods;

public class T1 {
    static double u(double x , double y){
        double h = 0.1;
        double t0 = 0, t1=0.005;
        if(((x==0) && (y==0)) || ((x==0) && (y==0.005)) || ((x==0) && (y==0.01))){
            return 2*y;
        }
        else if(y==0){
            return (double)(Math.sin(2*x));
        }
        else if(y==0.005){
            return (double)((1/6)*(u(x+h,t0)+4*u(x,t0)+u((x-h),t0)));
        }
        else if(y==0.01){
            return (double)((1/6)*(u(x+h,t1)+4*u(x,t1)+u((x-h),t1)));
        }
        else return 0;
    }

    public static void main(String[] args) {
        double h = 0.1;
        double t0 = 0;
        double k = 0.005;
        double x0 = 0;
        for (int i = 0; i <=6 ; i++) {
            for (int j = 0; j <=6 ; j++) {
                double f = u((x0+i*h) ,(t0 + j*k));
                System.out.println(f);

            }

        }
    }
}
