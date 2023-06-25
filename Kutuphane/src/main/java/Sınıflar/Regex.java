/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sınıflar;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author emir
 */
public class Regex {
    
   /* Kullanıcı adı bu "_" " karakterleriyle başlayamaz." . Harflerle başlamalı.    
    Sayılar ve "_,."karakterler kullanılabilir, En az 7 karakter, en fazla 20 karakter içermelidir*/
    private static final String usernamePattern ="^(?!.*[_.]{2})[a-zA-Z][a-zA-Z0-9_.]{7,20}$";
    
    /* Şifre harf, sayı ve "_ " , en az 7 karakter içerebilir.*/
    private static final String passwordsPattern="^[a-zA-Z0-9_.]{7,20}$";
    
    
    Pattern pattern;
    Matcher matcher;
    
    /* Bu yöntem, kullanıcı adının desenle eşleşip eşleşmediğini kontrol eder ve bir 'true' veya 'false' değeri döndürür*/
    public boolean regexForUsername(String username){
        pattern=Pattern.compile(usernamePattern);
        matcher=pattern.matcher(username);
        return matcher.matches();   
    }
    
    /* Bu yöntem, şifrenin desenle eşleşip eşleşmediğini kontrol eder ve 'doğru' veya 'yanlış' bir değer döndürür*/
    public boolean regexForPassword(String password){
        pattern=Pattern.compile(passwordsPattern);
        matcher=pattern.matcher(password);
        return matcher.matches(); 
    }
   
    
}