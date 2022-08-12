/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinemanagementsystem;

import java.sql.Connection;
//import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Juliet
 */
public class Flights extends javax.swing.JFrame {

    /**
     * Creates new form Flights
     */
    public Flights() {
        initComponents();
        DisplayFlight();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FCodeTb = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        FSourceCb = new javax.swing.JComboBox<>();
        FDestCb = new javax.swing.JComboBox<>();
        FDate = new com.toedter.calendar.JDateChooser();
        FSeatTb = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        FlightsTableList = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setText("Dynamite Airline");

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("Manage Flights");

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 153));
        jLabel4.setText("Flight Code");

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 153));
        jLabel5.setText("Source");

        FCodeTb.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 153));
        jLabel6.setText("Destination");

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 153));
        jLabel7.setText("Number of Seats");

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 153));
        jLabel8.setText("Takeof Date");

        FSourceCb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FSourceCb.setForeground(new java.awt.Color(153, 0, 153));
        FSourceCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abuja", "Accra", "Delta", "Ibandan", "Lagos", "Kumasi", "Johannasburg", "Owerri", " ", " " }));

        FDestCb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FDestCb.setForeground(new java.awt.Color(153, 0, 153));
        FDestCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abuja", "Accra", "Delta", "Ibandan", "Lagos", "Kumasi", "Johannasburg", "Owerri", " ", " " }));

        FDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        FSeatTb.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 153));
        jLabel9.setText("Flights List");

        EditBtn.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(153, 0, 153));
        EditBtn.setText("Edit");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(153, 0, 153));
        DeleteBtn.setText("Delete");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        SaveBtn.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        SaveBtn.setForeground(new java.awt.Color(153, 0, 153));
        SaveBtn.setText("Save");
        SaveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveBtnMouseClicked(evt);
            }
        });

        BackBtn.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(153, 0, 153));
        BackBtn.setText("Back");
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBtnMouseClicked(evt);
            }
        });

        FlightsTableList.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FlightsTableList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        FlightsTableList.setRowHeight(25);
        FlightsTableList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FlightsTableListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(FlightsTableList);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(72, 72, 72))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(FCodeTb, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(FSourceCb, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(91, 91, 91)
                                        .addComponent(jLabel8))
                                    .addComponent(jLabel3)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(396, 396, 396)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(FDestCb, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FDate, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(FSeatTb, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(FCodeTb)
                        .addGap(1, 1, 1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FSourceCb, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(FDestCb, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                .addComponent(FDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FSeatTb)))))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditBtn)
                    .addComponent(DeleteBtn)
                    .addComponent(BackBtn)
                    .addComponent(SaveBtn))
                .addGap(42, 42, 42)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
        new Mainform().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnMouseClicked

    Connection Con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null, Rsl = null;
    Statement St = null, Stl = null;
    
    private void DisplayFlight() {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3307/airlinedb","root","");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from FlightTable");
            FlightsTableList.setModel(DbUtils.resultSetToTableModel(Rs));
        } 
        catch (Exception e){  
        }
    }
    
     private void Clear() {
        FCodeTb.setText("");
        FSeatTb.setText("");
    }
    
    private void SaveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtnMouseClicked
         if(FCodeTb.getText().isEmpty() || FSeatTb.getText().isEmpty() || 
                FSourceCb.getSelectedIndex() == -1 ||  FDestCb.getSelectedIndex() == -1)
        {
            JOptionPane.showMessageDialog(this, "Missing field");
        } else {
            try {
                
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3307/airlinedb","root","");
                PreparedStatement Add = Con.prepareStatement("insert into FlightTable values(?,?,?,?,?)");
                Add.setString(1, FCodeTb.getText());
                Add.setString(2, FSourceCb.getSelectedItem().toString());
                Add.setString(3, FDestCb.getSelectedItem().toString());
                Add.setString(4, FDate.getDate().toString());
                Add.setInt(5, Integer.valueOf(FSeatTb.getText()));
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Flight Added");
                Con.close();
                DisplayFlight();
                Clear();
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_SaveBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if(key == "") {
            JOptionPane.showMessageDialog(this, "Select a Flight Detail");
        } 
        else {
            try {
               Con = DriverManager.getConnection("jdbc:mysql://localhost:3307/airlinedb","root",""); 
               String query = "Delete from FlightTable where FlightCode = '" + key + "'";
               Statement del = Con.createStatement();
               del.executeUpdate(query);
               JOptionPane.showMessageDialog(this, "Flight Details Deleted");
               DisplayFlight();
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    String key = "";
    private void FlightsTableListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FlightsTableListMouseClicked
        DefaultTableModel model = (DefaultTableModel) FlightsTableList.getModel();
        int myIndex = FlightsTableList.getSelectedRow();
        key = model.getValueAt(myIndex, 0).toString();
        //FCodeTb.setText(model.getValueAt(myIndex, 1).toString());
        FSourceCb.setSelectedItem(model.getValueAt(myIndex, 1).toString());
        FDestCb.setSelectedItem(model.getValueAt(myIndex, 2).toString());
       // FDate.setText(model.getValueAt(myIndex, 4).toString());
        FSeatTb.setText(model.getValueAt(myIndex, 4).toString());
        
    }//GEN-LAST:event_FlightsTableListMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        if(key == "")
        {
            JOptionPane.showMessageDialog(this, "Select Flight Info");
        } else {
            try {
               // CountPassengers();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3307/airlinedb","root","");
                String query = "Update FlightTable set FlightSource=?, FlightDestination=?, FlightDate=?,"
                        + "FlightSeats=? where FlightCode=?";
                PreparedStatement Add = Con.prepareStatement(query);
                Add.setString(5, key);
                Add.setString(1, FSourceCb.getSelectedItem().toString());
                Add.setString(2, FDestCb.getSelectedItem().toString());
                Add.setString(3, FDate.getDate().toString());
                Add.setString(4, FSeatTb.getText());
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Flight  Information Updated");
                Con.close();
                DisplayFlight();
                Clear();
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_EditBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Flights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Flights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Flights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Flights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Flights().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JTextField FCodeTb;
    private com.toedter.calendar.JDateChooser FDate;
    private javax.swing.JComboBox<String> FDestCb;
    private javax.swing.JTextField FSeatTb;
    private javax.swing.JComboBox<String> FSourceCb;
    private javax.swing.JTable FlightsTableList;
    private javax.swing.JButton SaveBtn;
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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
