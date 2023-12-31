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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emir
 */
public class KullaniciEkrani extends javax.swing.JFrame {

    /**
     * Creates new form Kullanici
     */
    YoneticiEkrani yonetici;
    KullaniciAdiDegistirmeEkrani adDegistir;
    SifreDegistirmeEkrani sifreDegistir;
    Kullanicilar kullanicilar;
    DefaultTableModel kitapTablosu;
    DefaultTableModel oduncKitapTablosu;
    private ArrayList<Kitap> kitaplar;
    private ArrayList<Kitap> oduncKitaplar;

    public KullaniciEkrani() {
        initComponents();
        /*yonetici, adDegistir, sifreDegistir, kullanicilar adında sınıf nesneleri tanımlanır. Bu nesneler, diğer sınıflara erişim sağlamak veya ilgili işlemleri gerçekleştirmek için kullanılır.
        kitapTablosu ve oduncKitapTablosu adında iki adet DefaultTableModel tanımlanır. Bu tablolar, kitap ve ödünç alınan kitap bilgilerini tutmak için kullanılır.
        kitaplar ve oduncKitaplar adında ArrayList<Kitap> nesneleri tanımlanır. Bu nesneler, kitapların ve ödünç alınan kitapların listesini tutmak için kullanılır.
        Sınıfın kurucusu KullaniciEkrani() tanımlanır. Bu kurucu yöntemde, arayüz bileşenlerinin başlangıç durumu ayarlanır, sınıf nesneleri oluşturulur ve tablo modelleri ile tablo görünümleri ayarlanır.*/
        ImageIcon image = new ImageIcon(getClass().getResource("logo.png"));
        lbl_logo1.setIcon(image);
        jLabel2.setIcon(image);
        jLabel3.setIcon(image);
        ImageIcon image2 = new ImageIcon(getClass().getResource("icon60.png"));
        lbl_icon.setIcon(image2);
        jLabel4.setIcon(image2);
        jLabel5.setIcon(image2);
        yonetici = new YoneticiEkrani();
        oduncKitaplar = new ArrayList<>();
        adDegistir = new KullaniciAdiDegistirmeEkrani();
        sifreDegistir = new SifreDegistirmeEkrani();
        kullanicilar = new Kullanicilar();
        kitapTablosu = (DefaultTableModel) tbl_kitaplar.getModel();
        oduncKitapTablosu = (DefaultTableModel) tbl_oduncKİtaplar.getModel();
        kitaplar = yonetici.getKitaplar();
        tbl_kitaplar.setModel(kitapTablosu);
        tbl_oduncKİtaplar.setModel(oduncKitapTablosu);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        guncelleKitapTablosu();
    }

    /*setKullaniciBilgileri() metodu, kullanıcı adı ve EMAİL adres bilgilerini alarak ilgili alanlara yerleştirir.*/
    public void setKullaniciBilgileri(String kullaniciAdi, String adres) {
        txt_kullaniciAdi.setText(kullaniciAdi);
        txt_addressEmail.setText(adres);
    }

    /*guncelleOduncKitapTablosu() metodu, kullanıcının ödünç aldığı kitapların tablosunu günceller. 
    Öncelikle kullanıcının ödünç aldığı kitapların listesini alır, daha sonra tabloya bu bilgileri ekler.*/
    private void guncelleOduncKitapTablosu() {
        tbl_oduncKİtaplar.setForeground(new Color(51, 102, 255));
        // tbl_kitaplar.setModel(tableModel);
        Kullanici ekranKullanicisi = new Kullanici();
        ekranKullanicisi = kullanicilar.bilgiAlma(txt_kullaniciAdi.getText());
        oduncKitapTablosu.setRowCount(0);
        oduncKitaplar = ekranKullanicisi.getOduncAlinanKitaplar();
        for (Kitap kitap : oduncKitaplar) {
            Object[] satir = {kitap.getKitapAdi(), kitap.getSaysaSayisi(), kitap.getYazarAdi(), kitap.getYazarSoyadi(), kitap.getKitapTuru(), kitap.getYayınEvi()};
            oduncKitapTablosu.addRow(satir);
        }
    }

    /*guncelleKitapTablosu() metodu, tüm kitapların tablosunu günceller. Kitapların bilgilerini alır ve tabloya ekler.*/
    private void guncelleKitapTablosu() {
        tbl_kitaplar.setForeground(new Color(51, 102, 255));
        // tbl_kitaplar.setModel(tableModel);
        kitapTablosu.setRowCount(0);

        for (Kitap kitap : kitaplar) {
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

        anaSayfa = new javax.swing.JTabbedPane();
        pnl_anaSayfa = new javax.swing.JPanel();
        lbl_kutuphanesi = new javax.swing.JLabel();
        lbl_dostlar = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_kitaplar = new javax.swing.JTable();
        btn_oduncAl = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_oduncKİtaplar = new javax.swing.JTable();
        lbl_icon = new javax.swing.JLabel();
        lbl_logo1 = new javax.swing.JLabel();
        pnl_personalInfosPane = new javax.swing.JPanel();
        kisiselBilgiler = new javax.swing.JPanel();
        lbl_iconOfPersonal = new javax.swing.JLabel();
        benimKisiselBilgilerim = new javax.swing.JPanel();
        lbl_kullaniciAdi = new javax.swing.JLabel();
        lbl_address = new javax.swing.JLabel();
        txt_kullaniciAdi = new javax.swing.JTextField();
        jscrollpane_address = new javax.swing.JScrollPane();
        txt_addressEmail = new javax.swing.JTextArea();
        btn_bilgileriDegistir = new javax.swing.JButton();
        lbl_kutuphanesi1 = new javax.swing.JLabel();
        lbl_dostlar1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnl_helpSupportPane = new javax.swing.JPanel();
        yardımDestek = new javax.swing.JPanel();
        lbl_changeUsername = new javax.swing.JLabel();
        lbl_resetPassword = new javax.swing.JLabel();
        lbl_logOut = new javax.swing.JLabel();
        btn_sifreDegis = new javax.swing.JButton();
        btn_cıkıs = new javax.swing.JButton();
        btn_adDegis = new javax.swing.JButton();
        lbl_kutuphanesi2 = new javax.swing.JLabel();
        lbl_dostlar2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
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
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        anaSayfa.setBackground(new java.awt.Color(255, 255, 255));
        anaSayfa.setForeground(new java.awt.Color(51, 102, 255));
        anaSayfa.setOpaque(true);

        pnl_anaSayfa.setBackground(new java.awt.Color(255, 255, 255));
        pnl_anaSayfa.setMaximumSize(new java.awt.Dimension(404, 512));
        pnl_anaSayfa.setMinimumSize(new java.awt.Dimension(404, 512));
        pnl_anaSayfa.setPreferredSize(new java.awt.Dimension(404, 512));
        pnl_anaSayfa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_kutuphanesi.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        lbl_kutuphanesi.setForeground(new java.awt.Color(51, 102, 255));
        lbl_kutuphanesi.setText("KÜTÜPHANESI|");
        pnl_anaSayfa.add(lbl_kutuphanesi, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 210, -1));

        lbl_dostlar.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        lbl_dostlar.setForeground(new java.awt.Color(51, 102, 255));
        lbl_dostlar.setText("| DOSTLAR");
        pnl_anaSayfa.add(lbl_dostlar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 130, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
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
        jScrollPane2.setViewportView(tbl_kitaplar);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 550, 230));

        btn_oduncAl.setBackground(new java.awt.Color(51, 102, 255));
        btn_oduncAl.setForeground(new java.awt.Color(255, 255, 255));
        btn_oduncAl.setText("Seçili Kitabı Ödünç Al");
        btn_oduncAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_oduncAlActionPerformed(evt);
            }
        });
        jPanel1.add(btn_oduncAl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 230, -1));

        jTabbedPane1.addTab("Kitap Ödünç Al", jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        tbl_oduncKİtaplar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kitap Adı", "Sayfa Sayısı", "Yazar Ad", "Yazar Soyad", "Kitap Türü", "Yayınevi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
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
        jScrollPane1.setViewportView(tbl_oduncKİtaplar);

        jPanel2.add(jScrollPane1);

        jTabbedPane1.addTab("Bende Olan Kitaplar", jPanel2);

        pnl_anaSayfa.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 610, 360));
        pnl_anaSayfa.add(lbl_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 80, 70));
        pnl_anaSayfa.add(lbl_logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 70, 60));

        anaSayfa.addTab("Ana Sayfa", pnl_anaSayfa);

        kisiselBilgiler.setBackground(new java.awt.Color(255, 255, 255));
        kisiselBilgiler.setMaximumSize(new java.awt.Dimension(404, 512));
        kisiselBilgiler.setMinimumSize(new java.awt.Dimension(404, 512));
        kisiselBilgiler.setPreferredSize(new java.awt.Dimension(404, 512));
        kisiselBilgiler.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_iconOfPersonal.setText(" ");
        kisiselBilgiler.add(lbl_iconOfPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        benimKisiselBilgilerim.setBackground(new java.awt.Color(255, 255, 255));
        benimKisiselBilgilerim.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kişisel Bilgilerim", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(51, 102, 255))); // NOI18N
        benimKisiselBilgilerim.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_kullaniciAdi.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_kullaniciAdi.setForeground(new java.awt.Color(51, 102, 255));
        lbl_kullaniciAdi.setText("Kullanıcı Adı");
        benimKisiselBilgilerim.add(lbl_kullaniciAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 140, -1));

        lbl_address.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_address.setForeground(new java.awt.Color(51, 102, 255));
        lbl_address.setText("Adres");
        benimKisiselBilgilerim.add(lbl_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 140, -1));

        txt_kullaniciAdi.setEnabled(false);
        benimKisiselBilgilerim.add(txt_kullaniciAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 240, -1));

        txt_addressEmail.setColumns(20);
        txt_addressEmail.setLineWrap(true);
        txt_addressEmail.setRows(5);
        txt_addressEmail.setEnabled(false);
        jscrollpane_address.setViewportView(txt_addressEmail);

        benimKisiselBilgilerim.add(jscrollpane_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 240, -1));

        btn_bilgileriDegistir.setBackground(new java.awt.Color(51, 102, 255));
        btn_bilgileriDegistir.setForeground(new java.awt.Color(255, 255, 255));
        btn_bilgileriDegistir.setText("Bilgilerimi Değiştir");
        btn_bilgileriDegistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bilgileriDegistirActionPerformed(evt);
            }
        });
        benimKisiselBilgilerim.add(btn_bilgileriDegistir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 240, -1));

        kisiselBilgiler.add(benimKisiselBilgilerim, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 580, 390));

        lbl_kutuphanesi1.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        lbl_kutuphanesi1.setForeground(new java.awt.Color(51, 102, 255));
        lbl_kutuphanesi1.setText("KÜTÜPHANESI|");
        kisiselBilgiler.add(lbl_kutuphanesi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 210, -1));

        lbl_dostlar1.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        lbl_dostlar1.setForeground(new java.awt.Color(51, 102, 255));
        lbl_dostlar1.setText("| DOSTLAR");
        kisiselBilgiler.add(lbl_dostlar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 130, 30));
        kisiselBilgiler.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 70, 60));
        kisiselBilgiler.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 80, 70));

        javax.swing.GroupLayout pnl_personalInfosPaneLayout = new javax.swing.GroupLayout(pnl_personalInfosPane);
        pnl_personalInfosPane.setLayout(pnl_personalInfosPaneLayout);
        pnl_personalInfosPaneLayout.setHorizontalGroup(
            pnl_personalInfosPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kisiselBilgiler, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
        );
        pnl_personalInfosPaneLayout.setVerticalGroup(
            pnl_personalInfosPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kisiselBilgiler, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
        );

        anaSayfa.addTab("Kişisel Bilgiler", pnl_personalInfosPane);

        yardımDestek.setBackground(new java.awt.Color(255, 255, 255));
        yardımDestek.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_changeUsername.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_changeUsername.setForeground(new java.awt.Color(51, 102, 255));
        lbl_changeUsername.setText("Kullanıcı adınızı değiştirmek mi istiyorsunuz ?");
        yardımDestek.add(lbl_changeUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        lbl_resetPassword.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_resetPassword.setForeground(new java.awt.Color(51, 102, 255));
        lbl_resetPassword.setText("Şifrenizi değiştirmek mi istiyorsunuz ?");
        yardımDestek.add(lbl_resetPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        lbl_logOut.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_logOut.setForeground(new java.awt.Color(51, 102, 255));
        lbl_logOut.setText("Çıkış mı yapmak istiyorsunuz ?");
        yardımDestek.add(lbl_logOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 280, 30));

        btn_sifreDegis.setBackground(new java.awt.Color(51, 102, 255));
        btn_sifreDegis.setForeground(new java.awt.Color(255, 255, 255));
        btn_sifreDegis.setText("Şifre Değiştir");
        btn_sifreDegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sifreDegisActionPerformed(evt);
            }
        });
        yardımDestek.add(btn_sifreDegis, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 150, -1));

        btn_cıkıs.setBackground(new java.awt.Color(51, 102, 255));
        btn_cıkıs.setForeground(new java.awt.Color(255, 255, 255));
        btn_cıkıs.setText("Çıkış Yap");
        btn_cıkıs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cıkısActionPerformed(evt);
            }
        });
        yardımDestek.add(btn_cıkıs, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 150, -1));

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
        yardımDestek.add(lbl_kutuphanesi2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 210, -1));

        lbl_dostlar2.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        lbl_dostlar2.setForeground(new java.awt.Color(51, 102, 255));
        lbl_dostlar2.setText("| DOSTLAR");
        yardımDestek.add(lbl_dostlar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 130, 30));
        yardımDestek.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 70, 60));
        yardımDestek.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 80, 70));

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

        anaSayfa.addTab("Yardım & Destek", pnl_helpSupportPane);

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

        pnl_about.add(jscrollpane_aboutUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 640, 230));

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

        pnl_systemFeedback.add(jscrollpane_feedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 640, 150));

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
        pnl_systemFeedback.add(btn_sendFeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 180, -1));

        splitpane_aboutUs.setRightComponent(pnl_systemFeedback);

        pnl_aboutUs.add(splitpane_aboutUs);

        anaSayfa.addTab("Uygulama Hakkında", pnl_aboutUs);

        getContentPane().add(anaSayfa);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_bilgileriDegistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bilgileriDegistirActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Kişisel bilgilerinizin bir kısmını değiştirmek istiyorsanız."
                + "\n'Yardım ve Destek' bölümüne gitmeniz gerekiyor.", "Kişisel Bilgileri Değiştirme", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_bilgileriDegistirActionPerformed

    private void btn_sifreDegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sifreDegisActionPerformed
        // Kullanıcıya şifresini değiştireceğinden emin olup olmadığı soruldu, cevabınız evet ise şifre değiştirme ekranına girildi.
        int resetPass = JOptionPane.showConfirmDialog(rootPane, "Şifrenizi değiştirmek istediğinize emin misiniz?", "", JOptionPane.YES_NO_OPTION);
        if (resetPass == JOptionPane.YES_OPTION) {
            sifreDegistir.setVisible(true);
        }
    }//GEN-LAST:event_btn_sifreDegisActionPerformed

    private void btn_cıkısActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cıkısActionPerformed
        // Kullanıcıya uygulamadan çıkmak istediğinden emin olup olmadığı soruldu, alınan cevap evet, başvuru ekranı kapatıldı       
        int logOut = JOptionPane.showConfirmDialog(rootPane, "Çıkış yapmak istediğinize emin misiniz?", "", JOptionPane.YES_NO_OPTION);
        if (logOut == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_btn_cıkısActionPerformed

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

    private void btn_oduncAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oduncAlActionPerformed
        /*Bu kod bloğu, kullanıcının bir kitabı ödünç almasını sağlayan işlemi gerçekleştirir. İşlem adımları aşağıdaki gibi açıklanmıştır:
        İlk olarak, tbl_kitaplar adlı bir tablodan seçili olan satırın indeksi alınır.*/
        int seciliSatir = tbl_kitaplar.getSelectedRow();
        /*Eğer seçili bir satır varsa (seciliSatir değeri -1'den farklı ise), seçili satırdaki kitap adını alırız.*/
        if (seciliSatir != -1) {
            String kitapAdi = (String) tbl_kitaplar.getValueAt(seciliSatir, 0);
            /*kitaplar adlı bir koleksiyon içerisinde döngü oluşturulur ve kitap adı eşleşen kitap bulunur.*/
            for (Kitap kitap : kitaplar) {
                if (kitap.getKitapAdi().equals(kitapAdi)) {
                    /*Bulunan kitabın bilgileri, oduncKitapTablosu adlı başka bir tabloya eklenir.*/
                    Object[] satir = {kitap.getKitapAdi(), kitap.getSaysaSayisi(), kitap.getYazarAdi(), kitap.getYazarSoyadi(), kitap.getKitapTuru(), kitap.getYayınEvi()};
                    oduncKitapTablosu.addRow(satir);
                    break;
                }

            }
            /*Kullanıcıya ödünç alınan kitap hakkında bir bilgi mesajı gösterilir.*/
            JOptionPane.showMessageDialog(KullaniciEkrani.this, kitapAdi + " adlı kitap ödünç alınmıştır.", "Ödünç Alındı.", JOptionPane.INFORMATION_MESSAGE);

            /*Seçili satır, kitapTablosu adlı başka bir tablodan kaldırılır.*/
            kitapTablosu.removeRow(seciliSatir);
        } else {
            /*Eğer seçili bir satır yoksa, kullanıcıya hata mesajı gösterilir.*/
            JOptionPane.showMessageDialog(KullaniciEkrani.this, "Lütfen ödünç almak istediğiniz kitabı tablodan seçiniz.", "Hata", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btn_oduncAlActionPerformed

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
            java.util.logging.Logger.getLogger(KullaniciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KullaniciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KullaniciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KullaniciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KullaniciEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane anaSayfa;
    private javax.swing.JPanel benimKisiselBilgilerim;
    private javax.swing.JButton btn_adDegis;
    private javax.swing.JButton btn_bilgileriDegistir;
    private javax.swing.JButton btn_cıkıs;
    private javax.swing.JButton btn_oduncAl;
    private javax.swing.JButton btn_sendFeedback;
    private javax.swing.JButton btn_sifreDegis;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JScrollPane jscrollpane_aboutUs;
    private javax.swing.JScrollPane jscrollpane_address;
    private javax.swing.JScrollPane jscrollpane_feedback;
    private javax.swing.JTextArea jtextarea_aboutUs;
    private javax.swing.JTextArea jtxtarea_feedback;
    private javax.swing.JPanel kisiselBilgiler;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_changeUsername;
    private javax.swing.JLabel lbl_dostlar;
    private javax.swing.JLabel lbl_dostlar1;
    private javax.swing.JLabel lbl_dostlar2;
    private javax.swing.JLabel lbl_feedbackQuestion;
    private javax.swing.JLabel lbl_icon;
    private javax.swing.JLabel lbl_iconOfPersonal;
    private javax.swing.JLabel lbl_kullaniciAdi;
    private javax.swing.JLabel lbl_kutuphanesi;
    private javax.swing.JLabel lbl_kutuphanesi1;
    private javax.swing.JLabel lbl_kutuphanesi2;
    private javax.swing.JLabel lbl_logOut;
    private javax.swing.JLabel lbl_logo1;
    private javax.swing.JLabel lbl_resetPassword;
    private javax.swing.JPanel pnl_about;
    private javax.swing.JPanel pnl_aboutUs;
    private javax.swing.JPanel pnl_anaSayfa;
    private javax.swing.JPanel pnl_helpSupportPane;
    private javax.swing.JPanel pnl_personalInfosPane;
    private javax.swing.JPanel pnl_systemFeedback;
    private javax.swing.JSplitPane splitpane_aboutUs;
    private javax.swing.JTable tbl_kitaplar;
    private javax.swing.JTable tbl_oduncKİtaplar;
    private javax.swing.JTextArea txt_addressEmail;
    private javax.swing.JTextField txt_kullaniciAdi;
    private javax.swing.JPanel yardımDestek;
    // End of variables declaration//GEN-END:variables
}
