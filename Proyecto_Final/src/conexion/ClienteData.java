package conexion;

import Entidades.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;


public class ClienteData {
    private Connection con = null;

    public ClienteData() {
        con = Conexion.getConexion();
    }
    
    public void altaCliente(Cliente cliente){
        
        String sql = "INSERT INTO `cliente`(`dni`, `apellido`, `nombre`, `telefono`, `direccion`, `nomAux`, `telAux`)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, cliente.getDni());
            ps.setString(2, cliente.getApellido());
            ps.setString(3, cliente.getNombre());
            ps.setInt(4, cliente.getTelefono());
            ps.setString(5, cliente.getDireccion());
            ps.setString(6, cliente.getAltClie());
            ps.setInt(7, cliente.getAltTel());
            
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
    
    public void bajaCliente(int dni) {
        String sql = "DELETE FROM `cliente` WHERE dni = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se ha dado de baja al cliente");
            } else if (fila == 0) {
                JOptionPane.showMessageDialog(null, "No se encontra un cliente con ese DNI");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla CLIENTE");
        }

    }
    //`apellido`, `nombre`, `telefono`, `direccion`, `telAux`
    public void modificarCliente(Cliente cliente){
        String sql = "UPDATE cliente SET apellido = ?, nombre = ?, telefono = ?, direccion = ?, telAux = ? WHERE idCliente = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getApellido());
            ps.setString(2, cliente.getNombre());
            ps.setInt(3, cliente.getTelefono());
            ps.setString(4, cliente.getDireccion());
            ps.setInt(5, cliente.getAltTel());
            ps.setInt(6, cliente.getIdCliente());
            int guardar = ps.executeUpdate();
            if (guardar == 1) {
                JOptionPane.showMessageDialog(null, "Se modificó correctamente los datos del cliente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar los datos del cliente" + ex.getMessage());
        }
    }
    
//    public Cliente buscarCliente(int id) {
//    
//    }
    
    
//    public List<Cliente> listarClientes() {
//        
//    }
}
