
import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Return extends javax.swing.JFrame {
Connection conn;
ResultSet rs;
PreparedStatement pst;
    /**
     * Creates new form Return
     */
    public Return() {
        super("Return Book");
        initComponents();
        conn=JavaConnect.ConncerDb();
    }
    public void Delete(){
        String sql="delete from Issue where Student_ID=?";
        try{
           pst=conn.prepareStatement(sql);
           pst.setString(1, jTextField1.getText());
           pst.execute();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void Delete1(){
        String sql="delete from return_book where Student_ID=?";
        try{
           pst=conn.prepareStatement(sql);
           pst.setString(1, jTextField1.getText());
           pst.execute();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void ReturnUpdate(){
        String sql="insert into Return_Book (Student_ID,Name,FName,Course,Branch,Year,Semester,Book_ID,BName,Edition,Publisher,Price,Pages,Doi,Dor) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
           pst=conn.prepareStatement(sql);
           pst.setString(1, jTextField1.getText());
           pst.setString(2, jTextField2.getText());
           pst.setString(3, jTextField3.getText());
           pst.setString(4, jTextField4.getText());
           pst.setString(5, jTextField5.getText());
           pst.setString(6, jTextField6.getText());
           pst.setString(7, jTextField7.getText());
           pst.setString(8, jTextField8.getText());
           pst.setString(9, jTextField9.getText());
           pst.setString(10, jTextField10.getText());
           pst.setString(11, jTextField11.getText());
           pst.setString(12, jTextField12.getText());
           pst.setString(13, jTextField13.getText());
           pst.setString(14, jTextField14.getText());
           pst.setString(15,((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText());
           pst.execute();
           JOptionPane.showMessageDialog(null, "Book Retruned");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void Book(){
        String sql="insert into Book(Book_ID,Name,Edition,Publisher,Price,Pages) values(?,?,?,?,?,?)";
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1, jTextField8.getText());
            pst.setString(2, jTextField9.getText());
            pst.setString(3, jTextField10.getText());;
            pst.setString(4, jTextField11.getText());
            pst.setString(5, jTextField12.getText());
            pst.setString(6, jTextField13.getText());
            pst.execute();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Student ID");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 80, 80, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 110, 35, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Father Name");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 140, 80, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Course");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 170, 43, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Branch");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(60, 200, 43, 17);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Year");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(60, 230, 27, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Semester");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(60, 260, 80, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Book_ID");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(410, 80, 70, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Name");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(410, 110, 35, 17);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Edition");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(410, 140, 41, 17);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Publisher");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(410, 170, 60, 17);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Price");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(410, 200, 29, 17);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Pages");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(410, 230, 36, 17);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(160, 80, 190, 20);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(160, 110, 190, 20);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(160, 140, 190, 20);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(160, 170, 190, 20);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(160, 200, 190, 20);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6);
        jTextField6.setBounds(160, 230, 190, 20);
        jPanel1.add(jTextField7);
        jTextField7.setBounds(160, 260, 190, 20);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Date of Issue");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(410, 260, 90, 14);
        jPanel1.add(jTextField8);
        jTextField8.setBounds(520, 80, 200, 20);
        jPanel1.add(jTextField9);
        jTextField9.setBounds(520, 110, 200, 20);
        jPanel1.add(jTextField10);
        jTextField10.setBounds(520, 140, 200, 20);
        jPanel1.add(jTextField11);
        jTextField11.setBounds(520, 170, 200, 20);
        jPanel1.add(jTextField12);
        jTextField12.setBounds(520, 200, 200, 20);
        jPanel1.add(jTextField13);
        jTextField13.setBounds(520, 230, 200, 20);
        jPanel1.add(jTextField14);
        jTextField14.setBounds(520, 260, 200, 20);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 0, 0));
        jLabel17.setText("Return Panel");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(310, 20, 180, 29);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Date Of Return");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(410, 310, 100, 17);

        jButton2.setBackground(new java.awt.Color(255, 255, 51));
        jButton2.setIcon(new javax.swing.ImageIcon("E:\\project\\ICON\\Untitled-21.png")); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(610, 360, 90, 25);

        jButton1.setBackground(new java.awt.Color(255, 255, 51));
        jButton1.setIcon(new javax.swing.ImageIcon("E:\\project\\ICON\\Untitled-23.png")); // NOI18N
        jButton1.setText("Return");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(470, 360, 90, 25);

        jButton3.setBackground(new java.awt.Color(255, 255, 51));
        jButton3.setIcon(new javax.swing.ImageIcon("E:\\project\\ICON\\Untitled-20.png")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(360, 80, 20, 20);
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(520, 310, 200, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\project\\ICON\\nice-backgrounds-for-powerpoints-selo-l-ink-co-regarding-nice-backgrounds-for-powerpoint-presentations.jpg")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, -10, 760, 420);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(772, 444));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       String sql="select * from Issue where Student_ID=?";
       try{
           pst=conn.prepareStatement(sql);
           pst.setString(1, jTextField1.getText());
           rs=pst.executeQuery();
           if(rs.next())
           {
               String add1=rs.getString("SName");
               jTextField2.setText(add1);
               String add2=rs.getString("FName");
               jTextField3.setText(add2);
               String add3=rs.getString("Course");
               jTextField4.setText(add3);
               String add4=rs.getString("Branch");
               jTextField5.setText(add4);
               String add5=rs.getString("Year");
               jTextField6.setText(add5);
               String add6=rs.getString("Semester");
               jTextField7.setText(add6);
               String add7=rs.getString("Book_ID");
               jTextField8.setText(add7);
               String add8=rs.getString("Name");
               jTextField9.setText(add8);
               String add9=rs.getString("Edition");
               jTextField10.setText(add9);
               String add10=rs.getString("Publisher");
               jTextField11.setText(add10);
               String add11=rs.getString("price");
               jTextField12.setText(add11);
               String add12=rs.getString("Pages");
               jTextField13.setText(add12);
               String add13=rs.getString("DateOfIssue");
               jTextField14.setText(add13);
               rs.close();
               pst.close();
           }else{
               JOptionPane.showMessageDialog(null, "Book was not Issue");
           }
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }finally{
           try{
               rs.close();
               pst.close();
           }catch(Exception e){
               
           }
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Delete1();
        Book();
        ReturnUpdate();
        Delete();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        Home ob = new Home();
        ob.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Return().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
