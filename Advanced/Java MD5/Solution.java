import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.xml.bind.DatatypeConverter;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException, NoSuchAlgorithmException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        MessageDigest md = MessageDigest.getInstance("MD5");
        System.out.println(DatatypeConverter.printHexBinary(md.digest(input.getBytes())).toLowerCase());
    }
}