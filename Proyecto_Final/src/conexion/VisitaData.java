package conexion;

import java.sql.Connection;
import Entidades.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class VisitaData {

    private Connection con = null;

    public VisitaData() {
        con = Conexion.getConexion();
    }

    public void registrarVisita(Mascota mascota, Tratamiento tratamiento, Visitas visita) {
        String sql = "INSERT INTO `visita`( `idMascota`, `idTratamiento`, `fechaVisita`, `detalle`, `pesoActual`)"
                + "VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, mascota.getIdMascota());
            ps.setInt(2, tratamiento.getIdTratamiento());
            ps.setDate(3, java.sql.Date.valueOf(visita.getFechaVisita()));
            ps.setString(4, visita.getDetalle());
            ps.setDouble(5, mascota.getPesoActual());
            int ejecucion = ps.executeUpdate();
            // el codigo de abajo es para  verificar si la sentencia se ejecutó con éxito y si afectó filas
            if (ejecucion > 0) {
                JOptionPane.showMessageDialog(null, "Se registró la visita");
                // luego obtener la clave generada 
                ResultSet generatedKeys = ps.getGeneratedKeys();
                //si está disponible para su uso posterior en la aplicación.
                if (generatedKeys.next()) {
                    int generatedId = generatedKeys.getInt(1);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Imprime el mensaje completo de la excepción 
            JOptionPane.showMessageDialog(null, "Error al registrar la visita");
        }

        // Actualizar el último peso registrado de la mascota
        String sql2 = "UPDATE mascota SET peso = ? WHERE idMascota = ?";
        try {
            PreparedStatement ps2 = con.prepareStatement(sql2);
            ps2.setDouble(1, visita.getPesoActual());
            ps2.setInt(2, mascota.getIdMascota());
            int ejecucion2 = ps2.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(); // Imprime el mensaje completo de la excepción 
            JOptionPane.showMessageDialog(null, "Error al actualizar el peso");
        }

    }

//Debe haber un método que pueda listar todas las 
//visitas de una mascota en especial (históricamente) 
    public List<Visitas> listarVisitas(int idMascota) {
        ArrayList<Visitas> listaV = new ArrayList<>();
        try {
            String sql = "SELECT * FROM visita WHERE idMascota = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMascota);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Visitas v = new Visitas();
                v.setIdVisita(rs.getInt("idVisita"));
                Tratamiento trat = new Tratamiento();
                trat.setIdTratamiento(rs.getInt("idTratamiento"));
                v.setFechaVisita(rs.getDate("fechaVisita") != null ? rs.getDate("fechaVisita").toLocalDate() : null);
                v.setDetalle(rs.getString("Detalle"));
                v.setPesoActual(rs.getDouble("pesoActual"));
                listaV.add(v);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al listar las visitas" + e.getMessage());
        }
        return listaV;
    }

//metodo que trabaja con el jtable de MascotaVista
    public List<String[]> listarVisitasXIdmascota(int id) {
    List<String[]> listaV = new ArrayList<>();
    try {
        String sql = "SELECT visita.fechaVisita AS fechaVisita, tratamiento.tipo AS tipoTratamiento, tratamiento.importe AS importeTratamiento\n"
                + "FROM visita\n"
                + "JOIN tratamiento ON visita.idTratamiento = tratamiento.idtratamiento\n"
                + "WHERE visita.idMascota = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            // Crea un vector de strings para almacenar los datos de la fila actual
            String[] visitaData = new String[3];

            // Rellena el vector con los datos de la fila
            visitaData[0] = rs.getString("fechaVisita");
            visitaData[1] = rs.getString("tipoTratamiento");
            visitaData[2] = rs.getString("importeTratamiento");

            // Agrega el vector de strings a la lista
            listaV.add(visitaData);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al listar las visitas");
    }
    return listaV;
}


}
