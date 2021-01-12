/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import model.*;
import trainingapp.TrainingApp;
import javax.swing.JOptionPane;
/**
 *
 * @author borek
 */
public class AddCoachOrNutrForm extends javax.swing.JFrame {

    private App model;
    /** Creates new form AddCoachOrNutrForm */
    public AddCoachOrNutrForm() {
        initComponents();
    }

    public AddCoachOrNutrForm(App m) {
        initComponents();
        
        this.model = m;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        coachNutritionistButtonGroup = new javax.swing.ButtonGroup();
        homeButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        passwordPasswordField = new javax.swing.JPasswordField();
        emailLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        expertiseLabel = new javax.swing.JLabel();
        expertiseTextField = new javax.swing.JTextField();
        coachRadioButton = new javax.swing.JRadioButton();
        nutritionistRadioButton = new javax.swing.JRadioButton();
        addSportAdvisorButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        homeButton.setText("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        nameLabel.setText("Name:");

        passwordLabel.setText("Password:");

        emailLabel.setText("Email:");

        expertiseLabel.setText("Expertise:");

        coachNutritionistButtonGroup.add(coachRadioButton);
        coachRadioButton.setText("Coach");

        coachNutritionistButtonGroup.add(nutritionistRadioButton);
        nutritionistRadioButton.setText("Nutritionist");

        addSportAdvisorButton.setText("Add Sport Advisor!");
        addSportAdvisorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSportAdvisorButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(homeButton))
                    .add(layout.createSequentialGroup()
                        .add(75, 75, 75)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(nameLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(passwordLabel)
                            .add(emailLabel)
                            .add(expertiseLabel))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(coachRadioButton)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 64, Short.MAX_VALUE)
                                .add(nutritionistRadioButton))
                            .add(passwordPasswordField)
                            .add(nameTextField)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, emailTextField)
                            .add(expertiseTextField)
                            .add(addSportAdvisorButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .add(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(homeButton)
                .add(33, 33, 33)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(nameLabel)
                    .add(nameTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(passwordLabel)
                    .add(passwordPasswordField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(emailLabel)
                    .add(emailTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(expertiseLabel)
                    .add(expertiseTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(coachRadioButton)
                    .add(nutritionistRadioButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(addSportAdvisorButton)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        this.setVisible(false);
        TrainingApp.GoHome(this.model);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void addSportAdvisorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSportAdvisorButtonActionPerformed
        try {
            String name = nameTextField.getText().toString();
            if (model.NameExists(name)){
                throw new IllegalArgumentException("This name is already taken!");
            }
            String password = passwordPasswordField.getPassword().toString();
            String email = emailTextField.getText().toString();
            if (model.EmailExists(email)){
                throw new IllegalArgumentException("This email is already used!");
            }
            String expertise = expertiseTextField.getText().toString();
            if(name.equals("") || password.equals("") || email.equals("") || expertise.equals("")){
                throw new IllegalArgumentException("All fields must be nonempty!");
            }
            
            if(coachRadioButton.isSelected()){
                Coach coach = new Coach(name, password, email, expertise);
                this.model.AddCoach(coach);
                JOptionPane.showMessageDialog(this, "Coach added successfully!");
            }
            else{
                Nutritionist nutritionist  = new Nutritionist(name, password, email, expertise);
                this.model.AddNutritionist(nutritionist);
                JOptionPane.showMessageDialog(this, "Nutritionist added successfully!");
            }
        }
        
        catch(IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_addSportAdvisorButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddCoachOrNutrForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCoachOrNutrForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCoachOrNutrForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCoachOrNutrForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCoachOrNutrForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSportAdvisorButton;
    private javax.swing.ButtonGroup coachNutritionistButtonGroup;
    private javax.swing.JRadioButton coachRadioButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel expertiseLabel;
    private javax.swing.JTextField expertiseTextField;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JRadioButton nutritionistRadioButton;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordPasswordField;
    // End of variables declaration//GEN-END:variables

}
