
package RestaurantProject;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.text.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.*;

public class Restaurant extends javax.swing.JFrame {
    byte nasgor, migor, sototer, ayambak, nascam, este, esjeru, escampu, escinca, airop;
    byte nasgor1, migor1, sototer1, ayambak1, nascam1, este1, esjeru1, escampu1, escinca1, airop1;
    int nasgor2 = 12000, migor2 = 12000, sototer2 = 10000, ayambak2 = 15000, nascam2 = 10000, este2 = 3000, esjeru2 = 5000, escampu2 = 7000, escinca2 = 5000, airop2 = 1000;
        Locale Indonesia = new Locale("in", "ID");
        NumberFormat Rupiah = NumberFormat.getCurrencyInstance(Indonesia);
        
    
    
    

    public Restaurant() {
        initComponents();
        setResizable(false);
        yakin.setVisible(false);
        
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        checkbox1 = new java.awt.Checkbox();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        nasigoreng = new javax.swing.JCheckBox();
        mie = new javax.swing.JCheckBox();
        nasicampur = new javax.swing.JCheckBox();
        soto = new javax.swing.JCheckBox();
        ayambakar = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jumlahnasi = new javax.swing.JTextField();
        jumlahmie = new javax.swing.JTextField();
        jumlahsoto = new javax.swing.JTextField();
        jumlahayam = new javax.swing.JTextField();
        jumlahnasicampur = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        esteh = new javax.swing.JCheckBox();
        esjeruk = new javax.swing.JCheckBox();
        air = new javax.swing.JCheckBox();
        escincau = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jumlahesteh = new javax.swing.JTextField();
        jumlahesjeruk = new javax.swing.JTextField();
        jumlahescampur = new javax.swing.JTextField();
        jumlahescincau = new javax.swing.JTextField();
        jumlahair = new javax.swing.JTextField();
        escampur = new javax.swing.JCheckBox();
        label1 = new java.awt.Label();
        totalbtn = new javax.swing.JButton();
        pesanbtn = new javax.swing.JButton();
        hapusbtn = new javax.swing.JButton();
        fieldharga = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        yakin = new javax.swing.JPanel();
        fek = new java.awt.Button();
        tru = new java.awt.Button();
        makasi = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        checkbox1.setLabel("checkbox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(14, 21, 58));

        jLabel1.setBackground(new java.awt.Color(14, 21, 58));
        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(14, 21, 58));
        jLabel1.setText("M y  R e s t a u r a n t");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        nasigoreng.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        nasigoreng.setText("             Nasi Goreng Kernel");
        nasigoreng.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                nasigorengStateChanged(evt);
            }
        });
        nasigoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nasigorengActionPerformed(evt);
            }
        });

        mie.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        mie.setText("             Mie Goreng Kernel");
        mie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mieActionPerformed(evt);
            }
        });

        nasicampur.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        nasicampur.setText("             Nasi Campur Kernel Panic");
        nasicampur.setActionCommand("             Ayam Bakar Overheat");
        nasicampur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nasicampurActionPerformed(evt);
            }
        });

        soto.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        soto.setText("             Soto Terminal");
        soto.setToolTipText("");
        soto.setActionCommand("");
        soto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sotoActionPerformed(evt);
            }
        });

        ayambakar.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        ayambakar.setText("             Ayam Bakar Overheat");
        ayambakar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayambakarActionPerformed(evt);
            }
        });

        jLabel2.setText("Rp. 12.000,00");

        jLabel3.setText("Rp. 12.000,00");

        jLabel4.setText("Rp. 12.000,00");

        jLabel5.setText("Rp. 12.000,00");

        jLabel6.setText("Rp. 12.000,00");

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(14, 21, 58));
        jLabel7.setText("Menu Makanan");

        jLabel8.setText("Jumlah");

        jumlahnasi.setEditable(false);
        jumlahnasi.setText("0");

        jumlahmie.setEditable(false);
        jumlahmie.setText("0");
        jumlahmie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahmieActionPerformed(evt);
            }
        });

        jumlahsoto.setEditable(false);
        jumlahsoto.setText("0");
        jumlahsoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahsotoActionPerformed(evt);
            }
        });

        jumlahayam.setEditable(false);
        jumlahayam.setText("0");

        jumlahnasicampur.setEditable(false);
        jumlahnasicampur.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nasicampur)
                            .addComponent(nasigoreng)
                            .addComponent(mie)
                            .addComponent(soto)
                            .addComponent(ayambakar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel6))
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jumlahnasicampur, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jumlahayam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jumlahnasi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jumlahmie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jumlahsoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addGap(14, 14, 14))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(3, 3, 3)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nasigoreng)
                    .addComponent(jLabel2)
                    .addComponent(jumlahnasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mie)
                    .addComponent(jLabel3)
                    .addComponent(jumlahmie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soto)
                    .addComponent(jLabel5)
                    .addComponent(jumlahsoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ayambakar)
                    .addComponent(jLabel4)
                    .addComponent(jumlahayam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nasicampur)
                    .addComponent(jLabel6)
                    .addComponent(jumlahnasicampur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        esteh.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        esteh.setText("             Es Teh Server");
        esteh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estehActionPerformed(evt);
            }
        });

        esjeruk.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        esjeruk.setText("             Es Jeruk Server");
        esjeruk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esjerukActionPerformed(evt);
            }
        });

        air.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        air.setText("             Air Open Source");
        air.setActionCommand("             Ayam Bakar Overheat");
        air.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airActionPerformed(evt);
            }
        });

        escincau.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        escincau.setText("             Es Cincau Terminal");
        escincau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escincauActionPerformed(evt);
            }
        });

        jLabel9.setText("Rp. 12.000,00");

        jLabel10.setText("Rp. 12.000,00");

        jLabel11.setText("Rp. 12.000,00");

        jLabel12.setText("Rp. 12.000,00");

        jLabel13.setText("Rp. 12.000,00");

        jLabel14.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(14, 21, 58));
        jLabel14.setText("Menu Minuman");

        jLabel15.setText("Jumlah");

        jumlahesteh.setEditable(false);
        jumlahesteh.setText("0");
        jumlahesteh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahestehActionPerformed(evt);
            }
        });

        jumlahesjeruk.setEditable(false);
        jumlahesjeruk.setText("0");

        jumlahescampur.setEditable(false);
        jumlahescampur.setText("0");

        jumlahescincau.setEditable(false);
        jumlahescincau.setText("0");

        jumlahair.setEditable(false);
        jumlahair.setText("0");

        escampur.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        escampur.setText("             Es Campur Directory");
        escampur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escampurActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(air)
                            .addComponent(esteh)
                            .addComponent(esjeruk)
                            .addComponent(escincau)
                            .addComponent(escampur))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel13))
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jumlahair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jumlahescincau, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jumlahesteh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jumlahesjeruk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jumlahescampur, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel15)))
                .addGap(14, 14, 14))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(3, 3, 3)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(esteh)
                    .addComponent(jLabel9)
                    .addComponent(jumlahesteh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(esjeruk)
                    .addComponent(jLabel10)
                    .addComponent(jumlahesjeruk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jumlahescampur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(escampur))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(escincau)
                    .addComponent(jLabel11)
                    .addComponent(jumlahescincau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(air)
                    .addComponent(jLabel13)
                    .addComponent(jumlahair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Total Harga");

        totalbtn.setText("Total");
        totalbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalbtnActionPerformed(evt);
            }
        });

        pesanbtn.setText("Pesan");
        pesanbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesanbtnActionPerformed(evt);
            }
        });

        hapusbtn.setText("Hapus");
        hapusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusbtnActionPerformed(evt);
            }
        });

        fieldharga.setEditable(false);

        jPanel6.setBackground(new java.awt.Color(16, 25, 69));

        fek.setLabel("MFF FEK");
        fek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fekActionPerformed(evt);
            }
        });

        tru.setLabel("TRU CUY");
        tru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                truActionPerformed(evt);
            }
        });

        makasi.setFont(new java.awt.Font("Microsoft JhengHei", 0, 36)); // NOI18N
        makasi.setText("Adalah benar? afkh iyh?");

        javax.swing.GroupLayout yakinLayout = new javax.swing.GroupLayout(yakin);
        yakin.setLayout(yakinLayout);
        yakinLayout.setHorizontalGroup(
            yakinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yakinLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(yakinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(yakinLayout.createSequentialGroup()
                        .addComponent(makasi, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        yakinLayout.setVerticalGroup(
            yakinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yakinLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(makasi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tru, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fek, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(yakin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(yakin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(totalbtn))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(pesanbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hapusbtn))
                            .addComponent(fieldharga)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalbtn))
                        .addGap(4, 4, 4)
                        .addComponent(fieldharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pesanbtn)
                            .addComponent(hapusbtn)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nasigorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nasigorengActionPerformed
        nasgor = 1;
        jumlahnasi.setEditable(rootPaneCheckingEnabled);
    }//GEN-LAST:event_nasigorengActionPerformed

    private void mieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mieActionPerformed
        migor = 1;
        jumlahmie.setEditable(rootPaneCheckingEnabled);
    }//GEN-LAST:event_mieActionPerformed

    private void nasicampurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nasicampurActionPerformed
        nascam = 1;
        jumlahnasicampur.setEditable(rootPaneCheckingEnabled);
    }//GEN-LAST:event_nasicampurActionPerformed

    private void sotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sotoActionPerformed
        sototer = 1;
        jumlahsoto.setEditable(rootPaneCheckingEnabled);
    }//GEN-LAST:event_sotoActionPerformed

    private void ayambakarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayambakarActionPerformed
        ayambak = 1;
        jumlahayam.setEditable(rootPaneCheckingEnabled);
    }//GEN-LAST:event_ayambakarActionPerformed

    private void estehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estehActionPerformed
        este= 1;
        jumlahesteh.setEditable(rootPaneCheckingEnabled);
    }//GEN-LAST:event_estehActionPerformed

    private void esjerukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esjerukActionPerformed
        esjeru = 1;
        jumlahesjeruk.setEditable(rootPaneCheckingEnabled);
    }//GEN-LAST:event_esjerukActionPerformed

    private void airActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airActionPerformed
        airop = 1;
        jumlahair.setEditable(rootPaneCheckingEnabled);
    }//GEN-LAST:event_airActionPerformed

    private void escincauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escincauActionPerformed
        escinca = 1;
        jumlahescincau.setEditable(rootPaneCheckingEnabled);
    }//GEN-LAST:event_escincauActionPerformed

    private void escampurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escampurActionPerformed
        escampu = 1;
        jumlahescampur.setEditable(rootPaneCheckingEnabled);
    }//GEN-LAST:event_escampurActionPerformed

    private void nasigorengStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_nasigorengStateChanged

    }//GEN-LAST:event_nasigorengStateChanged

    private void totalbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalbtnActionPerformed

        int harga = Integer.parseInt(jumlahnasi.getText());
        int harga1 = Integer.parseInt(jumlahmie.getText());
        int harga2 = Integer.parseInt(jumlahsoto.getText());
        int harga3 = Integer.parseInt(jumlahayam.getText());
        int harga4 = Integer.parseInt(jumlahnasicampur.getText());
        int harga5 = Integer.parseInt(jumlahesteh.getText());
        int harga6 = Integer.parseInt(jumlahesjeruk.getText());
        int harga7 = Integer.parseInt(jumlahescampur.getText());
        int harga8 = Integer.parseInt(jumlahescincau.getText());
        int harga9 = Integer.parseInt(jumlahair.getText());
        
        
        
        int hasil = (harga*nasgor2)+(harga1*migor2)+(harga2*sototer2)+(harga3*ayambak2)+(harga4*nascam2)+(harga5*este2)+(harga6*esjeru2)+(harga7*escampu2)+(harga8*escinca2)+(harga9*airop2);
       
        
        fieldharga.setText(Rupiah.format(hasil));
        
    }//GEN-LAST:event_totalbtnActionPerformed

    private void jumlahmieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahmieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahmieActionPerformed

    private void jumlahsotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahsotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahsotoActionPerformed

    private void jumlahestehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahestehActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahestehActionPerformed

    private void hapusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusbtnActionPerformed
       this.setVisible(false);
        new Restaurant().setVisible(true);
    }//GEN-LAST:event_hapusbtnActionPerformed

    private void pesanbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesanbtnActionPerformed
        this.yakin.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_pesanbtnActionPerformed

    private void truActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_truActionPerformed
        makasi.setText("Makasi cuy, anjay");
    }//GEN-LAST:event_truActionPerformed

    private void fekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fekActionPerformed
        this.dispose();
        new Restaurant().setVisible(true);
    }//GEN-LAST:event_fekActionPerformed

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
            java.util.logging.Logger.getLogger(Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Restaurant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox air;
    private javax.swing.JCheckBox ayambakar;
    private java.awt.Checkbox checkbox1;
    private javax.swing.JCheckBox escampur;
    private javax.swing.JCheckBox escincau;
    private javax.swing.JCheckBox esjeruk;
    private javax.swing.JCheckBox esteh;
    private java.awt.Button fek;
    private javax.swing.JTextField fieldharga;
    private javax.swing.JButton hapusbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jumlahair;
    private javax.swing.JTextField jumlahayam;
    private javax.swing.JTextField jumlahescampur;
    private javax.swing.JTextField jumlahescincau;
    private javax.swing.JTextField jumlahesjeruk;
    private javax.swing.JTextField jumlahesteh;
    private javax.swing.JTextField jumlahmie;
    private javax.swing.JTextField jumlahnasi;
    private javax.swing.JTextField jumlahnasicampur;
    private javax.swing.JTextField jumlahsoto;
    private java.awt.Label label1;
    private javax.swing.JLabel makasi;
    private javax.swing.JCheckBox mie;
    private javax.swing.JCheckBox nasicampur;
    private javax.swing.JCheckBox nasigoreng;
    private javax.swing.JButton pesanbtn;
    private javax.swing.JCheckBox soto;
    private javax.swing.JButton totalbtn;
    private java.awt.Button tru;
    private javax.swing.JPanel yakin;
    // End of variables declaration//GEN-END:variables
}
