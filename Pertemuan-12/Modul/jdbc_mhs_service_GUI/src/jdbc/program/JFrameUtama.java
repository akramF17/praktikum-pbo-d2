/**
 *  Nama File   : JFrameUtama.java                05/06/2024
 *  Penulis     : Zikry Alfahri Akram (24060122120033)
 *  Deskripsi   : Kelas ini sebagai program utama yang berperan sebagai view 
 *                untuk antarmuka pengguna (GUI) mengelola data mahasiswa pada
 *                tabel mahasiswa di database
 */

package jdbc.program;

import java.util.*;
import javax.swing.*;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

public class JFrameUtama extends javax.swing.JFrame {

    static MysqlMahasiswaService service = new MysqlMahasiswaService();
    DefaultListModel<String> iddlm;
    DefaultListModel<String> namadlm;
    List<Mahasiswa> listMhs = new ArrayList<>();
    
    /**
     * Creates new form JFrameUtama
     */
    public JFrameUtama() {
        initComponents();
        this.iddlm = new DefaultListModel<>();
        this.namadlm = new DefaultListModel<>();
        this.jListId.setModel(iddlm);
        this.jListNama.setModel(namadlm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jListNama = new javax.swing.JList<>();
        jLabelListId = new javax.swing.JLabel();
        jLabelListNama = new javax.swing.JLabel();
        jLabelInsertNama = new javax.swing.JLabel();
        jButtonAmbilSemuaData = new javax.swing.JButton();
        jTextFieldInsertNama = new javax.swing.JTextField();
        jButtonInsertNama = new javax.swing.JButton();
        jTextFieldUpdateNama = new javax.swing.JTextField();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jTextFieldDeleteId = new javax.swing.JTextField();
        jTextFieldDeleteNama = new javax.swing.JTextField();
        jButtonResetIndex = new javax.swing.JButton();
        jLabelJudul = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelResetIndex = new javax.swing.JLabel();
        jTextFieldUpdateId = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListId = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jListNama.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListNama);

        jLabelListId.setText("ID");

        jLabelListNama.setText("NAMA");

        jLabelInsertNama.setText("Nama:");

        jButtonAmbilSemuaData.setText("Ambil Semua Data");
        jButtonAmbilSemuaData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAmbilSemuaDataActionPerformed(evt);
            }
        });

        jButtonInsertNama.setText("Tambahkan");
        jButtonInsertNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertNamaActionPerformed(evt);
            }
        });

        jButtonUpdate.setText("Edit");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Hapus");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonResetIndex.setText("Reset Indeks");
        jButtonResetIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetIndexActionPerformed(evt);
            }
        });

        jLabelJudul.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelJudul.setText("Kelola Data Mahasiswa");

        jLabelResetIndex.setText("Index di reset mulai dari 1");

        jListId.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListIdMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jListId);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabelListId)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelListNama))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldUpdateId, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jTextFieldDeleteId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldUpdateNama, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(jTextFieldDeleteNama))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(jButtonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jButtonAmbilSemuaData)
                    .addComponent(jTextFieldInsertNama, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonInsertNama)
                    .addComponent(jLabelInsertNama)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonResetIndex, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelResetIndex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabelJudul))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelListId)
                            .addComponent(jLabelListNama))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButtonAmbilSemuaData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelInsertNama)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldInsertNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonInsertNama)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldUpdateNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonUpdate)
                            .addComponent(jTextFieldUpdateId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDeleteId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDeleteNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDelete))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonResetIndex)
                            .addComponent(jLabel1)
                            .addComponent(jLabelResetIndex)))
                    .addComponent(jScrollPane3))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAmbilSemuaDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAmbilSemuaDataActionPerformed
        if (!iddlm.isEmpty() && !namadlm.isEmpty()){
            iddlm.removeAllElements();
            namadlm.removeAllElements();
        }
        listMhs = service.getAll();
        for (Mahasiswa mhs : listMhs){
            iddlm.addElement(String.valueOf(mhs.getId()));
            namadlm.addElement(mhs.getNama());
        }
    }//GEN-LAST:event_jButtonAmbilSemuaDataActionPerformed

    private void jButtonInsertNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertNamaActionPerformed
        String nama = jTextFieldInsertNama.getText();
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNama(nama);
        service.add(mhs);
        jButtonAmbilSemuaDataActionPerformed(evt);
        jTextFieldInsertNama.setText("");
    }//GEN-LAST:event_jButtonInsertNamaActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        int id = Integer.parseInt(jTextFieldUpdateId.getText());
        String nama = jTextFieldUpdateNama.getText();
        Mahasiswa mhs = new Mahasiswa(id, nama);
        service.update(mhs);
        jButtonAmbilSemuaDataActionPerformed(evt);
        jTextFieldUpdateId.setText("");
        jTextFieldUpdateNama.setText("");
        jTextFieldDeleteId.setText("");
        jTextFieldDeleteNama.setText("");
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int id = Integer.parseInt(jTextFieldDeleteId.getText());
        service.delete(id);
        jButtonAmbilSemuaDataActionPerformed(evt);
        jTextFieldUpdateId.setText("");
        jTextFieldUpdateNama.setText("");
        jTextFieldDeleteId.setText("");
        jTextFieldDeleteNama.setText("");
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonResetIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetIndexActionPerformed
        service.indexReset();
        jButtonAmbilSemuaDataActionPerformed(evt);
    }//GEN-LAST:event_jButtonResetIndexActionPerformed

    private void jListIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListIdMouseClicked
        int id = Integer.parseInt(jListId.getSelectedValue());
        String nama = service.getById(id).getNama();
        jTextFieldUpdateId.setText("" + id);
        jTextFieldUpdateNama.setText(nama);
        jTextFieldDeleteId.setText("" + id);
        jTextFieldDeleteNama.setText(nama);
    }//GEN-LAST:event_jListIdMouseClicked
    
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
            java.util.logging.Logger.getLogger(JFrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAmbilSemuaData;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsertNama;
    private javax.swing.JButton jButtonResetIndex;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelInsertNama;
    private javax.swing.JLabel jLabelJudul;
    private javax.swing.JLabel jLabelListId;
    private javax.swing.JLabel jLabelListNama;
    private javax.swing.JLabel jLabelResetIndex;
    private javax.swing.JList<String> jListId;
    private javax.swing.JList<String> jListNama;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextFieldDeleteId;
    private javax.swing.JTextField jTextFieldDeleteNama;
    private javax.swing.JTextField jTextFieldInsertNama;
    private javax.swing.JTextField jTextFieldUpdateId;
    private javax.swing.JTextField jTextFieldUpdateNama;
    // End of variables declaration//GEN-END:variables
}
