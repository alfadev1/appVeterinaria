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
    private String telefono;
    private String altClie;

    public Cliente() {
    }

    public Cliente(int idCliente, int dni, String apellido, String nombre, String direccion, String telefono, String altClie) {
        this.idCliente = idCliente;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.altClie = altClie;
    }

    public Cliente(int dni, String apellido, String nombre, String direccion, String telefono, String altClie) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.altClie = altClie;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAltClie() {
        return altClie;
    }

    public void setAltClie(String altClie) {
        this.altClie = altClie;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", dni=" + dni + ", apellido=" + apellido + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", altClie=" + altClie + '}';
    }
}