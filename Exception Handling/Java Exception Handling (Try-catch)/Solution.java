import java.util.*;

public class Solution {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println(scan.nextInt() / scan.nextInt());
        } catch (Exception e) {
            if (e instanceof java.util.InputMismatchException)
                System.out.println("java.util.InputMismatchException");
            else if (e instanceof java.lang.ArithmeticException)
                System.out.println("java.lang.ArithmeticException: / by zero");
            else
                System.out.println(e);
        }
    }
}