package gui;

import edu.ucue.databasequery.db.DBField;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import srv.QuerySrv;

/**
 *
 * @author santos
 */
public class EditTableWindow extends javax.swing.JDialog {
    QuerySrv querySrv;
    String tableName;
    
    /**
     * Creates new form EditTableWindow
     */
    public EditTableWindow(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public EditTableWindow(java.awt.Frame parent, boolean modal, String tableName) {
        this(parent, modal);
        querySrv = QuerySrv.getInstance();
        this.tableName = tableName;
        loadTable(tableName);
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
        table = new javax.swing.JTable();
        deleteBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        searchTF = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        actionCB = new javax.swing.JComboBox<>();
        fieldCB = new javax.swing.JComboBox<>();
        consutlBtn = new javax.swing.JButton();
        valueTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(table);

        deleteBtn.setText("Eliminar");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        editBtn.setText("Editar");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        searchBtn.setText("Buscar");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        closeBtn.setText("Cerrar");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        addBtn.setText("Agregar");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        actionCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suma", "Promedio", "Máximo", "Mínimo", "Contar", "Mayor que", "Menor que", "Igual que", "Diferente que" }));
        actionCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionCBActionPerformed(evt);
            }
        });

        consutlBtn.setText("Consultar");
        consutlBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consutlBtnActionPerformed(evt);
            }
        });

        valueTF.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(closeBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(actionCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldCB, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valueTF, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(consutlBtn)))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(actionCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consutlBtn)
                    .addComponent(valueTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBtn)
                    .addComponent(editBtn)
                    .addComponent(closeBtn)
                    .addComponent(addBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        try {
            AddElementWindow addElementWindow = new AddElementWindow(null, true, tableName);
            addElementWindow.setLocationRelativeTo(null);
            addElementWindow.setVisible(true);
            loadTable(tableName);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        try {
            querySrv.deleteRow(tableName, getSelectedRow());
            JOptionPane.showMessageDialog(null, "Elemento eliminado.");
            loadTable(tableName);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        try {
            ArrayList<DBField> row = getSelectedRow();
            EditElementWindow editElementWindow = new EditElementWindow(null, true, tableName, row);
            editElementWindow.setLocationRelativeTo(null);
            editElementWindow.setVisible(true);
            loadTable(tableName);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_editBtnActionPerformed

    private void consutlBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consutlBtnActionPerformed
        try {
            String colName = (String) fieldCB.getSelectedItem();
            String operation = (String) actionCB.getSelectedItem();
            String value = valueTF.getText();
            ArrayList<ArrayList<String>> result;
            if (operation.equalsIgnoreCase("suma"))
                result = querySrv.funtionSum(tableName, colName);
            else if (operation.equalsIgnoreCase("mínimo"))
                result = querySrv.funtionMin(tableName, colName);
            else if (operation.equalsIgnoreCase("máximo"))
                result = querySrv.funtionMax(tableName, colName);
            else if (operation.equalsIgnoreCase("promedio"))
                result = querySrv.funtionAverage(tableName, colName);
            else if (operation.equalsIgnoreCase("contar"))
                result = querySrv.funtionCount(tableName, colName);
            else if (operation.equalsIgnoreCase("mayor que"))
                result = querySrv.greaterThan(tableName, colName, value);
            else if (operation.equalsIgnoreCase("menor que"))
                result = querySrv.lessThan(tableName, colName, value);
            else if (operation.equalsIgnoreCase("igual que"))
                result = querySrv.equalTo(tableName, colName, value);
            else if (operation.equalsIgnoreCase("diferente que"))
                result = querySrv.unequalTo(tableName, colName, value);
            else
                throw new RuntimeException("Debe seleccionar una acción válida.");
            loadTable(result);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_consutlBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        try {
            String subString = searchTF.getText();
            ArrayList<ArrayList<String>> result = querySrv.search(tableName, subString);
            loadTable(result);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }//GEN-LAST:event_searchBtnActionPerformed

    private void actionCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionCBActionPerformed
        String operation = (String) actionCB.getSelectedItem();
        String[] validOperators = new String[]{"Mayor que", "Menor que", "Igual que", "Diferente que"};
        
        if (Arrays.asList(validOperators).contains(operation)) {
            valueTF.setEnabled(true);
        } else {
            valueTF.setEnabled(false);
        }
    }//GEN-LAST:event_actionCBActionPerformed

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
            java.util.logging.Logger.getLogger(EditTableWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditTableWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditTableWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditTableWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditTableWindow dialog = new EditTableWindow(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> actionCB;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton consutlBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JComboBox<String> fieldCB;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchTF;
    private javax.swing.JTable table;
    private javax.swing.JTextField valueTF;
    // End of variables declaration//GEN-END:variables
    
    
    private void loadTable(ArrayList<ArrayList<String>> result) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        
        //Borrar elementos anteriores
        for(int i = model.getRowCount() - 1; i >= 0 ; i--)
            model.removeRow(i);
        
        Object headerNames[] = result.get(0).toArray();
        
        DefaultTableModel newModel = new DefaultTableModel(headerNames, 0);
        table.setModel(newModel);
        model = (DefaultTableModel) table.getModel();
        
        for (ArrayList<String> row : result.subList(1, result.size()))
            model.addRow(row.toArray());
        table.setDefaultEditor(Object.class, null);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        loadColNamesCB(headerNames);
    }

    private void loadTable(String tableName) {
        loadTable(querySrv.getAll(tableName));
    }

    private ArrayList<DBField> getSelectedRow() {
        ArrayList<DBField> row = new ArrayList<>();
        int indexRow = table.getSelectedRow();
        if (indexRow == -1)
            throw new RuntimeException("Debe seleccionar una tabla.");
        for (int indexCol = 0; indexCol < table.getColumnCount(); indexCol++)
            row.add(new DBField(table.getColumnName(indexCol), (String) table.getValueAt(indexRow, indexCol)));
        return row;
    }

    private void loadColNamesCB(Object[] headerNames) {
        for (Object item : headerNames)
            fieldCB.addItem((String) item);
    }
}
