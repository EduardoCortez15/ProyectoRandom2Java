package igu;
import com.mysql.cj.util.DnsSrv;//esta clase se usa mayormente para manejar consultas dns relacionadas con servidores mysql
import datos.Mantenimiento;
import java.security.interfaces.RSAKey;//importantes para la funcionalidad de operaciones rsa 
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;//importante para traer una tabla ah la interfaz


public class MenuOpciones extends javax.swing.JFrame {

    public MenuOpciones() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnDuenios = new javax.swing.JButton();
        btnMascotas = new javax.swing.JButton();
        btnCitas = new javax.swing.JButton();
        btnVeterinarios = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnReservaCita = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        visor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDuenios.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\OneDrive\\Escritorio\\imagenes para programar\\Iconos de Cachorro Perro Su Dueno Mirando Direcciones Opuestas para descargar gratis.jpg")); // NOI18N
        btnDuenios.setText("DUEÑOS");
        btnDuenios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDueniosActionPerformed(evt);
            }
        });

        btnMascotas.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\OneDrive\\Escritorio\\imagenes para programar\\Iconos de Pata Perro para descargar gratis.jpg")); // NOI18N
        btnMascotas.setText("MASCOTAS");
        btnMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMascotasActionPerformed(evt);
            }
        });

        btnCitas.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\OneDrive\\Escritorio\\imagenes para programar\\guardar.jpg")); // NOI18N
        btnCitas.setText("CITAS");
        btnCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitasActionPerformed(evt);
            }
        });

        btnVeterinarios.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\OneDrive\\Escritorio\\imagenes para programar\\Nurse free vector icons designed by Freepik.jpg")); // NOI18N
        btnVeterinarios.setText("VETERINARIOS");
        btnVeterinarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeterinariosActionPerformed(evt);
            }
        });

        jLabel3.setText("ID USER:");

        btnBuscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\OneDrive\\Escritorio\\imagenes para programar\\lupa.jpg")); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnReservaCita.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\OneDrive\\Escritorio\\imagenes para programar\\guardar.jpg")); // NOI18N
        btnReservaCita.setText("RESERVA CITAS ");
        btnReservaCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservaCitaActionPerformed(evt);
            }
        });

        btnAgregar.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\OneDrive\\Escritorio\\imagenes para programar\\agregar.jpg")); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\OneDrive\\Escritorio\\imagenes para programar\\delete.jpg")); // NOI18N
        btnLimpiar.setText("ELIMINAR MASCOTA");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\OneDrive\\Escritorio\\imagenes para programar\\update.jpg")); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jButton1.setText("Menu principal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        visor.setModel(new javax.swing.table.DefaultTableModel(
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
        visor.setToolTipText("");
        jScrollPane2.setViewportView(visor);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReservaCita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(btnDuenios, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVeterinarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(308, 308, 308))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton1)
                .addGap(279, 279, 279)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(397, 397, 397))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDuenios)
                    .addComponent(btnMascotas)
                    .addComponent(btnCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVeterinarios, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBuscar)
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(27, 27, 27)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnReservaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1))
                .addContainerGap(20, Short.MAX_VALUE))
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
//mostrar tabla de persona
    public void mostrar(String tabla){
        String sql="select * from "+tabla;//toda la consulta 
        Statement st;//ejecucion de la consulta
        Mantenimiento com=new Mantenimiento();
        Connection conexion=com.conectar();//la conexion establecida se guarda en conexion
        System.out.println(sql);
        DefaultTableModel model=new DefaultTableModel();//clase que me permite almacenar y gestionar los datos en una tabla
        
        //insercion de las columnas ah la tabla
        model.addColumn("ID");
        model.addColumn("DNI");
        model.addColumn("CONTRASEÑA");
        model.addColumn("NOMBRE");
        model.addColumn("SEXO");
        model.addColumn("EDAD");
        visor.setModel(model);//la tabla visor ahora utilizara el modelo model para mostrar y gestionar los datos
        
        //creacion de un array que almacenara temporalmente los datos de cada fila que se desee agregar al modelo de la tabla model 
        String []datos=new String[6];
        
        try{
            st=conexion.createStatement();//ejecutar las consultas sql 
            ResultSet rs=st.executeQuery(sql);//guarda los resultados de la consulta que se acaba de ejecutar
            while(rs.next()){
                datos[0]=rs.getString(1);//obtiene el valor de la primera columna
                datos[1]=rs.getString(2);//
                //datos[2]=rs.getString(3); no lo coloco porque las contraseñas son privadas
                datos[3]=rs.getString(4);//
                datos[4]=rs.getString(5);//
                datos[5]=rs.getString(6);//
                model.addRow(datos);//se crea una nuena fila con los datos obtenidos recientemente
            }
        }catch(SQLException e7){
            JOptionPane.showMessageDialog(null, "ERROR "+e7.toString());
        }
        
    }
    //mostrar tabla de mascota
    public void mostrar2(String tabla){
        String sql="select * from "+tabla;//construccion de la consulta
        Statement st;
        Mantenimiento com=new Mantenimiento();
        Connection conexion=com.conectar();//establecer la conexion ah la base de datos
        System.out.println(sql);
        DefaultTableModel model=new DefaultTableModel();//crea un nuevo modelo de la tabla 
        
        //insercion de la columna ah la tabla
        model.addColumn("ID");
        model.addColumn("NOMBRE");
        model.addColumn("ANIMAL");
        model.addColumn("SEXO");
        model.addColumn("EDAD");
        model.addColumn("PESO");
        model.addColumn("codDueño");
        visor.setModel(model);//que se guarda el nuevo modelo establecido
        
        String []datos=new String[7];//se creara este array para almacenar temporalmente los datos de cada fila extraida de la
        //bd
        
        try{
            st=conexion.createStatement();
            ResultSet rs=st.executeQuery(sql);//ejecuta la consulta sql y obtiene el resultado en un resultset st
            while(rs.next()){//cada fila del resultset que permite guardar los datos en el nuevo array
                
                //agregar los datos en cada casillero del array
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                model.addRow(datos);//agregar todos los datos en la fila ah la tabla modelo
            }
        }catch(SQLException e7){
            JOptionPane.showMessageDialog(null, "ERROR "+e7.toString());
        }
        
    }
    //mostrar las tablas de las citas
     public void mostrar3(String tabla){
        String sql="select * from "+tabla;
        Statement st;
        Mantenimiento com=new Mantenimiento();
        Connection conexion=com.conectar();
        System.out.println(sql);
        DefaultTableModel model=new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("NOMBRE DUEÑO");
        model.addColumn("NOMBRE MASCOTA");
        model.addColumn("TIPO SERVICIO");
        model.addColumn("FECHA");
        visor.setModel(model);
        
        String []datos=new String[5];
        
        try{
            st=conexion.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                model.addRow(datos);
            }
        }catch(SQLException e11){
            JOptionPane.showMessageDialog(null, "ERROR "+e11.toString());
        }
        
    }
     //mostrar tabla veterinarios
      public void mostrar4(String tabla){//parametro tabla
        String sql="select * from "+tabla;//construccion de la consulta
        Statement st;
        Mantenimiento com=new Mantenimiento();
        Connection conexion=com.conectar();
        System.out.println(sql);
        DefaultTableModel model=new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("NOMBRE");
        model.addColumn("APELLIDO");
        model.addColumn("SEXO");
        model.addColumn("EDAD");
        model.addColumn("DNI");
        visor.setModel(model);
        
        String []datos=new String[6];
        
        try{
            st=conexion.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                model.addRow(datos);
            }
        }catch(SQLException e12){
            JOptionPane.showMessageDialog(null, "ERROR "+e12.toString());
        }
        
    }

      datos.Mantenimiento com=new Mantenimiento();
         Connection conn=com.conectar();
         
      //metodo para eliminarmascotas   
      public void eliminarMascota(){
          int fila=visor.getSelectedRow();//obtiene el indice de la fila seleccionada de la tabla y si no hay ninguna seleccionada , sera -1
          //obtiene el valor de la celda en la primera columna 0 de la fila seleccionada y luego se convierte ah string 
          String valor=visor.getValueAt(fila,0).toString();
          
          try{
              //realiza una consulta sql para eliminar el registro en la tabla segun el valor de la id seleccionada 
            PreparedStatement ps=conn.prepareStatement("delete from mascota where id=' "+valor+"'");
            ps.executeUpdate();//ejecutar la consulta sql
            mostrar2("mascota");//actualizar la tabla mascota
          }catch(Exception e20){
              JOptionPane.showMessageDialog(null,"ERROR : "+e20);
          }
        
      } 

    
    private void btnDueniosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDueniosActionPerformed
        mostrar("usuarios");
    }//GEN-LAST:event_btnDueniosActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       eliminarMascota();
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        AgregarRegistro arg=new AgregarRegistro();
        arg.setVisible(true);
        arg.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnReservaCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservaCitaActionPerformed
        ReservaCita rsct=new ReservaCita();
        rsct.setVisible(true);
        rsct.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btnReservaCitaActionPerformed

    
    
    
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        ModificarRegistro mdfr=new ModificarRegistro();
        mdfr.setVisible(true);
        mdfr.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        Principal pr=new Principal();
        pr.setVisible(true);
        pr.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMascotasActionPerformed
        mostrar2("mascota");
    }//GEN-LAST:event_btnMascotasActionPerformed

    private void btnCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitasActionPerformed
       mostrar3("cita");
    }//GEN-LAST:event_btnCitasActionPerformed

    private void btnVeterinariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeterinariosActionPerformed
        mostrar4("veterinarios");
    }//GEN-LAST:event_btnVeterinariosActionPerformed

//btn buscar
    public void mostrar5(String tabla){
        String id=txtBuscar.getText();//obtiene el valor de la interfaz y la guarsa en la variable id
        String sql="select * from usuarios where id ='"+id+"'";//construccion de la consulta
        Statement st;
        Mantenimiento com=new Mantenimiento();
        Connection conexion=com.conectar();
        System.out.println(sql);
        DefaultTableModel model=new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("DNI");
        model.addColumn("CONTRASEÑA");
        model.addColumn("NOMBRE");
        model.addColumn("SEXO");
        model.addColumn("EDAD");
        
        visor.setModel(model);
        
        String []datos=new String[6];
        
        try{
            st=conexion.createStatement();//creacion del statement para realizar la consulta
            ResultSet rs=st.executeQuery(sql);//ejecutar la consulta y guardar los datos en el resultset
            while(rs.next()){
                //obtencion de los valores de todos los campos
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                //datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                
                model.addRow(datos);//creacion de la fila con los datos obtenidos
            }
        }catch(SQLException e7){
            JOptionPane.showMessageDialog(null, "ERROR "+e7.toString());
        }
    }
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

               mostrar5("usuarios");
               
    }//GEN-LAST:event_btnBuscarActionPerformed

  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCitas;
    private javax.swing.JButton btnDuenios;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMascotas;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnReservaCita;
    private javax.swing.JButton btnVeterinarios;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtBuscar;
    public javax.swing.JTable visor;
    // End of variables declaration//GEN-END:variables
}
