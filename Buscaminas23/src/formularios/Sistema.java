/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

/*Importante: Credito a "Gestión Rt24" (YouTube) por la creación del CRUD, ya
que me base en su tutorial para su diseño y creación, con ayuda de MySQL y WAMPP,
cabe acalarar que no hubo uso de la funcion Ctrl C, ya que hice lo posible por
entender los conceptos y funciones utilizadas(os)"
*/

import conexionSQL.ConexionSQL;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juice_pjuorme
 */
public class Sistema extends javax.swing.JFrame {
    ConexionSQL cc = new ConexionSQL();
    Connection con=cc.conexion();

    /**
     * Creates new form Sistema
     */
    public Sistema() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(getBackground());
        mostrarDatos();
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
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btmNuevo = new javax.swing.JButton();
        btmGuardar = new javax.swing.JButton();
        btmEliminar = new javax.swing.JButton();
        btmActualizar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaJugadores = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setText("Nombre:");

        jLabel2.setText("Edad:");

        btmNuevo.setText("Nuevo");
        btmNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmNuevoActionPerformed(evt);
            }
        });

        btmGuardar.setText("Guardar");
        btmGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmGuardarActionPerformed(evt);
            }
        });

        btmEliminar.setText("Eliminar");
        btmEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmEliminarActionPerformed(evt);
            }
        });

        btmActualizar.setText("Actualizar");
        btmActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmActualizarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Hecho por: Alcalá Rangel Jeffrey Alexander");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btmNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btmGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btmEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btmActualizar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btmNuevo)
                    .addComponent(btmGuardar)
                    .addComponent(btmEliminar)
                    .addComponent(btmActualizar))
                .addGap(37, 37, 37))
        );

        tablaJugadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaJugadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaJugadoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaJugadores);

        jLabel4.setText("Busqueda:");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 144, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmNuevoActionPerformed
        limpiar();
    }//GEN-LAST:event_btmNuevoActionPerformed

    private void btmGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmGuardarActionPerformed
        insertarDatos();
        limpiar();
        mostrarDatos();
    }//GEN-LAST:event_btmGuardarActionPerformed

    private void tablaJugadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaJugadoresMouseClicked
        int filaSeleccionada = tablaJugadores.rowAtPoint(evt.getPoint());
        txtNombre.setText(tablaJugadores.getValueAt(filaSeleccionada, 1).toString());
        txtEdad.setText(tablaJugadores.getValueAt(filaSeleccionada, 2).toString());
        
    }//GEN-LAST:event_tablaJugadoresMouseClicked

    private void btmActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmActualizarActionPerformed
        actualizarDatos();
        limpiar();
        mostrarDatos();
    }//GEN-LAST:event_btmActualizarActionPerformed

    private void btmEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmEliminarActionPerformed
        eliminarRegistro();
        mostrarDatos();
        limpiar();
    }//GEN-LAST:event_btmEliminarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        filtrarDatos(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased
    
    public void insertarDatos(){
        try{
            String SQL="insert into jugadores(nombre,edad,puntuacion) values (?,?,?)";
            PreparedStatement pst=con.prepareStatement(SQL);
            pst.setString(1, txtNombre.getText());
            pst.setInt(2, Integer.parseInt(txtEdad.getText()));
            pst.setInt(3, 0);
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registrado Correctamenete");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }
    
    public void eliminarRegistro(){
        int filaSeleccionada = tablaJugadores.getSelectedRow();
        try {
            String SQL = "delete from jugadores where idjugadores="+tablaJugadores.getValueAt(filaSeleccionada,0);
            Statement st = con.createStatement();
            int n=st.executeUpdate(SQL);
            if (n>=0) {
                JOptionPane.showMessageDialog(null,"Eliminacion Exitosa");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la eliminacion");
        }
    }
    
     public void actualizarDatos(){
        try{
            String SQL="update jugadores set nombre=?,edad=?,puntuacion=? where idjugadores=?";
            int filaSeleccionada = tablaJugadores.getSelectedRow();
            String dao = (String)tablaJugadores.getValueAt(filaSeleccionada, 0);
            PreparedStatement pst=con.prepareStatement(SQL);
            pst.setString(1, txtNombre.getText());
            pst.setInt(2, Integer.parseInt(txtEdad.getText()));
            pst.setInt(3, 0);
            
            pst.setString(4, dao);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Edicion Exitosa");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en la edicion: "+e.getMessage());
        }
    }
    
    public void limpiar(){
        txtNombre.setText("");
        txtEdad.setText("");
    }
    
    public void filtrarDatos(String valor){
        String[] titulos = {"ID", "NOMBRE", "EDAD", "PUNTUACION"};
        String[] registros = new String[4];
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        String SQL = "select * from jugadores where nombre like '%"+valor+"&'";
        
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while(rs.next()){
                registros[0]=rs.getString("idjugadores");
                registros[1]=rs.getString("nombre");
                registros[2]=rs.getString("edad");
                registros[3]=rs.getString("puntuacion");
                modelo.addRow(registros);
                tablaJugadores.setModel(modelo);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al mostrar datos: "+e.getMessage());
        } 
    }
    
    public void mostrarDatos(){
        String[] titulos = {"ID", "NOMBRE", "EDAD", "PUNTUACION"};
        String[] registros = new String[4];
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        String SQL = "select * from jugadores";
        
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while(rs.next()){
                registros[0]=rs.getString("idjugadores");
                registros[1]=rs.getString("nombre");
                registros[2]=rs.getString("edad");
                registros[3]=rs.getString("puntuacion");
                modelo.addRow(registros);
                tablaJugadores.setModel(modelo);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al mostrar datos: "+e.getMessage());
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
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmActualizar;
    private javax.swing.JButton btmEliminar;
    private javax.swing.JButton btmGuardar;
    private javax.swing.JButton btmNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaJugadores;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
