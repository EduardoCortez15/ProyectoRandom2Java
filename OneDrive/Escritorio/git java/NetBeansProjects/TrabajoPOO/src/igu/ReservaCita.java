package igu;
import javax.swing.JOptionPane;
import datos.Mantenimiento;
import java.sql.Connection; 
import java.sql.*;
import com.itextpdf.text.Document;//para representar y manipular documentos pdf
import com.itextpdf.text.DocumentException;//para manejar las excepciones con la creacion de los pdf
import com.itextpdf.text.Paragraph;//para representar y agregar parrafos ah documentos pdf
import com.itextpdf.text.pdf.PdfPTable;//creacion de tablas en documentos pdf
import com.itextpdf.text.pdf.PdfWriter;//escribir contenidos en documentos pdf
import java.awt.HeadlessException;//para manejar excepciones en una interfaz grafica
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
public class ReservaCita extends javax.swing.JFrame {

    datos.Mantenimiento com=new Mantenimiento();
    Connection conn=com.conectar();
    public ReservaCita() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTicket = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNomDuenio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNomMascota = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbServicio = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        btnAtras = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnTicket1 = new javax.swing.JButton();

        btnTicket.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\OneDrive\\Escritorio\\imagenes para programar\\pdf.jpg")); // NOI18N
        btnTicket.setText("TICKET");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("VETERINARIA DR.VISE");

        jLabel2.setText("NOMBRE DUEÑO : ");

        jLabel3.setText("NOMBRE MASCOTA:");

        jLabel4.setText("TIPO DE SERVICIO:");

        cmbServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "BAÑADO", "CHEQUEO", "OPERACIONES", " " }));

        jLabel5.setText("FECHA:");

        btnAtras.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\OneDrive\\Escritorio\\imagenes para programar\\atras.jpg")); // NOI18N
        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\OneDrive\\Escritorio\\imagenes para programar\\guardar.jpg")); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnTicket1.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\OneDrive\\Escritorio\\imagenes para programar\\pdf.jpg")); // NOI18N
        btnTicket1.setText("TICKET");
        btnTicket1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTicket1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(302, 302, 302))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiar)
                .addGap(32, 32, 32))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnAtras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTicket1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNomMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTicket1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnLimpiar)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
       txtFecha.setText("");
       txtNomDuenio.setText("");
       txtNomMascota.setText("");
       
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.setVisible(false);
        MenuOpciones mop=new MenuOpciones();
        mop.setVisible(true);
        mop.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nombreDueño=txtNomDuenio.getText();
        String nombreMascota=txtNomMascota.getText();
        String tipoServicio=cmbServicio.getSelectedItem().toString();
        String fecha=txtFecha.getText();
        
        if(nombreDueño.isEmpty() || nombreMascota.isEmpty() || tipoServicio.isEmpty() || fecha.isEmpty()){
            JOptionPane.showMessageDialog(null, "ERRROR , COMPLETE LOS CASILLEROS");
        }else{
            if(tipoServicio.equalsIgnoreCase("SELECCIONE")){
                JOptionPane.showMessageDialog(null,"DEBE SELECCIONAR EL SEXO");
            }else{
                try{
                    String consulta="insert into cita(nombreDueño,nombreMascota,tipoServicio,fecha) values('"+nombreDueño+"','"+nombreMascota+"','"+tipoServicio+"','"+fecha+"')";
                    PreparedStatement ps=conn.prepareStatement(consulta);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null,"DATOS GUARDADOS CORRECTAMENTE");
                }catch(Exception e10){
                    JOptionPane.showMessageDialog(null,"NO SE PUEDE GUARDAR USUARIO : "+e10);
                }
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnTicket1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicket1ActionPerformed

     Document documento = new Document();//creacion de un documento pdf
     try {
        String ruta = System.getProperty("user.home");//obtencion de la ruta del usuario actual
        
        //creacion de un objeto pdfwriter 
        PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reporte_Cita_xd.pdf"));
        documento.open();// Apertura del documento para comenzar a agregar contenido

        PdfPTable tabla = new PdfPTable(5);//creacion de una tabla de 5 columnas 
        
        //añadir las columnas ah la tabla
        tabla.addCell("ID");
        tabla.addCell("NOMBRE DUEÑO");
        tabla.addCell("NOMBRE MASCOTA");
        tabla.addCell("TIPO DE SERVICIO");
        tabla.addCell("FECHA");

        try {
            datos.Mantenimiento com = new Mantenimiento();
            Connection conn = com.conectar();
            PreparedStatement pst = conn.prepareStatement("select*from cita");
            ResultSet rs = pst.executeQuery();

            boolean tieneDatos = false;//variable que verifica si hay datos en el resultset
            while (rs.next()) {
                tieneDatos = true;
                tabla.addCell(rs.getString(1)); // Columna 1: ID
                tabla.addCell(rs.getString(2)); // Columna 2: NOMBRE DUEÑO
                tabla.addCell(rs.getString(3)); // Columna 3: NOMBRE MASCOTA
                tabla.addCell(rs.getString(4)); // Columna 4: TIPO DE SERVICIO
                tabla.addCell(rs.getString(5)); // Columna 5: FECHA
            }

            if (tieneDatos) {//si hay datos en la tabla , agregarlas al pdf y si no mostrar el mensaje
                documento.add(tabla);
            } else {
                documento.add(new Paragraph("No hay citas para mostrar."));
            }

        } catch (DocumentException | SQLException e) {
            e.printStackTrace();
        }
//cerrar el documento luego de realizar la accion 
        documento.close();
        JOptionPane.showMessageDialog(null, "REPORTE CREADO");

    } catch (DocumentException | HeadlessException | FileNotFoundException e) {
        e.printStackTrace();
    }
        
    }//GEN-LAST:event_btnTicket1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnTicket;
    private javax.swing.JButton btnTicket1;
    private javax.swing.JComboBox<String> cmbServicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNomDuenio;
    private javax.swing.JTextField txtNomMascota;
    // End of variables declaration//GEN-END:variables
}
