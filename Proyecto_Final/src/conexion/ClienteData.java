package conexion;

import Entidades.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class ClienteData {
    private Connection con = null;

    public ClienteData() {
        con = Conexion.getConexion();
    }
    
    public void altaCliente(Cliente cliente){
        
        String sql = "INSERT INTO `cliente`(`dni`, `apellido`, `nombre`, `telefono`, `direccion`, `telAux`)"
                + "VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, cliente.getDni());
            ps.setString(2, cliente.getApellido());
            ps.setString(3, cliente.getNombre());
            ps.setString(4, cliente.getTelefono());
            ps.setString(5, cliente.getDireccion());
            ps.setInt(6, cliente.getAltTel());//
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                cliente.setIdCliente(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Cliente añadido con exito");          
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla CLIENTE" + ex.getMessage());
        }
    }
    
}
