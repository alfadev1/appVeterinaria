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
    private int tipo;
    private String descripcion;
    private double importe;
    private boolean estado;

    public Tratamiento() {
    }

    public Tratamiento(int idTratamiento, int tipo, String descripcion, double importe, boolean estado) {
        this.idTratamiento = idTratamiento;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.importe = importe;
        this.estado = estado;
    }

    public Tratamiento(int tipo, String descripcion, double importe, boolean estado) {
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

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
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
        return "Tratamiento{" + "idTratamiento=" + idTratamiento + ", tipo=" + tipo + ", descripcion=" + descripcion + ", importe=" + importe + ", estado=" + estado + '}';
    }
}
