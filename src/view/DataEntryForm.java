package view;

import controller.PersonDao;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Person;

/**
 *
 * @author hirwa
 */
public class DataEntryForm extends javax.swing.JInternalFrame {

    String Gender = null;
    DefaultTableModel table;
    
    public DataEntryForm() {
        initComponents();
        table = (DefaultTableModel) dataEntryTable.getModel();
        displayData();
    }

    public void displayData(){
        table.setRowCount(0);
         
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        phoneNumberLable = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        phoneNumberField = new javax.swing.JTextField();
        EmailTextField = new javax.swing.JTextField();
        dateOfBirthDateChooser = new com.toedter.calendar.JDateChooser();
        RegistrantTypeComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        MaleRadioButton = new javax.swing.JRadioButton();
        FemaleRadioButton = new javax.swing.JRadioButton();
        BrowsePictureButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataEntryTable = new javax.swing.JTable();
        ImagePanel = new javax.swing.JPanel();
        ImageLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        saveButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        clearFieldsButton = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        Title = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Data Entry");
        setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("First Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Last Name");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date Of Birth");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        phoneNumberLable.setForeground(new java.awt.Color(255, 255, 255));
        phoneNumberLable.setText("Phone Number");
        jPanel1.add(phoneNumberLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Registrant Type");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Picture");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));
        jPanel1.add(firstNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 130, -1));
        jPanel1.add(lastNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 130, -1));
        jPanel1.add(phoneNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 130, -1));
        jPanel1.add(EmailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 169, 130, -1));
        jPanel1.add(dateOfBirthDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 130, -1));

        RegistrantTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Lecturer", "Administrator" }));
        jPanel1.add(RegistrantTypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 199, 130, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Gender");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        buttonGroup1.add(MaleRadioButton);
        MaleRadioButton.setText("Male");
        MaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleRadioButtonActionPerformed(evt);
            }
        });
        jPanel1.add(MaleRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        buttonGroup1.add(FemaleRadioButton);
        FemaleRadioButton.setText("Female");
        FemaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleRadioButtonActionPerformed(evt);
            }
        });
        jPanel1.add(FemaleRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        BrowsePictureButton.setBackground(new java.awt.Color(255, 255, 255));
        BrowsePictureButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BrowsePictureButton.setForeground(new java.awt.Color(0, 0, 51));
        BrowsePictureButton.setText("Browse");
        jPanel1.add(BrowsePictureButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 130, 30));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 53, 300, 272));

        dataEntryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Date of Birth", "Gender", "National Id", "Email", "Registrant Type", "Picture"
            }
        ));
        dataEntryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataEntryTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dataEntryTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 727, 145));

        ImagePanel.setBackground(new java.awt.Color(102, 102, 255));
        ImagePanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        ImageLabel.setBackground(new java.awt.Color(204, 204, 255));
        ImageLabel.setText("jLabel8");

        javax.swing.GroupLayout ImagePanelLayout = new javax.swing.GroupLayout(ImagePanel);
        ImagePanel.setLayout(ImagePanelLayout);
        ImagePanelLayout.setHorizontalGroup(
            ImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
        );
        ImagePanelLayout.setVerticalGroup(
            ImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImageLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
        );

        jPanel2.add(ImagePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 53, -1, 272));

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        saveButton.setBackground(new java.awt.Color(255, 255, 255));
        saveButton.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        saveButton.setForeground(new java.awt.Color(0, 0, 51));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        UpdateButton.setBackground(new java.awt.Color(255, 255, 255));
        UpdateButton.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        UpdateButton.setForeground(new java.awt.Color(0, 0, 51));
        UpdateButton.setText("Update");

        DeleteButton.setBackground(new java.awt.Color(255, 255, 255));
        DeleteButton.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        DeleteButton.setForeground(new java.awt.Color(0, 0, 51));
        DeleteButton.setText("Delete");

        clearFieldsButton.setBackground(new java.awt.Color(255, 255, 255));
        clearFieldsButton.setForeground(new java.awt.Color(0, 0, 51));
        clearFieldsButton.setText("jButton1");

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setForeground(new java.awt.Color(0, 0, 51));
        jButton5.setText("jButton1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearFieldsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clearFieldsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 53, -1, 272));

        Title.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Personal Info Data Entry");
        jPanel2.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleRadioButtonActionPerformed
        Gender = "Male";
    }//GEN-LAST:event_MaleRadioButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        Person per = new Person();
        per.setFirstName(firstNameTextField.getText());
        per.setLastName(lastNameTextField.getText());
        
        java.sql.Date dates = new java.sql.Date(dateOfBirthDateChooser.getDate().getTime());
        LocalDate date = dates.toLocalDate();//This is the date on which a person was vaccinated.
        per.setDob(date);
        
        per.setGender(Gender);
        per.setPhoneNumber(phoneNumberField.getText());
        per.setEmailAddress(EmailTextField.getText());
        per.setRegistrantType(title);
        per.setPicture(Byte.MIN_VALUE);
        
        PersonDao pdao = new PersonDao();
        pdao.insertPerson(per);
        
        displayData();
        
        JOptionPane.showMessageDialog(this, "Saved!!","Success",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_saveButtonActionPerformed

    private void FemaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleRadioButtonActionPerformed
        Gender = "Female";
    }//GEN-LAST:event_FemaleRadioButtonActionPerformed

    private void dataEntryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataEntryTableMouseClicked
        
    }//GEN-LAST:event_dataEntryTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BrowsePictureButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JRadioButton FemaleRadioButton;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JPanel ImagePanel;
    private javax.swing.JRadioButton MaleRadioButton;
    private javax.swing.JComboBox<String> RegistrantTypeComboBox;
    private javax.swing.JLabel Title;
    private javax.swing.JButton UpdateButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clearFieldsButton;
    private javax.swing.JTable dataEntryTable;
    private com.toedter.calendar.JDateChooser dateOfBirthDateChooser;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JLabel phoneNumberLable;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
