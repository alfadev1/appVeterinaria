package conexion;

import Entidades.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
    
    public void modificarCliente(Cliente cliente){
        String sql = "UPDATE cliente SET apellido = ?, nombre = ?, telefono = ?, direccion = ?, nomAux = ?, telAux = ? WHERE idCliente = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getApellido());
            ps.setString(2, cliente.getNombre());
            ps.setInt(3, cliente.getTelefono());
            ps.setString(4, cliente.getDireccion());
            ps.setString(5, cliente.getAltClie());
            ps.setInt(6, cliente.getAltTel());
            ps.setInt(7, cliente.getIdCliente());
            int guardar = ps.executeUpdate();
            if (guardar == 1) {
                JOptionPane.showMessageDialog(null, "Se modificó correctamente los datos del cliente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar los datos del cliente" + ex.getMessage());
        }
    }
    
    public Cliente buscarCliente(int id) {
    Cliente cliente = null;
        String sql = "SELECT `dni`, `apellido`, `nombre`, `telefono`, `direccion`, `nomAux`, `telAux` FROM cliente WHERE idCliente = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(id);
                cliente.setDni(rs.getInt("dni"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setAltClie(rs.getString("nomAux"));
                cliente.setAltTel(rs.getByte("telAux"));
                

            } else {
                JOptionPane.showMessageDialog(null, "El cliente no existe");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de Clientes" + ex.getMessage());

        }

        return cliente;
    }
    
    public Cliente buscarClientexdni(int dni) {
    Cliente cliente = null;
        String sql = "SELECT `apellido`, `nombre`, `telefono`, `direccion`, `nomAux`, `telAux` FROM cliente WHERE dni = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(dni);
                cliente.setApellido(rs.getString("apellido"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setTelefono(rs.getInt("telefono"));
                cliente.setAltClie(rs.getString("nomAux"));
                cliente.setAltTel(rs.getInt("telAux"));
                

            } else {
                JOptionPane.showMessageDialog(null, "El cliente no existe");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de Clientes" + ex.getMessage());

        }

        return cliente;
    }
    
    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        try {
            String sql = "SELECT * FROM cliente WHERE estado = 1 ";//Al eliminar un cliente, habria que set a 0
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();

                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setDni(rs.getInt("dni"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setAltClie(rs.getString("nomAux"));
                cliente.setAltTel(rs.getByte("telAux"));
                clientes.add(cliente);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de Clientes" + ex.getMessage());
        }
        return clientes;
    }
}
