/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asrama;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Locale;

/**
 *
 * 
 */
public class Encryption {
    
    public static String MD5(String input){
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            String hashtext = number.toString(16);
            while(hashtext.length()<32){
                hashtext = "0"+hashtext;
            }
            return hashtext;
        }catch(Exception e){
            e.printStackTrace();
            throw  new RuntimeException(e);
        }
    }
    
    public static String MD5toText(String input){
        try{
            String result = null;
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
            md.update(input.getBytes(Charset.forName("UTF-8")));
            result = String.format(Locale.ROOT, "%032x", new BigInteger(1, md.digest()));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
        return result;
        }catch(Exception e){
            e.printStackTrace();
            throw  new RuntimeException(e);
        }
    }
    
}
