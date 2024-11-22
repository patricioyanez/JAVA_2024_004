/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Validaciones.Validacion;
import controlador.ControladorCategoria;
import controlador.ControladorMarca;
import controlador.ControladorProducto;
import javax.swing.JOptionPane;
import modelo.Categoria;
import modelo.Marca;
import modelo.Producto;

/**
 *
 * @author patri
 */
public class FrmProducto extends javax.swing.JFrame {

    /**
     * Creates new form FrmProducto
     */
    public FrmProducto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        txtId = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        txtPrecioCosto = new javax.swing.JTextField();
        txtPrecioVenta = new javax.swing.JTextField();
        cmbMarca = new javax.swing.JComboBox<>();
        cmbCategoria = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Productos");

        jLabel2.setText("Marca");

        jLabel3.setText("Categoria");

        jLabel4.setText("Codigo");

        jLabel5.setText("Descripción");

        jLabel6.setText("Stock");

        jLabel7.setText("Precio Costo");

        jLabel8.setText("Precio Venta");

        jLabel9.setText("id");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        btnBuscar.setBackground(new java.awt.Color(51, 255, 51));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 255, 102));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnListar.setBackground(new java.awt.Color(0, 102, 0));
        btnListar.setForeground(new java.awt.Color(255, 255, 255));
        btnListar.setText("Listar");

        btnGrabar.setBackground(new java.awt.Color(255, 0, 0));
        btnGrabar.setForeground(new java.awt.Color(255, 255, 255));
        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPrecioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnListar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cmbMarca, 0, 151, Short.MAX_VALUE)
                                    .addComponent(txtCodigo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnLimpiar))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGrabar)))))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGrabar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListar))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        cmbMarca.setModel(new ControladorMarca().llenarComboBox());
        cmbCategoria.setModel(new ControladorCategoria().llenarComboBox());
        
    }//GEN-LAST:event_formWindowOpened

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtId.setText("");
        
        cmbMarca.setSelectedIndex(0);
        cmbCategoria.setSelectedIndex(0);
        
        txtCodigo.setText("");
        txtDescripcion.setText("");
        txtStock.setText("");
        txtPrecioCosto.setText("");
        txtPrecioVenta.setText("");
        txtId.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        if(txtId.getText().trim().length() < 1)
        {
            JOptionPane.showMessageDialog(this, "No especificó id a buscar");
            txtId.requestFocus();
        }
        else if(!Validaciones.Validacion.soloNumero(txtId.getText()))
        {
            JOptionPane.showMessageDialog(this, "El id debe contener solo números");
            txtId.requestFocus();
        }
        else
        {
            int id = Integer.parseInt(txtId.getText());
            ControladorProducto cp = new ControladorProducto();
            Producto producto = cp.buscarPorId(id);
            
            if(producto == null)
            {
                JOptionPane.showMessageDialog(this, "Id no encontrado");
            }
            else
            {
                this.seleccionarPorId(cmbMarca, producto.getIdMarca());
                this.seleccionarPorId(cmbCategoria, producto.getIdCategoria());
                txtCodigo.setText("" + producto.getCodigo());
                txtDescripcion.setText(producto.getDescripcion());
                txtStock.setText("" + producto.getStock());
                txtPrecioCosto.setText("" + producto.getPrecioCosto());
                txtPrecioVenta.setText("" + producto.getPrecioVenta());
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if(txtId.getText().trim().length() < 1)
        {
            JOptionPane.showMessageDialog(this, "No especificó id a buscar");
            txtId.requestFocus();
        }
        else if(!Validaciones.Validacion.soloNumero(txtId.getText()))
        {
            JOptionPane.showMessageDialog(this, "El id debe contener solo números");
            txtId.requestFocus();
        }
        else
        {
            int id = Integer.parseInt(txtId.getText());
            ControladorProducto cp = new ControladorProducto();
            
            boolean respuesta = cp.eliminar(id);
            
            
            if(respuesta)
            {
                JOptionPane.showMessageDialog(this, "Id fue eliminado.");
                btnLimpiarActionPerformed(null);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Id no fue encontrado.");
                txtId.requestFocus();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        // TODO add your handling code here:
        
        // validar
        if(cmbMarca.getSelectedIndex() == 0)
        {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una marca.");
            cmbMarca.requestFocus();
        }
        else if(cmbCategoria.getSelectedIndex() == 0)
        {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una categoria.");
            cmbCategoria.requestFocus();
        }
        else if(txtCodigo.getText().trim().length() < 1)
        {
            JOptionPane.showMessageDialog(this, "Debe especificar Codigo.");
            txtCodigo.requestFocus();
        }
        else if(!Validacion.soloNumero(txtCodigo.getText()))
        {
            JOptionPane.showMessageDialog(this, "Debe ingresar solo numeros");
            txtCodigo.requestFocus();
        }
        else if(txtDescripcion.getText().trim().length() < 1)
        {
            JOptionPane.showMessageDialog(this, "Debe especificar Descripción.");
            txtDescripcion.requestFocus();
        }        
        else if(!Validacion.soloLetras(txtDescripcion.getText()))
        {
            JOptionPane.showMessageDialog(this, "Debe ingresar solo letras");
            txtDescripcion.requestFocus();
        }
        else if(txtStock.getText().trim().length() < 1)
        {
            JOptionPane.showMessageDialog(this, "Debe especificar el stock.");
            txtStock.requestFocus();
        }
        else if(!Validacion.soloNumero(txtStock.getText()))
        {
            JOptionPane.showMessageDialog(this, "Debe ingresar solo numeros");
            txtStock.requestFocus();
        }
        else if(txtPrecioCosto.getText().trim().length() < 1)
        {
            JOptionPane.showMessageDialog(this, "Debe especificar el Precio Costo.");
            txtStock.requestFocus();
        }
        else if(!Validacion.soloNumero(txtPrecioCosto.getText()))
        {
            JOptionPane.showMessageDialog(this, "Debe ingresar solo numeros");
            txtPrecioCosto.requestFocus();
        }
        else if(txtPrecioVenta.getText().trim().length() < 1)
        {
            JOptionPane.showMessageDialog(this, "Debe especificar el Precio Venta.");
            txtPrecioVenta.requestFocus();
        }
        else if(!Validacion.soloNumero(txtPrecioVenta.getText()))
        {
            JOptionPane.showMessageDialog(this, "Debe ingresar solo numeros");
            txtPrecioVenta.requestFocus();
        }
        else if(Integer.parseInt(txtPrecioVenta.getText()) < Integer.parseInt(txtPrecioCosto.getText()))
        {
            JOptionPane.showMessageDialog(this, "El precio de venta no puede ser menor al de costo");
            txtPrecioVenta.requestFocus();
        }
        else
        {
            // crear un objeto modelo, 
            
            Producto producto = new Producto();
            // traspasar los datos del form al objeto
            int numero = Integer.parseInt("0" + txtId.getText());            
            producto.setId(numero);
            
            Marca marca = (Marca)cmbMarca.getSelectedItem();
            producto.setIdMarca(marca.getId());
            
            Categoria categoria = (Categoria)cmbCategoria.getSelectedItem();
            producto.setIdCategoria(categoria.getId());
            
            numero = Integer.parseInt("0" + txtCodigo.getText());
            producto.setCodigo(numero);
            
            producto.setDescripcion(txtDescripcion.getText());
            
            numero = Integer.parseInt("0" + txtStock.getText());
            producto.setStock(numero);
            numero = Integer.parseInt("0" + txtPrecioCosto.getText());
            producto.setPrecioCosto(numero);
            numero = Integer.parseInt("0" + txtPrecioVenta.getText());
            producto.setPrecioVenta(numero);
            
            // instanciar al controlador
            ControladorProducto controlador = new ControladorProducto();
            // entregar el modelo al controlador y esperar respuesta.
            boolean resultado = false;
            if(producto.getId() <= 0)
                resultado = controlador.agregar(producto);
            else
                resultado = controlador.actualizar(producto);
            
            if(resultado)
            {
                JOptionPane.showMessageDialog(this, "Los datos fueron guardados");
                //btnListarActionPerformed(null);
                btnLimpiarActionPerformed(null);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Los datos NO fueron guardados");
            }
        }
        
        
    }//GEN-LAST:event_btnGrabarActionPerformed

    public void seleccionarPorId(javax.swing.JComboBox<?> comboBox, int id){
        javax.swing.DefaultComboBoxModel<?> model = (javax.swing.DefaultComboBoxModel<?>) comboBox.getModel();
        comboBox.setSelectedIndex(0);
        for (int i = 0; i < model.getSize(); i++) {
            Object element = model.getElementAt(i);

            try {
                int elementId = (int) element.getClass().getMethod("getId").invoke(element);
                if (elementId == id)
                {
                    comboBox.setSelectedIndex(i);
                    return;
                }
            } catch (NoSuchMethodException | SecurityException ex) {
                System.out.println("Error: " + ex.getMessage());
            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }        
        }
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
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnListar;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JComboBox<String> cmbMarca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPrecioCosto;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
