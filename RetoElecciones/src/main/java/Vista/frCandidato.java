package Vista;

import Controlador.ctlCandidato;
import Controlador.ctlEleccion;
import clases.*;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

import javax.swing.JOptionPane;

/**
 *
 * @author TOSHIBA
 */
public class frCandidato extends javax.swing.JFrame {

    LinkedList<clsCandidato> listaCandidatos = new LinkedList<>(); //Estructura de datos temporal

    /**
     * Creates new form frElecciones
     */
    ctlCandidato ctlCandidato;
    ctlEleccion ctlEleccion;
    JFrame frMenu;

    public frCandidato(JFrame frMenu) {
        initComponents();
        this.ctlCandidato = new ctlCandidato(); // IMPORTANTE !!!!!!!!!!!!!!!!!
        this.ctlEleccion = new ctlEleccion();

        this.frMenu = frMenu;

        this.btnEliminarCandidato.setVisible(false);
        this.btnModCandidato.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtIdCandidato = new javax.swing.JTextField();
        cbGenero = new javax.swing.JComboBox<>();
        txtNombreCandidato = new javax.swing.JTextField();
        txtTelCandidato = new javax.swing.JTextField();
        txtPartidoPolitico = new javax.swing.JTextField();
        cbCiudadCandidato = new javax.swing.JComboBox<>();
        btnGuardarCandidato = new javax.swing.JButton();
        btnModCandidato = new javax.swing.JButton();
        btnBuscarCandidato = new javax.swing.JButton();
        btnEliminarCandidato = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtMensajeCamp = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtPropuestas = new javax.swing.JTextArea();
        menuPrincipalC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(630, 500));
        setResizable(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 2, 24)); // NOI18N
        jLabel3.setText("SISTEMA DE ELECCIONES");

        jLabel4.setText("Genero");

        jLabel5.setText("Numero de Documento");

        jLabel6.setText("Nombre");

        jLabel7.setText("Telefono");

        jLabel8.setText("Partido Politico");

        jLabel9.setText("Ciudad Origen");

        jLabel10.setText("Descripcion");

        jLabel11.setText("Mensaje Campaña");

        jLabel12.setText("Propuestas");

        cbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Otro" }));
        cbGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGeneroActionPerformed(evt);
            }
        });

        cbCiudadCandidato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BOGOTÁ", "MEDELLÍN", "CALI", "BARRANQUILLA", "CARTAGENA", "CÚCUTA", "SOLEDAD", "IBAGUÉ", "BUCARAMANGA", "SANTA MARTA", "VILLAVICENCIO", "SOACHA", "PEREIRA", "BELLO", "VALLEDUPAR", "MONTERÍA", "PASTO", "MANIZALES", "BUENAVENTURA", "NEIVA", "BARRANCABERMEJA", "PALMIRA", "ARMENIA", "POPAYÁN", "SINCELEJO", "ITAGUI", "FLORIDABLANCA", "RIOHACHA", "ENVIGADO", "TULUÁ", "DOSQUEBRADAS", "SAN ANDRÉS DE TUMACO", "TUNJA", "GIRÓN", "APARTADÓ", "FLORENCIA", "URIBIA", "IPIALES", "TURBO", "MAICAO", "PIEDECUESTA", "YOPAL", "OCAÑA", "FUSAGASUGÁ", "CARTAGO", "FACATATIVÁ", "CHÍA", "MAGANGUÉ", "PITALITO", "CAUCASIA", "ZIPAQUIRÁ", "MALAMBO", "RIONEGRO", "LORICA", "JAMUNDI", "QUIBDÓ", "GUADALAJARA DE BUGA", "YUMBO", "SOGAMOSO", "DUITAMA", "GIRARDOT", "CIÉNAGA" }));

        btnGuardarCandidato.setText("GUARDAR");
        btnGuardarCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCandidatoActionPerformed(evt);
            }
        });

        btnModCandidato.setText("MODIFICAR");
        btnModCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModCandidatoActionPerformed(evt);
            }
        });

        btnBuscarCandidato.setText("BUSCAR");
        btnBuscarCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCandidatoActionPerformed(evt);
            }
        });

        btnEliminarCandidato.setText("ELIMINAR");
        btnEliminarCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCandidatoActionPerformed(evt);
            }
        });

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane3.setViewportView(txtDescripcion);

        txtMensajeCamp.setColumns(20);
        txtMensajeCamp.setRows(5);
        jScrollPane4.setViewportView(txtMensajeCamp);

        txtPropuestas.setColumns(20);
        txtPropuestas.setRows(5);
        jScrollPane5.setViewportView(txtPropuestas);

        menuPrincipalC.setText("Menu Principal");
        menuPrincipalC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPrincipalCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnGuardarCandidato)
                        .addGap(59, 59, 59)
                        .addComponent(btnModCandidato)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarCandidato)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(menuPrincipalC)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBuscarCandidato)
                        .addGap(57, 57, 57))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIdCandidato, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(txtTelCandidato))
                .addGap(37, 37, 37))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4)
                        .addComponent(jLabel6)
                        .addComponent(jLabel8)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11)
                        .addComponent(jLabel12))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtNombreCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtPartidoPolitico, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbCiudadCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane3)
                        .addComponent(jScrollPane4)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(menuPrincipalC)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtIdCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTelCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 249, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarCandidato)
                    .addComponent(btnBuscarCandidato)
                    .addComponent(btnModCandidato)
                    .addComponent(btnEliminarCandidato))
                .addGap(65, 65, 65))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtNombreCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)
                        .addComponent(txtPartidoPolitico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbCiudadCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(5, 5, 5)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12))
                    .addGap(123, 123, 123)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCandidatoActionPerformed
        try {
            String id = txtIdCandidato.getText();
            boolean respuesta = this.ctlEleccion.eliminarCandidato(id);
            if (!respuesta) {
                JOptionPane.showMessageDialog(this, "Registro NO eliminado");
            } else {
                JOptionPane.showMessageDialog(this, "Registro eliminado con exito");
                eliminarCamposCandidato();
                this.btnGuardarCandidato.setEnabled(true);
                this.txtIdCandidato.setEnabled(true);
                this.btnModCandidato.setVisible(false);
                this.btnEliminarCandidato.setVisible(false);

            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnEliminarCandidatoActionPerformed

    private void btnBuscarCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCandidatoActionPerformed

        String id = txtIdCandidato.getText();
        clsCandidato candidato = (clsCandidato) ctlEleccion.buscarCandidato(id);

        if (candidato == null) {
            JOptionPane.showMessageDialog(this, "Documento no encontrado");
        } else {
            cbGenero.setSelectedItem(candidato.getGenero());
            txtNombreCandidato.setText(candidato.getNombre());
            txtTelCandidato.setText(candidato.getTelefono());
            txtPartidoPolitico.setText(candidato.getPartidoPolitico());
            cbCiudadCandidato.setSelectedItem(candidato.getCiudadOrigen());
            txtDescripcion.setText(candidato.getDescripcion());
            txtMensajeCamp.setText(candidato.getMjsCampaña());
            txtPropuestas.setText(candidato.getPropuesta());
            this.btnModCandidato.setVisible(true);
            this.btnEliminarCandidato.setVisible(true);

            this.btnGuardarCandidato.setEnabled(false);
            this.txtIdCandidato.setEnabled(false);
            JOptionPane.showMessageDialog(rootPane, "Si desea modificar sus datos,\n" + ""
                    + "corrijalos y de click en el boton 'Modificar'\n\n"
                    + "Dar click en 'Eliminar' si desea eliminar su registro");
        }


    }//GEN-LAST:event_btnBuscarCandidatoActionPerformed

    private void btnModCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModCandidatoActionPerformed

        String nombre = txtNombreCandidato.getText();
        String telefono = txtTelCandidato.getText();
        String partidoPol = txtPartidoPolitico.getText();
        String ciudad = cbCiudadCandidato.getSelectedItem().toString();
        String descripcion = txtDescripcion.getText();
        String mjsCampania = txtMensajeCamp.getText();
        String propuestas = txtPropuestas.getText();
        String genero = cbGenero.getSelectedItem().toString();

        try {
            String id = txtIdCandidato.getText();
            clsCandidato candidato = new clsCandidato(partidoPol, ciudad, descripcion,
                    mjsCampania, propuestas, id, nombre, telefono, genero);
            boolean respuesta = this.ctlEleccion.modificarCandidato(candidato);
            if (!respuesta) {
                JOptionPane.showMessageDialog(this, "Error en la modificacion de la informacion");
            } else {
                JOptionPane.showMessageDialog(this, "Informacion modificada con exito");
                eliminarCamposCandidato();
                this.btnGuardarCandidato.setEnabled(true);
                this.txtIdCandidato.setEnabled(true);
                this.btnModCandidato.setVisible(false);
                this.btnEliminarCandidato.setVisible(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Buscar registro valido para la modificación");
        }
    }//GEN-LAST:event_btnModCandidatoActionPerformed

    private void btnGuardarCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCandidatoActionPerformed
        //JOptionPane.showMessageDialog(this, "Esto es una prueba");
        //JComboBox<String> tipoId = cbIdCandidato;

        try {
            //colocar el genero en vez del tipo de documento
            String genero = cbGenero.getSelectedItem().toString();
            String id = txtIdCandidato.getText();
            String nombre = txtNombreCandidato.getText();
            String telefono = txtTelCandidato.getText();
            String partidoPol = txtPartidoPolitico.getText();
            String ciudad = cbCiudadCandidato.getSelectedItem().toString();
            String descripcion = txtDescripcion.getText();
            String mjsCampania = txtMensajeCamp.getText();
            String propuestas = txtPropuestas.getText();

            if (id.equals("") || nombre.equals("") || telefono.equals("") || partidoPol.equals("") || ciudad.equals("") || descripcion.equals("") || mjsCampania.equals("") || propuestas.equals("")) {
                JOptionPane.showMessageDialog(this, "Por favor llene todos los campos");
            } else {
                clsCandidato candidato = new clsCandidato(partidoPol, ciudad, descripcion, mjsCampania, propuestas, id, nombre, telefono, genero);
                //mdlCandidato.CrearCandidato(candidato);
                //this.ctlCandidato.crearCandidato(candidato);
                this.ctlEleccion.crearCandidato(candidato);
                //listaCandidatos.add(candidato);
                //this.FillJList();
                JOptionPane.showMessageDialog(this, "La información ha sido almacenada!");
                eliminarCamposCandidato();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Agregue los datos correctos");
            JOptionPane.showMessageDialog(this, "El error es: " + e.getLocalizedMessage());
        }
    }//GEN-LAST:event_btnGuardarCandidatoActionPerformed

    private void cbGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGeneroActionPerformed

    private void menuPrincipalCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPrincipalCActionPerformed
        this.setVisible(false);
        this.frMenu.setVisible(true);
    }//GEN-LAST:event_menuPrincipalCActionPerformed

    private void eliminarCamposCandidato() {
        cbGenero.setSelectedIndex(0);
        txtIdCandidato.setText("");
        txtNombreCandidato.setText("");
        txtTelCandidato.setText("");
        txtPartidoPolitico.setText("");
        cbCiudadCandidato.setSelectedIndex(0);
        txtDescripcion.setText("");
        txtMensajeCamp.setText("");
        txtPropuestas.setText("");
    }

    private void FillJList() { //donde se almacenara la informacion por el momento

        DefaultListModel model = new DefaultListModel();
        int indice = 0;
        for (clsCandidato candidato : listaCandidatos) {
            String data = candidato.getIdDocumento() + " - " + candidato.getCiudadOrigen() + " - " + candidato.getIdDocumento();
            model.add(indice, data);
            indice++;
        }
        //listaCand.setModel(model);

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
            java.util.logging.Logger.getLogger(frCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frCandidato(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCandidato;
    private javax.swing.JButton btnEliminarCandidato;
    private javax.swing.JButton btnGuardarCandidato;
    private javax.swing.JButton btnModCandidato;
    private javax.swing.JComboBox<String> cbCiudadCandidato;
    private javax.swing.JComboBox<String> cbGenero;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton menuPrincipalC;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtIdCandidato;
    private javax.swing.JTextArea txtMensajeCamp;
    private javax.swing.JTextField txtNombreCandidato;
    private javax.swing.JTextField txtPartidoPolitico;
    private javax.swing.JTextArea txtPropuestas;
    private javax.swing.JTextField txtTelCandidato;
    // End of variables declaration//GEN-END:variables
}