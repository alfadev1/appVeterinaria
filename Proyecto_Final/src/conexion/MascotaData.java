package conexion;

import java.sql.Connection;


public class MascotaData {
    private Connection con = null;

    public MascotaData() {
        con = Conexion.getConexion();
    }
    
//    public Mascota buscarMascota(int id) {
//    
//    }
    
    
//    public List<Mascota> listarMascotas() {
//        
//    }
}
