package datos;
import java.sql.*;//importa las clases para trabajar con base de datos en java como connection , statement, result set
public class Mantenimiento {
    
    //conexion ah la base de datos
    public String driver="com.mysql.cj.jdbc.Driver";//nombre del driver de mysql , importante para que pueda conectarse
    public String cadena="jdbc:mysql://localhost:3307/trabajofinal";//contiene el url de la bd , tiene local host, puerto y el name de la bd
    public String usuario="root";//contiene el nombre del usuario de la bd
    public String clave="";//contiene la clave del usuario de la bd
    
    public Connection conn;//sirve para almacenar la conexion ah la base de datos
    public Statement sen;//sirve para ejecutar consultas sql en la bd
    public ResultSet data;//sirve para almacenar los resultados de una consulta sql 
    
    //funcion para la conexion
    public Connection conectar(){
        try {
            Class.forName(driver);//necesario para que Java pueda utilizar el driver para conectarse a la base de datos.
            conn=DriverManager.getConnection(cadena,usuario,clave);//abre una conexión con la base de datos especificada.
            sen=conn.createStatement();//Este objeto se utiliza para ejecutar consultas SQL en la base de datos.
            System.out.println("conexion ok");
        } catch (ClassNotFoundException e1) {
            System.out.println("error en el driver "+e1);
        }catch(SQLException e2){
            System.out.println("error en la conexion "+e2);
        }
        return conn;//Retorna la conexión a la base de datos
    }
    
    
    
    
    
}
