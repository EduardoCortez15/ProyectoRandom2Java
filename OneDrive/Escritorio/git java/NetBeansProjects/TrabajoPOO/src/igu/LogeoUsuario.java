
package igu;
import java.sql.*;
import datos.Mantenimiento;
import javax.swing.JOptionPane;
public class LogeoUsuario extends javax.swing.JFrame {

   Mantenimiento com=new Mantenimiento();//creacion un objeto de la clase mantenimiento
    Connection conn=com.conectar();//llama al metodo conectar para que haya la conexion y almecene la conexion en
    //la variable "conn"
    
    //constructor para inicializar los componentes de la interfaz grafica
    public LogeoUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtContrasenia = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        jLabel3.setText("CONTRASEÑA :");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("VETERINARIA DR.VISE");

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\OneDrive\\Escritorio\\imagenes para programar\\inisesc.jpg")); // NOI18N

        jLabel2.setText("USUARIO :");

        jLabel5.setText("CONTRASEÑA :");

        jLabel6.setText("estado : ");

        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnIngresar.setText("INGRESAR");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEstado)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(btnAtras)
                        .addGap(18, 18, 18)
                        .addComponent(btnIngresar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLimpiar)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblEstado))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras)
                    .addComponent(btnIngresar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnLimpiar)
                .addGap(20, 20, 20))
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

    //funcion que permite limpiar los campos al presionar el boton
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtContrasenia.setText("");
        txtUsuario.setText("");
        lblEstado.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    //funcion para ocultar la ventana y muestra una nueva de la clase principal y coloca la nueva en el centro
    //de la pantalla
    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
       this.setVisible(false);//esta ventana se oculta
       Principal pr=new Principal();//creacion de un objeto de la clase principal
       pr.setVisible(true);//permite que la pantalla de la clase princi se vea
       pr.setLocationRelativeTo(null);//que se vea en el centro
       
        
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String  usuario=txtUsuario.getText();//el texto que se ingrese en txtusuario se guarda ah la variable usuario
        String contraseña=txtContrasenia.getText();//el texto que se ingrese en txtcontra se guarda en la variable contraseña
        if(!usuario.equals("") || !contraseña.equals("")){//verifica si almenos un campo no esta vacio
            try {
                //prepstat para una mejor consulta en la bd , guardando en el objeto ps  y que cumpla lo requerido en la consulta
                PreparedStatement ps=conn.prepareStatement("select nombre,dni from Usuarios where dni='"+usuario+"' and contraseña='"+contraseña+"'");
                ResultSet rs=ps.executeQuery();//ejecuta la consulta sql y lo almacena el resultado en un objeto resultset llamado rs
                if(rs.next()){//verifica si el resultado resultset contine almenos una fila o si hay coincidencias
                    lblEstado.setText("CORRECTO");
                    JOptionPane.showMessageDialog(null,"BIENVENIDO!!");
                    this.setVisible(false);//ocultar esta ventana
                    MenuOpciones mop=new MenuOpciones();//creacion de obj de la clase menuopciones
                    mop.setVisible(true);//mostrar la ventana de menuopciones
                    mop.setLocationRelativeTo(null);//colocar la ventana en el medio
                }else{//en clase que no contenga coincidencias en el resultset
                    JOptionPane.showMessageDialog(null,"USUARIO O CONTRASEÑA INCORRECTA");
                    lblEstado.setText("INCORRECTO");
                }
            } catch (Exception e) {
            }
            
        }else{//en caso que algunos de los campos este vacio
            JOptionPane.showMessageDialog(null,"DEBE COMPLETAR LOS DATOS ");
        }
    }//GEN-LAST:event_btnIngresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
