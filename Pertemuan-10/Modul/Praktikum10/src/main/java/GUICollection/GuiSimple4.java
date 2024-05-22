/**
 * Nama File    : GuiSimple4.java          22/05/2024
 * Pembuat      : Zikry Alfahri Akram (24060122120033)
 * Deskripsi    : Class untuk mengimplementasikan penggunaan 
 *                Collection (List, Set, dan Map)
 */

package GUICollection;

import java.util.*;
import javax.swing.*;

public class GuiSimple4 extends javax.swing.JFrame {

    DefaultListModel<String> dlm;
    List<String> listOfItems = new ArrayList<>();
    Set<String> setOfItems = new HashSet<>();
    Map<Integer, String> mapOfItems = new HashMap<>();
    String[] datas = {"Buku", "Meja", "Kursi", "Tas", "Pintu"};
    
    /**
     * Creates new form GuiSimple4
     */
    public GuiSimple4() {
        initComponents();
        this.dlm = new DefaultListModel<>();
        this.jListItem.setModel(dlm);
        for (String data : datas){
            dlm.addElement(data);
        }
        updateJumlahDataTersimpanList();
        updateJumlahDataTersimpanSet();
        updateJumlahDataTersimpanMap();
    }

    private void addItem(String namaItem){
        dlm.addElement(namaItem);
    }
    
    private void updateJumlahDataTersimpanList(){
        jLabelJumlahDataList.setText("Data Tersimpan = " + listOfItems.size());
    }
    
    private void updateJumlahDataTersimpanSet(){
        jLabelJumlahDataSet.setText("Data Tersimpan = " + setOfItems.size());
    }
    
    private void updateJumlahDataTersimpanMap(){
        jLabelJumlahDataMap.setText("Data Tersimpan = " + mapOfItems.size());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListItem = new javax.swing.JList<>();
        jButtonInsertDataList = new javax.swing.JButton();
        jLabelNamaItem = new javax.swing.JLabel();
        jButtonSaveList = new javax.swing.JButton();
        jLabelJumlahDataList = new javax.swing.JLabel();
        jTextFieldItem = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonClearAll = new javax.swing.JButton();
        jButtonSaveSet = new javax.swing.JButton();
        jButtonInsertDataSet = new javax.swing.JButton();
        jLabelJumlahDataSet = new javax.swing.JLabel();
        jButtonSaveMap = new javax.swing.JButton();
        jButtonInsertDataMap = new javax.swing.JButton();
        jLabelJumlahDataMap = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jListItem.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListItem);

        jButtonInsertDataList.setText("<- Insert Data List");
        jButtonInsertDataList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertDataListActionPerformed(evt);
            }
        });

        jLabelNamaItem.setText("Item Name : ");

        jButtonSaveList.setText("Save to List ->");
        jButtonSaveList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveListActionPerformed(evt);
            }
        });

        jLabelJumlahDataList.setText("Data Tersimpan = 0");

        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonClearAll.setText("Clear All");
        jButtonClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearAllActionPerformed(evt);
            }
        });

        jButtonSaveSet.setText("Save to Set ->");
        jButtonSaveSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveSetActionPerformed(evt);
            }
        });

        jButtonInsertDataSet.setText("<- Insert Data Set ");
        jButtonInsertDataSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertDataSetActionPerformed(evt);
            }
        });

        jLabelJumlahDataSet.setText("Data Tersimpan = 0");

        jButtonSaveMap.setText("Save to Map ->");
        jButtonSaveMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveMapActionPerformed(evt);
            }
        });

        jButtonInsertDataMap.setText("<- Insert Data Map");
        jButtonInsertDataMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertDataMapActionPerformed(evt);
            }
        });

        jLabelJumlahDataMap.setText("Data Tersimpan = 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonClearAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonAdd)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonUpdate)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonDelete))
                        .addComponent(jLabelNamaItem)
                        .addComponent(jTextFieldItem)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButtonSaveList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonInsertDataList, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelJumlahDataList)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonInsertDataMap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSaveMap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonInsertDataSet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSaveSet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelJumlahDataSet)
                            .addComponent(jLabelJumlahDataMap))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSaveList)
                            .addComponent(jLabelJumlahDataList))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonInsertDataList)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSaveSet)
                            .addComponent(jLabelJumlahDataSet))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonInsertDataSet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSaveMap)
                            .addComponent(jLabelJumlahDataMap))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonInsertDataMap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelNamaItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonClearAll)
                    .addComponent(jButtonAdd)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonDelete))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInsertDataListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertDataListActionPerformed
        for (String item : listOfItems){
            dlm.addElement(item);
        }
    }//GEN-LAST:event_jButtonInsertDataListActionPerformed

    private void jButtonSaveListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveListActionPerformed
        if (!listOfItems.isEmpty()){
            listOfItems.clear();
        }
        for (int i = 0; i < dlm.getSize(); i++){
            listOfItems.add(dlm.getElementAt(i));
        }
        updateJumlahDataTersimpanList();
    }//GEN-LAST:event_jButtonSaveListActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        addItem(jTextFieldItem.getText());
        jTextFieldItem.setText("");
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int index = jListItem.getSelectedIndex();
        dlm.removeElementAt(index);
        jTextFieldItem.setText("");
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        int index = jListItem.getSelectedIndex();
        String selected = jTextFieldItem.getText();
        dlm.setElementAt(selected, index);
        jTextFieldItem.setText("");
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearAllActionPerformed
        dlm.clear();
    }//GEN-LAST:event_jButtonClearAllActionPerformed

    private void jButtonSaveMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveMapActionPerformed
        if (!mapOfItems.isEmpty()){
            mapOfItems.clear();
        }
        for (int i = 0; i < dlm.getSize(); i++){
            mapOfItems.put(i + 1, dlm.getElementAt(i));
        }
        updateJumlahDataTersimpanMap();
    }//GEN-LAST:event_jButtonSaveMapActionPerformed

    private void jButtonSaveSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveSetActionPerformed
        if (!setOfItems.isEmpty()){
            setOfItems.clear();
        }
        for (int i = 0; i < dlm.getSize(); i++){
            setOfItems.add(dlm.getElementAt(i));
        }
        updateJumlahDataTersimpanSet();
    }//GEN-LAST:event_jButtonSaveSetActionPerformed

    private void jButtonInsertDataSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertDataSetActionPerformed
        for (String item : setOfItems){
            dlm.addElement(item);
        }
    }//GEN-LAST:event_jButtonInsertDataSetActionPerformed

    private void jButtonInsertDataMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertDataMapActionPerformed
        for (Integer key : mapOfItems.keySet()){
            dlm.addElement(mapOfItems.get(key));
        }
    }//GEN-LAST:event_jButtonInsertDataMapActionPerformed

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
            java.util.logging.Logger.getLogger(GuiSimple4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiSimple4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiSimple4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiSimple4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiSimple4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonClearAll;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsertDataList;
    private javax.swing.JButton jButtonInsertDataMap;
    private javax.swing.JButton jButtonInsertDataSet;
    private javax.swing.JButton jButtonSaveList;
    private javax.swing.JButton jButtonSaveMap;
    private javax.swing.JButton jButtonSaveSet;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabelJumlahDataList;
    private javax.swing.JLabel jLabelJumlahDataMap;
    private javax.swing.JLabel jLabelJumlahDataSet;
    private javax.swing.JLabel jLabelNamaItem;
    private javax.swing.JList<String> jListItem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldItem;
    // End of variables declaration//GEN-END:variables
}
