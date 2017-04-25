package gui.studentDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shivam Sood
 */
public class gui extends javax.swing.JFrame {

    /**
     * Creates new form gui
     */
    public gui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        textDeleteReg = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        deleteCheckBox = new javax.swing.JCheckBox();
        deleteCheckBox1 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textInsertReg = new javax.swing.JTextField();
        textInsertName = new javax.swing.JTextField();
        textInsertDOB = new javax.swing.JTextField();
        textInsertClass = new javax.swing.JTextField();
        textInsertSection = new javax.swing.JTextField();
        buttonInsert = new javax.swing.JButton();
        exitInsert = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        textInsertFather = new javax.swing.JTextField();
        textInsertMother = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        textUpdateReg = new javax.swing.JTextField();
        textUpdateName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textUpdateDOB = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        textUpdateClass = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        textUpdateSection = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        textUpdateFather = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        textUpdateMother = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        textUpdateClass1 = new javax.swing.JTextField();

        jTextField2.setText("jTextField2");

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Student Database"));
        jTabbedPane1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTabbedPane1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jLabel7.setText("Search By Registration Number:");

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        deleteCheckBox.setText("Delete Parent's Information");

        deleteCheckBox1.setText("Delete All Info");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(deleteCheckBox1)
                    .addComponent(jButton2)
                    .addComponent(deleteCheckBox))
                .addGap(72, 72, 72)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(textDeleteReg, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(484, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textDeleteReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(deleteCheckBox1)
                .addGap(18, 18, 18)
                .addComponent(deleteCheckBox)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addContainerGap(329, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Delete", jPanel3);

        jButton3.setText("Display All Student's Database");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton7.setText("Display Parents' Information");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1041, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(49, 49, 49)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(246, 246, 246))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton7)
                    .addComponent(jButton1))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        jTabbedPane1.addTab("Display", jPanel4);

        jLabel1.setText("Registration Number:");

        jLabel2.setText("Name:");

        jLabel3.setText("Date of Birth (YYYY-MM-DD):");

        jLabel4.setText("Class:");

        jLabel5.setText("Section:");

        textInsertSection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textInsertSectionActionPerformed(evt);
            }
        });

        buttonInsert.setText("Insert");
        buttonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInsertActionPerformed(evt);
            }
        });

        exitInsert.setText("Exit");
        exitInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitInsertActionPerformed(evt);
            }
        });

        jLabel8.setText("Parent's Details (Optional) :");

        jLabel13.setText("Father's Name:");

        jLabel14.setText("Mother's Name:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(buttonInsert)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(exitInsert)
                            .addComponent(textInsertReg)
                            .addComponent(textInsertName)
                            .addComponent(textInsertDOB, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                            .addComponent(textInsertClass)
                            .addComponent(textInsertSection)
                            .addComponent(textInsertFather)
                            .addComponent(textInsertMother))))
                .addContainerGap(485, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(textInsertReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textInsertName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(textInsertDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(textInsertClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(textInsertSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(textInsertFather, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(textInsertMother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonInsert)
                    .addComponent(exitInsert))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Insert", jPanel1);

        jLabel6.setText("Search by Registration Number:");

        jLabel9.setText("Name:");

        jLabel10.setText("Date of Birth (YYYY-MM-DD):");

        jLabel11.setText("Class:");

        jLabel12.setText("Section:");

        jLabel15.setText("Parent's Details :");

        jLabel16.setText("Father's Name:");

        jButton6.setText("Update");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel18.setText("Mother's Name:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel18))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(310, 310, 310)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(234, 234, 234)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addGap(325, 325, 325)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textUpdateSection)
                                    .addComponent(textUpdateClass)
                                    .addComponent(textUpdateMother, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textUpdateName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textUpdateDOB, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textUpdateClass1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textUpdateFather, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textUpdateReg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(612, 612, 612))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textUpdateReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(textUpdateName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(textUpdateDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(textUpdateClass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textUpdateSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(textUpdateClass, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(textUpdateFather, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(textUpdateMother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton5))
                .addGap(244, 244, 244))
        );

        jTabbedPane1.addTab("Update", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1082, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInsertActionPerformed

String dup,dup1;
int i=0,j=0;
Connection conn=null;
int regNo=Integer.parseInt(textInsertReg.getText());
PreparedStatement preparedStatement=null;
PreparedStatement preparedStatement1=null;
try{
    Class.forName("com.mysql.jdbc.Driver");
    conn=DriverManager.getConnection("jdbc:mysql:///5am","root","hey");    
    if(!textInsertName.getText().isEmpty())
    {
        String name=textInsertName.getText();
        String date=textInsertDOB.getText();
        int insertClass=Integer.parseInt(textInsertClass.getText());
        String section=textInsertSection.getText();
        preparedStatement=conn.prepareStatement("insert into student values (?,?,?,?,?);");
        preparedStatement.setInt(1, regNo);
        preparedStatement.setString(2,name);
        preparedStatement.setString(3,date);
        preparedStatement.setInt(4,insertClass);
        preparedStatement.setString(5,section);
        i=preparedStatement.executeUpdate();
    }
    if(!(textInsertFather.getText().isEmpty()) || !(textInsertMother.getText().isEmpty()))
    {
        String father=textInsertFather.getText();
        String mother=textInsertMother.getText();
        preparedStatement1=conn.prepareStatement("insert into guardian values (?,?,?);");
        preparedStatement1.setInt(1, regNo);
        preparedStatement1.setString(2, father);
        preparedStatement1.setString(3, mother);
        j=preparedStatement1.executeUpdate();
        if(j<=0)
        {
            JOptionPane.showMessageDialog(null,"Student Data Doesn't Exsist");
        }
    }
    if(i>0 || j>0)
    {
        JOptionPane.showMessageDialog(null,"Data Saved");
        textInsertReg.setText("");
        textInsertName.setText("");
        textInsertDOB.setText("");
        textInsertClass.setText("");
        textInsertSection.setText("");
        textInsertFather.setText("");
        textInsertMother.setText("");
    }
    else
    {
        
        JOptionPane.showMessageDialog(null,"Invalid Data");
    }
conn.close();
}
catch(Exception e){
    dup="com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException: Duplicate entry '"+regNo+"' for key 'PRIMARY'";
    dup1=e.toString();
    if(dup.equals(e.toString()))
    {
    JOptionPane.showMessageDialog(null,"Registration Number Already Exist");
    textInsertReg.setText("");
    }
    else{
    JOptionPane.showMessageDialog(null,e);
    }
  }
    }//GEN-LAST:event_buttonInsertActionPerformed

    private void exitInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitInsertActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_exitInsertActionPerformed

    private void textInsertSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textInsertSectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textInsertSectionActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
int i=0,j=0,regNo=Integer.parseInt(textDeleteReg.getText());
Connection conn=null;
PreparedStatement preparedStatement=null;
PreparedStatement preparedStatement1=null;
boolean box1=deleteCheckBox1.isSelected();
boolean box=deleteCheckBox.isSelected();
try{
    Class.forName("com.mysql.jdbc.Driver");
    conn=DriverManager.getConnection("jdbc:mysql:///5am","root","hey");
    preparedStatement1=conn.prepareStatement("delete from guardian where Regno=?;");
    preparedStatement=conn.prepareStatement("delete from student where regno=?;");
    preparedStatement.setInt(1, regNo);
    preparedStatement1.setInt(1, regNo);
    //JOptionPane.showMessageDialog(null,"Please Select One of the Two Check Boxes");
    //JOptionPane.showMessageDialog(null,box);
    if((box1|box))
    {
    if(box1)
    {
        j=preparedStatement1.executeUpdate();
        i=preparedStatement.executeUpdate();
        deleteCheckBox.setSelected(false);
        deleteCheckBox1.setSelected(false);
    }      
    else if(box)
    {
        j=preparedStatement1.executeUpdate();
        deleteCheckBox.setSelected(false);
        textDeleteReg.setText("");
    } 
    }
    else
    {
        JOptionPane.showMessageDialog(null,"Please Select One of the Two Check Boxes");
        return;
    }
    if(i>0 || j>0)
    {
        JOptionPane.showMessageDialog(null,"Data Deleted");
        textDeleteReg.setText("");
    }
    else
    {
        JOptionPane.showMessageDialog(null,"Registration Number Doesn't Exist");
    }
conn.close();
}
catch(Exception e){
    JOptionPane.showMessageDialog(null,e);
}

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
int i=0,k=0,j=0,l=0,regNo=Integer.parseInt(textUpdateReg.getText());
String name=textUpdateName.getText();
String date=textUpdateDOB.getText();
String insertClass=textUpdateClass1.getText();
String section=textUpdateSection.getText();
String father,mother;
father=textUpdateFather.getText();
mother=textUpdateMother.getText();
Connection conn=null;
String command="update student set ";
String command1="update guardian set ";
PreparedStatement preparedStatement,preparedStatement1;
try{
    Class.forName("com.mysql.jdbc.Driver");
    conn=DriverManager.getConnection("jdbc:mysql:///5am","root","hey");
    
    if(name.length()!=0)
    {
        command=command+" name='"+name+"'";
        i=1;
    }
    
    if(date.length()!=0)
    {
        if(i==0){
        command=command+" dob='"+date+"' ";
        i=1;
        }
        else
        command=command+", dob='"+date+"' ";
    }
    
    if(insertClass.length()!=0)
    {
        if(i==0){
        command=command+" class="+insertClass;
        i=1;
        }
        else
        command=command+", class="+insertClass;
    }
    
    if(section.length()!=0)
    {
        if(i==0)
        {command=command+" section='"+section+"' ";
        i=1;
        }
        else
        command=command+", section='"+section+"' ";
    }
    
    if(father.length()!=0)
    {
        command1=command1+" Father='"+father+"' ";
        k=1;
    }
    if(mother.length()!=0)
    {
        if(k==0)
        {
            command1=command1+" Mother='"+mother+"'";
            k=1;
        }
        else
            command1=command1+", Mother='"+mother+"'";
    }
    
    command=command+" where regno="+regNo+";";
    command1=command1+" where Regno="+regNo+";";
    preparedStatement=conn.prepareStatement(command);
    preparedStatement1=conn.prepareStatement(command1);
    if(i==1)
    j=preparedStatement.executeUpdate();
    if(k==1)
    l=preparedStatement1.executeUpdate();
    if(j>0 || l>0)
    {
        JOptionPane.showMessageDialog(null,"Updated");
        textUpdateReg.setText("");
        textUpdateName.setText("");
        textUpdateDOB.setText("");
        textUpdateClass1.setText("");
        textUpdateSection.setText("");
        textUpdateFather.setText("");
        textUpdateMother.setText("");
    }
    else
    {
        JOptionPane.showMessageDialog(null,"Error");
    }
conn.close();    
}
catch(Exception e){
    JOptionPane.showMessageDialog(null,e);
}

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1AncestorAdded

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
Connection connect = null;
Statement statement = null;
        try {
    Class.forName("com.mysql.jdbc.Driver");
    connect = DriverManager.getConnection("jdbc:mysql:///5am","root","hey");
    statement = connect.createStatement();
    ResultSet rs = statement.executeQuery("SELECT * FROM student;");
    
    // get columns info
    ResultSetMetaData rsmd = rs.getMetaData();
    int columnCount = rsmd.getColumnCount();
    
    // for changing column and row model
    DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
    
    // clear existing columns 
    tm.setColumnCount(0);

    // add specified columns to table
    for (int i = 1; i <= columnCount; i++ ) {
        tm.addColumn(rsmd.getColumnName(i));
    }   

    // clear existing rows
    tm.setRowCount(0);

    // add rows to table
    while (rs.next()) {
        String[] a = new String[columnCount];
        for(int i = 0; i < columnCount; i++) {
            a[i] = rs.getString(i+1);
        }
    tm.addRow(a);
    }
    tm.fireTableDataChanged();

    // Close ResultSet and Statement
    rs.close();
    statement.close();
    connect.close();
} catch (Exception ex) { 
    JOptionPane.showMessageDialog(this, ex, ex.getMessage(), WIDTH, null);
}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTabbedPane1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTabbedPane1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1AncestorAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
Connection connect = null;
Statement statement = null;
        try {
    Class.forName("com.mysql.jdbc.Driver");
    connect = DriverManager.getConnection("jdbc:mysql:///5am","root","hey");
    statement = connect.createStatement();
    ResultSet rs = statement.executeQuery("SELECT student.regno,name,Father,Mother FROM student,guardian where student.regno=guardian.Regno;");
    
    // get columns info
    ResultSetMetaData rsmd = rs.getMetaData();
    int columnCount = rsmd.getColumnCount();
    
    // for changing column and row model
    DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
    
    // clear existing columns 
    tm.setColumnCount(0);

    // add specified columns to table
    for (int i = 1; i <= columnCount; i++ ) {
        tm.addColumn(rsmd.getColumnName(i));
    }   

    // clear existing rows
    tm.setRowCount(0);

    // add rows to table
    while (rs.next()) {
        String[] a = new String[columnCount];
        for(int i = 0; i < columnCount; i++) {
            a[i] = rs.getString(i+1);
        }
    tm.addRow(a);
    }
    tm.fireTableDataChanged();

    // Close ResultSet and Statement
    rs.close();
    statement.close();
    connect.close();
} catch (Exception ex) { 
    JOptionPane.showMessageDialog(this, ex, ex.getMessage(), WIDTH, null);
}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
Connection connect = null;
Statement statement = null;
        try {
    Class.forName("com.mysql.jdbc.Driver");
    connect = DriverManager.getConnection("jdbc:mysql:///5am","root","hey");
    statement = connect.createStatement();
    ResultSet rs = statement.executeQuery("SELECT * FROM student;");
    
    // get columns info
    ResultSetMetaData rsmd = rs.getMetaData();
    int columnCount = rsmd.getColumnCount();
    
    // for changing column and row model
    DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
    
    // clear existing columns 
    tm.setColumnCount(0);

    // add specified columns to table
    for (int i = 1; i <= columnCount; i++ ) {
        tm.addColumn(rsmd.getColumnName(i));
    }   

    // clear existing rows
    tm.setRowCount(0);

    // add rows to table
    while (rs.next()) {
        String[] a = new String[columnCount];
        for(int i = 0; i < columnCount; i++) {
            a[i] = rs.getString(i+1);
        }
    tm.addRow(a);
    }
    tm.fireTableDataChanged();

    // Close ResultSet and Statement
    rs.close();
    statement.close();
    connect.close();
} catch (Exception ex) { 
    JOptionPane.showMessageDialog(this, ex, ex.getMessage(), WIDTH, null);
}
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
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
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                new gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonInsert;
    private javax.swing.JCheckBox deleteCheckBox;
    private javax.swing.JCheckBox deleteCheckBox1;
    private javax.swing.JButton exitInsert;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField textDeleteReg;
    private javax.swing.JTextField textInsertClass;
    private javax.swing.JTextField textInsertDOB;
    private javax.swing.JTextField textInsertFather;
    private javax.swing.JTextField textInsertMother;
    private javax.swing.JTextField textInsertName;
    private javax.swing.JTextField textInsertReg;
    private javax.swing.JTextField textInsertSection;
    private javax.swing.JTextField textUpdateClass;
    private javax.swing.JTextField textUpdateClass1;
    private javax.swing.JTextField textUpdateDOB;
    private javax.swing.JTextField textUpdateFather;
    private javax.swing.JTextField textUpdateMother;
    private javax.swing.JTextField textUpdateName;
    private javax.swing.JTextField textUpdateReg;
    private javax.swing.JTextField textUpdateSection;
    // End of variables declaration//GEN-END:variables
}
