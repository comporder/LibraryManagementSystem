/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sınıflar;

/**
 *
 * @author emir
 */
public class Kitap {

    /*Kitap sınıfı, kitap bilgilerini temsil etmek için kullanılan bir veri modelidir.
    Sınıfın özellikleri (instance variables) kitap adı, sayfa sayısı, yazar adı, yazar soyadı, kitap türü ve yayın evi olarak belirlenmiştir.*/
    private final String kitapAdi;
    private final String saysaSayisi;
    private final String yazarAdi;
    private final String yazarSoyadi;
    private final String kitapTuru;
    private final String yayınEvi;

    /*Kitap sınıfı, bir kitabın özelliklerini tutmak için kullanılan bir veri modelidir.
    kitapAdi değişkeni, kitabın adını temsil eder.
    saysaSayisi değişkeni, kitabın sayfa sayısını temsil eder.
    yazarAdi değişkeni, kitabın yazarının adını temsil eder.
    yazarSoyadi değişkeni, kitabın yazarının soyadını temsil eder.
    kitapTuru değişkeni, kitabın türünü temsil eder.
    yayınEvi değişkeni, kitabın yayın evini temsil eder.*/
    public Kitap(String kitapAdi, String sayfaSayisi, String yazarAdi, String yazarSoyadi, String kitapTuru, String yayinEvi) {
        this.kitapAdi = kitapAdi;
        this.saysaSayisi = sayfaSayisi;
        this.yazarAdi = yazarAdi;
        this.yazarSoyadi = yazarSoyadi;
        this.kitapTuru = kitapTuru;
        this.yayınEvi = yayinEvi;
    }

    /*Sınıfın yapıcısı (constructor) Kitap sınıfı için gerekli olan bilgileri alarak örnekleme oluşturur.
    get metotları, ilgili özelliklere erişim sağlar ve değerlerini döndürür. Bu sayede Kitap nesneleri, kitap bilgilerini saklayabilir ve ilgili özelliklere erişebilir.*/
    public String getKitapAdi() {
        return kitapAdi;
    }

    public String getSaysaSayisi() {
        return saysaSayisi;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public String getYazarSoyadi() {
        return yazarSoyadi;
    }

    public String getKitapTuru() {
        return kitapTuru;
    }

    public String getYayınEvi() {
        return yayınEvi;
    }

}
