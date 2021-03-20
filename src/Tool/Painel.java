package Tool;

import SQL.Conexao;
import javax.swing.JOptionPane;
import Send.Login;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.Timer;

/**
 *
 * @author Jorgi Luiz Bolonhezi Dias
 */
 

public class Painel extends javax.swing.JFrame {

    Login obj1 = new Login();
    String url, D, DP, IP2;

    public String getUrl() {
        return url;
    }

    public String getDP() {
        return DP;
    }

    public String getD() {
        return D;
    }

    /**
     * Creates new form Painel
     */
    public Painel() {
        initComponents();
        setSize(750,311);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jScrollBar1 = new javax.swing.JScrollBar();
        jPasswordField3 = new javax.swing.JPasswordField();
        JBUser = new javax.swing.JLabel();
        IP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        OKButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        CleanButton = new javax.swing.JButton();
        DBName = new javax.swing.JPasswordField();
        JFundo = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrator Panel 2.9.1");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        JBUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JBUser.setForeground(new java.awt.Color(255, 255, 255));
        JBUser.setText("Username:");
        getContentPane().add(JBUser);
        JBUser.setBounds(50, 30, 70, 30);
        getContentPane().add(IP);
        IP.setBounds(120, 30, 140, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Password:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 70, 70, 30);

        OKButton.setBackground(new java.awt.Color(0, 0, 102));
        OKButton.setForeground(new java.awt.Color(255, 255, 255));
        OKButton.setText("OK");
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });
        getContentPane().add(OKButton);
        OKButton.setBounds(70, 140, 70, 32);

        CancelButton.setBackground(new java.awt.Color(0, 0, 102));
        CancelButton.setForeground(new java.awt.Color(255, 255, 255));
        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CancelButton);
        CancelButton.setBounds(150, 140, 90, 32);

        CleanButton.setBackground(new java.awt.Color(0, 0, 102));
        CleanButton.setForeground(new java.awt.Color(255, 255, 255));
        CleanButton.setText("Clean");
        CleanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleanButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CleanButton);
        CleanButton.setBounds(250, 140, 80, 32);
        getContentPane().add(DBName);
        DBName.setBounds(120, 70, 140, 30);

        JFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SY.jpg"))); // NOI18N
        getContentPane().add(JFundo);
        JFundo.setBounds(0, 0, 750, 282);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed
        try {
                Conexao con = new Conexao();
                String SQL = "select * from PS_UserData.dbo.Users_Master where UserID=? and Pw=?";
                PreparedStatement ps = con.getConexao().prepareStatement(SQL);
                ps.setString(1, IP.getText());
                ps.setString(2, DBName.getText());
                ResultSet registros = ps.executeQuery();
                registros.next();
                int Am = registros.getInt("AdminLevel");
                if(Am == 255){
                new JBLogin().setVisible(true);
                this.dispose();
                this.setResizable(false);
                }else{
                    JOptionPane.showMessageDialog(null, "Acess Danied");
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: Acess Danied");
        }
    }//GEN-LAST:event_OKButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void CleanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CleanButtonActionPerformed
        IP.setText("");
        DBName.setText("");
    }//GEN-LAST:event_CleanButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Painel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton CleanButton;
    private javax.swing.JPasswordField DBName;
    private javax.swing.JTextField IP;
    private javax.swing.JLabel JBUser;
    private javax.swing.JLabel JFundo;
    private javax.swing.JButton OKButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollBar jScrollBar1;
    // End of variables declaration//GEN-END:variables
private boolean ValidarCampos() {
        if (JBUser.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Enter you Username");
            JBUser.requestFocus();
            return false;
        }
        if (DBName.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Enter your Password");
            DBName.requestFocus();
            return false;
        }
        return true;
    }
private Timer timer;
}
