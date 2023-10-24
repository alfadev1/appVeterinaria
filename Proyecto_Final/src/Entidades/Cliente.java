package Entidades;

/**
 *
 * @author @SimonettaDaniel
 */
//Cada cliente registra su documento, apellido y nombre del cabeza de familia, 
//una dirección y teléfono y nombre de otra persona alternativa. 
//Se podrá gestionar el ABM y consulta de clientes.
public class Cliente {

    private int idCliente;
    private int dni;
    private String apellido;
    private String nombre;
    private String direccion;
    private int telefono;
    private String altClie;
    private int altTel;

    public Cliente() {
    }

    public Cliente(int idCliente, int dni, String apellido, String nombre, String direccion, int telefono, String altClie, int altTel) {
        this.idCliente = idCliente;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.altClie = altClie;
        this.altTel = altTel;
    }

    public Cliente(int dni, String apellido, String nombre, String direccion, int telefono, String altClie, int altTel) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.altClie = altClie;
        this.altTel = altTel;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getAltClie() {
        return altClie;
    }

    public void setAltClie(String altClie) {
        this.altClie = altClie;
    }

    public int getAltTel() {
        return altTel;
    }

    public void setAltTel(int altTel) {
        this.altTel = altTel;
    }

    @Override
    public String toString() {
        if (idCliente == 0) {
            return "Seleccione un Cliente";
        } else {
            return "ID: " + idCliente + " // " + apellido + ", " + nombre + " // " + dni;
        }

    }

}
