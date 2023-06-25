/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sınıflar;

import Sınıflar.Kitap;
import java.util.ArrayList;

/**
 *
 * @author emir
 */
public class Yonetici {

    /*Yonetici sınıfı, yönetici kullanıcılarının özelliklerini ve yönetici işlemlerini gerçekleştirmek için kullanılan bir veri modelidir.*/
    private String kullaniciAdi;
    private String sifre;
    private String adres;
    private ArrayList<Kitap> kitaplar;

    public Yonetici() {

    }

    /*kullaniciAdi, sifre, adres ve kitaplar özellikleri, yönetici kullanıcının kullanıcı adını, şifresini, adresini ve yöneticiye ait kitapları saklamak için kullanılan değişkenlerdir.*/
    public Yonetici(String kullaniciAdi, String sifre, String adres) {
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        this.adres = adres;
    }

    /*Yonetici sınıfının yapıcısı (constructor), yönetici kullanıcısının özelliklerini tanımlar.
    getKullaniciAdi metodu, yönetici kullanıcının kullanıcı adını döndürür.
    girisYap metodu, belirtilen kullanıcı adı ve şifrenin yönetici kullanıcının kullanıcı adı ve şifresiyle eşleşip eşleşmediğini kontrol eder.
    kitapEkle metodu, bir kitabı yöneticiye ait kitaplar listesine ekler.
    kitapSil metodu, belirtilen kitabı yöneticiye ait kitaplar listesinden kaldırır.
    getSifre metodu, yönetici kullanıcının şifresini döndürür.
    getAdres metodu, yönetici kullanıcının adresini döndürür.
    getKitaplar metodu, yöneticiye ait kitaplar listesini döndürür.*/
    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public boolean girisYap(String kullaniciAdi, String sifre) {
        return this.kullaniciAdi.equals(kullaniciAdi) && this.sifre.equals(sifre);
    }

    public void kitapEkle(Kitap kitap) {
        kitaplar.add(kitap);
    }

    public void kitapSil(Kitap kitap) {
        kitaplar.remove(kitap);

    }

    public String getSifre() {
        return sifre;
    }

    public String getAdres() {
        return adres;
    }

    public ArrayList<Kitap> getKitaplar() {
        return kitaplar;
    }

}
