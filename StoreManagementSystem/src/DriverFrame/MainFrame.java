package DriverFrame;

import SamplePanels.StockListPanel;
import Panels.Products.NewPurchasePanel;
import Panels.Products.StoragePanel;
import Panels.Reports.MainReportPanel;
import Panels.UI.SettingsPanel;
import SamplePanels.EmployeeAttendancePanel;
import SamplePanels.OrderPanel;
import SamplePanels.RegistrationPanel;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JOptionPane;




public class MainFrame extends javax.swing.JFrame {

    GridBagLayout layout;
    GridBagConstraints c;
    
    
    
    public MainFrame() {
        initComponents();
        
        layout = new GridBagLayout();
        c = new GridBagConstraints();
        c.gridx = 10;
        c.gridy = 0;
        jPanelDynamic.setLayout(layout);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDynamic = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenuItemLogout = new javax.swing.JMenuItem();
        jMenuItemSettings = new javax.swing.JMenuItem();
        jMenuItemRegister = new javax.swing.JMenuItem();
        jMenuItemExit = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemNewOrder = new javax.swing.JMenuItem();
        jMenuItemSalesRecord = new javax.swing.JMenuItem();
        jMenuItemSalesReport = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemStockList = new javax.swing.JMenuItem();
        jMenuItemNewSupply = new javax.swing.JMenuItem();
        jMenuItemSupplier = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemEmpAttendance = new javax.swing.JMenuItem();
        jMenuItemEmpPerformance = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Store Management System");

        jPanelDynamic.setBackground(new java.awt.Color(254, 181, 181));

        javax.swing.GroupLayout jPanelDynamicLayout = new javax.swing.GroupLayout(jPanelDynamic);
        jPanelDynamic.setLayout(jPanelDynamicLayout);
        jPanelDynamicLayout.setHorizontalGroup(
            jPanelDynamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        jPanelDynamicLayout.setVerticalGroup(
            jPanelDynamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );

        jMenu5.setText("User");

        jMenuItemLogout.setText("Logout");
        jMenuItemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLogoutActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItemLogout);

        jMenuItemSettings.setText("Settings");
        jMenuItemSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSettingsActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItemSettings);

        jMenuItemRegister.setText("Register New User");
        jMenuItemRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegisterActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItemRegister);

        jMenuItemExit.setText("Exit");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItemExit);

        jMenuBar1.add(jMenu5);

        jMenu1.setText("Sales");

        jMenuItemNewOrder.setText("New Order");
        jMenuItemNewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNewOrderActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemNewOrder);

        jMenuItemSalesRecord.setText("Check Sales Records");
        jMenuItemSalesRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalesRecordActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSalesRecord);

        jMenuItemSalesReport.setText("Sales Reports");
        jMenuItemSalesReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalesReportActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSalesReport);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Supply");

        jMenuItemStockList.setText("Stock List");
        jMenuItemStockList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemStockListActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemStockList);

        jMenuItemNewSupply.setText("Add new Supply");
        jMenuItemNewSupply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNewSupplyActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemNewSupply);

        jMenuItemSupplier.setText("Supplier");
        jMenuItemSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSupplierActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemSupplier);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Manager");

        jMenuItemEmpAttendance.setText("Employee Attendance");
        jMenuItemEmpAttendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEmpAttendanceActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemEmpAttendance);

        jMenuItemEmpPerformance.setText("Employee Performance Analysis");
        jMenuItemEmpPerformance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEmpPerformanceActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemEmpPerformance);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanelDynamic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelDynamic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemStockListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemStockListActionPerformed
        jPanelDynamic.removeAll();
        jPanelDynamic.add(new StockListPanel(), c);
        jPanelDynamic.revalidate();
        jPanelDynamic.repaint();
    }//GEN-LAST:event_jMenuItemStockListActionPerformed

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
        int res = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to quit?", "Exit", JOptionPane.YES_NO_OPTION);
        if(res == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItemExitActionPerformed

    private void jMenuItemNewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNewOrderActionPerformed
        jPanelDynamic.removeAll();
        jPanelDynamic.add(new OrderPanel(), c);
        jPanelDynamic.revalidate();
        jPanelDynamic.repaint();
    }//GEN-LAST:event_jMenuItemNewOrderActionPerformed

    private void jMenuItemSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSettingsActionPerformed
        jPanelDynamic.removeAll();
        jPanelDynamic.add(new SettingsPanel(), c);
        jPanelDynamic.revalidate();
        jPanelDynamic.repaint();
    }//GEN-LAST:event_jMenuItemSettingsActionPerformed

    private void jMenuItemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemLogoutActionPerformed

    private void jMenuItemEmpAttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEmpAttendanceActionPerformed
        jPanelDynamic.removeAll();
        jPanelDynamic.add(new EmployeeAttendancePanel(), c);
        jPanelDynamic.revalidate();
        jPanelDynamic.repaint();
    }//GEN-LAST:event_jMenuItemEmpAttendanceActionPerformed

    private void jMenuItemSalesReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalesReportActionPerformed
        jPanelDynamic.removeAll();
        jPanelDynamic.add(new RegistrationPanel(), c);
        jPanelDynamic.revalidate();
        jPanelDynamic.repaint();
    }//GEN-LAST:event_jMenuItemSalesReportActionPerformed

    private void jMenuItemSalesRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalesRecordActionPerformed
        jPanelDynamic.removeAll();
        jPanelDynamic.add(new RegistrationPanel(), c);  //need panel
        jPanelDynamic.revalidate();
        jPanelDynamic.repaint();
    }//GEN-LAST:event_jMenuItemSalesRecordActionPerformed

    private void jMenuItemRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegisterActionPerformed
        jPanelDynamic.removeAll();
        jPanelDynamic.add(new RegistrationPanel(), c);
        jPanelDynamic.revalidate();
        jPanelDynamic.repaint();
    }//GEN-LAST:event_jMenuItemRegisterActionPerformed

    private void jMenuItemEmpPerformanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEmpPerformanceActionPerformed
        jPanelDynamic.removeAll();
        jPanelDynamic.add(new RegistrationPanel(), c);
        jPanelDynamic.revalidate();
        jPanelDynamic.repaint();
    }//GEN-LAST:event_jMenuItemEmpPerformanceActionPerformed

    private void jMenuItemNewSupplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNewSupplyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemNewSupplyActionPerformed

    private void jMenuItemSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemSupplierActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemEmpAttendance;
    private javax.swing.JMenuItem jMenuItemEmpPerformance;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuItemLogout;
    private javax.swing.JMenuItem jMenuItemNewOrder;
    private javax.swing.JMenuItem jMenuItemNewSupply;
    private javax.swing.JMenuItem jMenuItemRegister;
    private javax.swing.JMenuItem jMenuItemSalesRecord;
    private javax.swing.JMenuItem jMenuItemSalesReport;
    private javax.swing.JMenuItem jMenuItemSettings;
    private javax.swing.JMenuItem jMenuItemStockList;
    private javax.swing.JMenuItem jMenuItemSupplier;
    private javax.swing.JPanel jPanelDynamic;
    // End of variables declaration//GEN-END:variables
}
