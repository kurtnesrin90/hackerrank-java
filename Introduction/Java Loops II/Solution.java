import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] argh) {

        try (Scanner in = new Scanner(System.in)) {
            int t = in.nextInt();
            for (int i = 0; i < t; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();

                powerIt(a, b, n);
                System.out.println();
            }
            in.close();
        }
    }

    public static int powerIt(int cons, int base, int power) {

        int res = 0;
        if (power == 0) 
            return cons;

        res += base * Math.pow(2, power - 1) + powerIt(cons, base, power - 1);
        System.out.print(res + " ");

        return res;
    }
}