import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author petanikode
 */
public class tes extends javax.swing.JFrame {

    /**
     * Creates new form tes
     */
    public tes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        btnMsgDialog = new javax.swing.JButton();
        btnInputDialog = new javax.swing.JButton();
        btnConfirmDialog = new javax.swing.JButton();
        btnOptionDialog = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMsgDialog.setText("Message Dialog");
        btnMsgDialog.setName("btnMsgDialog"); // NOI18N
        btnMsgDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMsgDialogActionPerformed(evt);
            }
        });

        btnInputDialog.setText("Input Dialog");
        btnInputDialog.setName("btnInputDialog"); // NOI18N
        btnInputDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputDialogActionPerformed(evt);
            }
        });

        btnConfirmDialog.setText("Dialog Konfirmasi");
        btnConfirmDialog.setName("btnConfirmDialog"); // NOI18N
        btnConfirmDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmDialogActionPerformed(evt);
            }
        });

        btnOptionDialog.setText("Dialog Pilihan");
        btnOptionDialog.setName("btnOptionsDialog"); // NOI18N
        btnOptionDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOptionDialogActionPerformed(evt);
            }
        });

        jLabel1.setText("Belajar JOptionPane");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConfirmDialog)
                    .addComponent(btnMsgDialog))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInputDialog)
                    .addComponent(btnOptionDialog))
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMsgDialog)
                    .addComponent(btnInputDialog))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmDialog)
                    .addComponent(btnOptionDialog))
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>                        

    private void btnMsgDialogActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
        JOptionPane.showMessageDialog(this, "Ini Adalah Dialog Informasi");
        
    }                                            

    private void btnInputDialogActionPerformed(java.awt.event.ActionEvent evt) {                                               
        
        String inputan = JOptionPane.showInputDialog("Inputkan Sesuatu");
        JOptionPane.showMessageDialog(this, "Kamu meng-inputkan: " + inputan);
        
    }                                              

    private void btnConfirmDialogActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        
        int jawab = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi?");
        
        // 0 : yes
        // 1 : no
        // 2 : cancel
        
        switch(jawab){
            case JOptionPane.YES_OPTION: 
                JOptionPane.showMessageDialog(this, "Kamu menjawab ya");
                break;
            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(this, "Kamu menjawab tidak");
                break;
            case JOptionPane.CANCEL_OPTION:
                JOptionPane.showMessageDialog(this, "Kamu mejawab batal");
        }
    }                                                

    private void btnOptionDialogActionPerformed(java.awt.event.ActionEvent evt) {                                                
        
        int jawab = JOptionPane.showOptionDialog(this, 
                        "Ingin Keluar?", 
                        "Keluar", 
                        JOptionPane.YES_NO_OPTION, 
                        JOptionPane.QUESTION_MESSAGE, null, null, null);
        
        if(jawab == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(this, "Program Akan Keluar");
            System.exit(0);
        }
        
    }                                               

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
            java.util.logging.Logger.getLogger(tes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnConfirmDialog;
    private javax.swing.JButton btnInputDialog;
    private javax.swing.JButton btnMsgDialog;
    private javax.swing.JButton btnOptionDialog;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration                   
}