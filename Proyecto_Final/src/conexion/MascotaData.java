package conexion;

import java.sql.Connection;
import Entidades.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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

    public void registrarMascota(Mascota mascota, Cliente cliente) {
        String sql = "INSERT INTO `mascota`(`alias`, `sexo`, `especie`, `raza`, `colorPelo`, `f_nac`, `peso`, idCliente, estado)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, mascota.getAlias());
            ps.setString(2, mascota.getSexo());
            ps.setString(3, mascota.getEspecie());
            ps.setString(4, mascota.getRaza());
            ps.setString(5, mascota.getColor());
            java.sql.Date nac = java.sql.Date.valueOf(mascota.getfNac());
            ps.setDate(6, nac);
            ps.setDouble(7, mascota.getPesoActual());
            ps.setInt(8, cliente.getIdCliente());
            ps.setBoolean(9, true);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                mascota.setIdMascota(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Una nueva mascota ha sido añadida");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla MASCOTA" + ex.getMessage());
        }
    }

    public void noEsDormirMascota(int id) {
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
        String sql = "SELECT `alias`, `sexo`, `especie`, `raza`, `colorPelo`, `f_nac`, `peso`, idCliente FROM Mascota WHERE idMascota = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                mascota = new Mascota();
                mascota.setIdMascota(id);
                mascota.setAlias(rs.getString("alias"));
                mascota.setSexo(rs.getString("sexo"));
                mascota.setEspecie(rs.getString("especia"));
                mascota.setRaza(rs.getString("raza"));
                mascota.setColor(rs.getString("colorPelo"));
                mascota.setfNac(rs.getDate("f_nac").toLocalDate());
                mascota.setPesoActual(rs.getDouble("peso"));
                mascota.setPesoMedio(calcularPesoMedio(id));

            } else {
                JOptionPane.showMessageDialog(null, "No existe esa mascota");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla MASCOTA" + ex.getMessage());

        }

        return mascota;
    }

    public List<Mascota> buscarMascotaXCliente(int id) {
        List<Mascota> mascotaLista = new ArrayList<>();
        String sql = "SELECT  `idmascota`, `alias`, `sexo`, `especie`, `raza`, `colorPelo`, `f_nac`, `peso`, idCliente FROM Mascota WHERE idCliente = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Mascota mascota = new Mascota();
                mascota.setIdMascota(id);
                mascota.setAlias(rs.getString("alias"));
                mascota.setSexo(rs.getString("sexo"));
                mascota.setEspecie(rs.getString("especie"));
                mascota.setRaza(rs.getString("raza"));
                mascota.setColor(rs.getString("colorPelo"));
                mascota.setfNac(rs.getDate("f_nac").toLocalDate());
                mascota.setPesoActual(rs.getDouble("peso"));
                mascota.setPesoMedio(calcularPesoMedio(rs.getInt("idmascota")));
                mascotaLista.add(mascota);

            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla MASCOTA" + ex.getMessage());

        }

        return mascotaLista;
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
            ps.setDate(6, java.sql.Date.valueOf(mascota.getfNac()));
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
    public List<Mascota> listarMascotas() {
        List<Mascota> mascotas = new ArrayList<>();
        try {
            String sql = "SELECT * FROM mascota WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Mascota masc = new Mascota();
                Cliente cli = new Cliente();
                masc.setIdMascota(rs.getInt("idMascota"));
                masc.setAlias(rs.getString("alias"));
                masc.setSexo(rs.getString("sexo"));
                masc.setEspecie(rs.getString("especie"));
                masc.setRaza(rs.getString("raza"));
                masc.setColor(rs.getString("colorPelo"));
                //no me anda con el localDate Daniel
                //LocalDate Nac = rs.getDate("f_nac").toLocalDate();
                //masc.setfNac(Nac);
                masc.setPesoActual(rs.getInt("peso"));
                cli.setIdCliente(rs.getInt("idCliente"));
                mascotas.add(masc);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla MASCOTA" + ex.getMessage());
        }
        return mascotas;
    }

    public double calcularPesoMedio(int id) {
        double pesoMedio = 0;
        String sql = "SELECT pesoActual FROM visita WHERE idMascota = ? ORDER BY fechaVisita DESC LIMIT 10";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            int contador = 0;
            double suma = 0;
            double peso = 0;

            while (rs.next()) {
                peso = rs.getDouble("pesoActual");
                suma += peso;
                contador++;
            }

            pesoMedio = contador > 0 ? suma / contador : 0;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla visita " + e.getMessage());
        }

        if (pesoMedio == 0) {
            String sql2 = "SELECT peso FROM mascota WHERE idMascota = ?";

            try {
                PreparedStatement ps2 = con.prepareStatement(sql2);
                ps2.setInt(1, id);
                ResultSet rs2 = ps2.executeQuery();

                if (rs2.next()) {
                    pesoMedio = rs2.getDouble("peso");

                }

            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error accediendo a la tabla visita " + e.getMessage());
            }
        }

        return pesoMedio;
    }

}
