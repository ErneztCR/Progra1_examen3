
package ErnestoVargasExamen3;

/**
 *
 * @author ervargas
 */
public class FrmReporte extends javax.swing.JFrame {

    /**
     * Creates new form FrmReporte
     */
    public FrmReporte() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lcantidad = new javax.swing.JLabel();
        lActivo = new javax.swing.JLabel();
        lInactivo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tcodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bbuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lpromedio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(650, 440));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("REPORTES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(260, 0, 100, 40);

        jLabel2.setText("Codigos Inactivos");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 100, 110, 50);

        jLabel3.setText("Codigos Activos");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 100, 100, 50);

        jLabel4.setText("Cantidad de Articulos");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(420, 110, 130, 30);

        lcantidad.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lcantidad.setForeground(new java.awt.Color(0, 102, 255));
        lcantidad.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(lcantidad);
        lcantidad.setBounds(560, 110, 60, 30);

        lActivo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lActivo.setForeground(new java.awt.Color(0, 102, 255));
        lActivo.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(lActivo);
        lActivo.setBounds(120, 110, 60, 30);

        lInactivo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lInactivo.setForeground(new java.awt.Color(0, 102, 255));
        lInactivo.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(lInactivo);
        lInactivo.setBounds(340, 110, 60, 30);

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 390, 110, 30);
        getContentPane().add(tcodigo);
        tcodigo.setBounds(170, 50, 130, 24);

        jLabel5.setText("Buscar por Codigo");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 40, 120, 40);

        bbuscar.setText("Buscar");
        bbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(bbuscar);
        bbuscar.setBounds(420, 50, 140, 24);

        jLabel6.setText("Promedio dinero");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 170, 110, 60);

        lpromedio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lpromedio);
        lpromedio.setBounds(140, 180, 70, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        this.hide();

    }// GEN-LAST:event_jButton1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowActivated

        lActivo.setText(String.valueOf(ClsEncuesta.getActivo()));
        lInactivo.setText(String.valueOf(ClsEncuesta.getInactivo()));
        lcantidad.setText(String.valueOf(ClsEncuesta.getTotalCantidad()));

    }// GEN-LAST:event_formWindowActivated

    private void bbuscarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bbuscarActionPerformed
        ClsEncuesta.BuscarPorcodigo(tcodigo.getText());

    }// GEN-LAST:event_bbuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmReporte.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmReporte.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmReporte.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmReporte.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmReporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lActivo;
    private javax.swing.JLabel lInactivo;
    private javax.swing.JLabel lcantidad;
    private javax.swing.JLabel lpromedio;
    private javax.swing.JTextField tcodigo;
    // End of variables declaration//GEN-END:variables
}
