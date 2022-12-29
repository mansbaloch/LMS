
package UI.AdminInterface;
import UI.Commmon.CommonHandler;
import java.awt.Color;
import model.dto.StudentDTO;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.LMSController;
import model.SMSFactory;
import model.dto.Response;

/**
 *
 * @author Mukhtiar
 */
public class StudentMGUI extends javax.swing.JFrame {

StudentMod objMainUI;
LMSController objController;
    StudentMGUI(StudentMod aThis) {
        initComponents();
        objMainUI = aThis;
        objController = SMSFactory.getInstanceOfLMSController();
        loadData();
    }
    
    DefaultTableModel dtm;    
    private void PopulateDataFromDatabase(ArrayList<StudentDTO> list) {
        dtm = new DefaultTableModel();
        try {
         
            dtm.addColumn("First Name");
            dtm.addColumn("Last Name");
        
            for(StudentDTO std : list)
            {
                Object [] rowData = new Object[5];
                rowData[0] = std.FirstName;
                rowData[1] = std.LastName;
                
                dtm.addRow(rowData);
            }
            jTable1.setModel(dtm);
        }
        catch (Exception e) {
            System.out.println("Error Trace in getConnection() : " + e.getMessage());
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

        jPanel1 = new javax.swing.JPanel();
        searchEmployee = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Learning Management System");
        setPreferredSize(new java.awt.Dimension(1000, 720));

        jPanel1.setForeground(new java.awt.Color(242, 242, 242));
        jPanel1.setToolTipText("Search Empoyee");
        jPanel1.setName("SearchEmployee"); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchEmployee.setBackground(new java.awt.Color(0, 0, 0,90));
        searchEmployee.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(searchEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 200, -1));

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 87, -1));

        jButton1.setBackground(new java.awt.Color(0, 255, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setLabel("Add Student");
        jButton1.setOpaque(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 360, -1, -1));

        jTable1.setBackground(new java.awt.Color(0, 0, 0,90));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setGridColor(new java.awt.Color(51, 51, 255));
        jTable1.setOpaque(false);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 631, 267));

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Delete");
        jButton4.setToolTipText("Delete  Student");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 255), new java.awt.Color(153, 153, 153), new java.awt.Color(255, 255, 255)));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 410, 149, 36));

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, -1, 31));

        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, -1, 31));

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 930, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Users\\Mansoor\\Downloads\\blue.jpg")); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(1000, 720));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, -130, 1140, 810));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        new AddEmployeeUI(this,objController).setVisible(true);
//        this.setVisible(false);        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        loadData();        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
                objMainUI.setVisible(true);this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String selectedId = getSelectedStudentId();
        if(selectedId != null){
         JOptionPane.showMessageDialog(this, "Deleting record with "+ selectedId);
         Response objResponse =  objController.deleteStudent(selectedId);
         CommonHandler.handleResponse(objResponse, jLabel1);
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String selectedId = getSelectedStudentId();
        if(selectedId != null){
         JOptionPane.showMessageDialog(this, "Updating record with "+ selectedId);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setBackground(Color.green);
        jButton1.setForeground(Color.white);
        
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jButton1.setBackground(Color.white);
        jButton1.setForeground(Color.green);
    }//GEN-LAST:event_jButton1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField searchEmployee;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        String searchKeyword = searchEmployee.getText();
        ArrayList<StudentDTO> stdList = objController.viewStudents(searchKeyword);
        PopulateDataFromDatabase(stdList);
    }

    private String getSelectedStudentId() {
        if(jTable1.getSelectedRow() > 0)
        {
        return jTable1.getValueAt(jTable1.getSelectedRow(),jTable1.getSelectedColumn()).toString();
        }
        else {
        JOptionPane.showMessageDialog(this, "Select a record and then try again.");
        }
        return null;
    }
    private String getSelectedStudent() {
        if(jTable1.getSelectedRow() > 0)
        {
        return jTable1.getValueAt(jTable1.getSelectedRow(),jTable1.getSelectedColumn()).toString();
        }
        else {
        JOptionPane.showMessageDialog(this, "Select a record and then try again.");
        }
        return null;
    }
}
