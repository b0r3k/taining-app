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
public class AthleteViewForm extends javax.swing.JFrame {

    private App model;
    private Athlete athlete;
    /** Creates new form AthleteViewForm */
    public AthleteViewForm() {
        initComponents();
    }
    
    public AthleteViewForm(App m, Athlete a) {
        initComponents();
        
        this.model = m;
        this.athlete = a;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homeButton = new javax.swing.JButton();
        modifyDataButton = new javax.swing.JButton();
        findCoachButton = new javax.swing.JButton();
        findNutritionistButton = new javax.swing.JButton();
        viewPlanButton = new javax.swing.JButton();
        viewOldPlanButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        homeButton.setText("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        modifyDataButton.setText("Modify My Data");
        modifyDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyDataButtonActionPerformed(evt);
            }
        });

        findCoachButton.setText("Find Coach");
        findCoachButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findCoachButtonActionPerformed(evt);
            }
        });

        findNutritionistButton.setText("Find Nutritionist");
        findNutritionistButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findNutritionistButtonActionPerformed(evt);
            }
        });

        viewPlanButton.setText("View Sports Plan");

        viewOldPlanButton.setText("View Old Sports Plan");

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
                        .add(116, 116, 116)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(modifyDataButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .add(findCoachButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(findNutritionistButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(viewOldPlanButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(viewPlanButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(homeButton)
                .add(17, 17, 17)
                .add(viewPlanButton)
                .add(18, 18, 18)
                .add(viewOldPlanButton)
                .add(45, 45, 45)
                .add(modifyDataButton)
                .add(18, 18, 18)
                .add(findCoachButton)
                .add(18, 18, 18)
                .add(findNutritionistButton)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        this.setVisible(false);
        TrainingApp.GoHome(this.model);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void findNutritionistButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findNutritionistButtonActionPerformed
        if(this.athlete.getHasNutritionist()){
            JOptionPane.showMessageDialog(this, "You already have a Nutritionist!");
        }
        else{
            var newGui = new FindingNutrForm(this.model, this.athlete);
            newGui.setVisible(true);
        }
    }//GEN-LAST:event_findNutritionistButtonActionPerformed

    private void findCoachButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findCoachButtonActionPerformed
        if(this.athlete.getHasCoach()){
            JOptionPane.showMessageDialog(this, "You already have a Coach!");
        }
        else{
            var newGui = new FindingCoachForm(this.model, this.athlete);
            newGui.setVisible(true);
        }
    }//GEN-LAST:event_findCoachButtonActionPerformed

    private void modifyDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyDataButtonActionPerformed
        var newGui = new ModifyAthleteForm(this.model, this.athlete);
        newGui.setVisible(true);
    }//GEN-LAST:event_modifyDataButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AthleteViewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AthleteViewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AthleteViewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AthleteViewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AthleteViewForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton findCoachButton;
    private javax.swing.JButton findNutritionistButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton modifyDataButton;
    private javax.swing.JButton viewOldPlanButton;
    private javax.swing.JButton viewPlanButton;
    // End of variables declaration//GEN-END:variables

}
