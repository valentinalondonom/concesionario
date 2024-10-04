package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Taller {
    private String nombre;
    private Propietario propietario;
    private LinkedList<Vehiculo> vehiculos;

    public Taller (String nombre, Propietario propietario){
        this.nombre=nombre;
        this.propietario=propietario;
        this.vehiculos=new LinkedList<>();
    }

    

    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public Propietario getPropietario() {
        return propietario;
    }



    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }



    public LinkedList<Vehiculo> getVehiculos() {
        return vehiculos;
    }



    public void setVehiculos(LinkedList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }



    @Override
    public String toString() {
        return "Taller: " + nombre + ", propietario=" + propietario + ", vehiculo=" + vehiculos + "]";
    }

    public void agregarVehiculo (Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }

    public static void mostrarMensaje (String mensaje){
        System.out.println(mensaje);
    }
}
