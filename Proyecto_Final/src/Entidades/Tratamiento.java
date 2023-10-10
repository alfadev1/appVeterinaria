package Entidades;

/**
 *
 * @author @SimonettaDaniel
 */

//En cada visita se hace uno de los diferentes tratamientos, pudiendo ser de tipo: vacunación, enfermedad, 
//curaciones, baño y corte de pelo, castración, etc. Los tratamientos se registran con un código de tratamiento 
//o servicio, tipo, una descripción, el importe del mismo y si está activo (1) o no.


public class Tratamiento {
    private int idTratamiento;
    private String tipo;
    private String descripcion;
    private int importe;
    private boolean estado;

    public Tratamiento() {
    }

    public Tratamiento(int idTratamiento, String tipo, String descripcion, int importe, boolean estado) {
        this.idTratamiento = idTratamiento;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.importe = importe;
        this.estado = estado;
    }

    public Tratamiento(String tipo, String descripcion, int importe, boolean estado) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.importe = importe;
        this.estado = estado;
    }

    public int getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(int idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo ;
    }
}
