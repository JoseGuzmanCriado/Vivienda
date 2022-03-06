/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paqui Elena
 */
public class Vivienda {

    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;

    public Vivienda(double precio) {
        this.precio = precio;
    }
    //sobrecarga de contructor con parametros
    public Vivienda(double precio, int numhabitaciones, double superficie, boolean parking, String estado, String propietario){
    this.precio=precio;
    this.numHabitaciones=numhabitaciones;
    this.superficie=superficie;
    this.parking=parking;
    this.estado=estado;
    this.propietario=propietario;
    }
//metodo para porcentaje descuento
    public void actualizarPrecio(double descuento) {
       
        precio = precio - ((descuento*100)/precio);
    }
//metodo para imprimir valores de la vivienda
    public void imprimirVivienda() {
        System.out.println("Precio: " + this.precio);
        System.out.println("Número de habitaciones: " + this.numHabitaciones);
        System.out.println("Superficie en m2: " + this.superficie);
        System.out.println("¿Dispone de parking?: " + this.parking);
        System.out.println("Estado: " + this.estado);
        System.out.println("Propietario: " + this.propietario);

    }
//getters y setters
    public double getPrecio() {
        return precio;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public double getSuperficie() {
        return superficie;
    }

    public boolean isParking() {
        return parking;
    }

    public String getEstado() {
        return estado;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

}
