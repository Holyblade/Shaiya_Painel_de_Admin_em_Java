/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tool;

import SQL.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorgi Luiz Bolonhezi Dias
 */
 
public class Database extends javax.swing.JFrame {

    /**
     * Creates new form Database
     */
    public Database() {
        initComponents();
        setSize(1200,700);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScan = new javax.swing.JButton();
        CDSFix = new javax.swing.JButton();
        JMenu = new javax.swing.JButton();
        ScanStatus = new javax.swing.JLabel();
        CDSStatus = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProblemsFound = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProblemsFixed = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Database - Panel");
        setResizable(false);
        getContentPane().setLayout(null);

        jScan.setBackground(new java.awt.Color(102, 102, 0));
        jScan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jScan.setForeground(new java.awt.Color(255, 255, 255));
        jScan.setText("Scan");
        jScan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jScanActionPerformed(evt);
            }
        });
        getContentPane().add(jScan);
        jScan.setBounds(50, 30, 150, 25);

        CDSFix.setBackground(new java.awt.Color(102, 102, 0));
        CDSFix.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CDSFix.setForeground(new java.awt.Color(255, 255, 255));
        CDSFix.setText("Fix");
        CDSFix.setEnabled(false);
        CDSFix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CDSFixActionPerformed(evt);
            }
        });
        getContentPane().add(CDSFix);
        CDSFix.setBounds(210, 30, 150, 25);

        JMenu.setBackground(new java.awt.Color(102, 102, 0));
        JMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JMenu.setForeground(new java.awt.Color(255, 255, 255));
        JMenu.setText("Menu");
        JMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuActionPerformed(evt);
            }
        });
        getContentPane().add(JMenu);
        JMenu.setBounds(370, 30, 110, 25);

        ScanStatus.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        ScanStatus.setForeground(new java.awt.Color(255, 255, 255));
        ScanStatus.setText("Scan Status:");
        getContentPane().add(ScanStatus);
        ScanStatus.setBounds(50, 100, 740, 30);

        CDSStatus.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        CDSStatus.setForeground(new java.awt.Color(255, 255, 255));
        CDSStatus.setText("Database Status:");
        getContentPane().add(CDSStatus);
        CDSStatus.setBounds(50, 170, 180, 22);

        ProblemsFound.setColumns(20);
        ProblemsFound.setRows(5);
        ProblemsFound.setEnabled(false);
        jScrollPane1.setViewportView(ProblemsFound);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(720, 30, 470, 96);

        ProblemsFixed.setColumns(20);
        ProblemsFixed.setRows(5);
        ProblemsFixed.setEnabled(false);
        jScrollPane2.setViewportView(ProblemsFixed);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(720, 160, 470, 96);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Problems Found:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(580, 20, 140, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Problemas Fixed:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(580, 160, 160, 30);

        jFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SQL.jpg"))); // NOI18N
        getContentPane().add(jFundo);
        jFundo.setBounds(0, 0, 1290, 688);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jScanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jScanActionPerformed
     try { 
            Conexao con = new Conexao();
            String SQL = "select*from PS_UserData.dbo.Users_Master where Admin = 'True' and UserID <> 'batymaty'and UserID<> 'Nadia' and UserID<> 'osmairjun' and UserID<> 'Nadinha'";
            PreparedStatement ps = con.getConexao().prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            ScanStatus.setText("Scan Status: Finished");
            if(rs.next()){
                CDSStatus.setText("Database on Risk");
                CDSFix.setEnabled(true);
                ProblemsFound.setEnabled(true);
                ProblemsFound.setText("More than Admins Account at AdminLevel 255 Found");       
            }else{
               CDSStatus.setText("Database Safe");
            }
            SQL = "select*from PS_GameData.dbo.Chars where Str>=10000 and UserUID<>1 and UserUID<>46";
            ps = con.getConexao().prepareStatement(SQL);
            rs = ps.executeQuery();
            if(rs.next()){
                CDSStatus.setText("Database on Risk");
                CDSFix.setEnabled(true);
                ProblemsFound.setEnabled(true);
                ProblemsFound.setText("Edited Toons Found");
            }else{
               CDSStatus.setText("Database Safe");
            }
            SQL = "select*from PS_GameData.dbo.Chars where Dex>=10000 and UserUID<>1 and UserUID<>10 and UserUID<>25 and UserUID<>46";
            ps = con.getConexao().prepareStatement(SQL);
            rs = ps.executeQuery();
            if(rs.next()){
                CDSStatus.setText("Database on Risk");
                CDSFix.setEnabled(true);
                ProblemsFound.setEnabled(true);
                ProblemsFound.setText("Edited Toons Found");
            }else{
               CDSStatus.setText("Database Safe");
            }
            SQL = "select*from PS_GameData.dbo.Chars where Rec>=10000 and UserUID<>1 and UserUID<>10 and UserUID<>25 and UserUID<>46";
            ps = con.getConexao().prepareStatement(SQL);
            rs = ps.executeQuery();
            if(rs.next()){
                CDSStatus.setText("Database on Risk");
                ProblemsFound.setEnabled(true);
                ProblemsFound.setText("Edited Toons Found");
                CDSFix.setEnabled(true);
            }else{
               CDSStatus.setText("Database Safe");
            }
            SQL = "select*from PS_GameData.dbo.Chars where Luc>=10000 and UserUID<>1 and UserUID<>10 and UserUID<>25 and UserUID<>46";
            ps = con.getConexao().prepareStatement(SQL);
            rs = ps.executeQuery();
            if(rs.next()){
                CDSStatus.setText("Database on Risk");
                CDSFix.setEnabled(true);
                ProblemsFound.setEnabled(true);
                ProblemsFound.setText("Edited Toons Found");
            }else{
               CDSStatus.setText("Database Safe");
            }
            SQL = "select*from PS_GameData.dbo.Chars where Int>=10000 and UserUID<>1 and UserUID<>10 and UserUID<>25 and UserUID<>46";
            ps = con.getConexao().prepareStatement(SQL);
            rs = ps.executeQuery();
            if(rs.next()){
                CDSStatus.setText("Database on Risk");
                CDSFix.setEnabled(true);
                ProblemsFound.setEnabled(true);
                ProblemsFound.setText("Edited Toons Found");
            }else{
               CDSStatus.setText("Database Safe");
            }
            SQL = "select*from PS_GameData.dbo.Chars where Wis>=10000 and UserUID<>1 and UserUID<>10 and UserUID<>25 and UserUID<>46";
            ps = con.getConexao().prepareStatement(SQL);
            rs = ps.executeQuery();
            if(rs.next()){
                CDSStatus.setText("Database on Risk");
                CDSFix.setEnabled(true);
                ProblemsFound.setEnabled(true);
                ProblemsFound.setText("Edited Toons Found");
            }else{
               CDSStatus.setText("Database Safe");
               ProblemsFound.setEnabled(true);
               ProblemsFound.setText("Edited Toons Found");
            }
            if(ProblemsFound.getText()!=null){
                CDSFix.setEnabled(true);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Connection Error:"+ex);
        }
    }//GEN-LAST:event_jScanActionPerformed

    private void JMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuActionPerformed
              new JBLogin().setVisible(true);
              this.dispose();
              this.setResizable(false);
    }//GEN-LAST:event_JMenuActionPerformed

    private void CDSFixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CDSFixActionPerformed
        try{
           Conexao con = new Conexao();
           String SQL = "UPDATE PS_UserData.dbo.Users_Master SET Admin = 'False', AdminLevel = '0', Status = '0', UserType = '1' where UserID <> 'batymaty' and UserID<> 'osmairjun' and UserID<> 'Nadinha'";
           PreparedStatement ps = con.getConexao().prepareStatement(SQL);
           ps.executeUpdate();
           SQL = "UPDATE PS_GameData.dbo.Chars SET Str=0 where Str>=10000 and UserUID<>1 and UserUID<>10 and UserUID<>25 and UserUID<>46";
           ps = con.getConexao().prepareStatement(SQL);
           ps.executeUpdate();
           SQL = "UPDATE PS_GameData.dbo.Chars SET Dex=0 where Dex>=10000 and UserUID<>1 and UserUID<>10 and UserUID<>25 and UserUID<>46";
           ps = con.getConexao().prepareStatement(SQL);
           ps.executeUpdate();
           SQL = "UPDATE PS_GameData.dbo.Chars SET Luc=0 where Luc>=10000 and UserUID<>1 and UserUID<>10 and UserUID<>25 and UserUID<>46";
           ps = con.getConexao().prepareStatement(SQL);
           ps.executeUpdate();
           SQL = "UPDATE PS_GameData.dbo.Chars SET Rec=0 where Rec>=10000 and UserUID<>1 and UserUID<>10 and UserUID<>25 and UserUID<>46";
           ps = con.getConexao().prepareStatement(SQL);
           ps.executeUpdate();
           SQL = "UPDATE PS_GameData.dbo.Chars SET Int=0 where Int>=10000 and UserUID<>1 and UserUID<>10 and UserUID<>25 and UserUID<>46";
           ps = con.getConexao().prepareStatement(SQL);
           ps.executeUpdate();
           SQL = "UPDATE PS_GameData.dbo.Chars SET Wis=0 where Wis>=10000 and UserUID<>1 and UserUID<>10 and UserUID<>25 and UserUID<>46";
           ps = con.getConexao().prepareStatement(SQL);
           ps.executeUpdate();
           CDSStatus.setText("Database Safe");
           ProblemsFixed.setEnabled(true);
           ProblemsFixed.setText("Edited Toons Updated Status to 0 and "
                   + "\nDepGrade non-Allowed GM Accounts "
                   + "\nto Normal Accounts.");
           ProblemsFound.setEnabled(false);
           ProblemsFound.setText("");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro de Conexão SQL");
        }                               
    }//GEN-LAST:event_CDSFixActionPerformed

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
            java.util.logging.Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Database().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CDSFix;
    private javax.swing.JLabel CDSStatus;
    private javax.swing.JButton JMenu;
    private javax.swing.JTextArea ProblemsFixed;
    private javax.swing.JTextArea ProblemsFound;
    private javax.swing.JLabel ScanStatus;
    private javax.swing.JLabel jFundo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jScan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
