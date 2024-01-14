/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Enterprise1.Organization1.WorkArea.HotelManager.WorkResp2;

import TheBusiness.BookingManagement.Booking;
import TheBusiness.BookingManagement.Room;
import TheBusiness.Business.Business;
import TheBusiness.OrderManagement.Order;
import TheBusiness.Personnel.Enterprise1.Organization1.HotelManagerProfile;
import TheBusiness.ProductManagement.Product;
import TheBusiness.ProductManagement.ProductDirectory;
import UserInterface.Enterprise1.Organization1.WorkArea.HotelManager.HotelManagerLandingPageJPanel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sakshiwadaskar
 */
public class OrderSuppliesJPanel extends javax.swing.JPanel {

    Business business;
    javax.swing.JPanel CardSequencePanel;
    HotelManagerProfile hotelManagerProfile;
    float orderTotal;

    /**
     * Creates new form OrderSuppliesJPanel
     */
    public OrderSuppliesJPanel(Business b, HotelManagerProfile hmp, JPanel cardSequencePanel) {
        initComponents();
        business = b;
        this.hotelManagerProfile = hmp;
        this.CardSequencePanel = cardSequencePanel;
        populateTable();
    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblOrderSupplies.getModel();
        dtm.setRowCount(0);
        for (Product product : business.getHospitalitySupplierProductCatalog().getProductList()) {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrderSupplies = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnAddToOrder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrderStaging = new javax.swing.JTable();
        btnPurchase = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtOrderTotal = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(1000, 800));

        lblTitle.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Order Supplies");

        jScrollPane1.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N

        tblOrderSupplies.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        tblOrderSupplies.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblOrderSupplies);

        btnBack.setBackground(new java.awt.Color(0, 153, 255));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAddToOrder.setBackground(new java.awt.Color(0, 153, 255));
        btnAddToOrder.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAddToOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnAddToOrder.setText("Add to Order");
        btnAddToOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToOrderActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter the quantity:");

        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });

        jScrollPane2.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N

        tblOrderStaging.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        tblOrderStaging.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Product Price", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblOrderStaging);

        btnPurchase.setBackground(new java.awt.Color(0, 153, 255));
        btnPurchase.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnPurchase.setForeground(new java.awt.Color(255, 255, 255));
        btnPurchase.setText("Purchase");
        btnPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchaseActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Order Total:");

        txtOrderTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrderTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap(75, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtOrderTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addComponent(btnAddToOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)))
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddToOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtOrderTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        orderTotal = 0;
        // Clears table:
        int rc = tblOrderStaging.getRowCount();
        int i;
        for (i = rc - 1; i >= 0; i--) {
            ((DefaultTableModel) tblOrderStaging.getModel()).removeRow(i);
        }
        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).previous(CardSequencePanel);
        ManageSuppliesJPanel manageSuppliesPanel = new ManageSuppliesJPanel(business, hotelManagerProfile, CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("ManageSuppliesJPanel", manageSuppliesPanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);


    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddToOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToOrderActionPerformed

        if (txtQuantity.getText().equals("") || txtQuantity.getText() == null) {
            JOptionPane.showMessageDialog(null, "Please enter item quantity",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int orderItemQty = Integer.parseInt(txtQuantity.getText());

        int roomsTableSize = tblOrderSupplies.getRowCount();
        int selectedrow = tblOrderSupplies.getSelectionModel().getLeadSelectionIndex();

        if (selectedrow < 0 || selectedrow > roomsTableSize - 1) {
            JOptionPane.showMessageDialog(null, "Please select a row first",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int selectedProductIndex = tblOrderSupplies.getSelectedRow();
        Product selectedProduct = business.getHospitalitySupplierProductCatalog().getProductList().get(selectedProductIndex);
        if (orderItemQty > selectedProduct.getQuantity()) {
            JOptionPane.showMessageDialog(null, "Product not available, check availability first",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            return;

        }

        orderTotal += selectedProduct.getPrice() * Integer.parseInt(txtQuantity.getText());
        txtOrderTotal.setText(String.valueOf(orderTotal));
        if (selectedProduct == null) {
            return;
        } else {
            Object[] row = new Object[5];
            row[0] = selectedProduct.getId();
            row[1] = selectedProduct.getName();
            row[2] = selectedProduct.getPrice();
            row[3] = txtQuantity.getText();
            ((DefaultTableModel) tblOrderStaging.getModel()).addRow(row);

        }
    }//GEN-LAST:event_btnAddToOrderActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void btnPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tblOrderStaging.getModel();
        Object[] columnData = new Object[tblOrderStaging.getRowCount()];  // One entry for each row
        Object[] rowData = new Object[tblOrderStaging.getRowCount()];

        String orderId = String.valueOf(business.getHotelHospitalityOrders().getOrders().size() + 2000);
        Order order = new Order(orderId, hotelManagerProfile);

        for (int i = 0; i < tblOrderStaging.getRowCount(); i++) {  // Loop through the rows

            String productId = (String) tblOrderStaging.getValueAt(i, 0);
            System.out.println(productId);
            if (productId == "" || productId == null) {
                continue;
            }

            Product foundProduct = business.getHospitalitySupplierProductCatalog().findProduct(productId);
            order.newOrderItem(foundProduct, Integer.parseInt((String) tblOrderStaging.getValueAt(i, 3)));
        }
        order.setCustomer(hotelManagerProfile);
        order.submitOrder();
        business.getHotelHospitalityOrders().addOrder(order);
        populateTable();
        JOptionPane.showMessageDialog(null, "Order has been placed. Waiting for payment confirmation.",
                "Info", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btnPurchaseActionPerformed

    private void txtOrderTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrderTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrderTotalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToOrder;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPurchase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblOrderStaging;
    private javax.swing.JTable tblOrderSupplies;
    private javax.swing.JTextField txtOrderTotal;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}