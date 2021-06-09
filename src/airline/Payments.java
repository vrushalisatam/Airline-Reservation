/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Payments extends javax.swing.JFrame {
   
    PreparedStatement ps, pss, pst, pstt, pstmt= null;
    ResultSet rs, rss, rst, rst1, rst2=null;
    String CId, CIdd, sql;
    Connection con;
    /**
     * Creates new form Payments
     */
    public Payments() {
        initComponents();
        
    }
    
    public void close(){
        WindowEvent we = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(we);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cancelPay = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        payNow = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Payments");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Payment", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 3, 24), new java.awt.Color(0, 153, 153))); // NOI18N

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Payment Method :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Card NO. :");

        cancelPay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cancelPay.setText("Cancel Payment");
        cancelPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelPayActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Total Amount :");

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Card Type :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Bank Name :");

        payNow.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        payNow.setText("Pay Now");
        payNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payNowActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField4.setEnabled(false);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Credit Card", "Debit Card" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Holder Name :");

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Master Card", "Rupay", "Visa" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(109, 109, 109)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(payNow)
                        .addGap(94, 94, 94)
                        .addComponent(cancelPay)))
                .addContainerGap(222, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payNow)
                    .addComponent(cancelPay))
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void payNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payNowActionPerformed
        
        Invoice ic = new Invoice();
        if(evt.getSource() == payNow)
        {
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");  
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline?allowMultiQueries=true", "root", "pinku");
                ps = con.prepareStatement("insert into pay(C_ID, f_no, n_seats, pay_method, card_no, card_type, holder_name, bank_name, tot_amt) values(?,?,?,?,?,?,?,?,?)");
                pss = con.prepareStatement("select customer_id, flight_no from reg, flights where customer_id='" + LoginForm.txtusername.getText()+"' and flight_no='"+ SearchedFlights.jTextField1.getText()+"'");
                rs = pss.executeQuery();
                while(rs.next())
                {   
                    ps.setString(1, rs.getString("customer_id"));
                    ps.setString(2, rs.getString("flight_no"));
                    ps.setString(3, SearchedFlights.jSpinner1.getValue().toString());
                    ps.setString(4, jComboBox1.getSelectedItem().toString());
                    ps.setString(5, jTextField1.getText());
                    ps.setString(6, jComboBox2.getSelectedItem().toString());
                    ps.setString(7, jTextField2.getText());
                    ps.setString(8, jTextField3.getText());
                    ps.setString(9, jTextField4.getText());
                    ps.executeUpdate();
                }
                JOptionPane.showMessageDialog(null, "Transaction Successful");
            }
            catch(ClassNotFoundException | SQLException | HeadlessException ex)
            {
                System.out.println(ex);  
            }
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");  
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline?allowMultiQueries=true", "root", "pinku");
                pst = con.prepareStatement("select * from pay where C_ID = '" + LoginForm.txtusername.getText()+"';");
                rss = pst.executeQuery();
                while(rss.next())
                {
                    Invoice.jTextField1.setText(rss.getString("pay.P_id"));
                    Invoice.jTextField11.setText(rss.getString("pay.tot_amt"));
                    Invoice.jTextField6.setText(rss.getString("pay.n_seats"));
                    pst = con.prepareStatement("select customer_id, NAME from reg where customer_id='" + LoginForm.txtusername.getText()+"';");
                    rst1 = pst.executeQuery();
                    while(rst1.next())
                    {
                        Invoice.jTextField2.setText(rst1.getString("reg.customer_id"));
                        Invoice.jTextField3.setText(rst1.getString("reg.NAME"));
                    }
                    pst = con.prepareStatement("select flight_no, flight_name, class, depart_time, arr_time, flight_date from flights where flight_no='"+ rss.getString("f_no")+"'");
                    rst2 = pst.executeQuery();
                    while(rst2.next())
                    {
                        Invoice.jTextField4.setText(rst2.getString("flight_no"));
                        Invoice.jTextField5.setText(rst2.getString("flight_name"));
                        Invoice.jTextField7.setText(rst2.getString("class"));
                        Invoice.jTextField8.setText(rst2.getString("depart_time"));
                        Invoice.jTextField9.setText(rst2.getString("arr_time"));
                        Invoice.jTextField10.setText(rst2.getString("flight_date"));
                    }           
                }
                ic.setVisible(true);
            }
            catch(ClassNotFoundException | SQLException | HeadlessException ex)
            {
                System.out.println(ex);  
            }
            
            String sender = ""; //insert valid emailid
            String host = "smtp.gmail.com"; 
            Properties properties = System.getProperties(); 
            properties.put("mail.smtp.host", host);
            properties.put("mail.smtp.port", "465");
            properties.put("mail.smtp.ssl.enable", "true");
            properties.put("mail.smtp.auth", "true");
            Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("", ""); //insert the sender email id and the corresponding correct password
                }
                });
            session.setDebug(true);
            try{
                MimeMessage message = new MimeMessage(session); 
                message.setFrom(new InternetAddress(sender)); 
                String sql = "select email_id from reg where customer_id='" + LoginForm.txtusername.getText()+"';" ;
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                while(rs.next())
                {
                    message.addRecipients(Message.RecipientType.TO,InternetAddress.parse(rs.getString("email_id")));
                }
                String sql1 = "select C_ID, f_no, tot_amt from pay where C_ID='" + LoginForm.txtusername.getText()+"';";
                PreparedStatement pss = con.prepareStatement(sql1);
                rst = pss.executeQuery();
                while(rst.next())
                {
                    message.setSubject("Flight Update Information");
                    message.setText("Dear Customer (" + rst.getString("C_ID") + ") you are booked with the flight number" + rst.getString("f_no") + ". We there by confirm your payment of Rs. " + rst.getString("tot_amt") + ". Have a safe journey with airlines. If you have any problem or have any doubt regarding your flight feel free to contact us on this given no 7021592923.");
                    Transport.send(message); 
                    JOptionPane.showMessageDialog(null, "Mail successfully sent");
                }
            }
            catch (MessagingException mex)  
            { 
                System.out.println(mex);
            } catch (SQLException ex) {
                Logger.getLogger(Payments.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        close();
    }//GEN-LAST:event_payNowActionPerformed

    private void cancelPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelPayActionPerformed
        
        if(evt.getSource() == cancelPay)
        {
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");  
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline?allowMultiQueries=true", "root", "pinku");
                pstt = con.prepareStatement("delete from booked_flights where cust_id='" + LoginForm.txtusername.getText()+"';");
                pstt.execute();
                JOptionPane.showMessageDialog(null, "Booked Flight Cancelled");
                close();
                Flight fl = new Flight();
                fl.setVisible(true);  
            }
            catch(ClassNotFoundException | SQLException | HeadlessException ex)
            {
                System.out.println(ex);  
            }
        }
    }//GEN-LAST:event_cancelPayActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Payments().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelPay;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    public static javax.swing.JTextField jTextField4;
    private javax.swing.JButton payNow;
    // End of variables declaration//GEN-END:variables
}