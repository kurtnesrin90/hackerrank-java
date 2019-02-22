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
        int size = scanner.nextInt();
        scanner.nextLine();
        int[] arr = new int[size];
        String[] arrRowItems = scanner.nextLine().split("\\s");

        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(arrRowItems[i]);
        }

        int negCounter = 0;
        for (int i = 0; i < size; i++) {
            int subSum = 0;
            for (int j = i; j <size; j++) {
                subSum+= arr[j];
                
                if(subSum < 0)
                    negCounter++;
            }
        }
        
        System.out.println(negCounter);
        scanner.close();
    }
}