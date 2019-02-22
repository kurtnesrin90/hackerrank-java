import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BigInteger b1 = scanner.nextBigInteger();
        BigInteger b2 = scanner.nextBigInteger();

        System.out.println(b1.add(b2) + "\n" + b1.multiply(b2));
        scanner.close();
    }
}