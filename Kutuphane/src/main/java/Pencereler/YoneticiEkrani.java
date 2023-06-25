/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pencereler;

import Sınıflar.Kitap;
import Sınıflar.Kullanici;
import Sınıflar.Kullanicilar;
import Sınıflar.Yonetici;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emir
 */
public class YoneticiEkrani extends javax.swing.JFrame {

    /**
     * Creates new form YoneticiEkrani
     */
    SifreDegistirmeEkrani sifreDegistir;
    KullaniciAdiDegistirmeEkrani adDegistir;
    private ArrayList<Kitap> kitaplar;
    private DefaultTableModel kitapTablosu;
    private DefaultTableModel kullaniciTablosu;
    private ArrayList<Kullanici> kullaniciListesi;
    Yonetici admin;

    public YoneticiEkrani() {
        initComponents();
        /*SifreDegistirmeEkrani ve KullaniciAdiDegistirmeEkrani sınıflarından nesneler oluşturulur.
        kitapTablosu ve kullaniciTablosu adlı DefaultTableModel nesneleri, tablolardaki verileri tutmak için oluşturulur.
        kitaplar ve kullaniciListesi adlı ArrayList nesneleri oluşturulur.*/
        sifreDegistir = new SifreDegistirmeEkrani();
        admin = new Yonetici();
        adDegistir = new KullaniciAdiDegistirmeEkrani();
        kitapTablosu = (DefaultTableModel) tbl_kitaplar.getModel();
        kullaniciTablosu = (DefaultTableModel) tbl_kullanicilar.getModel();
        kitaplar = new ArrayList<>();
        kullaniciListesi = new ArrayList<>();
        /*Tablolara ilgili tablo modelleri atanır ve tablo görüntüsü güncellenir.*/
        tbl_kitaplar.setModel(kitapTablosu);
        tbl_kullanicilar.setModel(kullaniciTablosu);
        guncelleKitapTablosu();
        guncelleKullaniciTablosu();
        ImageIcon image = new ImageIcon(getClass().getResource("logo.png"));
        jLabel1.setIcon(image);
        jLabel2.setIcon(image);
        jLabel3.setIcon(image);
        ImageIcon image2 = new ImageIcon(getClass().getResource("icon60.png"));
        jLabel6.setIcon(image2);
        jLabel4.setIcon(image2);
        jLabel5.setIcon(image2);
        this.setLocationRelativeTo(null);
        kullaniciListesi = new ArrayList<>();

        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

    /*Kullanıcı bilgileri (kullaniciAdi ve adres) alınarak ilgili metotlarla ekrana yansıtılır.*/
    public void setYoneticiBilgileri(String kullaniciAdi, String adres) {
        txt_kullaniciAdi.setText(kullaniciAdi);
        txt_address.setText(adres);
    }

    /*guncelleKullaniciTablosu metodu, kullanıcı tablosunu güncellemek için çağrılır.*/
    private void guncelleKullaniciTablosu() {
        kullanicilariEkle();
        tbl_kullanicilar.setForeground(new Color(51, 102, 255));
        kullaniciTablosu.setRowCount(0);
        ArrayList<Kullanici> kullanicilar = getKullanicilar();
        for (Kullanici kullanici : kullanicilar) {
            Object[] satir = {kullanici.getKullaniciAdi(), kullanici.getAdres()};
            kullaniciTablosu.addRow(satir);
        }
    }

    /*kullaniciEkle metoduyla yeni kullanıcılar kullaniciListesi'ne eklenir.*/
    public void kullaniciEkle(Kullanici kullanici) {
        kullaniciListesi.add(kullanici);
    }

    /*kullanicilariEkle metoduyla örnek kullanıcılar kullaniciListesi'ne eklenir.*/
    private void kullanicilariEkle() {
        kullaniciEkle(new Kullanici("haydarahmet", "haydar123", "haydar_ahmet@gmail.com"));
        kullaniciEkle(new Kullanici("eraybasoglu", "225228eb", "eraybsglu@hotmail.com"));
        kullaniciEkle(new Kullanici("ebrartutku", "tutkuebrar", "tutkuebrar@outlook.com"));
        kullaniciEkle(new Kullanici("emirozalp", "2002emir", "emir.ozalp@gmail.com"));
        kullaniciEkle(new Kullanici("beyzayasar", "yasarrrr", "beyza_yasar@outlook.com"));
        kullaniciEkle(new Kullanici("eylulsahin", "eylulnursahin", "nur_sahin@hotmail.com"));

    }

    /*getKullanicilar metoduyla kullaniciListesi döndürülür.*/
    public ArrayList<Kullanici> getKullanicilar() {
        return kullaniciListesi;
    }

    /*kitapEkle metoduyla yeni kitaplar kitaplar listesine eklenir.*/
    public void kitapEkle(Kitap kitap) {
        kitaplar.add(kitap);
    }

    /*kitaplariEkle metoduyla örnek kitaplar default olarak kitaplar listesine eklenir.*/
    private void kitaplariEkle() {
        kitapEkle(new Kitap("Fareler ve İnsanlar", "128", "John", "Steinbeck ", "Roman", "Sel Yayınevi"));
        kitapEkle(new Kitap("1984", "352", "George", "Orwell ", "Roman", "Can Yayınevi"));
        kitapEkle(new Kitap("Dönüşüm ", "80", "Franz ", "Kafka ", "Roman", "Sel Yayınevi"));
        kitapEkle(new Kitap("Fahrenheit 451", "208", "Ray ", "Bradbury ", "Roman", "İthaki Yayınevi"));
        kitapEkle(new Kitap("Uçurtma Avcısı", "75", "Khaled ", "Hosseini ", "Roman", "Sel Yayınevi"));
        kitapEkle(new Kitap("National Geographic Kids ", "304", "Kolektif", " ", "Ansiklopedi", "National Geographic"));
        kitapEkle(new Kitap("Resimli Osmanlı Tarihi", "541", "Yavuz", "Bahadıroğlu ", "Ansiklopedi", "Nesil Yayınevi"));
        kitapEkle(new Kitap("2.Sınıf Tatil Kitabım ", "240", "Tudem", "Yayınları ", "Ders Kitabı", "Tudem Yayınevi"));
        kitapEkle(new Kitap("Havuzda Define Avı", "32", "Carly", "Hart ", "Hikaye", "Pearson Çocuk Yayınevi"));

    }

    /*getKitaplar metoduyla kitaplar listesi döndürülür.
     */
    public ArrayList<Kitap> getKitaplar() {
        kitaplariEkle();
        return kitaplar;
    }

    /*guncelleKitapTablosu metodu, kitap tablosunu güncellemek için çağrılır.*/
    private void guncelleKitapTablosu() {
        kitaplariEkle();
        tbl_kitaplar.setForeground(new Color(51, 102, 255));
        // tbl_kitaplar.setModel(tableModel);
        kitapTablosu.setRowCount(0);
        ArrayList<Kitap> kitapListesi = getKitaplar();
        for (Kitap kitap : kitapListesi) {
            Object[] satir = {kitap.getKitapAdi(), kitap.getSaysaSayisi(), kitap.getYazarAdi(), kitap.getYazarSoyadi(), kitap.getKitapTuru(), kitap.getYayınEvi()};
            kitapTablosu.addRow(satir);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbbd_anaSayfa = new javax.swing.JTabbedPane();
        anaSayfa = new javax.swing.JPanel();
        lbl_kutuphanesi = new javax.swing.JLabel();
        lbl_dostlar = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_kullanicilar = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lbl_yayinEvi = new javax.swing.JLabel();
        txt_kitapAdi = new javax.swing.JTextField();
        lbl_kitapTuru = new javax.swing.JLabel();
        lbl_yazarSoyad = new javax.swing.JLabel();
        lbl_yazarAd = new javax.swing.JLabel();
        txt_yayınEvi = new javax.swing.JTextField();
        txt_yazarAdi = new javax.swing.JTextField();
        lbl_kitapAd = new javax.swing.JLabel();
        txt_yazarSoyad = new javax.swing.JTextField();
        lbl_sayfaSayisi = new javax.swing.JLabel();
        cmb_kitapTuru = new javax.swing.JComboBox<>();
        spn_sayfaSayisi = new javax.swing.JSpinner();
        btn_kitabiEkle = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_kitaplar = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnl_personalInfosPane = new javax.swing.JPanel();
        pnl_personalInfos = new javax.swing.JPanel();
        lbl_iconOfPersonal = new javax.swing.JLabel();
        kisiselBilgilerim = new javax.swing.JPanel();
        lbl_kullaniciAdi = new javax.swing.JLabel();
        lbl_address = new javax.swing.JLabel();
        txt_kullaniciAdi = new javax.swing.JTextField();
        jscrollpane_address = new javax.swing.JScrollPane();
        txt_address = new javax.swing.JTextArea();
        btn_bilgileriDegis = new javax.swing.JButton();
        lbl_kutuphanesi1 = new javax.swing.JLabel();
        lbl_dostlar1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnl_helpSupportPane = new javax.swing.JPanel();
        yardımDestek = new javax.swing.JPanel();
        lbl_adDegis = new javax.swing.JLabel();
        lbl_sifreDegis = new javax.swing.JLabel();
        lbl_cıkıs = new javax.swing.JLabel();
        btn_sifreDegis = new javax.swing.JButton();
        btn_cıkısYap = new javax.swing.JButton();
        btn_adDegis = new javax.swing.JButton();
        lbl_kutuphanesi2 = new javax.swing.JLabel();
        lbl_dostlar2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pnl_aboutUs = new javax.swing.JPanel();
        splitpane_aboutUs = new javax.swing.JSplitPane();
        pnl_about = new javax.swing.JPanel();
        jscrollpane_aboutUs = new javax.swing.JScrollPane();
        jtextarea_aboutUs = new javax.swing.JTextArea();
        pnl_systemFeedback = new javax.swing.JPanel();
        jscrollpane_feedback = new javax.swing.JScrollPane();
        jtxtarea_feedback = new javax.swing.JTextArea();
        lbl_feedbackQuestion = new javax.swing.JLabel();
        btn_sendFeedback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbbd_anaSayfa.setBackground(new java.awt.Color(255, 255, 255));
        tbbd_anaSayfa.setForeground(new java.awt.Color(51, 102, 255));
        tbbd_anaSayfa.setOpaque(true);

        anaSayfa.setBackground(new java.awt.Color(255, 255, 255));
        anaSayfa.setMaximumSize(new java.awt.Dimension(404, 512));
        anaSayfa.setMinimumSize(new java.awt.Dimension(404, 512));
        anaSayfa.setPreferredSize(new java.awt.Dimension(404, 512));
        anaSayfa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_kutuphanesi.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        lbl_kutuphanesi.setForeground(new java.awt.Color(51, 102, 255));
        lbl_kutuphanesi.setText("KÜTÜPHANESI|");
        anaSayfa.add(lbl_kutuphanesi, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 210, -1));

        lbl_dostlar.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        lbl_dostlar.setForeground(new java.awt.Color(51, 102, 255));
        lbl_dostlar.setText("| DOSTLAR");
        anaSayfa.add(lbl_dostlar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 130, 30));

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        tbl_kullanicilar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Kullanıcı Adı", "Adres"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_kullanicilar);
        if (tbl_kullanicilar.getColumnModel().getColumnCount() > 0) {
            tbl_kullanicilar.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel1.add(jScrollPane2);

        jTabbedPane1.addTab("Kullanıcılar", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_yayinEvi.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_yayinEvi.setForeground(new java.awt.Color(51, 102, 255));
        lbl_yayinEvi.setText("Yayınevi");
        jPanel2.add(lbl_yayinEvi, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 140, 30));
        jPanel2.add(txt_kitapAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 190, -1));

        lbl_kitapTuru.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_kitapTuru.setForeground(new java.awt.Color(51, 102, 255));
        lbl_kitapTuru.setText("Kitap Türü");
        jPanel2.add(lbl_kitapTuru, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 140, 30));

        lbl_yazarSoyad.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_yazarSoyad.setForeground(new java.awt.Color(51, 102, 255));
        lbl_yazarSoyad.setText("Yazar Soyadı");
        jPanel2.add(lbl_yazarSoyad, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 140, 30));

        lbl_yazarAd.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_yazarAd.setForeground(new java.awt.Color(51, 102, 255));
        lbl_yazarAd.setText("Yazar Adı");
        jPanel2.add(lbl_yazarAd, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 140, 30));
        jPanel2.add(txt_yayınEvi, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 190, -1));
        jPanel2.add(txt_yazarAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 190, -1));

        lbl_kitapAd.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_kitapAd.setForeground(new java.awt.Color(51, 102, 255));
        lbl_kitapAd.setText("Kitap Adı");
        jPanel2.add(lbl_kitapAd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 140, 30));
        jPanel2.add(txt_yazarSoyad, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 190, -1));

        lbl_sayfaSayisi.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_sayfaSayisi.setForeground(new java.awt.Color(51, 102, 255));
        lbl_sayfaSayisi.setText("Sayfa Sayısı");
        jPanel2.add(lbl_sayfaSayisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 140, 30));

        cmb_kitapTuru.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmb_kitapTuru.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hikaye", "Dergi", "Roman", "Ansiklopedi", "Ders Kitabı", "Diğer..." }));
        jPanel2.add(cmb_kitapTuru, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 190, -1));

        spn_sayfaSayisi.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel2.add(spn_sayfaSayisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 190, -1));

        btn_kitabiEkle.setBackground(new java.awt.Color(51, 102, 255));
        btn_kitabiEkle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_kitabiEkle.setForeground(new java.awt.Color(255, 255, 255));
        btn_kitabiEkle.setText("Kitabı Kütüphaneye Ekle");
        btn_kitabiEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kitabiEkleActionPerformed(evt);
            }
        });
        jPanel2.add(btn_kitabiEkle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 240, 30));

        jTabbedPane1.addTab("Sisteme Kitap Ekle", jPanel2);

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        tbl_kitaplar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Kitap Adı", "Sayfa Sayısı", "Yazar Ad", "Yazar Soyad", "Kitap Türü", "Yayınevi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_kitaplar);
        if (tbl_kitaplar.getColumnModel().getColumnCount() > 0) {
            tbl_kitaplar.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel3.add(jScrollPane1);

        jTabbedPane1.addTab("Kitaplar", jPanel3);

        anaSayfa.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 610, 380));
        anaSayfa.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 70, 60));
        anaSayfa.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 80, 70));

        tbbd_anaSayfa.addTab("Ana Sayfa", anaSayfa);

        pnl_personalInfos.setBackground(new java.awt.Color(255, 255, 255));
        pnl_personalInfos.setMaximumSize(new java.awt.Dimension(404, 512));
        pnl_personalInfos.setMinimumSize(new java.awt.Dimension(404, 512));
        pnl_personalInfos.setPreferredSize(new java.awt.Dimension(404, 512));
        pnl_personalInfos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_iconOfPersonal.setText(" ");
        pnl_personalInfos.add(lbl_iconOfPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        kisiselBilgilerim.setBackground(new java.awt.Color(255, 255, 255));
        kisiselBilgilerim.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kişisel Bilgilerim", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(51, 102, 255))); // NOI18N
        kisiselBilgilerim.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_kullaniciAdi.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_kullaniciAdi.setForeground(new java.awt.Color(51, 102, 255));
        lbl_kullaniciAdi.setText("Kullanıcı Adı");
        kisiselBilgilerim.add(lbl_kullaniciAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 140, -1));

        lbl_address.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_address.setForeground(new java.awt.Color(51, 102, 255));
        lbl_address.setText("Adres");
        kisiselBilgilerim.add(lbl_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 140, -1));

        txt_kullaniciAdi.setEnabled(false);
        kisiselBilgilerim.add(txt_kullaniciAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 240, -1));

        txt_address.setColumns(20);
        txt_address.setLineWrap(true);
        txt_address.setRows(5);
        txt_address.setEnabled(false);
        jscrollpane_address.setViewportView(txt_address);

        kisiselBilgilerim.add(jscrollpane_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 240, -1));

        btn_bilgileriDegis.setBackground(new java.awt.Color(51, 102, 255));
        btn_bilgileriDegis.setForeground(new java.awt.Color(255, 255, 255));
        btn_bilgileriDegis.setText("Bilgilerimi Değiştir");
        btn_bilgileriDegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bilgileriDegisActionPerformed(evt);
            }
        });
        kisiselBilgilerim.add(btn_bilgileriDegis, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 240, -1));

        pnl_personalInfos.add(kisiselBilgilerim, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 610, 390));

        lbl_kutuphanesi1.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        lbl_kutuphanesi1.setForeground(new java.awt.Color(51, 102, 255));
        lbl_kutuphanesi1.setText("KÜTÜPHANESI|");
        pnl_personalInfos.add(lbl_kutuphanesi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 210, -1));

        lbl_dostlar1.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        lbl_dostlar1.setForeground(new java.awt.Color(51, 102, 255));
        lbl_dostlar1.setText("| DOSTLAR");
        pnl_personalInfos.add(lbl_dostlar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 130, 30));
        pnl_personalInfos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 70, 60));
        pnl_personalInfos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 80, 70));

        javax.swing.GroupLayout pnl_personalInfosPaneLayout = new javax.swing.GroupLayout(pnl_personalInfosPane);
        pnl_personalInfosPane.setLayout(pnl_personalInfosPaneLayout);
        pnl_personalInfosPaneLayout.setHorizontalGroup(
            pnl_personalInfosPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_personalInfos, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
        );
        pnl_personalInfosPaneLayout.setVerticalGroup(
            pnl_personalInfosPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_personalInfos, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
        );

        tbbd_anaSayfa.addTab("Kişisel Bilgiler", pnl_personalInfosPane);

        yardımDestek.setBackground(new java.awt.Color(255, 255, 255));
        yardımDestek.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_adDegis.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_adDegis.setForeground(new java.awt.Color(51, 102, 255));
        lbl_adDegis.setText("Kullanıcı adınızı değiştirmek mi istiyorsunuz ?");
        yardımDestek.add(lbl_adDegis, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        lbl_sifreDegis.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_sifreDegis.setForeground(new java.awt.Color(51, 102, 255));
        lbl_sifreDegis.setText("Şifrenizi değiştirmek mi istiyorsunuz ?");
        yardımDestek.add(lbl_sifreDegis, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        lbl_cıkıs.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_cıkıs.setForeground(new java.awt.Color(51, 102, 255));
        lbl_cıkıs.setText("Çıkış mı yapmak istiyorsunuz ?");
        yardımDestek.add(lbl_cıkıs, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 280, 30));

        btn_sifreDegis.setBackground(new java.awt.Color(51, 102, 255));
        btn_sifreDegis.setForeground(new java.awt.Color(255, 255, 255));
        btn_sifreDegis.setText("Şifre Değiştir");
        btn_sifreDegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sifreDegisActionPerformed(evt);
            }
        });
        yardımDestek.add(btn_sifreDegis, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 150, -1));

        btn_cıkısYap.setBackground(new java.awt.Color(51, 102, 255));
        btn_cıkısYap.setForeground(new java.awt.Color(255, 255, 255));
        btn_cıkısYap.setText("Çıkış Yap");
        btn_cıkısYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cıkısYapActionPerformed(evt);
            }
        });
        yardımDestek.add(btn_cıkısYap, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 150, -1));

        btn_adDegis.setBackground(new java.awt.Color(51, 102, 255));
        btn_adDegis.setForeground(new java.awt.Color(255, 255, 255));
        btn_adDegis.setText("Kullanıcı Adı Değiştir");
        btn_adDegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adDegisActionPerformed(evt);
            }
        });
        yardımDestek.add(btn_adDegis, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 150, -1));

        lbl_kutuphanesi2.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        lbl_kutuphanesi2.setForeground(new java.awt.Color(51, 102, 255));
        lbl_kutuphanesi2.setText("KÜTÜPHANESI|");
        yardımDestek.add(lbl_kutuphanesi2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 210, -1));

        lbl_dostlar2.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        lbl_dostlar2.setForeground(new java.awt.Color(51, 102, 255));
        lbl_dostlar2.setText("| DOSTLAR");
        yardımDestek.add(lbl_dostlar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 130, 30));
        yardımDestek.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 70, 60));
        yardımDestek.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 80, 70));

        javax.swing.GroupLayout pnl_helpSupportPaneLayout = new javax.swing.GroupLayout(pnl_helpSupportPane);
        pnl_helpSupportPane.setLayout(pnl_helpSupportPaneLayout);
        pnl_helpSupportPaneLayout.setHorizontalGroup(
            pnl_helpSupportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
            .addGroup(pnl_helpSupportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(yardımDestek, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE))
        );
        pnl_helpSupportPaneLayout.setVerticalGroup(
            pnl_helpSupportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
            .addGroup(pnl_helpSupportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(yardımDestek, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE))
        );

        tbbd_anaSayfa.addTab("Yardım & Destek", pnl_helpSupportPane);

        pnl_aboutUs.setLayout(new javax.swing.BoxLayout(pnl_aboutUs, javax.swing.BoxLayout.LINE_AXIS));

        splitpane_aboutUs.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        pnl_about.setBackground(new java.awt.Color(255, 255, 255));
        pnl_about.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dostlar Kütüphanesi Hakkında", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(51, 102, 255))); // NOI18N
        pnl_about.setMaximumSize(new java.awt.Dimension(677, 312));
        pnl_about.setMinimumSize(new java.awt.Dimension(677, 312));
        pnl_about.setPreferredSize(new java.awt.Dimension(677, 312));
        pnl_about.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtextarea_aboutUs.setEditable(false);
        jtextarea_aboutUs.setColumns(20);
        jtextarea_aboutUs.setLineWrap(true);
        jtextarea_aboutUs.setRows(5);
        jtextarea_aboutUs.setText("Dostlar Kütüphanesi, toplumsal yaşamın, ilişkilerin ve gereksinimlerin sonucu olarak ortaya çıkmış; amaç ve işlevlerini içinde bulundukları tarihsel ve toplumsal koşulların biçimlendirdiği kurumdur. Yine bir toplumda yaşayan kişiler arasında hiçbir ayrım gözetmeden, onların eğitim, kültür ve bilgi gereksinimlerini karşılıksız yerine getirmeyi ve boş zamanlarını değerlendirmeyi amaçlayan bir kurumdur. Dostlar Kütüphanesi; cins, yaş, ırk, milliyet, din, dil, eğitim, kültür, sosyo-ekonomik düzey ve politik görüş farkı gözetmeden, her tür kütüphane materyali ve çeşitli iletişim yolları aracılığıyla kültür ürünlerini ve bilgiyi insanlığın hizmetine ücretsiz sunarak, onlara ömür boyu eğitim ve boş zamanları değerlendirme olanağı veren, toplumla bütünleşip, sağlıklı kamuoyunun oluşmasına olanak sağlayan, toplumun ekonomik, sosyal, eğitsel kültürel ve teknik kalkınmasının gerçekleşmesini etkileyen, dünya barışının sağlanmasına yardımcı olan demokratik bir kuruluştur.");
        jtextarea_aboutUs.setWrapStyleWord(true);
        jscrollpane_aboutUs.setViewportView(jtextarea_aboutUs);

        pnl_about.add(jscrollpane_aboutUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 660, 230));

        splitpane_aboutUs.setTopComponent(pnl_about);

        pnl_systemFeedback.setBackground(new java.awt.Color(51, 102, 255));
        pnl_systemFeedback.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sistem Geribildirimi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        pnl_systemFeedback.setMaximumSize(new java.awt.Dimension(677, 200));
        pnl_systemFeedback.setMinimumSize(new java.awt.Dimension(677, 200));
        pnl_systemFeedback.setPreferredSize(new java.awt.Dimension(677, 200));
        pnl_systemFeedback.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtarea_feedback.setColumns(20);
        jtxtarea_feedback.setLineWrap(true);
        jtxtarea_feedback.setRows(5);
        jscrollpane_feedback.setViewportView(jtxtarea_feedback);

        pnl_systemFeedback.add(jscrollpane_feedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 660, 150));

        lbl_feedbackQuestion.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_feedbackQuestion.setForeground(new java.awt.Color(255, 255, 255));
        lbl_feedbackQuestion.setText("Uygulamamızı nasıl buldunuz ?");
        pnl_systemFeedback.add(lbl_feedbackQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, 30));

        btn_sendFeedback.setForeground(new java.awt.Color(51, 102, 255));
        btn_sendFeedback.setText("Gönder");
        btn_sendFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sendFeedbackActionPerformed(evt);
            }
        });
        pnl_systemFeedback.add(btn_sendFeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 180, -1));

        splitpane_aboutUs.setRightComponent(pnl_systemFeedback);

        pnl_aboutUs.add(splitpane_aboutUs);

        tbbd_anaSayfa.addTab("Uygulama Hakkında", pnl_aboutUs);

        getContentPane().add(tbbd_anaSayfa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_bilgileriDegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bilgileriDegisActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Kişisel bilgilerinizin bir kısmını değiştirmek istiyorsanız."
                + "\n'Yardım ve Destek' bölümüne gitmeniz gerekiyor.", "Kişisel Bilgileri Değiştirme", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_bilgileriDegisActionPerformed

    private void btn_sifreDegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sifreDegisActionPerformed
        // Kullanıcıya şifresini değiştireceğinden emin olup olmadığı soruldu, cevabınız evet ise şifre değiştirme ekranına girildi.
        int resetPass = JOptionPane.showConfirmDialog(rootPane, "Şifrenizi değiştirmek istediğinize emin misiniz?", "", JOptionPane.YES_NO_OPTION);
        if (resetPass == JOptionPane.YES_OPTION) {
            sifreDegistir.setVisible(true);
        }
    }//GEN-LAST:event_btn_sifreDegisActionPerformed

    private void btn_cıkısYapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cıkısYapActionPerformed
        // Kullanıcıya uygulamadan çıkmak istediğinden emin olup olmadığı soruldu, alınan cevap evet, başvuru ekranı kapatıldı       
        int logOut = JOptionPane.showConfirmDialog(rootPane, "Çıkış yapmak istediğinize emin misiniz?", "", JOptionPane.YES_NO_OPTION);
        if (logOut == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_btn_cıkısYapActionPerformed

    private void btn_adDegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adDegisActionPerformed
        // Kullanıcıya kullanıcı adını değiştirme konusunda emin olup olmadığı soruldu, cevabınız evet ise kullanıcı adı değiştirme ekranına girildi.
        int changeName = JOptionPane.showConfirmDialog(rootPane, "Kullanıcı adınızı değiştirmek istediğinizden emin misiniz?", "", JOptionPane.YES_NO_OPTION);
        if (changeName == JOptionPane.YES_OPTION) {
            adDegistir.setVisible(true);
        }
    }//GEN-LAST:event_btn_adDegisActionPerformed

    private void btn_sendFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sendFeedbackActionPerformed
        /*İlk olarak, geri bildirim metni kontrol edilir. Eğer metin boş ise kullanıcıya bir uyarı mesajı gösterilir.*/
        if (jtxtarea_feedback.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Gönderilecek herhangi bir not yazmadınız.\nLütfen bir not yazın", "", JOptionPane.WARNING_MESSAGE);
        } else {
            /*Eğer geri bildirim metni boş değilse, geri bildirim mesajı ve kullanıcı adı alınır.*/
            String message = jtxtarea_feedback.getText();
            String name = txt_kullaniciAdi.getText();
            JOptionPane.showMessageDialog(rootPane, "Sistem geri bildiriminiz başarıyla sağlanmıştır.", "", JOptionPane.INFORMATION_MESSAGE);
            jtxtarea_feedback.setText("");
        }
    }//GEN-LAST:event_btn_sendFeedbackActionPerformed

    private void btn_kitabiEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kitabiEkleActionPerformed
        /*Kullanıcının girdiği kitap adı, yazar adı, yazar soyadı, yayın evi ve kitap türü bilgileri ilgili değişkenlere atanır.*/
        String kitapAdi = txt_kitapAdi.getText();
        String yazarAd = txt_yazarAdi.getText();
        String yazarSoyad = txt_yazarSoyad.getText();
        String yayinEvi = txt_yayınEvi.getText();
        String tur = (String) cmb_kitapTuru.getSelectedItem();
        /*Sayfa sayısı, bir spinner bileşeni (spn_sayfaSayisi) aracılığıyla alınır ve bir tamsayıya dönüştürülerek sayfa değişkenine atanır.
        Sayfa sayısı int türünden String türüne dönüştürülerek sayfaSayisi değişkenine atanır.*/
        int sayfa = (int) spn_sayfaSayisi.getValue();
        String sayfaSayisi = String.valueOf(sayfa);

        /*Kitap adı, yazar adı, yazar soyadı ve yayın evi alanlarının boş olmadığı kontrol edilir. Eğer boş bir alan varsa, kullanıcıya bir uyarı mesajı gösterilir.*/
        if (!kitapAdi.equals("") && !yazarAd.equals("") && !yazarSoyad.equals("") && !yayinEvi.equals("")) {
            /*Eğer tüm alanlar doldurulmuşsa, Kitap sınıfından yeni bir yeniKitap nesnesi oluşturulur ve kullanıcının girdiği bilgilerle initialize edilir.*/
            Kitap yeniKitap = new Kitap(kitapAdi, sayfaSayisi, yazarAd, yazarSoyad, tur, yayinEvi);
            /*Kullanıcıya kitabın başarıyla kütüphaneye eklendiğine dair bir bilgilendirme mesajı gösterilir.*/
            JOptionPane.showMessageDialog(rootPane, "Kitap başarıyla kütüphaneye eklendi.\nGörebilmek adına Kitaplar sekmesine gidiniz.", "Kitap Eklendi", JOptionPane.INFORMATION_MESSAGE);
            /*kitapEkle metodu çağrılarak yeni kitap kütüphaneye eklenir.*/
            kitapEkle(yeniKitap);
            /*guncelleKitapTablosu metodu çağrılarak kitap tablosu güncellenir.*/
            guncelleKitapTablosu();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Herhangi bir alanı boş bırakmayınız, tüm alanları doldurunuz!", "Uyarı", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btn_kitabiEkleActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(YoneticiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YoneticiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YoneticiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YoneticiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YoneticiEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel anaSayfa;
    private javax.swing.JButton btn_adDegis;
    private javax.swing.JButton btn_bilgileriDegis;
    private javax.swing.JButton btn_cıkısYap;
    private javax.swing.JButton btn_kitabiEkle;
    private javax.swing.JButton btn_sendFeedback;
    private javax.swing.JButton btn_sifreDegis;
    private javax.swing.JComboBox<String> cmb_kitapTuru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JScrollPane jscrollpane_aboutUs;
    private javax.swing.JScrollPane jscrollpane_address;
    private javax.swing.JScrollPane jscrollpane_feedback;
    private javax.swing.JTextArea jtextarea_aboutUs;
    private javax.swing.JTextArea jtxtarea_feedback;
    private javax.swing.JPanel kisiselBilgilerim;
    private javax.swing.JLabel lbl_adDegis;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_cıkıs;
    private javax.swing.JLabel lbl_dostlar;
    private javax.swing.JLabel lbl_dostlar1;
    private javax.swing.JLabel lbl_dostlar2;
    private javax.swing.JLabel lbl_feedbackQuestion;
    private javax.swing.JLabel lbl_iconOfPersonal;
    private javax.swing.JLabel lbl_kitapAd;
    private javax.swing.JLabel lbl_kitapTuru;
    private javax.swing.JLabel lbl_kullaniciAdi;
    private javax.swing.JLabel lbl_kutuphanesi;
    private javax.swing.JLabel lbl_kutuphanesi1;
    private javax.swing.JLabel lbl_kutuphanesi2;
    private javax.swing.JLabel lbl_sayfaSayisi;
    private javax.swing.JLabel lbl_sifreDegis;
    private javax.swing.JLabel lbl_yayinEvi;
    private javax.swing.JLabel lbl_yazarAd;
    private javax.swing.JLabel lbl_yazarSoyad;
    private javax.swing.JPanel pnl_about;
    private javax.swing.JPanel pnl_aboutUs;
    private javax.swing.JPanel pnl_helpSupportPane;
    private javax.swing.JPanel pnl_personalInfos;
    private javax.swing.JPanel pnl_personalInfosPane;
    private javax.swing.JPanel pnl_systemFeedback;
    private javax.swing.JSplitPane splitpane_aboutUs;
    private javax.swing.JSpinner spn_sayfaSayisi;
    private javax.swing.JTabbedPane tbbd_anaSayfa;
    private javax.swing.JTable tbl_kitaplar;
    private javax.swing.JTable tbl_kullanicilar;
    private javax.swing.JTextArea txt_address;
    private javax.swing.JTextField txt_kitapAdi;
    private javax.swing.JTextField txt_kullaniciAdi;
    private javax.swing.JTextField txt_yayınEvi;
    private javax.swing.JTextField txt_yazarAdi;
    private javax.swing.JTextField txt_yazarSoyad;
    private javax.swing.JPanel yardımDestek;
    // End of variables declaration//GEN-END:variables
}
