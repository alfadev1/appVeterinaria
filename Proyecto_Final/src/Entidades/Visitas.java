package Entidades;

import java.time.LocalDate;

/**
 *
 * @author @SimonettaDaniel
 */
public class Visitas {
    private LocalDate fechaVisita;
    private String detalle;
    private double pesoActual;
    private Tratamiento idTratamiento;
    private Mascota idMascota;

    public Visitas() {
    }

    public Visitas(LocalDate fechaVisita, String detalle, double pesoActual, Tratamiento idTratamiento, Mascota idMascota) {
        this.fechaVisita = fechaVisita;
        this.detalle = detalle;
        this.pesoActual = pesoActual;
        this.idTratamiento = idTratamiento;
        this.idMascota = idMascota;
    }

    public LocalDate getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(LocalDate fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public Tratamiento getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(Tratamiento idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public Mascota getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(Mascota idMascota) {
        this.idMascota = idMascota;
    }

    @Override
    public String toString() {
        return "Visitas{" + "fechaVisita=" + fechaVisita + ", detalle=" + detalle + ", pesoActual=" + pesoActual + ", idTratamiento=" + idTratamiento + ", idMascota=" + idMascota + '}';
    }
    
}
