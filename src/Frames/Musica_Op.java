/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import java.applet.AudioClip;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author ADALBERTO
 */
public class Musica_Op extends javax.swing.JFrame {

    /**
     * Creates new form Musica_Op
     */
    public Musica_Op() {
        initComponents();
        BtSi.setPressedIcon(setIconoPresionado("/imagenes/GreenButton_1.png", BtSi, 10, 10));
        BtNo.setPressedIcon(setIconoPresionado("/imagenes/RedButton2.png", BtNo, 10, 10));
        BtRegresar.setPressedIcon(setIconoPresionado("/imagenes/GoBackButton.png", BtRegresar, 10, 10));
    }
    AudioClip music;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtSi = new javax.swing.JButton();
        BtNo = new javax.swing.JButton();
        BtRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtSi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GreenButton_1.png"))); // NOI18N
        BtSi.setBorderPainted(false);
        BtSi.setContentAreaFilled(false);
        BtSi.setFocusable(false);
        BtSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSiActionPerformed(evt);
            }
        });
        jPanel1.add(BtSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, -1));

        BtNo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RedButton2.png"))); // NOI18N
        BtNo.setBorderPainted(false);
        BtNo.setContentAreaFilled(false);
        BtNo.setFocusPainted(false);
        BtNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtNoActionPerformed(evt);
            }
        });
        jPanel1.add(BtNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, 190, 70));

        BtRegresar.setBackground(new java.awt.Color(102, 146, 52));
        BtRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GoBackButton.png"))); // NOI18N
        BtRegresar.setBorderPainted(false);
        BtRegresar.setContentAreaFilled(false);
        BtRegresar.setFocusPainted(false);
        BtRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(BtRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/JungleMenuMusica.gif"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1AncestorAdded

    private void BtNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtNoActionPerformed
        if (music != null) {
            music.stop();
        }
    }//GEN-LAST:event_BtNoActionPerformed

    private void BtRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtRegresarActionPerformed
        this.setVisible(false);
        Inicio in = new Inicio();

        in.setVisible(true);
    }//GEN-LAST:event_BtRegresarActionPerformed

    private void BtSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSiActionPerformed

        music = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Music2.wav"));
        music.play();
    }//GEN-LAST:event_BtSiActionPerformed
    public Icon setIconoPresionado(String url, JButton boton, int ancho, int altura) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int width = boton.getWidth() - ancho;
        int height = boton.getHeight() - altura;

        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));

        return icono;
    }

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
            java.util.logging.Logger.getLogger(Musica_Op.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Musica_Op.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Musica_Op.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Musica_Op.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Musica_Op().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtNo;
    private javax.swing.JButton BtRegresar;
    private javax.swing.JButton BtSi;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
