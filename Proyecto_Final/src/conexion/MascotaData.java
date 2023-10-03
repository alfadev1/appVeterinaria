package conexion;

import java.sql.Connection;
import Entidades.*;


public class MascotaData {
    private Connection con = null;

    public MascotaData() {
        con = Conexion.getConexion();
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
