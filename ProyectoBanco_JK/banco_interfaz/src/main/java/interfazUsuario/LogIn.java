/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfazUsuario;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Jesus Gabriel
 */
public class LogIn extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public LogIn() {
        initComponents();

        // creamos lo de el label registro clickeable
        lblCrearCuenta.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //abrimos los eventos de click en los label
                abrirRegistro();
            }
        });
        
        // creamos lo de label retiro sin cuenta clickeable
        lblRetiroSC.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //abrimos los eventos de click en los label
                abrirRetiroSinCuenta();
            }
        });
    }

    /**
     * Metodo para abrir Registro
     */
    private void abrirRegistro() {
        // Crear una nueva instancia del JFrame que deseas abrir
        Registro registro = new Registro();

        registro.setVisible(true);
        // Puedes cerrar el frame actual si es necesario
        this.dispose();
    }
    
    private void abrirRetiroSinCuenta() {
        // Crear una nueva instancia del JFrame que deseas abrir
        RetiroSinCuenta retiro = new RetiroSinCuenta();

        retiro.setVisible(true);
        // Puedes cerrar el frame actual si es necesario
        this.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Agrupador = new javax.swing.JPanel();
        lblRetiroSC = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblCrearCuenta = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Agrupador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRetiroSC.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblRetiroSC.setForeground(new java.awt.Color(255, 255, 255));
        lblRetiroSC.setText("Hacer retiro sin cuenta");
        Agrupador.add(lblRetiroSC, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("¿Desea retirar sin una cuenta?");
        Agrupador.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, -1, -1));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setForeground(new java.awt.Color(51, 51, 51));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        Agrupador.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 290, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Contraseña");
        Agrupador.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 150, 40));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        Agrupador.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 290, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Cliente");
        Agrupador.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 150, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bienvenido.");
        Agrupador.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 240, 60));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("¿Aun no tienes una cuenta?");
        Agrupador.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, -1));

        lblCrearCuenta.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblCrearCuenta.setForeground(new java.awt.Color(255, 255, 255));
        lblCrearCuenta.setText("Crear una cuenta");
        Agrupador.add(lblCrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, -1));

        btnIniciarSesion.setBackground(new java.awt.Color(204, 0, 51));
        btnIniciarSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIniciarSesion.setText("Iniciar Sesion");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        Agrupador.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 130, 50));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondonaranjarosa.jpg"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Agrupador.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Agrupador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Agrupador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        // TODO add your handling code here:

        this.dispose();

        Inicio inicio = new Inicio();

        inicio.setVisible(true);
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Agrupador;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblCrearCuenta;
    private javax.swing.JLabel lblRetiroSC;
    // End of variables declaration//GEN-END:variables
}
