/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.bp2projelogintasarim;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
public class StaffPanel extends javax.swing.JFrame {

    /**
     * Creates new form StaffPanel
     */
    DefaultTableModel tbl_model;

    public StaffPanel() {
        initComponents();
        txt_staffPanel_search.setVisible(false);
        btn_staffPerson_search.setVisible(false);
        btn_staffPerson_search_person.setVisible(false);
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
        pnl_staffPanel_person = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnl_staffPanel_edit_info = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnl_staffPanel_personel_info = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbl_StaffPanel_info = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_StaffPanel_person = new javax.swing.JTable();
        txt_staffPanel_search = new javax.swing.JTextField();
        btn_staffPerson_search = new javax.swing.JButton();
        btn_staffPerson_search_person = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mi_back_to_login = new javax.swing.JMenuItem();
        mi_exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 222, 179));

        pnl_staffPanel_person.setBackground(new java.awt.Color(245, 222, 179));
        pnl_staffPanel_person.setBorder(new javax.swing.border.MatteBorder(null));
        pnl_staffPanel_person.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_staffPanel_personMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_staffPanel_personMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl_staffPanel_personMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Person");

        javax.swing.GroupLayout pnl_staffPanel_personLayout = new javax.swing.GroupLayout(pnl_staffPanel_person);
        pnl_staffPanel_person.setLayout(pnl_staffPanel_personLayout);
        pnl_staffPanel_personLayout.setHorizontalGroup(
            pnl_staffPanel_personLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_staffPanel_personLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        pnl_staffPanel_personLayout.setVerticalGroup(
            pnl_staffPanel_personLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_staffPanel_personLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pnl_staffPanel_edit_info.setBackground(new java.awt.Color(245, 222, 179));
        pnl_staffPanel_edit_info.setBorder(new javax.swing.border.MatteBorder(null));
        pnl_staffPanel_edit_info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_staffPanel_edit_infoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_staffPanel_edit_infoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl_staffPanel_edit_infoMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Edit info");

        javax.swing.GroupLayout pnl_staffPanel_edit_infoLayout = new javax.swing.GroupLayout(pnl_staffPanel_edit_info);
        pnl_staffPanel_edit_info.setLayout(pnl_staffPanel_edit_infoLayout);
        pnl_staffPanel_edit_infoLayout.setHorizontalGroup(
            pnl_staffPanel_edit_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 189, Short.MAX_VALUE)
            .addGroup(pnl_staffPanel_edit_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_staffPanel_edit_infoLayout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(5, 5, 5)))
        );
        pnl_staffPanel_edit_infoLayout.setVerticalGroup(
            pnl_staffPanel_edit_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 114, Short.MAX_VALUE)
            .addGroup(pnl_staffPanel_edit_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_staffPanel_edit_infoLayout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(34, Short.MAX_VALUE)))
        );

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Staff Panel");

        pnl_staffPanel_personel_info.setBackground(new java.awt.Color(245, 222, 179));
        pnl_staffPanel_personel_info.setBorder(new javax.swing.border.MatteBorder(null));
        pnl_staffPanel_personel_info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_staffPanel_personel_infoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_staffPanel_personel_infoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl_staffPanel_personel_infoMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Personel Info");

        javax.swing.GroupLayout pnl_staffPanel_personel_infoLayout = new javax.swing.GroupLayout(pnl_staffPanel_personel_info);
        pnl_staffPanel_personel_info.setLayout(pnl_staffPanel_personel_infoLayout);
        pnl_staffPanel_personel_infoLayout.setHorizontalGroup(
            pnl_staffPanel_personel_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_staffPanel_personel_infoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        pnl_staffPanel_personel_infoLayout.setVerticalGroup(
            pnl_staffPanel_personel_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_staffPanel_personel_infoLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_staffPanel_person, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_staffPanel_edit_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(pnl_staffPanel_personel_info, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(pnl_staffPanel_person, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(pnl_staffPanel_personel_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_staffPanel_edit_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(665, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 239, 213));

        lbl_StaffPanel_info.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbl_StaffPanel_info.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_StaffPanel_info, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addGap(715, 715, 715))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_StaffPanel_info, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 900, -1));

        jPanel3.setBackground(new java.awt.Color(211, 211, 211));

        tbl_StaffPanel_person.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_StaffPanel_person);

        txt_staffPanel_search.setBackground(new java.awt.Color(255, 204, 204));
        txt_staffPanel_search.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N

        btn_staffPerson_search.setBackground(new java.awt.Color(102, 102, 102));
        btn_staffPerson_search.setText("Search");
        btn_staffPerson_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_staffPerson_searchActionPerformed(evt);
            }
        });

        btn_staffPerson_search_person.setBackground(new java.awt.Color(102, 102, 102));
        btn_staffPerson_search_person.setText("Search");
        btn_staffPerson_search_person.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_staffPerson_search_personActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txt_staffPanel_search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_staffPerson_search)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_staffPerson_search_person)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_staffPanel_search, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_staffPerson_search, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_staffPerson_search_person, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 900, 600));

        jMenu1.setText("Menu");

        mi_back_to_login.setText("Back to login");
        mi_back_to_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_back_to_loginActionPerformed(evt);
            }
        });
        jMenu1.add(mi_back_to_login);

        mi_exit.setText("Exit");
        mi_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_exitActionPerformed(evt);
            }
        });
        jMenu1.add(mi_exit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnl_staffPanel_personMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_staffPanel_personMouseEntered
        Color clr = new Color(200, 80, 59);
        pnl_staffPanel_person.setBackground(clr);


    }//GEN-LAST:event_pnl_staffPanel_personMouseEntered

    private void pnl_staffPanel_edit_infoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_staffPanel_edit_infoMouseEntered
        Color clr = new Color(200, 80, 59);
        pnl_staffPanel_edit_info.setBackground(clr);

    }//GEN-LAST:event_pnl_staffPanel_edit_infoMouseEntered

    private void pnl_staffPanel_personMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_staffPanel_personMouseExited
        Color clr = new Color(245, 222, 179);
        pnl_staffPanel_person.setBackground(clr);

    }//GEN-LAST:event_pnl_staffPanel_personMouseExited

    private void pnl_staffPanel_edit_infoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_staffPanel_edit_infoMouseExited
        Color clr = new Color(245, 222, 179);
        pnl_staffPanel_edit_info.setBackground(clr);

    }//GEN-LAST:event_pnl_staffPanel_edit_infoMouseExited

    private void pnl_staffPanel_personMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_staffPanel_personMouseClicked
        lbl_StaffPanel_info.setText("Person");
        txt_staffPanel_search.setVisible(true);
        btn_staffPerson_search.setVisible(true);
        btn_staffPerson_search_person.setVisible(false);


    }//GEN-LAST:event_pnl_staffPanel_personMouseClicked

    private void pnl_staffPanel_edit_infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_staffPanel_edit_infoMouseClicked

        StaffPanel_edit spnl = new StaffPanel_edit();
        spnl.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_pnl_staffPanel_edit_infoMouseClicked

    private void btn_staffPerson_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_staffPerson_searchActionPerformed
        tbl_model = new DefaultTableModel();
        tbl_model.setColumnIdentifiers(new Object[]{"NAME", "EMAIL", "GENDER", "POSITION",});
        tbl_StaffPanel_person.setModel(tbl_model);
        String search = txt_staffPanel_search.getText();
        tbl_model.setRowCount(0);
        ArrayList<Staff> plist = CompanyDB.SearchByNameOrEmail(search);
        for (Person np1 : plist) {
            tbl_model.addRow(new Object[]{np1.name_surname, np1.email, np1.gender, np1.position});

        }


    }//GEN-LAST:event_btn_staffPerson_searchActionPerformed

    private void btn_staffPerson_search_personActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_staffPerson_search_personActionPerformed

        tbl_model = new DefaultTableModel();
        tbl_model.setColumnIdentifiers(new Object[]{"ID", "NAME", "EMAIL", "PASSWORD", "ADDRESS", "GENDER"});
        tbl_StaffPanel_person.setModel(tbl_model);

        String search = txt_staffPanel_search.getText();
        ArrayList<Staff> personList = CompanyDB.SearchByNameOrEmail(search);

        if (!personList.isEmpty()) {
            Person person = personList.get(0); // İlk eşleşen kişiyi al
            tbl_model.addRow(new Object[]{person.id, person.name_surname, person.email, person.password, person.address, person.gender});
        }


    }//GEN-LAST:event_btn_staffPerson_search_personActionPerformed

    private void mi_back_to_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_back_to_loginActionPerformed
        // TODO add your handling code here:
        Login lgn = new Login();
        lgn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mi_back_to_loginActionPerformed

    private void mi_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_exitActionPerformed
        // TODO add your handling code here:

        System.exit(0);

    }//GEN-LAST:event_mi_exitActionPerformed

    private void pnl_staffPanel_personel_infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_staffPanel_personel_infoMouseClicked
        StaffPanel_personel_info stppi= new StaffPanel_personel_info();
        stppi.setVisible(true);
        this.dispose();
        
        
      
    }//GEN-LAST:event_pnl_staffPanel_personel_infoMouseClicked

    private void pnl_staffPanel_personel_infoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_staffPanel_personel_infoMouseEntered
        Color clr = new Color(200, 80, 59);
        pnl_staffPanel_personel_info.setBackground(clr);

    }//GEN-LAST:event_pnl_staffPanel_personel_infoMouseEntered

    private void pnl_staffPanel_personel_infoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_staffPanel_personel_infoMouseExited
       Color clr = new Color(245, 222, 179);
        pnl_staffPanel_personel_info.setBackground(clr);
    }//GEN-LAST:event_pnl_staffPanel_personel_infoMouseExited

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
            java.util.logging.Logger.getLogger(StaffPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_staffPerson_search;
    private javax.swing.JButton btn_staffPerson_search_person;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_StaffPanel_info;
    private javax.swing.JMenuItem mi_back_to_login;
    private javax.swing.JMenuItem mi_exit;
    private javax.swing.JPanel pnl_staffPanel_edit_info;
    private javax.swing.JPanel pnl_staffPanel_person;
    private javax.swing.JPanel pnl_staffPanel_personel_info;
    private javax.swing.JTable tbl_StaffPanel_person;
    private javax.swing.JTextField txt_staffPanel_search;
    // End of variables declaration//GEN-END:variables
}