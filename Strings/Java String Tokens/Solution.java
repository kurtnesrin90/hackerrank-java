import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] sArray = s.replaceAll("[^A-Za-z]", " ").split("\\s");

        int counter = 0;
        for (String index : sArray)
            if (!index.isEmpty())
                counter++;

        System.out.println(counter);

        for (String index : sArray)
            if (!index.isEmpty())
                System.out.println(index);

        scan.close();
    }
}