import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class tiga extends javax.swing.JFrame {
    private int hHitung = 0;
    private int cHitung = 0;
    private int tanya;
    private int hitungGiliran = 0;
    String[] hasil = new String[8];
    
    public tiga() {
        initComponents();
    }
    
    // Function menghitung skor
    private void skorPermainan(){
        playerHuman.setText(String.valueOf(hHitung));
        playerComputer.setText(String.valueOf(cHitung));
    }
    
    // Function indikator giliran
    private void ganti(){
        if(hitungGiliran % 2 == 1){
            giliran.setText("Player 1");
            hitungGiliran++;
        }else{
            giliran.setText("Player 2");
            hitungGiliran++;
        }
    }
    
    //Function back
    private void sosGameActionPerformed(java.awt.event.ActionEvent evt) {                                      
        sosGame c = new sosGame();
        c.setVisible(true); // setVisible untuk menampilkan class sosGame
        
        this.dispose(); // untuk menghilangkan GUI
    }
    
    // Function reset
    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt){
        button2.setText(null);
        button2.setBackground(Color.WHITE);
        button1.setText(null);
        button1.setBackground(Color.WHITE);
        button9.setText(null);
        button9.setBackground(Color.WHITE);
        
        button7.setText(null);
        button7.setBackground(Color.WHITE);
        button5.setText(null);
        button5.setBackground(Color.WHITE);
        button8.setText(null);
        button8.setBackground(Color.WHITE);
        
        button4.setText(null);
        button4.setBackground(Color.WHITE);
        button3.setText(null);
        button3.setBackground(Color.WHITE);
        button6.setText(null);
        button6.setBackground(Color.WHITE);
        
        hHitung = 0;
        cHitung = 0;
        hitungGiliran = 0;
        
        playerHuman.setText("0");
        playerComputer.setText("0");
        giliran.setText("Player 1");
    }
    
    private void pemenang(){
        String a = button1.getText();
        String b = button2.getText();
        String c = button3.getText();
        
        String d = button4.getText();
        String e = button5.getText();
        String f = button6.getText();
        
        String g = button7.getText();
        String h = button8.getText();
        String i = button9.getText();
        
        if (a == "S" && b == "O" && c == "S"){
            button1.setBackground(Color.red);
            button2.setBackground(Color.red);
            button3.setBackground(Color.red);
            
//            hHitung++;
//            playerHuman.setText(String.valueOf(hHitung));
            
            if (hitungGiliran % 2 == 1){
                hHitung++;
                playerHuman.setText(String.valueOf(hHitung));
            }else{
                cHitung++;
                playerComputer.setText(String.valueOf(cHitung));
            }
            
        }if (d == "S" && e == "O" && f == "S"){
            button4.setBackground(Color.red);
            button5.setBackground(Color.red);
            button6.setBackground(Color.red);
            
            
        }if (g == "S" && h == "O" && i == "S"){
            button7.setBackground(Color.red);
            button8.setBackground(Color.red);
            button9.setBackground(Color.red);
            
            
        }if (a == "S" && d == "O" && g == "S"){
            button1.setBackground(Color.red);
            button4.setBackground(Color.red);
            button7.setBackground(Color.red);
            
            
        }if (b == "S" && e == "O" && h == "S"){
            button2.setBackground(Color.red);
            button5.setBackground(Color.red);
            button8.setBackground(Color.red);
            
            
        }if (c == "S" && f == "O" && i == "S"){
            button3.setBackground(Color.red);
            button6.setBackground(Color.red);
            button9.setBackground(Color.red);
            
            
        }if (a == "S" && e == "O" && i == "S"){
            button1.setBackground(Color.red);
            button5.setBackground(Color.red);
            button9.setBackground(Color.red);
            
       
        }if (c == "S" && e == "O" && g == "S"){
            button3.setBackground(Color.red);
            button5.setBackground(Color.red);
            button7.setBackground(Color.red);
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        playerHuman = new javax.swing.JLabel();
        playerComputer = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        giliran = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PLAYER 1");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PLAYER 2");

        reset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reset.setForeground(new java.awt.Color(0, 102, 102));
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        back.setForeground(new java.awt.Color(0, 102, 102));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        playerHuman.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        playerHuman.setForeground(new java.awt.Color(255, 255, 255));
        playerHuman.setText("0");

        playerComputer.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        playerComputer.setForeground(new java.awt.Color(255, 255, 255));
        playerComputer.setText("0");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Giliran :");

        giliran.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        giliran.setForeground(new java.awt.Color(204, 204, 0));
        giliran.setText("Player 1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addComponent(back)
                        .addGap(18, 18, 18)
                        .addComponent(reset)
                        .addGap(74, 74, 74)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(49, 49, 49))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(playerHuman)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(giliran)
                        .addGap(149, 149, 149)
                        .addComponent(playerComputer)
                        .addGap(71, 71, 71))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(playerHuman, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(playerComputer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(giliran))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reset)
                            .addComponent(back))
                        .addContainerGap())))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setLayout(new java.awt.GridLayout(3, 3, 2, 2));

        button1.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel4.add(button1);

        button2.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jPanel4.add(button2);

        button3.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        jPanel4.add(button3);

        button4.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        jPanel4.add(button4);

        button5.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });
        jPanel4.add(button5);

        button6.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });
        jPanel4.add(button6);

        button7.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });
        jPanel4.add(button7);

        button8.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });
        jPanel4.add(button8);

        button9.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });
        jPanel4.add(button9);

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(586, 739));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        sosGameActionPerformed(evt);
    }//GEN-LAST:event_backActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        tanya = JOptionPane.showOptionDialog(this,"|| Yes = huruf S || No = huruf O ||","Pilih", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (tanya == JOptionPane.YES_OPTION){
            button1.setText("S");
        }else if(tanya == JOptionPane.NO_OPTION){
            button1.setText("O");
        }
        
        ganti();
        pemenang();
        
        // simpan huruf ke dalam array
//        hasil[0] = pertama;
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        
        tanya = JOptionPane.showOptionDialog(this,"|| Yes = huruf S || No = huruf O ||","Pilih", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (tanya == JOptionPane.YES_OPTION){
            button2.setText("S");
        }else if(tanya == JOptionPane.NO_OPTION){
            button2.setText("O");
        }
        
        ganti();
        pemenang();
        
        // simpan huruf ke dalam array
//        hasil[1] = pertama;
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        
        tanya = JOptionPane.showOptionDialog(this,"|| Yes = huruf S || No = huruf O ||","Pilih", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (tanya == JOptionPane.YES_OPTION){
            button3.setText("S");
        }else if(tanya == JOptionPane.NO_OPTION){
            button3.setText("O");
        }
        
        ganti();
        pemenang();
        
        // simpan huruf ke dalam array
//        hasil[1] = pertama;
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        
        tanya = JOptionPane.showOptionDialog(this,"|| Yes = huruf S || No = huruf O ||","Pilih", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (tanya == JOptionPane.YES_OPTION){
            button4.setText("S");
        }else if(tanya == JOptionPane.NO_OPTION){
            button4.setText("O");
        }
        
        ganti();
        pemenang();
        
        // simpan huruf ke dalam array
//        hasil[1] = pertama;
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        
        tanya = JOptionPane.showOptionDialog(this,"|| Yes = huruf S || No = huruf O ||","Pilih", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        
        if (tanya == JOptionPane.YES_OPTION){
            button5.setText("S");
        }else if(tanya == JOptionPane.NO_OPTION){
            button5.setText("O");
        }
        
        ganti();
        pemenang();
        
        // simpan huruf ke dalam array
//        hasil[1] = pertama;
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        
        tanya = JOptionPane.showOptionDialog(this,"|| Yes = huruf S || No = huruf O ||","Pilih", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (tanya == JOptionPane.YES_OPTION){
            button6.setText("S");
        }else if(tanya == JOptionPane.NO_OPTION){
            button6.setText("O");
        }
        
        ganti();
        pemenang();
        
        // simpan huruf ke dalam array
//        hasil[1] = pertama;
    }//GEN-LAST:event_button6ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        
        tanya = JOptionPane.showOptionDialog(this,"|| Yes = huruf S || No = huruf O ||","Pilih", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (tanya == JOptionPane.YES_OPTION){
            button7.setText("S");
        }else if(tanya == JOptionPane.NO_OPTION){
            button7.setText("O");
        }
        
        ganti();
        pemenang();
        
        // simpan huruf ke dalam array
//        hasil[1] = pertama;
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        
        tanya = JOptionPane.showOptionDialog(this,"|| Yes = huruf S || No = huruf O ||","Pilih", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (tanya == JOptionPane.YES_OPTION){
            button8.setText("S");
        }else if(tanya == JOptionPane.NO_OPTION){
            button8.setText("O");
        }
        
        ganti();
        pemenang();
        
        // simpan huruf ke dalam array
//        hasil[1] = pertama;
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        
        tanya = JOptionPane.showOptionDialog(this,"|| Yes = huruf S || No = huruf O ||","Pilih", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (tanya == JOptionPane.YES_OPTION){
            button9.setText("S");
        }else if(tanya == JOptionPane.NO_OPTION){
            button9.setText("O");
        }
        
        ganti();
        pemenang();
        
        // simpan huruf ke dalam array
//        hasil[1] = pertama;
    }//GEN-LAST:event_button9ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        jbtnResetActionPerformed(evt);
    }//GEN-LAST:event_resetActionPerformed
    
    
    
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
            java.util.logging.Logger.getLogger(tiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tiga().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JLabel giliran;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel playerComputer;
    private javax.swing.JLabel playerHuman;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}
