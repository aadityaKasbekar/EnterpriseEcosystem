/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Enterprise2.Organization1.WorkArea.SalesRepresentative.WorkResp2;

import TheBusiness.BookingManagement.Room;
import TheBusiness.Business.Business;
import TheBusiness.OrderManagement.Order;
import TheBusiness.OrderManagement.OrderItem;
import TheBusiness.Personnel.Enterprise1.Organization1.HotelManagerProfile;
import TheBusiness.Personnel.Enterprise1.Organization2.SalesPersonProfile;
import TheBusiness.ProductManagement.Product;
import UserInterface.Admin.AdminJPanel;
import UserInterface.Enterprise1.Organization1.WorkArea.HotelManager.HotelManagerLandingPageJPanel;
import UserInterface.Enterprise2.Organization1.WorkArea.SalesRepresentative.SalesRepresentativeLandingPageJPanel;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

//import java.util.*;
//import javax.mail.*;
//import javax.mail.internet.*;
//import javax.activation.*;

/**
 *
 * @author aadityakasbekar
 */
public class ManagePurchaseOrderJPanel extends javax.swing.JPanel {

    Business business;
    javax.swing.JPanel CardSequencePanel;
    SalesPersonProfile salesPersonProfile;

    /**
     * Creates new form ManagePurchaseOrderJPanel
     */
    public ManagePurchaseOrderJPanel(Business b, SalesPersonProfile hmp, JPanel cardSequencePanel) {
        initComponents();
        business = b;
        this.salesPersonProfile = hmp;
        this.CardSequencePanel = cardSequencePanel;
        populateTable();
    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblHotelOrders.getModel();
        dtm.setRowCount(0);
        for (Order order : business.getHotelHospitalityOrders().getOrders()) {
            Object[] row = new Object[7];
            row[0] = order.getOrderId();
            

            StringBuilder orderItemsStr = new StringBuilder();
            for (OrderItem orderItem : order.getOrderItems()) {
                orderItemsStr.append(orderItem.getProduct().getName() + " x " + orderItem.getQuantity() + " ; ");
            }

            row[1] = orderItemsStr.toString();
            row[2] = order.getOrderTotal();
            row[3] = order.getOrderStatus();

            dtm.addRow(row);
        }
    }

//    private void sendEmail() {
//        Properties prop = new Properties();
//        prop.put("mail.smtp.auth", true);
//        prop.put("mail.smtp.starttls.enable", "false");
//        prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");
//        prop.put("mail.smtp.host", "sandbox.smtp.mailtrap.io");
//        prop.put("mail.smtp.port", "2525");
//
//        prop.put("mail.debug", "true");
//
//        Session session = Session.getInstance(prop, new Authenticator() {
//            @Override
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication("5ffec9bf3dba37", "4c0c29d4ac886f");
//            }
//        });
//
//        try {
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress("sakshi0531998@gmail.com"));
//            message.setRecipients(
//                    Message.RecipientType.TO, InternetAddress.parse("saurabh7998@gmail.com"));
//            message.setSubject("Mail Subject");
//
//            String msg = "This is my first email using JavaMailer";
//
//            MimeBodyPart mimeBodyPart = new MimeBodyPart();
//            mimeBodyPart.setContent(msg, "text/html; charset=utf-8");
//
//            Multipart multipart = new MimeMultipart();
//            multipart.addBodyPart(mimeBodyPart);
//
//            message.setContent(multipart);
//
//            Transport.send(message);
//            System.out.println("Mail Sent!");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//    }

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
        tblHotelOrders = new javax.swing.JTable();
        btnApproveOrder = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(1000, 450));
        setPreferredSize(new java.awt.Dimension(1000, 450));

        lblTitle.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Manage Purchase Order");

        lblSubTitle1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblSubTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblSubTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubTitle1.setText("View All Purchase Orders");

        jScrollPane1.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N

        tblHotelOrders.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        tblHotelOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Order Id", "Order Items", "Order Total", "Order Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHotelOrders);

        btnApproveOrder.setBackground(new java.awt.Color(0, 153, 255));
        btnApproveOrder.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnApproveOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnApproveOrder.setText("Approve");
        btnApproveOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveOrderActionPerformed(evt);
            }
        });

        btnBack1.setBackground(java.awt.Color.pink);
        btnBack1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnBack1.setText("<< Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnApproveOrder)
                        .addGap(458, 458, 458))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSubTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 945, Short.MAX_VALUE)))
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSubTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnApproveOrder)
                .addGap(18, 18, 18)
                .addComponent(btnBack1)
                .addGap(353, 353, 353))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveOrderActionPerformed

        int orderTableSize = tblHotelOrders.getRowCount();
        int selectedrow = tblHotelOrders.getSelectionModel().getLeadSelectionIndex();

        if (selectedrow < 0 || selectedrow > orderTableSize - 1) {
            JOptionPane.showMessageDialog(null, "Please select a row first",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int selectedProductIndex = tblHotelOrders.getSelectedRow();

        String orderId = (String) tblHotelOrders.getValueAt(selectedProductIndex, 0);
        System.out.println(orderId);

        Order foundOrder = business.getHotelHospitalityOrders().findOrderItem(orderId);
        foundOrder.setSalesPerson(salesPersonProfile);
        foundOrder.approveOrder();

        for (OrderItem item : foundOrder.getOrderItems()) {
            Product p = item.getProduct();
            int qty = item.getQuantity();

            p.setQuantity(p.getQuantity() - qty);
        }

        JOptionPane.showMessageDialog(null, "Order has been approved",
                "Info", JOptionPane.INFORMATION_MESSAGE);

//        sendEmail();
        populateTable();
    }//GEN-LAST:event_btnApproveOrderActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).previous(CardSequencePanel);
        SalesRepresentativeLandingPageJPanel salesRepresentativePanel = new SalesRepresentativeLandingPageJPanel(business, salesPersonProfile, CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("SalesRepresentativeLandingPageJPanel", salesRepresentativePanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnBack1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApproveOrder;
    private javax.swing.JButton btnBack1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSubTitle1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblHotelOrders;
    // End of variables declaration//GEN-END:variables
}