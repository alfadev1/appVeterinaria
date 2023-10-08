package conexion;

import java.sql.Connection;
import Entidades.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    
    
    public void registrarVisita(Mascota mascota,Tratamiento tratamiento,Visitas visita) {
       String sql="INSERT INTO `visita`( `idMascota`, `idTratamiento`, `fechaVisita`, `detalle`, `pesoActual`)"
               + "+ VALUES (?,?,?,?,?)"; 
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, mascota.getIdMascota());
        ps.setInt(2, tratamiento.getIdTratamiento());
        //fecha?
        ps.setString(4,visita.getDetalle());
        ps.setDouble(5, mascota.getPesoActual());
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error" );
        }
        
        
    } 

    
//Debe haber un método que pueda listar todas las 
//visitas de una mascota en especial (históricamente) 
    
   /* public List<Visitas> listarVisitas() {
       List <Visitas> listaV= new ArrayList<>();
        try {
            String sql ="SELECT * FROM visitas";
            PreparedStatement ps =con.prepareStatement(sql);
            
        ResultSet rs= ps.executeQuery();
        
        if (rs.next()){
         Visitas v=new Visitas();
         v.setFechaVisita(LocalDate.MIN);
         v.setDetalle(rs.getString("Detalle"));
         v.setPesoActual(rs.getDouble("pesoActual"));
         //v.setIdMascota(rs.getInt("idMascota"));
         //v.setIdTratamiento(rs.getInt("idTratamiento"));
         
         
        
         
         
         
        }
        } catch (Exception e) {
        }*/
  
   
}

