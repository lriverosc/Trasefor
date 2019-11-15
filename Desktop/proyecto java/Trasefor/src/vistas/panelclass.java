
package vistas;

import java.sql.Connection;
import javax.swing.JOptionPane;


public class panelclass extends javax.swing.JFrame {

   
    public panelclass() {
        initComponents();
         this.setLocationRelativeTo(null);//Este codigo centra el formulario en la pantalla
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        contenedor = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnMenuArchivo = new javax.swing.JMenu();
        btnmenuconectar = new javax.swing.JMenuItem();
        btnmenusalir = new javax.swing.JMenuItem();
        btnMenuEditar = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        btnmenuagregar = new javax.swing.JMenuItem();
        btnmenueditar = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        btnmenuadmin = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMenuArchivo.setText("Archivo");

        btnmenuconectar.setText("Conectar BD");
        btnmenuconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuconectarActionPerformed(evt);
            }
        });
        btnMenuArchivo.add(btnmenuconectar);

        btnmenusalir.setText("Salir");
        btnmenusalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenusalirActionPerformed(evt);
            }
        });
        btnMenuArchivo.add(btnmenusalir);

        jMenuBar1.add(btnMenuArchivo);

        jMenuItem2.setLabel("Editar clientes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        btnMenuEditar.add(jMenuItem2);

        jMenuBar1.add(btnMenuEditar);

        jMenu1.setText("Clientes");

        btnmenuagregar.setText("Agregar clientes");
        btnmenuagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuagregarActionPerformed(evt);
            }
        });
        jMenu1.add(btnmenuagregar);

        btnmenueditar.setText("Editar clientes");
        btnmenueditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenueditarActionPerformed(evt);
            }
        });
        jMenu1.add(btnmenueditar);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Admin");

        btnmenuadmin.setText("Clientes Admin");
        btnmenuadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuadminActionPerformed(evt);
            }
        });
        jMenu4.add(btnmenuadmin);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmenuconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuconectarActionPerformed

    conectar cc= new conectar();
    Connection cn = cc.conexion();
    if(cn==null)
    {   
        JOptionPane.showMessageDialog(null, "No conectado");
    }
    else
    {
        JOptionPane.showMessageDialog(null, "Conexion Establecida...");
    }
                     
    }//GEN-LAST:event_btnmenuconectarActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnmenuagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuagregarActionPerformed
        clientesagregarclass h = new  clientesagregarclass();
      contenedor.add(h); //se añade h al contenedor desktoppane
      h.setVisible(true);
    }//GEN-LAST:event_btnmenuagregarActionPerformed

    private void btnmenueditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenueditarActionPerformed
        clienteseditarclass h = new  clienteseditarclass();
      contenedor.add(h); //se añade h al contenedor desktoppane
      h.setVisible(true);
    }//GEN-LAST:event_btnmenueditarActionPerformed

    private void btnmenuadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuadminActionPerformed
         clientesadminclass h = new  clientesadminclass();
      contenedor.add(h); //se añade h al contenedor desktoppane
      h.setVisible(true);
    }//GEN-LAST:event_btnmenuadminActionPerformed

    private void btnmenusalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenusalirActionPerformed
        int resp=JOptionPane.showConfirmDialog(null,"Estas seguro?");
      if (JOptionPane.OK_OPTION == resp)
          JOptionPane.showMessageDialog(null,"Gracias por usar mi programa");
          System.exit (0);
       
 
       if (JOptionPane.CANCEL_OPTION == resp){
           
       }
       
       if (JOptionPane.NO_OPTION== resp){
           JOptionPane.showMessageDialog(null,"Le diste al boton no");
       }
       
    }//GEN-LAST:event_btnmenusalirActionPerformed

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
            java.util.logging.Logger.getLogger(panelclass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panelclass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panelclass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panelclass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new panelclass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnMenuArchivo;
    private javax.swing.JMenu btnMenuEditar;
    private javax.swing.JMenuItem btnmenuadmin;
    private javax.swing.JMenuItem btnmenuagregar;
    private javax.swing.JMenuItem btnmenuconectar;
    private javax.swing.JMenuItem btnmenueditar;
    private javax.swing.JMenuItem btnmenusalir;
    private javax.swing.JDesktopPane contenedor;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
