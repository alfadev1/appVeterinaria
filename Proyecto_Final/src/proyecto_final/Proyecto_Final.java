package proyecto_final;
import Entidades.*;
import conexion.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Caren Markevicz, Tomas Bresca, Bradon Alfaro Rollano, Daniel Simonetta
 */
public class Proyecto_Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Connection con = null;
        PreparedStatement ps = null;
        con = Conexion.getConexion();
        
        Cliente Juan = new Cliente(29860341, "Salvo", "Juan", "Manaos 360", 11234567, "Jorge",11987654);
        ClienteData cd = new ClienteData();
        cd.altaCliente(Juan);
        
    }
    
}
