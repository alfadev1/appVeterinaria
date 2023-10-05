package conexion;

import java.sql.Connection;
import Entidades.*;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class MascotaData {
    private Connection con = null;

    public MascotaData() {
        con = Conexion.getConexion();
    }
//cada mascota tiene un código, un alias, sexo, una especie, una raza, color de pelo, 
//fecha de nacimiento aproximada, peso medio del animal en las últimas 10 visitas 
//y el peso actual del animal.
//idmascota	alias	sexo	especie	raza	colorPelo	f_nac	peso	idCliente	


    public void registrarMascota(Mascota mascota, Cliente cliente){
        String sql = "INSERT INTO `mascota`(`alias`, `sexo`, `especie`, `raza`, `colorPelo`, `f_nac`, `peso`, idCliente)" 
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, mascota.getIdMascota());
            ps.setString(2, mascota.getAlias());
            ps.setString(3, mascota.getSexo());
            ps.setString(4, mascota.getEspecie());
            ps.setString(5, mascota.getRaza());
            ps.setString(6, mascota.getColor());
            java.sql.Date nac = java.sql.Date.valueOf(mascota.getfNac());
            ps.setDate(7, nac);
            ps.setDouble(8, mascota.getPesoActual());
            ps.setInt(9, cliente.getIdCliente());
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla MASCOTA" + ex.getMessage());
        }
    }
    
    public void noEsDormirMascota(int id){
        String sql = "DELETE FROM alumno WHERE dni = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "La mascota ha decidido irse a otra veterinaria");
            } else if (fila == 0) {
                JOptionPane.showMessageDialog(null, "No se encontró a la mascota");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla MASCOTA" + ex.getMessage());
        }
    }
    
public Mascota buscarMascota(int id) {
        Mascota mascota = null;
        Cliente cliente = null;//???
        String sql = "SELECT `alias`, `sexo`, `especie`, `raza`, `colorPelo`, `f_nac`, `peso`, idCliente FROM Mascota WHERE idMascota = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                mascota = new Mascota();
                mascota.setAlias(rs.getString("alias"));
                mascota.setSexo(rs.getString("sexo"));
                mascota.setEspecie(rs.getString("especie"));
                mascota.setRaza(rs.getString("raza"));
                mascota.setColor(rs.getString("colorPelo"));
                mascota.setfNac(rs.getDate("f_nac").toLocalDate());
                mascota.setPesoActual(rs.getDouble("peso"));//Tengo una duda (No hagan el chiste)
                cliente.setIdCliente(rs.getInt("idCliente"));
                

            } else {
                JOptionPane.showMessageDialog(null, "No existe esa mascota");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla MASCOTA" + ex.getMessage());

        }

        return mascota;
    }
    
    public void modificarMascota(Mascota mascota) {
        String sql = "UPDATE mascote SET `alias` = ?, `sexo` = ?, `especie` = ?, `raza` = ?, `colorPelo` = ?, `f_nac` = ?, `peso` = ? WHERE idMascota = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, mascota.getAlias());
            ps.setString(2, mascota.getSexo());
            ps.setString(3, mascota.getEspecie());
            ps.setString(4, mascota.getRaza());
            ps.setString(5, mascota.getColor());
            ps.setDate(6, Date.valueOf(mascota.getfNac()));
            ps.setDouble(7, mascota.getPesoActual());
            int guardar = ps.executeUpdate();
            if (guardar == 1) {
                JOptionPane.showMessageDialog(null, "Datos modificados correctamente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar los datos de la mascota" + ex.getMessage());
        }  
    }    
    
//     public Mascota promedioPeso(double peso){
//         
//     }
    
//    public List<Mascota> listarMascotas() {
//        
//    }
}
