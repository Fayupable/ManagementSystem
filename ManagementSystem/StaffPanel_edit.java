/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.bp2projelogintasarim;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
public class StaffPanel_edit extends javax.swing.JFrame {

    /**
     * Creates new form StaffPanel_edit
     */
    DefaultTableModel tbl_table_staffE_model;

    public StaffPanel_edit() {
        initComponents();
        tbl_table_staffE_model = new DefaultTableModel();
        tbl_table_staffE_model.setColumnIdentifiers(new Object[]{"ID", "NAME", "EMAIL", "PASSWORD", "ADDRESS", "GENDER",});
        tbl_staffPanel_edit.setModel(tbl_table_staffE_model);
        txt_staffPanel_edit_address.setEditable(false);
        txt_staffPanel_edit_id.setEditable(false);
        txt_staffPanel_edit_name_surname.setEditable(false);
        cmbx_staffPanel_gender.setEditable(false);
        btn_staffPanel_update.setEnabled(false);

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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_staffPanel_edit = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_staffPanel_edit_name_surname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_staffPanel_edit_email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_StaffPanel_edit_password = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_staffPanel_edit_address = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbx_staffPanel_gender = new javax.swing.JComboBox<>();
        btn_staffPanel_update = new javax.swing.JButton();
        btn_staffPanel_verify = new javax.swing.JButton();
        btn_staffPanel_clear = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_staffPanel_edit_id = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mi_back_to_panel = new javax.swing.JMenuItem();
        mi_exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        tbl_staffPanel_edit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_staffPanel_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_staffPanel_editMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_staffPanel_edit);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Name surname");

        txt_staffPanel_edit_name_surname.setBackground(new java.awt.Color(255, 204, 204));
        txt_staffPanel_edit_name_surname.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        txt_staffPanel_edit_name_surname.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Email");

        txt_staffPanel_edit_email.setBackground(new java.awt.Color(255, 204, 204));
        txt_staffPanel_edit_email.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        txt_staffPanel_edit_email.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Password");

        txt_StaffPanel_edit_password.setBackground(new java.awt.Color(255, 204, 204));
        txt_StaffPanel_edit_password.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        txt_StaffPanel_edit_password.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Address");

        txt_staffPanel_edit_address.setBackground(new java.awt.Color(255, 204, 204));
        txt_staffPanel_edit_address.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        txt_staffPanel_edit_address.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Gender");

        cmbx_staffPanel_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        btn_staffPanel_update.setBackground(new java.awt.Color(51, 204, 255));
        btn_staffPanel_update.setForeground(new java.awt.Color(0, 0, 0));
        btn_staffPanel_update.setText("Update");
        btn_staffPanel_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_staffPanel_updateActionPerformed(evt);
            }
        });

        btn_staffPanel_verify.setBackground(new java.awt.Color(255, 102, 102));
        btn_staffPanel_verify.setForeground(new java.awt.Color(0, 0, 0));
        btn_staffPanel_verify.setText("Verify");
        btn_staffPanel_verify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_staffPanel_verifyActionPerformed(evt);
            }
        });

        btn_staffPanel_clear.setBackground(new java.awt.Color(204, 255, 255));
        btn_staffPanel_clear.setForeground(new java.awt.Color(0, 0, 0));
        btn_staffPanel_clear.setText("Clear");
        btn_staffPanel_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_staffPanel_clearActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("ID");

        txt_staffPanel_edit_id.setBackground(new java.awt.Color(255, 204, 204));
        txt_staffPanel_edit_id.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        txt_staffPanel_edit_id.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_staffPanel_edit_name_surname, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_staffPanel_edit_email, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_StaffPanel_edit_password, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_staffPanel_edit_address, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_staffPanel_verify, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbx_staffPanel_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_staffPanel_update, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_staffPanel_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_staffPanel_edit_id, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_staffPanel_edit_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_staffPanel_edit_name_surname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_staffPanel_edit_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_StaffPanel_edit_password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_staffPanel_edit_address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbx_staffPanel_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_staffPanel_update, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_staffPanel_verify, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_staffPanel_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 590));

        jMenu1.setText("Menu");

        mi_back_to_panel.setText("Back to panel");
        mi_back_to_panel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_back_to_panelActionPerformed(evt);
            }
        });
        jMenu1.add(mi_back_to_panel);

        mi_exit.setText("Exit");
        mi_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_exitActionPerformed(evt);
            }
        });
        jMenu1.add(mi_exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Information");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_staffPanel_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_staffPanel_editMouseClicked

        if (tbl_staffPanel_edit.getSelectedRow() < 0) {
            return;
        }
        int id = (int) tbl_table_staffE_model.getValueAt(tbl_staffPanel_edit.getSelectedRow(), 0);

        Staff stff = CompanyDB.SearchStaffById(id);
        if (stff != null) {
            txt_staffPanel_edit_id.setText(stff.id + "");
            txt_staffPanel_edit_name_surname.setText(stff.name_surname);
            txt_staffPanel_edit_email.setText(stff.email);
            txt_staffPanel_edit_address.setText(stff.address);
            txt_StaffPanel_edit_password.setText(stff.password);
            cmbx_staffPanel_gender.setSelectedItem(stff.gender);

        }


    }//GEN-LAST:event_tbl_staffPanel_editMouseClicked

    private void btn_staffPanel_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_staffPanel_clearActionPerformed

        txt_staffPanel_edit_id.setText("");
        txt_staffPanel_edit_email.setText("");
        txt_staffPanel_edit_address.setText("");
        txt_StaffPanel_edit_password.setText("");
        txt_staffPanel_edit_name_surname.setText("");
        cmbx_staffPanel_gender.setSelectedIndex(0);
        tbl_table_staffE_model.setRowCount(0);
        


    }//GEN-LAST:event_btn_staffPanel_clearActionPerformed

    private void btn_staffPanel_verifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_staffPanel_verifyActionPerformed

        String email = txt_staffPanel_edit_email.getText();
        String password = txt_StaffPanel_edit_password.getText();
        Person person = CompanyDB.Login(email, password);

        if (email.isEmpty() && password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter your information in the boxes ");

        } else {
            if (person != null) {
                JOptionPane.showMessageDialog(rootPane, "Verification successful");

                tbl_table_staffE_model.setRowCount(0);
                ArrayList<Staff> slist = CompanyDB.SearchByNameOrEmailStaffEdit(email);
                for (Staff stff : slist) {

                    tbl_table_staffE_model.addRow(new Object[]{stff.id, stff.name_surname, stff.email, stff.password, stff.address, stff.gender});
                    txt_staffPanel_edit_address.setEditable(true);

                    txt_staffPanel_edit_name_surname.setEditable(true);
                    cmbx_staffPanel_gender.setEditable(true);
                    btn_staffPanel_update.setEnabled(true);

                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Verification failed");
            }

        }


    }//GEN-LAST:event_btn_staffPanel_verifyActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        JOptionPane.showMessageDialog(this, "To update your information, first enter and verify your email and password!");    }//GEN-LAST:event_jMenu2MouseClicked

    private void mi_back_to_panelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_back_to_panelActionPerformed
        StaffPanel stfpnl = new StaffPanel();
        stfpnl.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_mi_back_to_panelActionPerformed

    private void mi_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_exitActionPerformed

        System.exit(0);

    }//GEN-LAST:event_mi_exitActionPerformed

    private void btn_staffPanel_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_staffPanel_updateActionPerformed
        Staff np1 = new Staff();

        String[] regexPattern = {"((([A-Z]{1}+[a-zA-Z]{2,})+\\s)+([A-Z]{1}+[a-zA-Z]{2,})$)",
            "^([a-z]+\\w*){3,}@{1}((gmail)|(hotmail)){1}(.com){1}$",
            "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*\\\\-\\\\=+∫,#;(Ω≤≥]).{8,}$"};
        String[] textToPattern = {txt_staffPanel_edit_name_surname.getText(),
            txt_staffPanel_edit_email.getText(),
            txt_StaffPanel_edit_password.getText()};

        boolean isValid = true;
        for (int i = 0; i < regexPattern.length; i++) {
            Pattern pattern = Pattern.compile(regexPattern[i]);
            Matcher matcher = pattern.matcher(textToPattern[i]);

            if (!matcher.find()) {
                isValid = false;
                switch (i) {
                    case 0:
                        JOptionPane.showMessageDialog(this, "Uygun bir name surname giriniz! \n"
                                + "\" A--- A--- formatinda en az 3 harf olacak sekilde giriniz\"");

                        break;
                    case 1:
                        JOptionPane.showMessageDialog(this, "Uygun bir email giriniz!\n"
                                + "----@gmail|hotmail.com formatında giriniz");

                        break;
                    case 2:

                        JOptionPane.showMessageDialog(this, "Uygun bir password giriniz!\n"
                                + "Bir büyük harf, sayı ve sembol kullanarak en az 8 karakter olacak şekilde giriniz");
                        break;

                }

            }

        }
        if (isValid) {
            np1.id = Integer.parseInt(txt_staffPanel_edit_id.getText());
            np1.name_surname = txt_staffPanel_edit_name_surname.getText();
            np1.email = txt_staffPanel_edit_email.getText();
            np1.password = txt_StaffPanel_edit_password.getText();
            np1.address = txt_staffPanel_edit_address.getText();
            np1.gender = cmbx_staffPanel_gender.getSelectedItem().toString();

            if (CompanyDB.UpdateStaff(np1)) {
                JOptionPane.showMessageDialog(this, "Updated");

            } else {
                JOptionPane.showMessageDialog(this, "Not Updated");
            }

        }

    }//GEN-LAST:event_btn_staffPanel_updateActionPerformed

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
            java.util.logging.Logger.getLogger(StaffPanel_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffPanel_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffPanel_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffPanel_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffPanel_edit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_staffPanel_clear;
    private javax.swing.JButton btn_staffPanel_update;
    private javax.swing.JButton btn_staffPanel_verify;
    private javax.swing.JComboBox<String> cmbx_staffPanel_gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mi_back_to_panel;
    private javax.swing.JMenuItem mi_exit;
    private javax.swing.JTable tbl_staffPanel_edit;
    private javax.swing.JTextField txt_StaffPanel_edit_password;
    private javax.swing.JTextField txt_staffPanel_edit_address;
    private javax.swing.JTextField txt_staffPanel_edit_email;
    private javax.swing.JTextField txt_staffPanel_edit_id;
    private javax.swing.JTextField txt_staffPanel_edit_name_surname;
    // End of variables declaration//GEN-END:variables
}
