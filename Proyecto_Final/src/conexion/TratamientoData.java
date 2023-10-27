package conexion;

import Entidades.Tratamiento;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TratamientoData {

    private Connection con = null;

    public TratamientoData() {
        con = Conexion.getConexion();
    }

    public void tratamientosXMascota(int idMascota) {

        String sql = "SELECT * FROM tratamiento WHERE idMascota = ?";
    }

    public void guardarTratamiento(Tratamiento tr) {
        String sql = "INSERT INTO tratamiento (tipo, descripcion, importe, estado) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tr.getTipo());
            ps.setString(2, tr.getDescripcion());
            ps.setInt(3, tr.getImporte());
            ps.setBoolean(4, tr.isEstado());

            int reg = ps.executeUpdate();

            if (reg > 0) {
                JOptionPane.showMessageDialog(null, "se guardo el tratamiento");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar tratamiento " + e.getMessage());
        }

    }

    public void modificarTratamiento(Tratamiento tr) {
        try {
            Tratamiento tratamiento = new Tratamiento();
            String sql = "UPDATE tratamiento SET  descripcion = ?, importe = ?, estado = ? WHERE tipo = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, tr.getDescripcion());
            ps.setInt(2, tr.getImporte());
            ps.setBoolean(3, tr.isEstado());
            ps.setString(4, tr.getTipo());
            int rM = ps.executeUpdate();
            if (rM == 0) {
                JOptionPane.showMessageDialog(null, "No hay tratamientos con esa ID");
            } else {
                JOptionPane.showMessageDialog(null, "Se ha modificado con exito");
            }
        } catch (SQLException ex) {

        }

    }

    public void modificarTratamientoXId(int id, String tipo, int importe) {
        try {
            Tratamiento tratamiento = new Tratamiento();
            String sql = "UPDATE tratamiento SET  tipo = ? , importe = ? WHERE idtratamiento = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tipo);
            ps.setInt(2, importe);
            ps.setInt(3, id);
            int rM = ps.executeUpdate();
            if (rM == 0) {
                JOptionPane.showMessageDialog(null, "No hay tratamientos con esa ID");
            } else {
                JOptionPane.showMessageDialog(null, "Se ha modificado con exito");
            }
        } catch (SQLException ex) {

        }

    }

    public void modificarTratamientoEstadoActivado(int id) {
        try {
            Tratamiento tratamiento = new Tratamiento();
            String sql = "UPDATE tratamiento SET estado = 1 WHERE idtratamiento = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int rM = ps.executeUpdate();
            if (rM == 0) {
                JOptionPane.showMessageDialog(null, "No hay tratamientos con esa ID");
            } else {
                JOptionPane.showMessageDialog(null, "Se ha modificado con exito");
            }
        } catch (SQLException ex) {

        }

    }

    public void modificarTratamientoEstadoDesactivado(int id) {
        try {
            Tratamiento tratamiento = new Tratamiento();
            String sql = "UPDATE tratamiento SET estado = 0 WHERE idtratamiento = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int rM = ps.executeUpdate();
            if (rM == 0) {
                JOptionPane.showMessageDialog(null, "No hay tratamientos con esa ID");
            } else {
                JOptionPane.showMessageDialog(null, "Se ha modificado con exito");
            }
        } catch (SQLException ex) {

        }

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

//    public void registrarTratamiento(Tratamiento t) {
//        String sql = "INSERT into tratamiento VALUES(null,?,?,?,?)";
//        
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setString(1, t.getTipo());
//            ps.setString(2, t.getDescripcion());
//            ps.setInt(3, t.getImporte());
//            ps.setBoolean(4, t.isEstado());
//            
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Error al insertar el cliente. " + e.getMessage());
//        }
//    }
    public List<Tratamiento> listarTratamiento() {
        List<Tratamiento> tratamientos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM tratamiento WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Tratamiento t = new Tratamiento();
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

    public List<Tratamiento> listarTratamientoInactivo() {
        List<Tratamiento> tratamientos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM tratamiento WHERE estado = 0 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Tratamiento t = new Tratamiento();
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

    public List<Tratamiento> listarTodosTratamiento() {
        List<Tratamiento> tratamientos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM tratamiento";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Tratamiento t = new Tratamiento();
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
