/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Enterprise1.Organization1.WorkArea.HotelManager.WorkResp2;

import TheBusiness.Business.Business;
import TheBusiness.Personnel.Enterprise1.Organization1.HotelManagerProfile;
import TheBusiness.ProductManagement.Product;
import UserInterface.Enterprise1.Organization1.WorkArea.HotelManager.HotelManagerLandingPageJPanel;
import UserInterface.Enterprise2.Organization1.WorkArea.SalesRepresentative.WorkResp2.ManagePurchaseOrderJPanel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aadityakasbekar
 */
public class ManageSuppliesJPanel extends javax.swing.JPanel {

    Business business;
    javax.swing.JPanel CardSequencePanel;
    HotelManagerProfile hotelManagerProfile;

    /**
     * Creates new form ManageSuppliesJPanel
     */
    public ManageSuppliesJPanel(Business b, HotelManagerProfile hmp, JPanel cardSequencePanel) {
        initComponents();
        business = b;
        this.hotelManagerProfile = hmp;
        this.CardSequencePanel = cardSequencePanel;
        populateTable();
    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblMySupplies.getModel();
        dtm.setRowCount(0);
        for (Product product : business.getHotelSupplyInventory().getProductList()) {
            Object[] row = new Object[7];
            row[0] = product.getId();
            row[1] = product.getName();
            row[2] = product.getPrice();
            row[3] = product.getQuantity();

            dtm.addRow(row);
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

        lblTitle = new javax.swing.JLabel();
        lblSubTitle1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMySupplies = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnOrderSupplies = new javax.swing.JButton();
        btnViewMyOrders = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));

        lblTitle.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Manage Supplies");

        lblSubTitle1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblSubTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblSubTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubTitle1.setText("View Inventory ");

        jScrollPane1.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N

        tblMySupplies.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        tblMySupplies.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Product Price", "Availability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMySupplies);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Want to refill some products?");

        btnOrderSupplies.setBackground(new java.awt.Color(0, 153, 255));
        btnOrderSupplies.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnOrderSupplies.setForeground(new java.awt.Color(255, 255, 255));
        btnOrderSupplies.setText("Order supplies");
        btnOrderSupplies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderSuppliesActionPerformed(evt);
            }
        });

        btnViewMyOrders.setBackground(new java.awt.Color(0, 153, 255));
        btnViewMyOrders.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnViewMyOrders.setForeground(new java.awt.Color(255, 255, 255));
        btnViewMyOrders.setText("My Orders");
        btnViewMyOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewMyOrdersActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 153, 255));
        btnBack.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOrderSupplies)
                        .addGap(295, 295, 295)
                        .addComponent(btnViewMyOrders))
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSubTitle1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)))
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSubTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOrderSupplies)
                    .addComponent(btnViewMyOrders))
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(99, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderSuppliesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderSuppliesActionPerformed
        OrderSuppliesJPanel orderSuppliesPanel = new OrderSuppliesJPanel(business, hotelManagerProfile, CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("OrderSuppliesJPanel", orderSuppliesPanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_btnOrderSuppliesActionPerformed

    private void btnViewMyOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewMyOrdersActionPerformed
        ViewMyOrdersJPanel viewMyOrdersPanel = new ViewMyOrdersJPanel(business, hotelManagerProfile, CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("ViewMyOrdersJPanel", viewMyOrdersPanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_btnViewMyOrdersActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).previous(CardSequencePanel);
        HotelManagerLandingPageJPanel hotelManagerLandingPagePanel = new HotelManagerLandingPageJPanel(business, hotelManagerProfile, CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("HotelManagerLandingPageJPanel", hotelManagerLandingPagePanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnOrderSupplies;
    private javax.swing.JButton btnViewMyOrders;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSubTitle1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblMySupplies;
    // End of variables declaration//GEN-END:variables
}
