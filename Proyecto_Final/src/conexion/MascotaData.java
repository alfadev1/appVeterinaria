package conexion;

import java.sql.Connection;
import Entidades.*;
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
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
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
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                mascota.setIdMascota(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Mascota añadida con exito");          
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla MASCOTA" + ex.getMessage());
        }
    }
    
//    public Mascota buscarMascota(int id) {
//    
//    }
    
//     public Mascota promedioPeso(double peso){
//         
//     }
    
//    public List<Mascota> listarMascotas() {
//        
//    }
}
