/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.userinterface;

/**
 *
 * @author pumba
 */
public class MenuNo3 extends javax.swing.JInternalFrame {

    /**
     * Creates new form MenuNo3
     */
    
    MenuInterface menuInterface;
    AddProduct addProduct;
    ModifyProduct modifyProduct;
    
    public MenuNo3(MenuInterface menuInterface) {
        initComponents();
        this.menuInterface = menuInterface;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btAddProduct = new javax.swing.JButton();
        btModifyProduct = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taMenuNo3 = new javax.swing.JTextArea();

        setTitle("Modify Product");
        setPreferredSize(new java.awt.Dimension(500, 400));

        btAddProduct.setText("Add Product");
        btAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddProductActionPerformed(evt);
            }
        });

        btModifyProduct.setText("Modify Product");
        btModifyProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModifyProductActionPerformed(evt);
            }
        });

        taMenuNo3.setColumns(20);
        taMenuNo3.setRows(5);
        jScrollPane1.setViewportView(taMenuNo3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btAddProduct)
                .addGap(18, 18, 18)
                .addComponent(btModifyProduct)
                .addContainerGap(227, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btAddProduct, btModifyProduct});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btModifyProduct))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btAddProduct, btModifyProduct});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddProductActionPerformed
        addProduct = new AddProduct(menuInterface);
        addProduct.setVisible(true);
    }//GEN-LAST:event_btAddProductActionPerformed

    private void btModifyProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModifyProductActionPerformed
        modifyProduct = new ModifyProduct(menuInterface);
        modifyProduct.setVisible(true);
    }//GEN-LAST:event_btModifyProductActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddProduct;
    private javax.swing.JButton btModifyProduct;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taMenuNo3;
    // End of variables declaration//GEN-END:variables
}
