/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ais_ticket_reservation_system;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Owais
 */
public class DataForm extends javax.swing.JFrame {

    /**
     * Creates new form DataForm
     */
    int trip;
    public static int totPassenger=0;
    public DataForm() {
        trip=-1;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OneWay = new javax.swing.JRadioButton();
        RoundTrip = new javax.swing.JRadioButton();
        From = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        To = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        ReturningOn = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ReturnDate = new com.toedter.calendar.JDateChooser();
        DepartingDate = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        Childrens = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        Class = new javax.swing.JComboBox<>();
        Infants = new javax.swing.JComboBox<>();
        Adults = new javax.swing.JComboBox<>();
        jSeparator5 = new javax.swing.JSeparator();
        Continue = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        setMinimumSize(new java.awt.Dimension(450, 700));
        getContentPane().setLayout(null);

        OneWay.setText("One Way");
        OneWay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OneWayActionPerformed(evt);
            }
        });
        getContentPane().add(OneWay);
        OneWay.setBounds(260, 80, 80, 23);

        RoundTrip.setText("Round Trip");
        RoundTrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoundTripActionPerformed(evt);
            }
        });
        getContentPane().add(RoundTrip);
        RoundTrip.setBounds(80, 80, 77, 23);

        From.setBackground(new java.awt.Color(204, 255, 255));
        From.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Karachi", "Islamabad", "Lahore", "Multan", "Dubai", "Jeddah", "Sialkot", "Abu Dubai" }));
        getContentPane().add(From);
        From.setBounds(100, 130, 270, 30);

        jLabel2.setFont(new java.awt.Font("SansSerif", 2, 18)); // NOI18N
        jLabel2.setText("From");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 130, 60, 30);

        To.setBackground(new java.awt.Color(204, 255, 255));
        To.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Karachi", "Islamabad", "Lahore", "Multan", "Dubai", "Jeddah", "Sialkot", "Abu Dubai" }));
        To.setSelectedIndex(1);
        getContentPane().add(To);
        To.setBounds(100, 180, 270, 30);

        jLabel3.setFont(new java.awt.Font("SansSerif", 2, 18)); // NOI18N
        jLabel3.setText("To");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 180, 60, 30);

        ReturningOn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ReturningOn.setText("Returning On");
        getContentPane().add(ReturningOn);
        ReturningOn.setBounds(290, 260, 90, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Departing on");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 260, 90, 20);
        getContentPane().add(ReturnDate);
        ReturnDate.setBounds(240, 290, 180, 30);
        getContentPane().add(DepartingDate);
        DepartingDate.setBounds(20, 290, 180, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 60, 450, 10);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(20, 550, 410, 10);

        Childrens.setBackground(new java.awt.Color(204, 255, 255));
        Childrens.setEditable(true);
        Childrens.setMaximumRowCount(6);
        Childrens.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Childrens: None", "Childrens: 1", "Childrens: 2", "Childrens: 3", "Childrens: 4", "Childrens: 5" }));
        Childrens.setAutoscrolls(true);
        Childrens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChildrensActionPerformed(evt);
            }
        });
        getContentPane().add(Childrens);
        Childrens.setBounds(130, 460, 190, 30);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(120, 240, 200, 10);

        Class.setBackground(new java.awt.Color(204, 255, 255));
        Class.setEditable(true);
        Class.setMaximumRowCount(3);
        Class.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Economy Class", "Business Class", "First Class" }));
        Class.setAutoscrolls(true);
        Class.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassActionPerformed(evt);
            }
        });
        getContentPane().add(Class);
        Class.setBounds(130, 350, 190, 30);

        Infants.setBackground(new java.awt.Color(204, 255, 255));
        Infants.setEditable(true);
        Infants.setMaximumRowCount(3);
        Infants.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Infants: None", "Infants: 1" }));
        Infants.setAutoscrolls(true);
        Infants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfantsActionPerformed(evt);
            }
        });
        getContentPane().add(Infants);
        Infants.setBounds(130, 500, 190, 30);

        Adults.setMaximumRowCount(7);
        Adults.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adults: 1", "Adults: 2", "Adults: 3", "Adults: 4", "Adults: 5", "Adults: 6" }));
        Adults.setAutoscrolls(true);
        Adults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdultsActionPerformed(evt);
            }
        });
        getContentPane().add(Adults);
        Adults.setBounds(130, 420, 190, 30);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(10, 400, 430, 10);

        Continue.setBackground(new java.awt.Color(0, 102, 102));
        Continue.setForeground(new java.awt.Color(0, 255, 255));
        Continue.setText("Continue");
        Continue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueActionPerformed(evt);
            }
        });
        getContentPane().add(Continue);
        Continue.setBounds(120, 580, 190, 40);

        jTextField1.setBackground(new java.awt.Color(0, 102, 102));
        jTextField1.setFont(new java.awt.Font("Tekton Pro Ext", 0, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 255, 255));
        jTextField1.setText("ENTER DETAILS OF PASSENGER");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(-1, 0, 450, 60);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ChildrensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChildrensActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChildrensActionPerformed

    private void ClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClassActionPerformed

    private void InfantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfantsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InfantsActionPerformed

    private void AdultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdultsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdultsActionPerformed

    private void OneWayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OneWayActionPerformed
        trip=1;
        RoundTrip.setSelected(false);
        ReturningOn.setEnabled(false);
        ReturnDate.setEnabled(false);
    }//GEN-LAST:event_OneWayActionPerformed

    private void RoundTripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoundTripActionPerformed
        trip = 0;
        OneWay.setSelected(false);
        ReturningOn.setEnabled(true);
        ReturnDate.setEnabled(true);
    }//GEN-LAST:event_RoundTripActionPerformed

    private void ContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueActionPerformed
        
        
        totPassenger = (Adults.getSelectedIndex()+1) + (Childrens.getSelectedIndex() + (Infants.getSelectedIndex()));
        
        if(trip==-1) {
            JOptionPane.showMessageDialog(this, "Please Select The Trip Button");
            this.setVisible(true);
        }
        else {
            
            if(trip==0) {
                if((ReturnDate.getDate())==null) {
                JOptionPane.showMessageDialog(this, "Please Select The Return Date");
                this.setVisible(true);
                }
                
                if(DepartingDate.getDate()==null) {         //Thu Jan 05 20:00:25 PKT 2017  //24-28
                 JOptionPane.showMessageDialog(this, "Please Select The Depating Date");
                 this.setVisible(true);
                }
                
                 if(ReturnDate.getDate()!=null && DepartingDate.getDate()!=null) {
                     this.dispose();
                      CustomerData cc = new CustomerData();
                      cc.setVisible(true);
                 }
            }
            else 
            {
                if(DepartingDate.getDate()==null) {         //Thu Jan 05 20:00:25 PKT 2017  //24-28
                 JOptionPane.showMessageDialog(this, "Please Select The Depating Date");
                 this.setVisible(true);
                }
                
                if(DepartingDate.getDate()!=null) {
                     this.dispose();
                      CustomerData cc = new CustomerData();
                      cc.setVisible(true);
                 }
            }  
            
//                if(trip==0) {
//                    if((ReturnDate.getDate())==null) {
//                    JOptionPane.showMessageDialog(this, "Please Select The Return Date");
//                    this.setVisible(true);
//                }
            
            }
    }//GEN-LAST:event_ContinueActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DataForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DataForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DataForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DataForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DataForm().setVisible(true);
//            }
//      
//            
//            
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> Adults;
    public static javax.swing.JComboBox<String> Childrens;
    public static javax.swing.JComboBox<String> Class;
    private javax.swing.JButton Continue;
    public static com.toedter.calendar.JDateChooser DepartingDate;
    public static javax.swing.JComboBox<String> From;
    public static javax.swing.JComboBox<String> Infants;
    private javax.swing.JRadioButton OneWay;
    private com.toedter.calendar.JDateChooser ReturnDate;
    private javax.swing.JLabel ReturningOn;
    private javax.swing.JRadioButton RoundTrip;
    public static javax.swing.JComboBox<String> To;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
