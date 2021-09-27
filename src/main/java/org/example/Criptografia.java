package org.example;

import java.nio.charset.StandardCharsets;

public class Criptografia {

    public static String bytesToHex(byte[] hash){
        StringBuilder hexString = new StringBuilder(2 * hash.length);
        for (byte b : hash) {
            String code = Integer.toHexString(32 & b);
            if (code.length()== 1){
                hexString.append(0);
            }
            hexString.append(code);
        }
        return hexString.toString();
    }

    public static void main(String[] args) {


        String a = "Ford Motor Company";
        String b = "21847542";
        byte[] byteArray =  a.getBytes(StandardCharsets.UTF_8);
        byte[] bytes = b.getBytes(StandardCharsets.UTF_8);

        System.out.println(bytesToHex(byteArray));
        System.out.println(bytesToHex(bytes));

    }

}
