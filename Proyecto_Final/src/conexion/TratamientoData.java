package conexion;

import java.sql.Connection;

public class TratamientoData {
    private Connection con = null;

    public TratamientoData() {
        con = Conexion.getConexion();
    }
//    public Tratamiento buscarTratamiento(int id) {
//    
//    }
    
    
//    public List<Tratamiento> listarTratamiento() {
//        
//    }
}
