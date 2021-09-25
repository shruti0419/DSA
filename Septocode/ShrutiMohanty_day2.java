package Septocode.s;

import java.util.*;

public class ShrutiMohanty_day2 {

    public void leaptest(int x, int y) {
        int sum1, sum2;
        int a, c;
        if (y != 0) {
            a = (y % 400 == 0) ? (c = 1) : ((y % 100 == 0) ? (c = 0) : ((y % 4 == 0) ? (c = 1) : (c = 0)));
            if (a == 1)
                sum1 = 366;
            else
                sum1 = 365;
        } else
            sum1 = 0;
        if (x != 0) {
            a = (x % 400 == 0) ? (c = 1) : ((x % 100 == 0) ? (c = 0) : ((x % 4 == 0) ? (c = 1) : (c = 0)));
            if (a == 1)
                sum2 = 366;
            else
                sum2 = 365;
        } else
            sum2 = 0;

        System.out.println(sum1 + sum2);
    }

    public static void main(String arg[])
    {

        int x,y;
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();

        int[][] m = new int[N][2];
        for (int i = 0; i < N; i++) {

            for (int j = 0; j < 2; j++) {
                m[i][j] = Integer.valueOf(sc.next());//replaced line with proper code
            }
        }

        ShrutiMohanty_day2 d = new ShrutiMohanty_day2();
        for ( int i = 0; i < N; i++){

            x=m[i][0];
            y=m[i][1];
            d.leaptest(x,y);
        }


    }
}
