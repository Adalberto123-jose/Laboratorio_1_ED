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
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        // Añadir la imagen en el boton y ajustar su tamaño
        
//        Boton_Play.setIcon(setIcono("/imagenes/pngwing.com.png", Boton_Play));
//        Boton_Play.setPressedIcon(setIconoPresionado("/imagenes/Play.png", Boton_Play, 10, 10));

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
        BtSalir = new javax.swing.JButton();
        Boton_Play = new javax.swing.JButton();
        BtInformation = new javax.swing.JButton();
        BtOpciones = new javax.swing.JButton();
        BtMusica = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Imagen_Inicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtSalir.setText("Salir");
        BtSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalirActionPerformed(evt);
            }
        });
        jPanel1.add(BtSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, -1, -1));

        Boton_Play.setBackground(new java.awt.Color(102, 102, 102));
        Boton_Play.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Play.setText("PLAY");
        Boton_Play.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Boton_Play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_PlayActionPerformed(evt);
            }
        });
        jPanel1.add(Boton_Play, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 140, 30));

        BtInformation.setText("Information");
        BtInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtInformationActionPerformed(evt);
            }
        });
        jPanel1.add(BtInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, -1, -1));

        BtOpciones.setText("Opciones");
        BtOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtOpcionesActionPerformed(evt);
            }
        });
        jPanel1.add(BtOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, -1, -1));

        BtMusica.setText("Musica");
        BtMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtMusicaActionPerformed(evt);
            }
        });
        jPanel1.add(BtMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, -1, -1));

        jLabel1.setFont(new java.awt.Font("Snap ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Aventura en el Bosque Misterioso");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 800, 60));

        Imagen_Inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Inicio Imagen.jpg"))); // NOI18N
        jPanel1.add(Imagen_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1110, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_PlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_PlayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton_PlayActionPerformed

    private void BtInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtInformationActionPerformed
       this.setVisible(false);
       Information inf = new Information();
       
       inf.setVisible(true);
    }//GEN-LAST:event_BtInformationActionPerformed

    private void BtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalirActionPerformed
        System.exit(WIDTH);
       
    }//GEN-LAST:event_BtSalirActionPerformed

    private void BtOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtOpcionesActionPerformed
        this.setVisible(false);
        Menu_Opciones op = new Menu_Opciones();
        
        op.setVisible(true);
    }//GEN-LAST:event_BtOpcionesActionPerformed

    private void BtMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtMusicaActionPerformed
        this.setVisible(false);
        Musica_Op mu = new Musica_Op();
        
        mu.setVisible(true);
        
    }//GEN-LAST:event_BtMusicaActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
     // Ajusatar la imagen en el boton 
    
//    public Icon setIcono(String url, JButton boton) {
//        ImageIcon icon = new ImageIcon(getClass().getResource(url));
//
//        int ancho = boton.getWidth();
//
//        int alto = boton.getHeight();
//
//        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
//
//        return icono;
//    }
    
    // Pequeña animacion al dar click en el boton 
    
//    public Icon setIconoPresionado(String url, JButton boton, int ancho, int altura) {
//        ImageIcon icon = new ImageIcon(getClass().getResource(url));
//        int width = boton.getWidth() - ancho;
//        int height = boton.getHeight() - altura;
//
//        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
//
//        return icono;
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Play;
    private javax.swing.JButton BtInformation;
    private javax.swing.JButton BtMusica;
    private javax.swing.JButton BtOpciones;
    private javax.swing.JButton BtSalir;
    private javax.swing.JLabel Imagen_Inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
