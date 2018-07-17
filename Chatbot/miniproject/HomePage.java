/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject;

import AppPackage.AnimationClass;
import java.awt.Dimension;
import javax.swing.JLabel;

/**
 *
 * @author praz
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * 
     * 
     * Creates new form HomePage
     */
    
    AnimationClass AC=new AnimationClass();
    public HomePage() {
        initComponents();
        setMinimumSize(new Dimension(840,472).getSize());
        Slideshow();
    }

    public void Slideshow(){
        new Thread(){
            int count;
            
            @Override
            public void run(){
                try{
                    while(true){
                      switch(count){
                          case 0:
                              Thread.sleep(3000);                            
                              doLeft(AC,-840,0,840,1680,2520,3360,4200,5040,b1,b2,b3,b4,b5,b6,b7);
                              count=1;
                              break;
                              
                          case 1:
                              Thread.sleep(3000);
                              doLeft(AC,-1680,-840,0,840,1680,2520,3360,4200,b1,b2,b3,b4,b5,b6,b7);
                              count=2;
                              break;
                          
                          case 2:
                              Thread.sleep(3000);
                              doLeft(AC,-2250,-1680,-840,0,840,1680,2520,3360,b1,b2,b3,b4,b5,b6,b7);                              count=3;
                              count=3;
                              break;
                              
                          case 3:
                              Thread.sleep(3000);
                              doLeft(AC,-3360,-2250,-1680,-840,0,840,1680,2520,b1,b2,b3,b4,b5,b6,b7);                              count=3;
                              count=4;
                              break;
                                  
                          case 4:
                              Thread.sleep(3000);
                              doLeft(AC,-4200,-3360,-2250,-1680,-840,0,840,1680,b1,b2,b3,b4,b5,b6,b7);                              count=3;
                              count=5;
                              break;
                              
                          case 5:
                              Thread.sleep(3000);
                              doLeft(AC,-5040,-4200,-3360,-2250,-1680,-840,0,840,b1,b2,b3,b4,b5,b6,b7);                              count=3;
                              count=6;
                              break;    
                          
                          case 6:
                              Thread.sleep(3000);
                              doRight(AC,840,0,-840,-1680,-2250,-3360,-4200,-5040,b7,b6,b5,b4,b3,b2,b1);                              count=3;
                              count=7;
                              break;    
                          
                          case 7:
                              Thread.sleep(3000);
                              doRight(AC,1680,840,0,-840,-1680,-2250,-3360,-4200,b7,b6,b5,b4,b3,b2,b1);                              count=3;
                              count=8;
                              break;    
                                                        
                          case 8:
                              Thread.sleep(3000);
                              doRight(AC,2250,1680,840,0,-840,-1680,-2250,-3360,b7,b6,b5,b4,b3,b2,b1);                              count=3;
                              count=9;
                              break;    
                          
                          case 9:
                              Thread.sleep(3000);
                              doRight(AC,3360,2250,1680,840,0,-840,-1680,-2250,b7,b6,b5,b4,b3,b2,b1);                              count=3;
                              count=10;
                              break;
                              
                          case 10:
                              Thread.sleep(3000);
                              doRight(AC,4200,3360,2250,1680,840,0,-840,-1680,b7,b6,b5,b4,b3,b2,b1);                              count=3;
                              count=11;
                              break;
                          
                          case 11:
                              Thread.sleep(3000);
                              doRight(AC,5040,4200,3360,2250,1680,840,0,-840,b7,b6,b5,b4,b3,b2,b1);                              count=3;
                              count=0;
                              break;
                              
                      }  
                    }
                }
                catch(Exception e){
                    
                }
            }
        }.start();
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
        student = new javax.swing.JButton();
        teacher = new javax.swing.JButton();
        admin = new javax.swing.JButton();
        welcome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        b2 = new javax.swing.JLabel();
        b3 = new javax.swing.JLabel();
        b4 = new javax.swing.JLabel();
        b5 = new javax.swing.JLabel();
        b6 = new javax.swing.JLabel();
        b7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        student.setIcon(new javax.swing.ImageIcon("/miniproject/MiniButton1.png")); // NOI18N
        student.setBorderPainted(false);
        student.setContentAreaFilled(false);
        student.setFocusPainted(false);
        student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentActionPerformed(evt);
            }
        });
        jPanel1.add(student);
        student.setBounds(85, 167, 199, 70);

        teacher.setIcon(new javax.swing.ImageIcon("/miniproject/MiniButton2.png")); // NOI18N
        teacher.setBorderPainted(false);
        teacher.setContentAreaFilled(false);
        teacher.setFocusPainted(false);
        teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherActionPerformed(evt);
            }
        });
        jPanel1.add(teacher);
        teacher.setBounds(190, 260, 199, 70);

        admin.setIcon(new javax.swing.ImageIcon("/miniproject/MiniButton15.png")); // NOI18N
        admin.setBorderPainted(false);
        admin.setContentAreaFilled(false);
        admin.setFocusPainted(false);
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });
        jPanel1.add(admin);
        admin.setBounds(300, 340, 199, 70);

        welcome.setFont(new java.awt.Font("eufm10", 1, 36)); // NOI18N
        welcome.setForeground(java.awt.Color.black);
        welcome.setText("Welcome to MEMIC!!!");
        jPanel1.add(welcome);
        welcome.setBounds(270, 50, 410, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/robot-img.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(540, 130, 290, 320);

        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/X1blue.jpg"))); // NOI18N
        b1.setText("jLabel1");
        jPanel1.add(b1);
        b1.setBounds(0, 0, 840, 472);

        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/X2green.jpg"))); // NOI18N
        b2.setText("jLabel1");
        jPanel1.add(b2);
        b2.setBounds(840, 0, 840, 472);

        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/X3orange.jpg"))); // NOI18N
        b3.setText("jLabel1");
        jPanel1.add(b3);
        b3.setBounds(1680, 0, 840, 472);

        b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/X4red.png"))); // NOI18N
        b4.setText("jLabel1");
        jPanel1.add(b4);
        b4.setBounds(2520, 0, 840, 472);

        b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/X5sky.jpg"))); // NOI18N
        b5.setText("jLabel2");
        jPanel1.add(b5);
        b5.setBounds(3360, 0, 840, 472);

        b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/X6purple.jpg"))); // NOI18N
        b6.setText("jLabel3");
        jPanel1.add(b6);
        b6.setBounds(4200, 0, 840, 472);

        b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/X7gray.jpg"))); // NOI18N
        b7.setText("jLabel4");
        jPanel1.add(b7);
        b7.setBounds(5040, 0, 840, 472);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 840, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentActionPerformed
        Form2 f2=new Form2();
        f2.setVisible(true);
    }//GEN-LAST:event_studentActionPerformed

    private void teacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherActionPerformed
        Form9 f9=new Form9();
        f9.setVisible(true);
    }//GEN-LAST:event_teacherActionPerformed

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        Form4 f4=new Form4();
        f4.setVisible(true);
    }//GEN-LAST:event_adminActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin;
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b2;
    private javax.swing.JLabel b3;
    private javax.swing.JLabel b4;
    private javax.swing.JLabel b5;
    private javax.swing.JLabel b6;
    private javax.swing.JLabel b7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton student;
    private javax.swing.JButton teacher;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
    public static void doLeft(AnimationClass AC,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,javax.swing.JLabel b1,javax.swing.JLabel b2,javax.swing.JLabel b3,javax.swing.JLabel b4,javax.swing.JLabel b5,javax.swing.JLabel b6,javax.swing.JLabel b7){
        AC.jLabelXLeft(i2, i1, 0, 1, b1);
        AC.jLabelXLeft(i3, i2, 0, 1, b2);
        AC.jLabelXLeft(i4, i3, 0, 1, b3);
        AC.jLabelXLeft(i5, i4, 0, 1, b4);
        AC.jLabelXLeft(i6, i5, 0, 1, b5);
        AC.jLabelXLeft(i7, i6, 0, 1, b6);
        AC.jLabelXLeft(i8, i7, 0, 1, b7);
                              
    } 
    
    public static void doRight(AnimationClass AC,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,javax.swing.JLabel b1,javax.swing.JLabel b2,javax.swing.JLabel b3,javax.swing.JLabel b4,javax.swing.JLabel b5,javax.swing.JLabel b6,javax.swing.JLabel b7){
        AC.jLabelXRight(i2, i1, 0, 1, b1);
        AC.jLabelXRight(i3, i2, 0, 1, b2);
        AC.jLabelXRight(i4, i3, 0, 1, b3);
        AC.jLabelXRight(i5, i4, 0, 1, b4);
        AC.jLabelXRight(i6, i5, 0, 1, b5);
        AC.jLabelXRight(i7, i6, 0, 1, b6);
        AC.jLabelXRight(i8, i7, 0, 1, b7);
                              
    } 

}
