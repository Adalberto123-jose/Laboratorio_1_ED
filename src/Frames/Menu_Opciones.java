/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author ADALBERTO
 */
public class Menu_Opciones extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Opciones
     */
    public Menu_Opciones() {
        initComponents();

        BtFacil.setPressedIcon(setIconoPresionado("/imagenes/EasyDifficulty.png", BtFacil, 10, 10));
        BtDificil.setPressedIcon(setIconoPresionado("/imagenes/HardDifficulty.png", BtDificil, 10, 10));
        BtMedio.setPressedIcon(setIconoPresionado("/imagenes/NormalDifficulty.png", BtMedio, 10, 10));
        BtRegresar.setPressedIcon(setIconoPresionado("/imagenes/GoBackButton.png", BtRegresar, 10, 10));

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
        BtFacil = new javax.swing.JButton();
        BtMedio = new javax.swing.JButton();
        BtDificil = new javax.swing.JButton();
        BtRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtFacil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EasyDifficulty.png"))); // NOI18N
        BtFacil.setBorderPainted(false);
        BtFacil.setContentAreaFilled(false);
        BtFacil.setFocusPainted(false);
        jPanel1.add(BtFacil, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 270, 100));

        BtMedio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NormalDifficulty.png"))); // NOI18N
        BtMedio.setToolTipText("");
        BtMedio.setBorderPainted(false);
        BtMedio.setContentAreaFilled(false);
        BtMedio.setFocusable(false);
        jPanel1.add(BtMedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 260, 100));

        BtDificil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/HardDifficulty.png"))); // NOI18N
        BtDificil.setBorderPainted(false);
        BtDificil.setContentAreaFilled(false);
        BtDificil.setFocusable(false);
        jPanel1.add(BtDificil, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 260, 110));

        BtRegresar.setBackground(new java.awt.Color(102, 146, 52));
        BtRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GoBackButton.png"))); // NOI18N
        BtRegresar.setBorderPainted(false);
        BtRegresar.setContentAreaFilled(false);
        BtRegresar.setDefaultCapable(false);
        BtRegresar.setFocusPainted(false);
        BtRegresar.setFocusable(false);
        BtRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(BtRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/JungleMenuDificultad.gif"))); // NOI18N
        jLabel1.setFocusable(false);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtRegresarActionPerformed
        this.setVisible(false);
        Inicio in = new Inicio();

        in.setVisible(true);
    }//GEN-LAST:event_BtRegresarActionPerformed
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
            java.util.logging.Logger.getLogger(Menu_Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Opciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtDificil;
    private javax.swing.JButton BtFacil;
    private javax.swing.JButton BtMedio;
    private javax.swing.JButton BtRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
