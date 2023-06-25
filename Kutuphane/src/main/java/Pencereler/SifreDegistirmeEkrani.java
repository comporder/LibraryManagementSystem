/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pencereler;

import Sınıflar.Kullanicilar;
import Sınıflar.Regex;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author emir
 */
public class SifreDegistirmeEkrani extends javax.swing.JFrame {

    /**
     * Creates new form SifreDegistirmeEkrani
     */
    /*Kullanicilar sınıfından bir kullaniciListesi nesnesi oluşturulur. Bu nesne, kullanıcı bilgilerini yönetmek için kullanılır.
        Regex sınıfından bir regex nesnesi oluşturulur. Bu nesne, şifre geçerlilik kurallarını kontrol etmek için kullanılır.
        GirisEkrani sınıfından bir giris nesnesi oluşturulur. Bu nesne, giriş ekranına erişimi sağlar.
        String tipinde bir ad değişkeni oluşturulur.*/
    Kullanicilar kullaniciListesi;
    Regex regex;
    GirisEkrani giris;
    String ad;

    public SifreDegistirmeEkrani() {
        initComponents();
        kullaniciListesi = new Kullanicilar();
        regex = new Regex();
        giris = new GirisEkrani();
        ad = new String();
        /*lbl_logo etiketine, "logo.png" dosyasından alınan bir resim atanır.
        Pencerenin konumunu ve kapatılma davranışını ayarlamak için gerekli kodlar eklenir.*/
        ImageIcon image = new ImageIcon(getClass().getResource("logo.png"));
        lbl_logo.setIcon(image);
        ImageIcon image2 = new ImageIcon(getClass().getResource("icon60.png"));
        lbl_icon.setIcon(image2);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /*bilgileriAl metodunun işlevi:
    Bu metodun parametresi olan kullaniciAd değeri, ad değişkenine atanır. Bu, şifre değiştirme işlemi için kullanıcı adının alınmasını sağlar.*/
    public void bilgileriAl(String kullaniciAd) {
        ad = kullaniciAd;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_sifreDegistir = new javax.swing.JPanel();
        lbl_yeniSifreTekrar = new javax.swing.JLabel();
        btn_sifreyiDegistir = new javax.swing.JButton();
        lbl_kullaniciAdi = new javax.swing.JLabel();
        txt_kullaniciAdi = new javax.swing.JTextField();
        txt_yeniSifreTekrar = new javax.swing.JPasswordField();
        lbl_eskiSifre = new javax.swing.JLabel();
        txt_eskiSifre = new javax.swing.JPasswordField();
        lbl_yeniSifre = new javax.swing.JLabel();
        txt_yeniSifre = new javax.swing.JPasswordField();
        lbl_dostlar2 = new javax.swing.JLabel();
        lbl_kutuphanesi2 = new javax.swing.JLabel();
        lbl_logo = new javax.swing.JLabel();
        lbl_icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_sifreDegistir.setBackground(new java.awt.Color(255, 255, 255));
        pnl_sifreDegistir.setMaximumSize(new java.awt.Dimension(404, 512));
        pnl_sifreDegistir.setMinimumSize(new java.awt.Dimension(404, 512));
        pnl_sifreDegistir.setPreferredSize(new java.awt.Dimension(404, 512));
        pnl_sifreDegistir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_yeniSifreTekrar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_yeniSifreTekrar.setForeground(new java.awt.Color(51, 102, 255));
        lbl_yeniSifreTekrar.setText("Yeni Şifre Tekrar");
        pnl_sifreDegistir.add(lbl_yeniSifreTekrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 160, -1));

        btn_sifreyiDegistir.setBackground(new java.awt.Color(51, 102, 255));
        btn_sifreyiDegistir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_sifreyiDegistir.setForeground(new java.awt.Color(255, 255, 255));
        btn_sifreyiDegistir.setText("Şifreyi Değiştir");
        btn_sifreyiDegistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sifreyiDegistirActionPerformed(evt);
            }
        });
        pnl_sifreDegistir.add(btn_sifreyiDegistir, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 240, -1));

        lbl_kullaniciAdi.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_kullaniciAdi.setForeground(new java.awt.Color(51, 102, 255));
        lbl_kullaniciAdi.setText("Kullanıcı Adı");
        pnl_sifreDegistir.add(lbl_kullaniciAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 140, 30));
        pnl_sifreDegistir.add(txt_kullaniciAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 240, -1));
        pnl_sifreDegistir.add(txt_yeniSifreTekrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 240, -1));

        lbl_eskiSifre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_eskiSifre.setForeground(new java.awt.Color(51, 102, 255));
        lbl_eskiSifre.setText("Eski Şifre");
        pnl_sifreDegistir.add(lbl_eskiSifre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 140, -1));
        pnl_sifreDegistir.add(txt_eskiSifre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 240, -1));

        lbl_yeniSifre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_yeniSifre.setForeground(new java.awt.Color(51, 102, 255));
        lbl_yeniSifre.setText("Yeni Şifre");
        pnl_sifreDegistir.add(lbl_yeniSifre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 140, -1));
        pnl_sifreDegistir.add(txt_yeniSifre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 240, -1));

        lbl_dostlar2.setFont(new java.awt.Font("Bodoni MT", 0, 16)); // NOI18N
        lbl_dostlar2.setForeground(new java.awt.Color(51, 102, 255));
        lbl_dostlar2.setText("| DOSTLAR");
        pnl_sifreDegistir.add(lbl_dostlar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 130, 30));

        lbl_kutuphanesi2.setFont(new java.awt.Font("Bodoni MT", 0, 20)); // NOI18N
        lbl_kutuphanesi2.setForeground(new java.awt.Color(51, 102, 255));
        lbl_kutuphanesi2.setText("KÜTÜPHANESI|");
        pnl_sifreDegistir.add(lbl_kutuphanesi2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 210, -1));
        pnl_sifreDegistir.add(lbl_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 70, 60));
        pnl_sifreDegistir.add(lbl_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 80, 70));

        getContentPane().add(pnl_sifreDegistir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sifreyiDegistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sifreyiDegistirActionPerformed

        /*Kullanıcının girdiği kullanıcı adı, eski şifre, yeni şifre ve yeni şifre tekrarını alır.
        Eğer kullanıcı adı boş bırakılmışsa veya eski şifre girilmemişse veya yeni şifre girilmemişse veya yeni şifre tekrarı girilmemişse, ilgili uyarı mesajlarını gösterir.
        Eğer yeni şifreler birbirleriyle eşleşmiyorsa, "Girdiğiniz yeni şifreler aynı olmalıdır!" uyarı mesajını gösterir.*/
        String kllaniciAdi = txt_kullaniciAdi.getText();
        String eskiSifre = txt_eskiSifre.getText();
        String yeniSifre = txt_yeniSifreTekrar.getText();
        String yeniSifreTekrar = txt_yeniSifreTekrar.getText();
        if (kllaniciAdi.compareTo("") == 0) {
            JOptionPane.showMessageDialog(rootPane, "Kullanıcı adı boş bırakılamaz!", "Uyarı", JOptionPane.WARNING_MESSAGE);
        } else if (eskiSifre.compareTo("") == 0) {
            JOptionPane.showMessageDialog(rootPane, "Eski şifrenizi girmelisiniz!!", "Uyarı", JOptionPane.WARNING_MESSAGE);
        } else if (yeniSifre.compareTo("") == 0) {
            JOptionPane.showMessageDialog(rootPane, "Yeni şifrenizi girmelisiniz!!", "Uyarı", JOptionPane.WARNING_MESSAGE);
        } else if (yeniSifreTekrar.compareTo("") == 0) {
            JOptionPane.showMessageDialog(rootPane, "Yeni şifrenizi tekrar girmelisiniz!!", "Uyarı", JOptionPane.WARNING_MESSAGE);
        } else if (!yeniSifre.equals(yeniSifreTekrar)) {
            JOptionPane.showMessageDialog(rootPane, "Girdiğiniz yeni şifreler aynı olmalıdır!", "Uyarı", JOptionPane.WARNING_MESSAGE);
        } else if (kullaniciListesi.kullaniciBilgileriDogrumu(kllaniciAdi, eskiSifre)) {
            /*Eğer kullanıcının girdiği kullanıcı adı ve eski şifre doğruysa:
            Yeni şifrenin şifre kurallarına uygun olup olmadığı kontrol edilir. Eğer uygunsa:
            Kullanıcıya başarı mesajı gösterilir.
            Kullanıcının eski şifresi yeni şifre ile değiştirilir.
            Giriş ekranının şifresi değiştirilir.
            Kullanıcı ekranı kapatılır.
            Giriş ekranı gösterilir.
            Eğer yeni şifre kurallara uymuyorsa, "Şifre geçerli değil!" uyarı mesajı gösterilir.*/
            if (regex.regexForPassword(yeniSifre)) {

                kullaniciListesi.sifreDegistir(eskiSifre, yeniSifre, kllaniciAdi);
                JOptionPane.showMessageDialog(rootPane, "Şifre başarıyla değiştirildi.\nLütfen yeni bilgilerinizle giriş yapın.", "", JOptionPane.INFORMATION_MESSAGE);
                giris.sifreDegistir(eskiSifre, yeniSifre, kllaniciAdi);
                this.dispose();

                giris.show();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Şifre  geçerli değil! Lütfen şifre kurallarına dikkat edin! ;\n"
                        + "En az 7 karakter ve harf, sayı ve '_' '/' karakterleri içerebilir.\n"
                        + "Örnek bir geçerli şifre: 2002Utku.",
                        "Uyarı", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            /*Eğer kullanıcının girdiği kullanıcı adı ve eski şifre doğru değilse, "Girdiğiniz kullanıcı bilgileri doğru değil. Lütfen tekrar deneyin." uyarı mesajı gösterilir.*/
            JOptionPane.showMessageDialog(rootPane, "Girdiğiniz kullanıcı bilgileri doğru değil.\nLütfen tekrar deneyin.", "Uyarı", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_sifreyiDegistirActionPerformed

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
            java.util.logging.Logger.getLogger(SifreDegistirmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SifreDegistirmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SifreDegistirmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SifreDegistirmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SifreDegistirmeEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_sifreyiDegistir;
    private javax.swing.JLabel lbl_dostlar2;
    private javax.swing.JLabel lbl_eskiSifre;
    private javax.swing.JLabel lbl_icon;
    private javax.swing.JLabel lbl_kullaniciAdi;
    private javax.swing.JLabel lbl_kutuphanesi2;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_yeniSifre;
    private javax.swing.JLabel lbl_yeniSifreTekrar;
    private javax.swing.JPanel pnl_sifreDegistir;
    private javax.swing.JPasswordField txt_eskiSifre;
    private javax.swing.JTextField txt_kullaniciAdi;
    private javax.swing.JPasswordField txt_yeniSifre;
    private javax.swing.JPasswordField txt_yeniSifreTekrar;
    // End of variables declaration//GEN-END:variables
}
