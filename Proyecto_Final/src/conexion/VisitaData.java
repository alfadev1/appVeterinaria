package conexion;

import java.sql.Connection;
import Entidades.*;

public class VisitaData {
    private Connection con = null;

    public VisitaData() {
        con = Conexion.getConexion();
    }
    
    
//    public void registrarVisita() {
//        
//    } 

    
//Debe haber un método que pueda listar todas las 
//visitas de una mascota en especial (históricamente) 
    
//    public List<Visitas> listarVisitas() {
//        
//    }    
}
