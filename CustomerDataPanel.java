/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ais_ticket_reservation_system;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Owais
 */public class CustomerDataPanel extends javax.swing.JFrame
 {
 int inputCounter=1;
    CustomerList cc = null;
    boolean status = false;
    int num=0;
    /**
     * Creates new form CustomerDataPanel
     */
    public CustomerDataPanel() {
        initComponents();
        cc = new CustomerList();
//        
//        while(num==0) {
//                try {
//                    num = Integer.parseInt(JOptionPane.showInputDialog("For Reservation\n10 Rooms are Left,\n\tso gow any rooms you want to make?"));
//                    if(num>10 || num<0) {
//                        JOptionPane.showMessageDialog(this, "Invalid Range");
//                        num=0;
//                    }
//                    else
//                        System.out.println("Congratulations");
//                    } catch (NumberFormatException e) {
//    //                    JOptionPane.showMessageDialog(this, "Invalid Input");
//                            JOptionPane.showMessageDialog(this, "Invalid Input");
//               }
//            }
//        System.out.println("num="+num);
        Text.setText("Enter Details of Customer# "+inputCounter);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        Output = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        Background = new javax.swing.JPanel();
        AddButton = new javax.swing.JButton();
        Departure = new javax.swing.JTextField();
        Departure_ = new javax.swing.JLabel();
        Destination_ = new javax.swing.JLabel();
        Destination = new javax.swing.JTextField();
        Age = new javax.swing.JTextField();
        Age_ = new javax.swing.JLabel();
        Contact = new javax.swing.JTextField();
        ContactNumber = new javax.swing.JLabel();
        eID = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        Sign = new javax.swing.JLabel();
        Domain = new javax.swing.JComboBox<>();
        Passport = new javax.swing.JTextField();
        DOY = new javax.swing.JTextField();
        d_o_y = new javax.swing.JLabel();
        DOM = new javax.swing.JTextField();
        d_o_m = new javax.swing.JLabel();
        DOB = new javax.swing.JTextField();
        d_o_b = new javax.swing.JLabel();
        Pass = new javax.swing.JLabel();
        Fname = new javax.swing.JLabel();
        FirstName = new javax.swing.JTextField();
        Lname = new javax.swing.JLabel();
        LastName = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        Text = new javax.swing.JLabel();
        Header = new javax.swing.JLabel();
        totCustomer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer Data");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(500, 800));
        getContentPane().setLayout(null);

        Output.setBackground(new java.awt.Color(204, 255, 255));
        Output.setColumns(20);
        Output.setRows(5);
        jScrollPane1.setViewportView(Output);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 570, 430, 160);

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(0, 102, 102));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("Customer List");
        getContentPane().add(jTextField2);
        jTextField2.setBounds(30, 540, 110, 30);

        jTextField3.setEditable(false);
        jTextField3.setText("Total Customers:");
        jTextField3.setAutoscrolls(false);
        jTextField3.setBorder(null);
        jTextField3.setFocusable(false);
        jTextField3.setOpaque(false);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(320, 540, 110, 30);

        Background.setBackground(new java.awt.Color(204, 255, 255));
        Background.setLayout(null);

        AddButton.setBackground(new java.awt.Color(153, 255, 255));
        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        Background.add(AddButton);
        AddButton.setBounds(30, 480, 440, 40);

        Departure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartureActionPerformed(evt);
            }
        });
        Background.add(Departure);
        Departure.setBounds(110, 410, 130, 30);

        Departure_.setText("Departure:");
        Background.add(Departure_);
        Departure_.setBounds(30, 410, 70, 30);

        Destination_.setText("Destination:");
        Background.add(Destination_);
        Destination_.setBounds(260, 410, 70, 30);
        Background.add(Destination);
        Destination.setBounds(340, 410, 130, 30);
        Background.add(Age);
        Age.setBounds(389, 350, 80, 30);

        Age_.setText("Age: ");
        Background.add(Age_);
        Age_.setBounds(350, 350, 40, 30);
        Background.add(Contact);
        Contact.setBounds(110, 350, 220, 30);

        ContactNumber.setText("Contact #");
        Background.add(ContactNumber);
        ContactNumber.setBounds(30, 350, 70, 30);

        eID.setText("Email ID:");
        Background.add(eID);
        eID.setBounds(30, 290, 60, 30);
        Background.add(Email);
        Email.setBounds(110, 290, 230, 30);

        Sign.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Sign.setText("@");
        Background.add(Sign);
        Sign.setBounds(340, 290, 20, 30);

        Domain.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "gmail.com", "yahoo.com", "hotmail.com" }));
        Domain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DomainActionPerformed(evt);
            }
        });
        Background.add(Domain);
        Domain.setBounds(360, 290, 110, 30);
        Background.add(Passport);
        Passport.setBounds(110, 230, 360, 30);

        DOY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOYActionPerformed(evt);
            }
        });
        Background.add(DOY);
        DOY.setBounds(380, 170, 90, 30);

        d_o_y.setText("Year:");
        Background.add(d_o_y);
        d_o_y.setBounds(340, 170, 40, 30);

        DOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOMActionPerformed(evt);
            }
        });
        Background.add(DOM);
        DOM.setBounds(250, 170, 80, 30);

        d_o_m.setText("Month:");
        Background.add(d_o_m);
        d_o_m.setBounds(200, 170, 40, 30);

        DOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOBActionPerformed(evt);
            }
        });
        Background.add(DOB);
        DOB.setBounds(110, 170, 80, 30);

        d_o_b.setText("Date of Birth");
        Background.add(d_o_b);
        d_o_b.setBounds(30, 170, 80, 30);

        Pass.setText("Passport #");
        Background.add(Pass);
        Pass.setBounds(30, 230, 70, 30);

        Fname.setText("First Name:");
        Background.add(Fname);
        Fname.setBounds(30, 110, 80, 30);

        FirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameActionPerformed(evt);
            }
        });
        Background.add(FirstName);
        FirstName.setBounds(110, 110, 130, 30);

        Lname.setText("Last Name:");
        Background.add(Lname);
        Lname.setBounds(260, 110, 70, 30);
        Background.add(LastName);
        LastName.setBounds(340, 110, 130, 30);

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));

        Text.setBackground(new java.awt.Color(153, 153, 153));
        Text.setFont(new java.awt.Font("Script MT Bold", 0, 36)); // NOI18N
        Text.setForeground(new java.awt.Color(255, 255, 255));
        Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text.setText("Enter Customer Details");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(Text, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(Text, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Background.add(jPanel5);
        jPanel5.setBounds(0, 0, 500, 60);

        Header.setBackground(new java.awt.Color(153, 153, 153));
        Header.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Header.setText("Enter Customer Details");
        Background.add(Header);
        Header.setBounds(140, 70, 230, 30);

        getContentPane().add(Background);
        Background.setBounds(0, 0, 500, 520);

        totCustomer.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        totCustomer.setText("0");
        getContentPane().add(totCustomer);
        totCustomer.setBounds(430, 540, 30, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DOBActionPerformed

    private void DOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DOMActionPerformed

    private void DOYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DOYActionPerformed

    private void DomainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DomainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DomainActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
            
            String Fname = FirstName.getText();
            String Lname = LastName.getText();
            String dob = DOB.getText();
            String dom = DOM.getText();
            String doy = DOY.getText();
            String Pass = Passport.getText();
            String emailID = Email.getText();
            String domain =  ( (String) Domain.getSelectedItem() );
            String contact = Contact.getText();
            String age = Age.getText();
            String departure = Departure.getText();
            String destination = Destination.getText();
        
            if( !Fname.equals("") && !Lname.equals("") && !dob.equals("") && !dom.equals("") &&
                    !doy.equals("") && !Pass.equals("") && !emailID.equals("") && 
                    !contact.equals("") && !age.equals("") && !departure.equals("") &&
                    !destination.equals("") )
            {
                emailID = emailID.concat(domain);
                int DOB=0, DOY=0, AGE=0;
                long ContactNo=0;

                try {
                    DOB = Integer.parseInt(dob);
                    DOY = Integer.parseInt(doy);
                    AGE = Integer.parseInt(age);
                    ContactNo = Long.parseLong(contact);
                    
                cc.addCustomer(Fname,Lname,DOB ,dom, DOY, Pass,emailID, ContactNo,AGE , departure,destination);
                cc.ADDTOFILE(Fname,Lname,DOB ,dom, DOY, Pass,emailID, ContactNo,AGE , departure,destination);
//                status = true;

                inputCounter=inputCounter+1;
                if(inputCounter <= DataForm.totPassenger) {
                    totCustomer.setText(Integer.toString(cc.TotalReservations));
                    Output.setText(cc.toString());
                    Text.setText("Enter Details of Customer# "+inputCounter);
                    clearAllTexts();
                   
                }
                else {
                    this.dispose();
                    System.out.println(cc.Recipet());
                    CustomersInfo ci = new CustomersInfo(cc);
                    ci.setVisible(true);
                }
                    
                
//                clearAllTexts();
                    
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Invalid Number Input");
                    status=false;
                }

            }

            else {
                JOptionPane.showMessageDialog(this, "Invalid Input");
                status=false;
            }
        
   
    }//GEN-LAST:event_AddButtonActionPerformed

    private void FirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameActionPerformed

    private void DepartureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepartureActionPerformed

    public void clearAllTexts() {
        FirstName.setText("");
        LastName.setText("");
        DOB.setText("");
        DOM.setText("");
        DOY.setText("");
        Passport.setText("");
        Contact.setText("");
        Email.setText("");
        Destination.setText("");
        Departure.setText("");
        Age.setText("");
    }
    
    public void disableall() {
        Text.setText("Enter Passenger Details");
        Text.setEnabled(false);
        FirstName.setEnabled(false);
        Fname.setEnabled(false);
        LastName.setEnabled(false);
        Lname.setEnabled(false);
        d_o_b.setEnabled(false);
        d_o_m.setEnabled(false);
        d_o_y.setEnabled(false);
        DOM.setEnabled(false);
        DOB.setEnabled(false);
        DOY.setEnabled(false);
        Pass.setEnabled(false);
        Passport.setEnabled(false);
        eID.setEnabled(false);
        Sign.setEnabled(false);
        Domain.setEnabled(false);
        Email.setEnabled(false);
        ContactNumber.setEnabled(false);
        Contact.setEnabled(false);
        Age.setEnabled(false);
        Age_.setEnabled(false);
        Departure.setEnabled(false);
        Departure_.setEnabled(false);
        Destination.setEnabled(false);
        Destination_.setEnabled(false);
        AddButton.setEnabled(false);
    }
    
//    public void  UserInput() {
//        for(int i=1; i<=num; i++) {
//            status=false;
////            this.setVisible(true);
//            Text.setText("Enter Details of Customer# "+i);
//            while (status==false) {
//                this.setVisible(true);
//            }
//            
////                JOptionPane.showMessageDialog(this, "You entered Data Successfully\n"+cc.toString());
//                  totCustomer.setText(Integer.toString(cc.TotalReservations));
//                  Output.setText(cc.toString());
//            
////            this.setVisible(false);
//        }
////        Background.setOpaque(false);
//        disableall();
//        System.out.println("in end");
//    }
    
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
//            java.util.logging.Logger.getLogger(CustomerDataPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CustomerDataPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CustomerDataPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CustomerDataPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CustomerDataPanel().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTextField Age;
    private javax.swing.JLabel Age_;
    private javax.swing.JPanel Background;
    private javax.swing.JTextField Contact;
    private javax.swing.JLabel ContactNumber;
    private javax.swing.JTextField DOB;
    private javax.swing.JTextField DOM;
    private javax.swing.JTextField DOY;
    private javax.swing.JTextField Departure;
    private javax.swing.JLabel Departure_;
    private javax.swing.JTextField Destination;
    private javax.swing.JLabel Destination_;
    private javax.swing.JComboBox<String> Domain;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField FirstName;
    private javax.swing.JLabel Fname;
    private javax.swing.JLabel Header;
    private javax.swing.JTextField LastName;
    private javax.swing.JLabel Lname;
    private javax.swing.JTextArea Output;
    private javax.swing.JLabel Pass;
    private javax.swing.JTextField Passport;
    private javax.swing.JLabel Sign;
    private javax.swing.JLabel Text;
    private javax.swing.JLabel d_o_b;
    private javax.swing.JLabel d_o_m;
    private javax.swing.JLabel d_o_y;
    private javax.swing.JLabel eID;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel totCustomer;
    // End of variables declaration//GEN-END:variables
}
