import java.util.Scanner;
import java.util.Random;
public class HomeWork2 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Random R = new Random();
            int i =5;
            int j = 5;
            char s [][] = new char [i][j];
            int a = R.nextInt(5)+1;
            int b = R.nextInt(5)+1;
            System.out.println("All set.Get ready to rumble!");
            int aa = sc.nextInt();
            int  ba = sc.nextInt();



            for (int k = 0; k <i ; k++)
               {
                for (int l = 0; l <j ; l++)
                    {
                    s[k][l] = '-';
                    }

               }

            for (int k = 0; k <i ; k++)
            {
                for (int l = 0; l <j ; l++)
                  {
                    System.out.print(s[k][l]);

                 }
                System.out.println();

            }

            for(;;)
            {
                if(aa >= i || ba>=j)
                    {
                    System.out.println("Please try again!");
                     aa = sc.nextInt();
                      ba = sc.nextInt();
                    }
                else  {

                    if(aa==a && ba==b){
                        System.out.println("You have won!");
                        s[a][b] = 'x';
                        for (int k = 0; k <i ; k++)
                             {
                            for (int l = 0; l <j ; l++)
                               {
                                System.out.print(s[k][l]+" ");
                               }
                            System.out.println();
                             }
                        break;
                    }
                        else {
                            s[aa][ba] = '*';
                        for (int k = 0; k <i ; k++)
                             {
                            for (int l = 0; l <j ; l++)
                                 {
                                System.out.print(s[k][l]);
                                 }
                            System.out.println();
                             }
                        aa = sc.nextInt();
                        ba = sc.nextInt();

                    } continue;
                }
            }
        }
    }


