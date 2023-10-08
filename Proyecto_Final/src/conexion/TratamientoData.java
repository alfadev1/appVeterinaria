package conexion;

import Entidades.Tratamiento;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.*;
import javax.swing.JOptionPane;
public class TratamientoData {

    private Connection con = null;

    public TratamientoData() {
        con = Conexion.getConexion();
    }

    public Tratamiento buscarTratamiento(int id) {
        Tratamiento tratamiento = new Tratamiento();
        String sql = "SELECT * from tratamiento WHERE idTratamiento = ?";
        
        try {
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setInt(1, id);
           ResultSet rs = ps.executeQuery();
           
           if (rs.next()) {
               tratamiento.setIdTratamiento(id);
               tratamiento.setTipo(rs.getString("tipo"));
               tratamiento.setDescripcion(rs.getString("descripcion"));
               tratamiento.setImporte(rs.getInt("importe"));
               tratamiento.setEstado(rs.getBoolean("activo"));
           } else {
               JOptionPane.showMessageDialog(null, "El cliente no existe", "Error", JOptionPane.ERROR);
           }
           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el tratamiento. " + e.getMessage());
        }

        return tratamiento;
    }
    
    public void registrarTratamiento(Tratamiento t) {
        String sql = "INSERT into tratamiento VALUES(null,?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, t.getTipo());
            ps.setString(2, t.getDescripcion());
            ps.setInt(3, t.getImporte());
            ps.setBoolean(4, t.isEstado());
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar el cliente. " + e.getMessage());
        }
    }

    public List<Tratamiento> listarTratamiento() {
       List <Tratamiento>tratamientos= new ArrayList<>();
        try {
            String sql ="SELECT * FROM tratamiento WHERE estado = 1 ";
            PreparedStatement ps= con.prepareStatement(sql);
           ResultSet rs= ps.executeQuery();
           while (rs.next()){
               Tratamiento t= new Tratamiento();
               t.setIdTratamiento(rs.getInt("idTratamiento"));
               t.setTipo(rs.getString("tipo"));
               t.setDescripcion(rs.getString("descripcion"));
               t.setImporte(rs.getInt("importe"));
               t.setEstado(rs.getBoolean("estado"));
               tratamientos.add(t);
           }
           ps.close();
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al listar los tratamientos.");
        }
        return tratamientos;
   }
}
