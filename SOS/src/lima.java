import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JOptionPane;

public class lima extends javax.swing.JFrame {
    private String pertama = "S";
    private int gantian;
    private int hHitung = 0;
    private int cHitung = 0;
    private int tanya;
    String[] hasil = new String[8];
    
    public lima() {
        initComponents();
    }

    // Function menghitung skor
    private void skorPermainan(){
//        playerHuman.setText(String.valueOf(hHitung));
//        playerComputer.setText(String.valueOf(cHitung));
    }
    
    private void giliran(){
        if(pertama == "S"){
            pertama = "O";
        }else{
            pertama = "S";
        }
    }
    
    //Function back
    private void sosGameActionPerformed(java.awt.event.ActionEvent evt) {                                      
        sosGame c = new sosGame();
        c.setVisible(true); // setVisible untuk menampilkan class sosGame
        
        this.dispose(); // untuk menghilangkan GUI
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();

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

        jButton15.setText("jButton15");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HUMAN");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("COMPUTER");

        jButton27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton27.setForeground(new java.awt.Color(0, 102, 102));
        jButton27.setText("RESET");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton28.setForeground(new java.awt.Color(0, 102, 102));
        jButton28.setText("BACK");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("0");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(jButton28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton27)
                .addGap(88, 88, 88)
                .addComponent(jLabel2)
                .addGap(43, 43, 43))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(70, 70, 70))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 47, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton27)
                    .addComponent(jButton28)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setLayout(new java.awt.GridLayout(5, 5));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jPanel4.add(jButton2);

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jPanel4.add(jButton3);

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jPanel4.add(jButton4);

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jPanel4.add(jButton5);

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jPanel4.add(jButton6);

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jPanel4.add(jButton7);

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jPanel4.add(jButton8);

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jPanel4.add(jButton9);

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jPanel4.add(jButton10);

        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jPanel4.add(jButton11);

        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jPanel4.add(jButton12);

        jButton16.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jPanel4.add(jButton16);

        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jPanel4.add(jButton13);

        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jPanel4.add(jButton14);

        jButton17.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jPanel4.add(jButton17);

        jButton18.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jPanel4.add(jButton18);

        jButton19.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jPanel4.add(jButton19);

        jButton20.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jPanel4.add(jButton20);

        jButton21.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jPanel4.add(jButton21);

        jButton22.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jPanel4.add(jButton22);

        jButton23.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jPanel4.add(jButton23);

        jButton24.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jPanel4.add(jButton24);

        jButton25.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jPanel4.add(jButton25);

        jButton26.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jPanel4.add(jButton26);

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(586, 739));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed

    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        sosGameActionPerformed(evt);
    }//GEN-LAST:event_jButton28ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {                                     
        sosGameActionPerformed(evt);
    }                                    

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
//        tanya = JOptionPane.showOptionDialog(this,"|| Yes = huruf O || No = huruf S ||","Pilih", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
//        if (tanya == JOptionPane.YES_OPTION){
//            pertama = "S";
//        }else if(tanya == JOptionPane.NO_OPTION){
//            pertama = "O";
//        }
//        
//        if(pertama == "S"){
//            button1.setForeground(Color.BLUE);
//        }else{
//            button1.setForeground(Color.ORANGE);
//        }
//        
//        giliran();
//        button1.setText(pertama);
//        pemenang();
    }                                      
  
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
            java.util.logging.Logger.getLogger(lima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lima().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
