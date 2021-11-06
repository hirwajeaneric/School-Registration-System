package view;

import controller.UserAccountsDao;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.UserAccounts;

/**
 *
 * @author hirwa
 */
public class SignInForm extends javax.swing.JFrame {

    ViewControler vcl = new ViewControler();
    
    public SignInForm() {
        initComponents();
        missingUsernameLabel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CreateAccountBackgroundPanel = new javax.swing.JPanel();
        CreateAccountPanel = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        newUserNameTextField = new javax.swing.JTextField();
        CreatePasswordField = new javax.swing.JPasswordField();
        CreateAccountButton = new javax.swing.JButton();
        passwordLabel1 = new javax.swing.JLabel();
        ConfirmPasswordField = new javax.swing.JPasswordField();
        usernameLabel1 = new javax.swing.JLabel();
        newPhoneNumberField = new javax.swing.JTextField();
        missingUsernameLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up");

        CreateAccountBackgroundPanel.setBackground(new java.awt.Color(153, 204, 255));

        CreateAccountPanel.setBackground(new java.awt.Color(0, 0, 51));

        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("Create username");

        passwordLabel.setBackground(new java.awt.Color(255, 255, 255));
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Create password");

        newUserNameTextField.setBorder(null);
        newUserNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                newUserNameTextFieldFocusLost(evt);
            }
        });

        CreatePasswordField.setBorder(null);
        CreatePasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreatePasswordFieldActionPerformed(evt);
            }
        });

        CreateAccountButton.setBackground(new java.awt.Color(0, 51, 255));
        CreateAccountButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        CreateAccountButton.setForeground(new java.awt.Color(255, 255, 255));
        CreateAccountButton.setText("Create Account");
        CreateAccountButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CreateAccountButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CreateAccountButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CreateAccountButtonMouseEntered(evt);
            }
        });
        CreateAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccountButtonActionPerformed(evt);
            }
        });

        passwordLabel1.setBackground(new java.awt.Color(255, 255, 255));
        passwordLabel1.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel1.setText("Confirm password");

        ConfirmPasswordField.setBorder(null);

        usernameLabel1.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel1.setText("Phone number");

        newPhoneNumberField.setBorder(null);
        newPhoneNumberField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                newPhoneNumberFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                newPhoneNumberFieldFocusLost(evt);
            }
        });

        missingUsernameLabel.setForeground(new java.awt.Color(255, 0, 0));
        missingUsernameLabel.setText(".");

        javax.swing.GroupLayout CreateAccountPanelLayout = new javax.swing.GroupLayout(CreateAccountPanel);
        CreateAccountPanel.setLayout(CreateAccountPanelLayout);
        CreateAccountPanelLayout.setHorizontalGroup(
            CreateAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreateAccountPanelLayout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(CreateAccountButton)
                .addGap(108, 108, 108))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreateAccountPanelLayout.createSequentialGroup()
                .addGap(0, 58, Short.MAX_VALUE)
                .addGroup(CreateAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CreateAccountPanelLayout.createSequentialGroup()
                        .addComponent(usernameLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(newPhoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CreateAccountPanelLayout.createSequentialGroup()
                        .addGroup(CreateAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreateAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(usernameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addComponent(passwordLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(27, 27, 27)
                        .addGroup(CreateAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(newUserNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(CreatePasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(ConfirmPasswordField)))
                    .addComponent(missingUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );
        CreateAccountPanelLayout.setVerticalGroup(
            CreateAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateAccountPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(CreateAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newUserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(missingUsernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CreateAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPhoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel1))
                .addGap(18, 18, 18)
                .addGroup(CreateAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(CreatePasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(CreateAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel1)
                    .addComponent(ConfirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(CreateAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Create Account");

        javax.swing.GroupLayout CreateAccountBackgroundPanelLayout = new javax.swing.GroupLayout(CreateAccountBackgroundPanel);
        CreateAccountBackgroundPanel.setLayout(CreateAccountBackgroundPanelLayout);
        CreateAccountBackgroundPanelLayout.setHorizontalGroup(
            CreateAccountBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateAccountBackgroundPanelLayout.createSequentialGroup()
                .addGroup(CreateAccountBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CreateAccountBackgroundPanelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(CreateAccountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CreateAccountBackgroundPanelLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel3)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        CreateAccountBackgroundPanelLayout.setVerticalGroup(
            CreateAccountBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateAccountBackgroundPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CreateAccountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CreateAccountBackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CreateAccountBackgroundPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccountButtonActionPerformed
        if ("".equals(newUserNameTextField.getText())) {
            missingUsernameLabel.setVisible(true);
            missingUsernameLabel.setText("Please first add Username!");
        } else if("".equals(CreatePasswordField.getPassword().toString()) || "".equals(ConfirmPasswordField.getPassword().toString())){
            missingUsernameLabel.setVisible(true);
            missingUsernameLabel.setText("First Set password Please!");
        } else {
            UserAccounts users = new UserAccounts();
            users.setUsername(newUserNameTextField.getText());
            users.setPhoneNumber(newPhoneNumberField.getText());
            users.setPassword(CreatePasswordField.getPassword().toString());
            users.setConfirmPassword(ConfirmPasswordField.getPassword().toString());
        
            UserAccountsDao userDao = new UserAccountsDao();
            userDao.saveCredentials(users);
        
            missingUsernameLabel.setText("");
            JOptionPane.showMessageDialog(this, "Account Created!","Successful",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_CreateAccountButtonActionPerformed

    private void CreatePasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreatePasswordFieldActionPerformed
        
    }//GEN-LAST:event_CreatePasswordFieldActionPerformed

    private void newUserNameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newUserNameTextFieldFocusLost
        if ("".equals(newUserNameTextField.getText())) {
            missingUsernameLabel.setText("First add username please!!");
        }else if(newUserNameTextField.getText().length()>0){
            missingUsernameLabel.setText("");
        }
    }//GEN-LAST:event_newUserNameTextFieldFocusLost

    private void newPhoneNumberFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newPhoneNumberFieldFocusGained
        if ("".equals(newUserNameTextField.getText())) {
            missingUsernameLabel.setText("First add username please!!");
        }else if(newUserNameTextField.getText().length()>0){
            missingUsernameLabel.setText("");
        }
    }//GEN-LAST:event_newPhoneNumberFieldFocusGained

    private void newPhoneNumberFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newPhoneNumberFieldFocusLost
        if(newPhoneNumberField.getText().length()>10){
            missingUsernameLabel.setText("Phone number exceeds 10 digits");
        }
    }//GEN-LAST:event_newPhoneNumberFieldFocusLost

    private void CreateAccountButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateAccountButtonMouseEntered
        CreateAccountButton.setBackground(new java.awt.Color(153,204,255));
        CreateAccountButton.setForeground(Color.BLACK);
    }//GEN-LAST:event_CreateAccountButtonMouseEntered

    private void CreateAccountButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateAccountButtonMouseExited
        CreateAccountButton.setBackground(new java.awt.Color(0, 51, 255));
        CreateAccountButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_CreateAccountButtonMouseExited

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
            java.util.logging.Logger.getLogger(SignInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignInForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ConfirmPasswordField;
    private javax.swing.JPanel CreateAccountBackgroundPanel;
    private javax.swing.JButton CreateAccountButton;
    private javax.swing.JPanel CreateAccountPanel;
    private javax.swing.JPasswordField CreatePasswordField;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel missingUsernameLabel;
    private javax.swing.JTextField newPhoneNumberField;
    private javax.swing.JTextField newUserNameTextField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel passwordLabel1;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel usernameLabel1;
    // End of variables declaration//GEN-END:variables
}
