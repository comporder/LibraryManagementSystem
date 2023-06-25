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
public class Kullanici {
    /*Kullanici sınıfı, kullanıcı bilgilerini ve kullanıcının ödünç aldığı kitapları temsil etmek için kullanılan bir veri modelidir. 
    Sınıfın özellikleri (instance variables) kullanıcı adı, şifre, adres ve ödünç alınan kitaplar olarak belirlenmiştir.*/

    private String kullaniciAdi;
    private String sifre;
    private String adres;
    private ArrayList<Kitap> oduncAlinanKitaplar;
    /*Kullanici sınıfı, bir kullanıcının bilgilerini ve ödünç aldığı kitapları saklamak için kullanılan bir veri modelidir.
    kullaniciAdi değişkeni, kullanıcının kullanıcı adını temsil eder.
    sifre değişkeni, kullanıcının şifresini temsil eder.
    adres değişkeni, kullanıcının adresini temsil eder.
    oduncAlinanKitaplar değişkeni, kullanıcının ödünç aldığı kitapları saklamak için bir ArrayList nesnesidir.*/

    /*Sınıfın yapıcısı (constructor) Kullanici sınıfı için gerekli olan bilgileri alarak örnekleme oluşturur. get metotları, ilgili özelliklere erişim sağlar ve değerlerini döndürür.
    kitapOduncAl ve kitapIadeEt metotları, kullanıcının kitap ödünç almasını ve iade etmesini sağlar. set metotları, ilgili özelliklere yeni değerler atar.*/
    public Kullanici() {

    }

    public Kullanici(String kullaniciAdi, String sifre, String adres) {
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        this.adres = adres;
        this.oduncAlinanKitaplar = new ArrayList<>();
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public String getAdres() {
        return adres;
    }

    public ArrayList<Kitap> getOduncAlinanKitaplar() {
        return oduncAlinanKitaplar;
    }

    public void kitapOduncAl(Kitap kitap) {
        oduncAlinanKitaplar.add(kitap);
    }

    public void kitapIadeEt(Kitap kitap) {
        oduncAlinanKitaplar.remove(kitap);
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
}
