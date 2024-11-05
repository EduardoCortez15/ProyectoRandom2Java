package vista;
import igu.Principal;
import java.sql.*;
import datos.Mantenimiento;
public class VeterinariaAnimales {

  
    public static void main(String[] args) {
        Mantenimiento m=new Mantenimiento();
        m.conectar();
        
        Principal princ=new Principal();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
    }
    
}
