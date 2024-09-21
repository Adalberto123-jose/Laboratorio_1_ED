/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import javax.swing.JOptionPane;
import laboratorio_1_ed.Juego;
import laboratorio_1_ed.Nodo;


/**
 *
 * @author HP
 */
public class NivelGO extends javax.swing.JFrame {

    private Juego juego;

    /**
     * Creates new form NivelGO
     */
    public NivelGO() {
        initComponents();
        juego = new Juego();
        juego.setDificultad("facil");
        actualizarEscenario();
        

    }

//    private void iniciarJuego() {
//        juego.iniciar();
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtRegresar = new javax.swing.JButton();
        BtIzquierda = new javax.swing.JButton();
        BtDerecha = new javax.swing.JButton();
        BtIrAlArbol = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GoBackButton.png"))); // NOI18N
        BtRegresar.setBorderPainted(false);
        BtRegresar.setContentAreaFilled(false);
        BtRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(BtRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        BtIzquierda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LetreroIzquierda.png"))); // NOI18N
        BtIzquierda.setBorderPainted(false);
        BtIzquierda.setContentAreaFilled(false);
        BtIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtIzquierdaActionPerformed(evt);
            }
        });
        jPanel1.add(BtIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        BtDerecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LetreroDerecha.png"))); // NOI18N
        BtDerecha.setBorderPainted(false);
        BtDerecha.setContentAreaFilled(false);
        BtDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtDerechaActionPerformed(evt);
            }
        });
        jPanel1.add(BtDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, -1, -1));

        BtIrAlArbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IrAlArbol.png"))); // NOI18N
        BtIrAlArbol.setBorderPainted(false);
        BtIrAlArbol.setContentAreaFilled(false);
        BtIrAlArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtIrAlArbolActionPerformed(evt);
            }
        });
        jPanel1.add(BtIrAlArbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/WateryForest.gif"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void actualizarEscenario() {
        if (juego.esHojaDeLlegada()) {
            JOptionPane.showMessageDialog(this, "¡Felicidades! Has llegado a la Torre del Hechicero.");
            mostrarResultados();
        } else {
            String escenario = juego.getNodoActualEscenario();
            String acertijo = juego.getNodoActualEnigma();
            
            System.out.println("Se ejecuta el de nivelGO"); //Debug
            JOptionPane.showMessageDialog(this, "Estás en: " + escenario + "\nAcertijo: " + acertijo);

            // Llama a la función para solicitar respuesta
            solicitarRespuesta();
        }
    }

    private void mostrarResultados() {
        // Si no es la hoja de llegada, mostrar el lugar donde está
        if (!juego.esHojaDeLlegada()) {
            Nodo hojaDeLlegada = juego.buscarHojaDeLlegada();
            JOptionPane.showMessageDialog(this, "No has llegado a la Torre del Hechicero.\nLa Torre del Hechicero está en: " + hojaDeLlegada.escenario);
        } else {
            JOptionPane.showMessageDialog(this, "Fin del juego.");
        }
    }

    private void solicitarRespuesta() {
        String respuesta = JOptionPane.showInputDialog(this, "Tu respuesta:");

        // Verificar si el usuario canceló (respuesta == null)
        if (respuesta == null) {
            // El usuario canceló, cerrar el juego
            JOptionPane.showMessageDialog(this, "Has cancelado el juego.");

            Menu_Bienvenido menu = new Menu_Bienvenido();
            menu.setVisible(true);
            
            this.dispose();  // Cierra la ventana actual (NivelGO)
            return;  // Terminar el método para no continuar el flujo
        }

        // Verificamos la respuesta
        if (juego.verificarRespuesta(respuesta)) {
            JOptionPane.showMessageDialog(this, "¡Respuesta correcta!");
            // Ahora el jugador puede moverse
        } else {
            JOptionPane.showMessageDialog(this, "Respuesta incorrecta. Generando otro acertijo.");
            // Generar un nuevo acertijo en el mismo nodo
            juego.generarNuevoAcertijo();
            actualizarEscenario();  // Volvemos a mostrar el escenario con el nuevo acertijo
        }
    }

    private void BtRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtRegresarActionPerformed
        this.setVisible(false);
        Menu_Bienvenido bn = new Menu_Bienvenido();

        bn.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_BtRegresarActionPerformed

    private void BtIrAlArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtIrAlArbolActionPerformed
        this.setVisible(false);

        ArbolFrame af = new ArbolFrame();
        af.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_BtIrAlArbolActionPerformed

    private void BtIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtIzquierdaActionPerformed
        boolean seMovio = juego.moverIzquierda();
        if (seMovio) {
            actualizarEscenario(); // Si se movió, actualizamos el escenario
        } else {
            JOptionPane.showMessageDialog(this, "No hay camino a la izquierda.");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_BtIzquierdaActionPerformed

    private void BtDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtDerechaActionPerformed
        boolean seMovio = juego.moverDerecha();
        if (seMovio) {
            actualizarEscenario(); // Si se movió, actualizamos el escenario
        } else {
            JOptionPane.showMessageDialog(this, "No hay camino a la derecha.");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_BtDerechaActionPerformed

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
            java.util.logging.Logger.getLogger(NivelGO.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NivelGO.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NivelGO.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NivelGO.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NivelGO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtDerecha;
    private javax.swing.JButton BtIrAlArbol;
    private javax.swing.JButton BtIzquierda;
    private javax.swing.JButton BtRegresar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
