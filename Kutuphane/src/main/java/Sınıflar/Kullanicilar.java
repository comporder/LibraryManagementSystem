/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sınıflar;

import java.util.ArrayList;

/**
 *
 * @author emir
 */
public class Kullanicilar {
    /*Kullanicilar sınıfını tanımlamaktadır. 
    Kullanicilar sınıfı, kullanıcıları saklamak, kullanıcı bilgilerini doğrulamak, kullanıcıları bulmak, kullanıcı adı veya şifre değişiklikleri yapmak gibi işlevleri gerçekleştirmek için kullanılan bir veri modelidir.*/

    /*kullanicilar değişkeni, kullanıcıları saklamak için bir ArrayList nesnesidir.*/
    private final ArrayList<Kullanici> kullanicilar;

    /*Kullanicilar sınıfının yapıcısı (constructor), kullanicilar listesini oluşturur ve bazı başlangıç kullanıcılarını ekler. İstendiğinde daha fazla başlangıç kullanıcısı eklenebilir.*/
    public Kullanicilar() {
        kullanicilar = new ArrayList<>();
        // Add some initial users with random information
        kullaniciEkle(new Kullanici("haydarahmet", "haydar123", "haydar_ahmet@gmail.com"));
        kullaniciEkle(new Kullanici("eraybasoglu", "225228eb", "eraybsglu@hotmail.com"));
        kullaniciEkle(new Kullanici("ebrartutku", "tutkuebrar", "tutkuebrar@outlook.com"));
        kullaniciEkle(new Kullanici("emirozalp", "2002emir", "emir.ozalp@gmail.com"));
        kullaniciEkle(new Kullanici("beyzayasar", "yasarrrr", "beyza_yasar@outlook.com"));
        kullaniciEkle(new Kullanici("eylulsahin", "eylulnursahin", "nur_sahin@hotmail.com"));
        // Add more initial users if needed
    }

    /*kullaniciEkle metodu, bir kullanıcıyı kullanicilar listesine ekler.*/
    public void kullaniciEkle(Kullanici kullanici) {
        kullanicilar.add(kullanici);
    }
    
    /*kullaniciSil metodu, belirtilen kullanıcıyı kullanicilar listesinden kaldırır.*/
    public void kullaniciSil(Kullanici kullanici) {
        kullanicilar.remove(kullanici);
    }
    
    /*bilgiAlma metodu, belirtilen kullanıcı adına ait kullanıcı bilgilerini döndürür.*/
    public Kullanici bilgiAlma(String kullaniciAdi){
        for (Kullanici kullanici : kullanicilar) {
            if (kullanici.getKullaniciAdi().equals(kullaniciAdi) ) {
                return kullanici; 
            }
        }
        return null;
    }

    /*kullaniciBilgileriDogrumu metodu, belirtilen kullanıcı adı ve şifrenin doğru olup olmadığını kontrol eder.*/
    public boolean kullaniciBilgileriDogrumu(String username, String password) {
        return kullaniciyiBul(username, password) != null;
    }

    /*kullaniciyiBul metodu, belirtilen kullanıcı adı ve şifreye sahip kullanıcıyı kullanicilar listesinde bulur.*/
    public Kullanici kullaniciyiBul(String username, String password) {
        for (Kullanici kullanici : kullanicilar) {
            if (kullanici.getKullaniciAdi().equals(username) && kullanici.getSifre().equals(password)) {
                return kullanici; // User found
            }
        }
        return null; // User not found
    }

    /*kullanicilariAl metodu, kullanicilar listesini döndürür.*/
    public ArrayList<Kullanici> kullanicilariAl() {
        return kullanicilar;
    }

    /*kullaniciAdiniDegistir metodu, belirtilen kullanıcı adına sahip kullanıcının kullanıcı adını değiştirir.*/
    public void kullaniciAdiniDegistir(String eskiAd, String sifre, String yeniAd) {
        for (Kullanici kullanici : kullanicilar) {
            if (kullanici.getKullaniciAdi().equals(eskiAd) && kullanici.getSifre().equals(sifre)) {
                kullanici.setKullaniciAdi(yeniAd);
            }
        }
    }

    /*sifreDegistir metodu, belirtilen kullanıcı adı ve eski şifreye sahip kullanıcının şifresini değiştirir.*/
    public void sifreDegistir(String eskiSifre, String yeniSifre, String kullaniciAdi) {
        for (Kullanici kullanici : kullanicilar) {
            if (kullanici.getKullaniciAdi().equals(kullaniciAdi) && kullanici.getSifre().equals(eskiSifre)) {
                kullanici.setSifre(yeniSifre);
            }
        }
    }

    /*kullaniciAdiAlinmismi metodu, belirtilen kullanıcı adının başka bir kullanıcı tarafından kullanılıp kullanılmadığını kontrol eder.*/
    public boolean kullaniciAdiAlinmismi(String username) {
        for (Kullanici user : kullanicilar) {
            if (user.getKullaniciAdi().equals(username)) {
                return true;
            }
        }
        return false; 
    }
}
