package Entidades;

import java.time.LocalDate;

/**
 *
 * @author @SimonettaDaniel
 */

//Se debe asociar que los clientes pueden tener varias mascotas (de tipo perros, gatos, loros, o hámster), 
//cada mascota tiene un código, un alias, sexo, una especie, una raza, color de pelo, fecha de nacimiento 
//aproximada, peso medio del animal en las últimas 10 visitas y el peso actual del animal.
public class Mascota {
    private int idMascota;
    private String alias;
    private String sexo;
    private String especie;
    private String raza;
    private String color;
    private LocalDate fNac;
    private double pesoMedio;
    private double pesoActual;
    private Cliente Cliente;

    public Mascota() {
    }

    public Mascota(int idMascota, String alias, String sexo, String especie, String raza, String color, LocalDate fNac, double pesoMedio, double pesoActual, Cliente Cliente) {
        this.idMascota = idMascota;
        this.alias = alias;
        this.sexo = sexo;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.fNac = fNac;
        this.pesoMedio = pesoMedio;
        this.pesoActual = pesoActual;
        this.Cliente = Cliente;
    }

    public Mascota(String alias, String sexo, String especie, String raza, String color, LocalDate fNac, double pesoMedio, double pesoActual, Cliente Cliente) {
        this.alias = alias;
        this.sexo = sexo;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.fNac = fNac;
        this.pesoMedio = pesoMedio;
        this.pesoActual = pesoActual;
        this.Cliente = Cliente;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getfNac() {
        return fNac;
    }

    public void setfNac(LocalDate fNac) {
        this.fNac = fNac;
    }

    public double getPesoMedio() {
        return pesoMedio;
    }

    public void setPesoMedio(double pesoMedio) {
        this.pesoMedio = pesoMedio;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    @Override
    public String toString() {
        return "Mascota: "+alias+ ",raza "+ raza;
    }
}
